package org.oauth.client.details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;

public class CustomClientDetailsService implements ClientDetailsService {

	@Override
	public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
		
		
		   CustomClientDetails clientDetails = null;
		   
		try {
			Connection connection = this.getConnection();
			String query = "select * from clientdetails where appId = "+"'"+clientId+"'";
			
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet results = pst.executeQuery();
			
			while(results.next()){
				
				clientDetails = new CustomClientDetails();
				clientDetails.setClientId(results.getString(1));
				clientDetails.setResourceIds(this.splitSpring(results.getString(2)));
				clientDetails.setClientSecret(results.getString(3));
			    clientDetails.setScopes(this.splitSpring(results.getString(4)));
			    clientDetails.setAuthorizedGrantTypes(this.splitSpring(results.getString(5)));
			    clientDetails.setRegisteredRedirectUri(this.splitSpring(results.getString(6)));
			    clientDetails.setAuthorities(this.getGrantedAuthorities(results.getString(7)));
			    clientDetails.setAccessTokenValiditySeconds(results.getInt(8));
			    clientDetails.setRefreshTokenValiditySeconds(results.getInt(9));
			    clientDetails.setAdditionalInformation(null);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return clientDetails;
	}
	
	public Connection getConnection() throws ClassNotFoundException{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = null;
		try{
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oauth_model","root","");
		}catch(Exception e){
			System.out.println("Can not connect to the database");
		}
		return connection;
	}
	
	public Set<String> splitSpring(String str){
		Set<String> sets = new HashSet<String>();
		String[] strs = str.split(",");
		for(String string : strs){
			sets.add(string);
		}
		return sets;
	}
	
	public Collection<GrantedAuthority> getGrantedAuthorities(String authority){
		
		Collection<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		Set<String> strs = this.splitSpring(authority);
		for(String auths : strs){
		   CustomGrantedAuthority grantedAuthority = new CustomGrantedAuthority(auths);	
		   authorities.add(grantedAuthority);
		}
		return authorities;
	}

}
