package com.yash.time;
import java.time.Clock;
import java.time.Instant;
import java.util.Date;

public class ClockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clock clock=Clock.systemDefaultZone();
		System.out.println(clock);
		
		Instant instant=clock.instant();
		Date date=Date.from(instant);
		System.out.println(date);
		
	

	}

}
