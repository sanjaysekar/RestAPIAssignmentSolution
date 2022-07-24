package com.greatlearning.employeemanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String showHomePage() {
		return "Welcome to Employee Management Project with Spring Security";
	}
}
