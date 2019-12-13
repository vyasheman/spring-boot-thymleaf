package com.hemant.springbootthymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hemant.springbootthymleaf.model.LoginForm;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		
		return "index";
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST) 
	public String loginForm(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model) {
		
			System.out.println(loginForm.getName());
			System.out.println(loginForm.getPassword());
			
			model.addAttribute("value", "Valid login");
			
		return "home";
	}
}
