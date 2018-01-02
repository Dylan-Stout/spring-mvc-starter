package com.stout.starter.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.stout.starter.core.hibernate.HibernateUtils;
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
	public boolean authenticateLogin(String userName, String password)
	{ 
		SessionFactory factory = HibernateUtils.getSessionFactory();
	    Session session = factory.getCurrentSession();
		return false; // TODO implement model layer for password authentication
	}
	
	public User getUser(String userId)
	{
		return null; 
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
