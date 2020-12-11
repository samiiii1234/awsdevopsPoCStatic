package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientOAuthController {

	String strUser = "";
	Integer iUserID;
	
	@GetMapping("/register")
	public String viewHomePage(Model model) {
		return "register";
	}
	
}
