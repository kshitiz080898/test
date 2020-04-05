package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.form.LoginForm;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;

@Controller
public class LoginController {
	//to get login form page
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String getLoginForm() {
		//return html page name
		return "login";
	}
//checking for login credentials
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model)
	{
		String username=loginForm.getUsername();
		String password=loginForm.getPassword();
		
		if("admin".equals(username) && "admim".equals(password)) {
			//if username and password is correct, we are returning home page
			return "home";
		}
		// if username or password is wrong 
		model.addAttribute("invalidCredentials",true);
		//returning again login page 
		return "login";
	}
	
}
