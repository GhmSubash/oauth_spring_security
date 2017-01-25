package org.oauth.others;

import java.util.HashMap;
import java.util.Map;

public class StringHandler {

	public void createRequestParamMap(String str){
		Map<String,String> requestParameter = new HashMap<String,String>();
		String[] token = str.split("\\W+");
		
		for(int i = 0;i<token.length;i++){
			if(token[i].equals("grant_type")){
				requestParameter.put(token[i],token[i+1]);
			}else if(token[i].equals("username")){
				requestParameter.put(token[i],token[i+1]);
			}else if(token[i].equals("password")){
				requestParameter.put(token[i],token[i+1]);
			}
			System.out.println("TOken "+token[i]);
		}
		
		System.out.println("Request Parameter : "+requestParameter);
	}
	
}
 