package com.pavan.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoApplication {
	
	public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);
	
	
	@PostConstruct
	public void init() {
		logger.info("Application Started.....")
		System.out.println("Pipelines Dev-->UAT-->Prod is added");
	}

	public static void main(String[] args) {
		logger.info("Application Executed......");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
