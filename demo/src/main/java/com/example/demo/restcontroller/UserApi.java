package com.example.demo.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

@RestController
public class UserApi {
	
	@GetMapping("/user")
	public User getUser() {
		return new User("John 1", 30);
	}

}
