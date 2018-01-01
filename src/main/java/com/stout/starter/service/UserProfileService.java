package com.stout.starter.service;

import com.stout.starter.model.User;

public class UserProfileService {
	
	/**
	 * Base user authentication logic. Use hashing alg to check password is correct and
	 * if so, return the appropriate user object. 
	 * 
	 * @param userName
	 * @param password
	 * @return if success - User object, if fail - null 
	 */
	public User authenticateUser(String userName, String password)
	{ 
		return null; // TODO implement model layer for password authentication
	}
	
	
	/**
	 * Logout user ---- 
	 * 
	 * 
	 * @param user
	 */
	public void logoutUser(User user)
	{ 
		//TODO implement logout logic 
	}

}
