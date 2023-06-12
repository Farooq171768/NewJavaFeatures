package cgg.localtime;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("Current time is: "+time);
		
		LocalTime time2 = LocalTime.of(5, 12,30);
		System.out.println("Time: "+time2);
		
		System.out.println("Next hour: "+ time.plusHours(1));
		
		System.out.println("Previous hour: "+time.minusHours(1));
		
		System.out.println("Next minute: "+time.plusMinutes(1));
		
		System.out.println("Previous minute: "+time.minusMinutes(1));
		
		System.out.println(time.isAfter(time2));
		
		System.out.println(time.withMinute(45));
		
		
	}

}
