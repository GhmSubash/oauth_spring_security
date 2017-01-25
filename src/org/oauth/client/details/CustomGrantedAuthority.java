package org.oauth.client.details;

import org.springframework.security.core.GrantedAuthority;

public class CustomGrantedAuthority implements GrantedAuthority {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String role_Name;
	
	public CustomGrantedAuthority(String role_Name){
		this.role_Name = role_Name;
	}
	
	@Override
	public String getAuthority() {
		return role_Name;
	}

}
