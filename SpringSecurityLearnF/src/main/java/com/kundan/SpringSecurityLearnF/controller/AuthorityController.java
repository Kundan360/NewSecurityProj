package com.kundan.SpringSecurityLearnF.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AuthorityController {

	@GetMapping("/home")
	public String home()
	{
		return "<h3>this is home page<h3>";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "<h3>this is login page<h3>";
	}
	
	@GetMapping("/register")
	public String register()
	{
		return "<h3>this is registration page<h3>";
	}
	
}
