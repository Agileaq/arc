package client;

import headerinterceptor.AddSoapHeader;

import java.util.Arrays;
import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import util.ReadSAIDs;

import com.hp.it.sbs.sems.interfaces.SemsError;
import com.hp.it.sbs.sems.interfaces.SemsSOAP;
import com.hp.it.sbs.sems.interfaces.SemsSOAPService;
import com.hp.it.sbs.sems.interfaces.SemsServiceResponse;

public class SemsSOAPServiceClient {
	
	public static void main(String args[]) {
		SemsSOAPService semsSOAP = new SemsSOAPService();
		SemsSOAP semsSOAPService = semsSOAP.getSemsSOAPPort();
		Client clientProxy = ClientProxy.getClient(semsSOAPService);
		clientProxy.getOutInterceptors().add(new AddSoapHeader());
  
		//Time out setting
        HTTPConduit httpConduit = (HTTPConduit) clientProxy.getConduit();  
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();  
        httpClientPolicy.setConnectionTimeout(1000*60*25*2);  
        httpClientPolicy.setReceiveTimeout(1000*60*25*2);  
        httpConduit.setClient(httpClientPolicy); 
        
		List<String> sAIDs = new ReadSAIDs().getSAIDs();
		System.out.println(sAIDs.size());
		long start = System.currentTimeMillis();
		//Arrays.asList("103932083112")
		SemsServiceResponse semsResponse = semsSOAPService.getEntitlementsByUserSp("ArcTestCase", "active", "", "", false, sAIDs);
		System.out.println(semsResponse.getResponse());
		for(SemsError semsError : semsResponse.getErrors().getError()) {
			System.out.println(semsError.getErrorCode());
			System.out.println(semsError.getErrorMessage());
			System.out.println(semsError.getErrorDetail());
		}
		System.out.println(System.currentTimeMillis() - start + "ms");
	}
	
}
