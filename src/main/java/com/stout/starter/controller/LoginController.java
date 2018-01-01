package com.stout.starter.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.stout.starter.model.User;
import com.stout.starter.model.form.Login;
import com.stout.starter.ui.UIConstants;


/**
 * Login request/response controller for Login specific actions. 
 * 
 * Mapped using relative context mappings. (http://{serverhostname}:{port}/{context}/) 
 * This is mapped to root context and is not an endpoint for which user authentication is needed. 
 * 
 * Author: dystout
 * Created : May 2, 2017
 *
 */
@Controller
@RequestMapping("/")
public class LoginController 
{
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class); 
	
	@RequestMapping("/")
	public String view(Model model)
	{
		model.addAttribute("login", new Login());
		return UIConstants.VIEW_LOGIN; 
	}
	
	@RequestMapping(value="/logErr", method=RequestMethod.GET)
	public String viewLoginError(Model model, @RequestParam("error") String error)
	{
		Login login  = new Login(); 
		model.addAttribute("login", login); 
		model.addAttribute("loginError", true);
		model.addAttribute("loginErrorMessage", error); 
		return UIConstants.VIEW_LOGIN; 
	}
	
	@RequestMapping("/welcome")
	public String viewWelcome(HttpSession session, Model model)
	{
		model.addAttribute("pageName", "HOME"); 
		return UIConstants.VIEW_WELCOME; 
	}
	
	@RequestMapping(value="/logout",  method=RequestMethod.GET)
	public String logout(Model model, HttpSession session, @ModelAttribute("user") User user)
	{
		model.addAttribute("login", new Login()); 
		return "login"; 
	}

}
