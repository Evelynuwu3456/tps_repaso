package com.example.examen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class chatController {

	@GetMapping("/")
	public String views() {
		return "chat";
	}
	
	
	
}
