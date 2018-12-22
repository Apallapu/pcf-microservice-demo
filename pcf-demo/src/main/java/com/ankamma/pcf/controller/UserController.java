package com.ankamma.pcf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankamma.pcf.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	@GetMapping("/list")
	public User getUsers() {
		return new User(12,"ankamma");
		
	}
	
	

}
