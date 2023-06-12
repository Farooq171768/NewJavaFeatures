package cgg.zoneddatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {
		ZonedDateTime currentTime=ZonedDateTime.now();
		
		ZonedDateTime zonetime = ZonedDateTime.now(ZoneId.of("Europe/London"));
		
		ZonedDateTime zonetime1 = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		
		ZonedDateTime zonetime2 = ZonedDateTime.now(ZoneId.of("America/New_York"));
		
		
		System.out.println("MyZone: "+currentTime);
		
		System.out.println("Europe/London: "+zonetime);
		
		System.out.println("Europe-Paris: "+zonetime1);
		
		System.out.println("America-NewYork: "+zonetime2);
		
		ZonedDateTime americatime=ZonedDateTime.of(2023, 05,12,4,30,20,123456789,ZoneId.of("America/Chicago"));
		System.out.println("Time in America: "+americatime);
		
		

	}

}
