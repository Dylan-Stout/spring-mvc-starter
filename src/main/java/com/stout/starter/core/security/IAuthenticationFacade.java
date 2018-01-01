package com.stout.starter.core.security;

import org.springframework.security.core.Authentication;

/**
 * Provide common interface for getting the current user's authentication. 
 * 
 * Author: dystout
 * Created : May 25, 2017
 *
 */
public interface IAuthenticationFacade
{
	/**
	 * Get the authentication token for the current logged in user if exist. 
	 * 
	 * @return Authentication - authentication token 
	 */
	Authentication getAuthentication(); 
}

