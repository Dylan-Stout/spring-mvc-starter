package com.stout.starter.core.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * User roles defined via a string to be cast as a Spring Granted Authority
 * for use in access control/security 
 * 
 * Author: dystout
 * Created : May 27, 2017
 *
 */
public class GrantedAuthorityImpl implements GrantedAuthority 
{
	public static final long serialVersionUID = 1L;
	
	private String role;

	public GrantedAuthorityImpl(String role) {
		this.role = role;
	}
	
	@Override
	public String getAuthority()
	{
		return role;
	}

}
