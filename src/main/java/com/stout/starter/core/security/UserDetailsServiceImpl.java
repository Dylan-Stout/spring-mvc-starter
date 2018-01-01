package com.stout.starter.core.security;


import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


/**
 * Service to access user details 
 * 
 * Author: dystout
 * Created : May 25, 2017
 *
 */
public class UserDetailsServiceImpl implements UserDetailsService
{

	/**
	 * Get the user details for the given username if exists. If no user exist throw a UsernameNotFoundException
	 * 
	 * @return user details - details of user
	 */
    public UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException 
    {
    	
        UserDetailsImpl matchingUser = BaseUserRepository.getInstance().getUserRepository().get(username);
        if (matchingUser == null) {
            throw new UsernameNotFoundException("Username or password incorrect!");
        }
        return matchingUser;
    }

}
