package cgg.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Today's Date: "+date);
		
		LocalDate date2 = LocalDate.of(2014,Month.JUNE,2);
		System.out.println(date2);
		
		System.out.println("Tomorrow's Date is: "+ date.plusDays(1));
		
		System.out.println("Yesterday's date is: "+ date.minusDays(1));
		
		System.out.println("Next month is: "+ date.plusMonths(1));
		
		System.out.println("Last month is: "+ date.minusMonths(1));
		
		System.out.println("is leap year? :" +date.isLeapYear());
		
		System.out.println("Move to the 30th day of the this month :"+ date.withDayOfMonth(30));
		
		System.out.println("Day of year: "+ date.withDayOfYear(160));
		//System.out.println(date.plusDays(21));
		
		
	}

}
