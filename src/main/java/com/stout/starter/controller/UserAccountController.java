package com.stout.starter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stout.starter.model.form.Login;
import com.stout.starter.ui.UIConstants;

@Controller
@RequestMapping("/user")
public class UserAccountController {
	
private static final Logger logger = LoggerFactory.getLogger(LoginController.class); 
	
	@RequestMapping("/account")
	public String view(Model model)
	{
		return UIConstants.USERACCOUNT; 
	}
	

}
