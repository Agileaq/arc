package headerinterceptor;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class AddSoapHeader extends AbstractSoapInterceptor {

	public static final String xml_namespaceUR_att = "http://gd.chinamobile.com//authentication";
	public static final String xml_header_el = "soap:Header";
	public static final String xml_authentication_el = "auth:authentication";
	public static final String xml_systemID_el = "auth:systemID";
	public static final String xml_userID_el = "auth:userID";
	public static final String xml_password_el = "auth:password";

	public AddSoapHeader() {
		super(Phase.WRITE);
	}

	public void handleMessage(SoapMessage message) throws Fault {
//		String userId = "test";
//		String sysId = "1";
//		String password = "test";
		QName qname = new QName("RequestSOAPHeader");
		Document doc = (Document) DOMUtils.createDocument();
		Element root = doc.createElement(xml_header_el);
//		Element eSysId = doc.createElement(xml_systemID_el);
//		eSysId.setTextContent(sysId);
//		Element eUserId = doc.createElement(xml_userID_el);
//		eUserId.setTextContent(userId);
//		Element ePwd = doc.createElement(xml_password_el);
//		ePwd.setTextContent(password);
//		Element child = doc.createElementNS(xml_namespaceUR_att,
//				xml_authentication_el);
//		child.appendChild(eSysId);
//		child.appendChild(eUserId);
//		child.appendChild(ePwd);
//		root.appendChild(child);
//		SoapHeader head = new SoapHeader(qname, root);
//		X-HP-SBS-ApplicationId: SEMS_GETEntitlement_User
//		X-HP-SBS-ApplicationKey: A.cat.ran.@fter.the.dog

//		Element root = doc.createElement(xml_header_el);
//		List<Header> headers = message.getHeaders();
		Map<String, List<String>> headers = (Map<String, List<String>>) message.get(Message.PROTOCOL_HEADERS);
		headers.put("X-HP-SBS-ApplicationId", Arrays.asList(new String[]{"SEMS_GETEntitlement_User"}));
		headers.put("X-HP-SBS-ApplicationKey", Arrays.asList(new String[]{"A.cat.ran.@fter.the.dog"}));
//		Header header1 = new Header(null, header1);
//		headers.add(head);
		
	}

}
