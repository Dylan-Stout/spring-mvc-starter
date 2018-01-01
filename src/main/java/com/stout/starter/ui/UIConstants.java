package com.stout.starter.ui;

/**
 * @author dystout
 * Date: Sep 24, 2016
 *
 * Description: UI Constants for convenience where jstl or el is not possible. 
 * 
 * TODO - refactor errors to seperate constants and remove html formatting (should be rendered on view side) 
 */
public interface UIConstants 
{
	
	final String CONTEXT = "starter"; 
	
	/*****************************
	 * WRxJ Error message wrappers
	 *****************************/
	
	final String W_FONT = "</font>"; 
	
	/********* ERRORS **********/
	
	final String W_ERR_MSG = "<font class=\"errorHelpText\">"; 

	/******** SUCCESS *********/
	
	final String W_SUCCEED_MSG = "<font class=\"successHelpText\">";
	
	
	/**********************
	 * User UI Components
	 **********************/
	
	/********* ERRORS ********/
	
	final String DB_EXCEPTION = "<font class=\"errorHelpText\">Database Exception. See logs.</font>"; 
	final String DB_CONNECTION = "<font class=\"errorHelpText\">Connection Error</font>"; 
	final String SESSION_INVALID = "<center><font class=\"errorHelpText\">Session invalid, please login.</font></center>";
	final String LOGIN_INVALID = "<center><font class=\"errorHelpText\">Login invalid, please try again.</font></center>";
	final String LOGIN_EXPIRED = "<center><font class=\"errorHelpText\">Login has Expired</font></center>";
	final String LOGIN_IN_USE = "<center><font class=\"errorHelpText\">Login in use - Logout from terminal</font></center>";
	
	/*********** VIEW NAMES ******/


	final String VIEW_LOGIN = "/login";
	final String VIEW_USERS = "/usermanagement/userManagement";
	final String VIEW_USER_PREFERENCES = "/userpreference/userPreference"; 
	final String VIEW_WELCOME = "/main"; 
	
	/***** TEMPLATE VIEW NAMES *****/ 
	final String VIEW_TEMPLATE_USER_INFO = "classpath:templates/userinfo.html";
	
	/** UI THEME CONSTANTS */
	
	final String UI_THEME_DEFAULT = "default"; 
	final String UI_THEME_LIGHT = "light"; 
	final String UI_THEME_DARK = "dark";

	final String USERACCOUNT = "/user/account";
	
	
	

}
