package com.hms.spring.security.springbootsecuritysample.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {
	
	@GetMapping("/")
	public String welcomeEmp() { 
		
		return ("<h1>Welcome</h1>");
	}

}
