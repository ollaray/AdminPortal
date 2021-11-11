package com.adminportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.adminportal.service.SecurityService;

@Controller
public class HomeController {
	@Autowired
	SecurityService securityService;
	
	@GetMapping("/")
	public String index(Model model) {
		return "redirect:/login";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		return "home";
	}
	
//	@GetMapping("/login")
//	public String login(Model model) {
//		return "login";
//	}
	
	@GetMapping("/login")
	public String login(Model model, String error, String logout) {
		if(securityService.isAuthenticated()) {
			return "redirect:/home";
		}
		
		if(error != null) {
			model.addAttribute("error", "Invalid Username or Password");
		}
		if(logout != null) {
			model.addAttribute("message", "You have been logged out successfully");
		}
		
		return "login";
	}
	
	
	
	
	
}
