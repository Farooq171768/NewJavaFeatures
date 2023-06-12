package cgg.periodduration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class PeriodExample {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2014, Month.JUNE, 2);
		LocalDate end= LocalDate.now();
		
		Period period = start.until(end);
		
	
		
		System.out.println("Days between: "+period.get(ChronoUnit.DAYS));
		System.out.println("MOnths between: "+period.get(ChronoUnit.MONTHS));
		System.out.println("Years between: "+period.get(ChronoUnit.YEARS));
		
		System.out.println("-----------------------");
		LocalDate initialDate = LocalDate.now();
		LocalDate finalDate = initialDate.plus(Period.ofDays(5));
		int days=Period.between(initialDate, finalDate).getDays();
		
		System.out.println(days+" days");

		System.out.println("--------------------------");
		
		long between = ChronoUnit.DAYS.between(initialDate, finalDate);
		System.out.println(between +" days");
		
		System.out.println("----------------");
		
		
		LocalDate today = LocalDate.now();
		LocalDate birthdate = LocalDate.of(1999, 11, 14);
		
		Period period2 = Period.between(birthdate, today);
		
		long p1 = ChronoUnit.DAYS.between(birthdate, today);
		System.out.println("You are "+period2.getYears()+" years, "+period2.getMonths()+" months and "+period2.getDays()+ 
				" days old.("+p1+" days total)");
		
		
		//To calculate next birthday:
		
		LocalDate nextBday = birthdate.withYear(today.getYear());
		//if your birthday has occurred this year already ,add 1 to the year
		if(nextBday.isBefore(today)|| nextBday.isEqual(today)) {
			nextBday = nextBday.plusYears(1);
		}
		
		Period p=Period.between(today, nextBday);
		p1=ChronoUnit.DAYS.between(today, nextBday);
		
		System.out.println("There are "+p.getMonths()+" months and "+
		p.getDays()+" days until your next birthdy.("+p1+" days total)");
		
		
		System.out.println("----------------------------");
		
		
		LocalTime initialTime = LocalTime.of(6, 30, 0);
		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
		
		long seconds = Duration.between(initialTime, finalTime).getSeconds();
		System.out.println(seconds+" seconds");
		
		long between2 = ChronoUnit.SECONDS.between(initialTime, finalTime);
		System.out.println(between2+" seconds");
		
	
		///Date and time formatting
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		LocalDate currentDate = LocalDate.now();
		
		System.out.println("----------------------------------");
		System.out.println(currentDate.format(formatter));
		
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		LocalTime now = LocalTime.now();
		System.out.println("----------------------");
		System.out.println(now.format(formatter2));
		
		
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("DD/mm/yyyy");
		String text="12/02/2015";
		LocalDate date = LocalDate.parse(text,formatter3);
		System.out.println(date);
		System.out.println("------------------");
		
		DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("HH-mm-ss");
		String time="12-40-22";
		LocalTime time2 = LocalTime.parse(time, formatter4);
		System.out.println(time2);
	}

}
