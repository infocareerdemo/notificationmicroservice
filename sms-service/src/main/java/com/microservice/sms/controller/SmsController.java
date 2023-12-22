package com.microservice.sms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SmsController {

	@GetMapping("/sms")
	public String getEmail() {
		return "This is sms service...!";
	}
}
