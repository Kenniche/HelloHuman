package com.kenniche.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value="first_name", required=false) String first_name, 
						@RequestParam(value="last_name", required=false) String last_name){
		if (first_name == null) {
			return "<h1>Hello Human!</h1> <h2>Welcome to Spring Boot!</h2>"  ;
		} else {	
			return ( "<h1>"+"Hello " + first_name + " " + last_name + "!"+ "</h1> <h2>Welcome to Spring Boot!</h2>");
			// Example of Parameters pass: http://localhost:8080/?first_name=John&last_name=Doe
		}
	}
}
	
	