package com.ankamma.pcf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankamma.pcf.feign.UserFeignClient;
import com.ankamma.pcf.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserFeignClient userFeignClient;

	@GetMapping("/list")
	public User getUsers() {
		return userFeignClient.getUsers();

	}

}
