package org.oauth.client.details;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;

public class CustomClientDetails implements ClientDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer accessTokenValiditySeconds;
	private Map<String,Object> additionalInformation;
	private Collection<GrantedAuthority> authorities;
	private Set<String> authorizedGrantTypes;
	private String clientId;
	private String clientSecret;
	private Integer refreshTokenValiditySeconds;
	private Set<String> registeredRedirectUri;
	private Set<String> resourceIds;
	private boolean autoApprove;
	private Set<String> scopes;
	private boolean scoped;
	private boolean secretRequired;
	
	public boolean isAutoApprove() {
		return autoApprove;
	}

	public Set<String> getScopes() {
		return scopes;
	}

	public void setAccessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
		this.accessTokenValiditySeconds = accessTokenValiditySeconds;
	}

	public void setAdditionalInformation(Map<String, Object> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public void setAuthorities(Collection<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	public void setAuthorizedGrantTypes(Set<String> authorizedGrantTypes) {
		this.authorizedGrantTypes = authorizedGrantTypes;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public void setRefreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
		this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
	}

	public void setRegisteredRedirectUri(Set<String> registeredRedirectUri) {
		this.registeredRedirectUri = registeredRedirectUri;
	}

	public void setResourceIds(Set<String> resourceIds) {
		this.resourceIds = resourceIds;
	}

	public void setAutoApprove(boolean autoApprove) {
		this.autoApprove = autoApprove;
	}

	public void setScopes(Set<String> scopes) {
		this.scopes = scopes;
	}

	public void setScoped(boolean scoped) {
		this.scoped = scoped;
	}

	public void setSecretRequired(boolean secretRequired) {
		this.secretRequired = secretRequired;
	}

	@Override
	public Integer getAccessTokenValiditySeconds() {
		return this.accessTokenValiditySeconds;
	}

	@Override
	public Map<String, Object> getAdditionalInformation() {
		return this.additionalInformation;
	}

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public Set<String> getAuthorizedGrantTypes() {
		return this.authorizedGrantTypes;
	}

	@Override
	public String getClientId() {
		return this.clientId;
	}

	@Override
	public String getClientSecret() {
		return this.clientSecret;
	}

	@Override
	public Integer getRefreshTokenValiditySeconds() {
		return this.refreshTokenValiditySeconds;
	}

	@Override
	public Set<String> getRegisteredRedirectUri() {
		return this.registeredRedirectUri;
	}

	@Override
	public Set<String> getResourceIds() {
		return this.resourceIds;
	}

	@Override
	public Set<String> getScope() {
		return this.scopes;
	}

	@Override
	public boolean isAutoApprove(String arg0) {
		return this.autoApprove;
	}

	@Override
	public boolean isScoped() {
		return this.scoped;
	}

	@Override
	public boolean isSecretRequired() {
		return this.secretRequired;
	}

}
