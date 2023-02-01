package com.kundan.SpringSecurityLearnF.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kundan.SpringSecurityLearnF.model.User;
import com.kundan.SpringSecurityLearnF.service.Dbclass;

@RestController
@RequestMapping("/")
public class SecurityController {
	
	@Autowired
	Dbclass db;
	
	@GetMapping("/kundan")
	public String home()
	{
		return "<h3>kundan krlega tm and ye home page hai<h3>";
	}
	
	@GetMapping("/user")
	public List<User> getAllStudent()
	{
		return db.getAllUser();
	}

}
