package com.example.familytree.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1/family/user")
public class FamilyController {

	@GetMapping("/home")
	public String home() {
		return "welcome to home page";
	}
}
