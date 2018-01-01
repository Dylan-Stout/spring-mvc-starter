package com.stout.starter.core.security;

public interface AuthenticationErrors
{
	final String USERNAME_NOT_FOUND = "User not found."; 
	final String SESSION_AUTHENTICATION = "Session Invalid, please re-login."; 
	final String INSUFFICIENT_AUTHENTICATION = "Insufficient privileges for this action"; 
	final String BAD_CREDENTIALS = "Incorrect username/password combo, please try again."; 
	final String ACCOUNT_STATUS = "User account locked/disabled/expired, please contact an administrator"; 
	final String AUTHENTICATION_SERVICE = "Internal error, please contact an administrator"; 
}
