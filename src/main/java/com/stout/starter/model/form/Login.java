package com.stout.starter.model.form;


/**
 * Form data for login page. Not persisted or saved in any way other 
 * than the initial handoff to spring security authentication. 
 * 
 * Passwords sent in clear-text. Make sure connection is run on TLS/SSL. 
 * 
 * Author: dystout
 * Created : May 27, 2017
 *
 */
public class Login {
	
	private String username; 
	private String password;
	private String loginError; 
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoginError()
	{
		return loginError;
	}
	public void setLoginError(String loginError)
	{
		this.loginError = loginError;
	} 
	
	

}

