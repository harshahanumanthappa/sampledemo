package com.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RestController
	@RequestMapping("/hello")
	public class HelloController 
	{	
		@GetMapping
		public String hello() {
			return "Hello harsha!!! how are you...";
		}
		
	}
	
	@RestController
	@RequestMapping("/test")
	public class TestController 
	{	
		@GetMapping
		public String hello() {
			return "Test harsha!!!! working fine.....";
		}
		
	}
	
	@RestController
	@RequestMapping("/sample")
	public class TestController 
	{	
		@GetMapping
		public String hello() {
			return "Test Sample!!!! working fine.....";
		}
		
	}
	
}
