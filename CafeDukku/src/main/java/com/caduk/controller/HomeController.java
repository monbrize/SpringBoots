package com.caduk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String goHome() {
		return "home";
	}
	
	@GetMapping("/signUp")
	public String goSignUp() {
		return "signUp";
	}
}
