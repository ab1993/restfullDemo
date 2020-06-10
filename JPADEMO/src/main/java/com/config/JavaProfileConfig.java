package com.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile(value = { "message.msg" })
@Configuration
public class JavaProfileConfig {
	
	String message="hi dev";
	
	@PostConstruct
	public void display() {
		System.out.println(message); 
	}

}
