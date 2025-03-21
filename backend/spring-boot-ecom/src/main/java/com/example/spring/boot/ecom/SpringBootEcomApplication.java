package com.example.spring.boot.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootEcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEcomApplication.class, args);
	}

	@RestController
	public static class HelloController {


		@GetMapping("/hello")
		public String hello() {
			return "Hello World";
		}
		@PostMapping("/post")
		public String post(@RequestBody String name) {
			return "Hello "+name;
		}
	}
}
