package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientOAuthController {
	
	@GetMapping("/welcome")
	public String viewWelcomePage(Model model) {
		return "welcome";
	} 
	
}
