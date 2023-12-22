package com.microservice.email.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class EmailController {

	@GetMapping("/email")
	public String getEmail() {
		return "This is email service...!";
	}
}
