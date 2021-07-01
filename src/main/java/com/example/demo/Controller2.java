package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // only of Serving HTML/XML Responses
public class Controller2 {
	@GetMapping("/home")
	public String homepage() {
		return "index";
	}
}
