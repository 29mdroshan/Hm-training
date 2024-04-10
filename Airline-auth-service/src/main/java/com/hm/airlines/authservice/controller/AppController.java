package com.hm.airlines.authservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/public")
	public String sayHelloWorld() {
		return "Hello World";
	}
	
	
	@GetMapping("/user")
	public String sayHelloUser() {
		return "Hello User";
	}
	
	@GetMapping("/admin")
	public String sayHelloAdmin() {
		return "Hello Admin";
	}

}
