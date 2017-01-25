package org.oauth.request;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;

public class OAuth2Request {
	
	private Map<String,String> requestParameter;
	private String clientId;
	private Collection<GrantedAuthority> authorities;
	private String grantType;
	private boolean approved;
	private Set<String> scopes;
	private Set<String> resourceIds;
	private Set<String> redirectUris;
	private Set<String> responseTypes;
	private Map<String,Serializable> extensionProperties;
	
	public OAuth2Request(Map<String, String> requestParameter, String clientId,
			Collection<GrantedAuthority> authorities, boolean approved, Set<String> scopes, Set<String> resourceIds,
			Set<String> redirectUris, Set<String> responseTypes, Map<String, Serializable> extensionProperties) {
		super();
		this.requestParameter = requestParameter;
		this.clientId = clientId;
		this.authorities = authorities;
		this.approved = approved;
		this.scopes = scopes;
		this.resourceIds = resourceIds;
		this.redirectUris = redirectUris;
		this.responseTypes = responseTypes;
		this.extensionProperties = extensionProperties;
	}
	
	public Map<String,Serializable> getExtendionProperties(){
		return this.extensionProperties;
	}
	public Collection<? extends GrantedAuthority> getAuthorities(){
		return this.authorities;
	}
	
	public String getClientId(){
		return this.clientId;
	}
	
	public String getGrantType(){
		return this.grantType;
	}
	
	public Set<String> getRedirectUris(){
		return this.redirectUris;
	}
	
	public Map<String,String> getRequestParameter(){
		return this.requestParameter;
	}
	
	public Set<String> getResourceIds(){
		return this.resourceIds;
	}

	public Set<String> getResponseTypes(){
		return this.responseTypes;
	}
	
	public Set<String> getScopes(){
		return this.scopes;
	}
	
	public boolean isApproved(){
		return this.approved;
	}
	
	public void setApproved(boolean bol){
	    this.approved = bol;	
	}
	
	public void setClientId(String clientId){
		this.clientId = clientId;
	}
	
	public void setRequestParameters(Map<String,String> requestParameters){
		this.requestParameter = requestParameters;
	}
	
	public void setScopes(Set<String> scopes){
		this.scopes = scopes;
	}
	
}
