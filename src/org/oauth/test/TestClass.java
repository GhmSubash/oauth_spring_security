package org.oauth.test;

import org.oauth.client.details.CustomClientDetailsService;
import org.oauth.others.StringHandler;
import org.springframework.security.oauth2.provider.ClientDetails;

public class TestClass {
	
	private static String clientId = "12345678910";
	private static String tokenUrl = "POST http://localhost:8080/SpringSecurityOAuth2Example/oauth/token?grant_type=password&username=bill&password=abc123";
	
	public static void main(String[] args){
	CustomClientDetailsService service = new CustomClientDetailsService();
    
	ClientDetails clientDetails = service.loadClientByClientId(clientId);
	
	System.out.println("Details Of Clients\n");
	
	System.out.println("Client ID  : "+clientDetails.getClientId());
	System.out.println("Client Secret : "+clientDetails.getClientSecret());
	System.out.println("Authorities : "+clientDetails.getAuthorities().toString());
	System.out.println("Authorization Grant types :  "+clientDetails.getAuthorizedGrantTypes().toString());
	System.out.println("Scopes : "+clientDetails.getScope());
	System.out.println("Access Token Validity seconds : "+clientDetails.getAccessTokenValiditySeconds());
	System.out.println("Refresh Token Validity seconds : "+clientDetails.getRefreshTokenValiditySeconds());
	System.out.println("Registered Redirect Uri : "+clientDetails.getRegisteredRedirectUri().toString());
	System.out.println("Resource IDs : "+clientDetails.getResourceIds());
	
	StringHandler handler = new StringHandler();
	handler.createRequestParamMap(tokenUrl);
	
	}
}
