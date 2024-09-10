package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {	
	 

		@GetMapping("/welcome")
		public String firstPage() {
			return "Welcome to Spring";
		}

}
