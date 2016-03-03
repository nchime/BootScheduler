package com.chime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TestSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSchedulerApplication.class, args);
		
		System.out.println("# Daemons Start ... ");
	}
}
