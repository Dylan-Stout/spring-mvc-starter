package com.stout.starter.core.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

/**
 * Facade for obtaining a user's Authentication token from the Security Context.
 * 
 * Author: dystout
 * Created : May 25, 2017
 *
 */
@Component
public class AuthenticationFacade implements IAuthenticationFacade 
{
	@Override
	public Authentication getAuthentication()
	{
		return SecurityContextHolder.getContext().getAuthentication();
	}
}
