package com.fs;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	@RequestMapping(value = "/hello", method =  RequestMethod.GET)
	public String hello() {
		System.out.println(SecurityContextHolder.getContext().getAuthentication().isAuthenticated());
		return "ngay ma em den da lam cho trai tim hy vong";
	}
	
	
	@RequestMapping(value = "/hello2", method =  RequestMethod.GET)
	public String hello2() {
		return "ngay ma em den da lam cho trai tim hy vong22222";
	}
}
