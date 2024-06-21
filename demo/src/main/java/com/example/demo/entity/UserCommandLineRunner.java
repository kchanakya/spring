package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class UserCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private UserJpa repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new User("Krishna", 25));
		
	}

}
