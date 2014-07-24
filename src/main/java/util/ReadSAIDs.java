package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadSAIDs {

	public List<String> getSAIDs() {
		List<String> results = new ArrayList<String>();
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("saids.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line = null;
		try {
			while((line = br.readLine()) != null) {
				String[] strArray = line.split(",");
				for(String str : strArray) {
					String result = str.trim();
					if(!"".equals(result)) {
						results.add(result);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return results;
	}
	
	public static void main(String args[]) {
		List<String> test = new ReadSAIDs().getSAIDs();
		System.out.println(test.size());
	}
}
