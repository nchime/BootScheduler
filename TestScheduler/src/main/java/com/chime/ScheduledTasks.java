package com.chime;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	 @Scheduled(fixedRate = 5000)
	public void reportCurrentTime1() {
		System.out.println("Scheduler 1 : The time is now " + dateFormat.format(new Date()));
	}
	 
	 @Scheduled(cron = "*/1 * * * * *")
	public void reportCurrentTime2() {
		System.out.println("Scheduler 2 : The time is now " + dateFormat.format(new Date()));
	}

	 

}
