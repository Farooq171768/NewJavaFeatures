package cgg.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime now2 = LocalDateTime.of(2013, 5, 10, 3, 24);
		
		System.out.println("Day of month: "+now.getDayOfMonth());
		
		System.out.println("Next day is: "+now.plusDays(1));
		
		System.out.println(now.isBefore(now2));

	}

}
