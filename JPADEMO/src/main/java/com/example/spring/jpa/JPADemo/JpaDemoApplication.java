package com.example.spring.jpa.JPADemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.hibernate.annotations.common.util.impl.*;

@SpringBootApplication
@EnableSwagger2
public class JpaDemoApplication {
	
	private static final Logger log= LoggerFactory.getLogger(JpaDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
		//JpaDemoApplication.log.debug("Logger Started");
		//System.out.println("Started");
		
	}

}
