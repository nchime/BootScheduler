package com.chime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TestSchedulerApplication {
	
	private static  final Logger LOGGER = LoggerFactory.getLogger(TestSchedulerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TestSchedulerApplication.class, args);
		
		LOGGER.info("# Daemons Start ... "); 
		
	}
}