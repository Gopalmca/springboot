package com.wish;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class WishMeApplication {
 
	@GetMapping("/")
	public String msg() {
		return "deploy Scueessfuly = "+new Date();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(WishMeApplication.class, args);
	}

}
