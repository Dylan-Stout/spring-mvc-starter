package com.stout.starter.core.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/*import com.daifukuamerica.wrxj.web.core.UserSession;
import com.daifukuamerica.wrxj.web.model.User;
import com.daifukuamerica.wrxj.web.model.json.wrx.UserPreferenceModel;
import com.daifukuamerica.wrxj.web.service.dao.UserPreferenceService;
*/
/**
 * Post-success login authentication handler. Runs after successful spring invoked login. 
 * 
 * Author: dystout
 * Created : May 26, 2017
 *
 */
public class BaseAuthenticationSuccessHandler implements AuthenticationSuccessHandler
{
	@Autowired
	IAuthenticationFacade authenticationFacade; 
	
	@Autowired
	UserDetailsServiceImpl userDetailService; 
	
	/*@Autowired
	UserPreferenceService userPreferenceService; */

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy(); 
	
	/**
	 * Create a user from the successful authentication and put into session scope. 
	 * Add user & session to server pool. Redirects to the welcome page. 
	 */
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication auth)
			throws IOException, ServletException
	{
		/*Authentication authentication = authenticationFacade.getAuthentication();
		String username = authentication.getName(); 
		UserDetailsImpl userDetails = userDetailService.loadUserByUsername(username); 
		User user = new User(userDetails.getUsername(), userDetails.getDisplayName(), userDetails.getDisplayRole()); 
		UserPreferenceModel userPreferences = userPreferenceService.getUserPreferences(user.getUserId()); 
		HttpSession session = request.getSession(); 
		UserSession.addUserSession(user, session);
		session.setAttribute("user", user);
		session.setAttribute("userPref", userPreferences); 
		response.setStatus(HttpServletResponse.SC_OK);*/
		redirectStrategy.sendRedirect(request, response, "/welcome");
	}

}
