package com.stout.starter.core.security;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AccountStatusException;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;

/**
 * Executed after any type of authentication failure/exception. Used to add 
 * authentication error messages to model for client view. 
 * 
 * Author: dystout
 * Created : May 27, 2017
 *
 */
public class BaseAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler
{


	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException
	{

		StringBuilder errorUrl = new StringBuilder("/logErr?error="); 	
		
		if(exception.getClass().isAssignableFrom(SessionAuthenticationException.class))
			errorUrl.append(AuthenticationErrors.SESSION_AUTHENTICATION);
		if(exception.getClass().isAssignableFrom(UsernameNotFoundException.class))
			errorUrl.append(AuthenticationErrors.USERNAME_NOT_FOUND);
		if(exception.getClass().isAssignableFrom(InsufficientAuthenticationException.class))
			errorUrl.append(AuthenticationErrors.INSUFFICIENT_AUTHENTICATION);
		if(exception.getClass().isAssignableFrom(BadCredentialsException.class))
			errorUrl.append(AuthenticationErrors.BAD_CREDENTIALS);
		if(exception.getClass().isAssignableFrom(AccountStatusException.class))
			errorUrl.append(AuthenticationErrors.ACCOUNT_STATUS);
		if(exception.getClass().isAssignableFrom(AuthenticationServiceException.class))
			errorUrl.append(AuthenticationErrors.AUTHENTICATION_SERVICE);
		
		setDefaultFailureUrl(errorUrl.toString());
		super.onAuthenticationFailure(request, response, exception);
			
	}
	
}
