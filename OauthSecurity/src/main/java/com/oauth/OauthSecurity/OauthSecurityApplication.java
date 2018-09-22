package com.oauth.OauthSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OauthSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthSecurityApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello deepak!!";
		
	}
}
