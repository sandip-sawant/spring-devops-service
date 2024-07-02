package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevOpsControler {

	@GetMapping("/hello")
	public String getMessage() {
		return "Hello";
	}
}
