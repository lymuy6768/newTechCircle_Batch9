package day25_LocalDateTime;

import java.time.LocalDate;

public class LocalDateTest {

	public static void main(String[] args) {
		//				yyyy-MM-dd
		LocalDate date = LocalDate.now();
		
		LocalDate yesterday=date.minusDays(1);
		LocalDate tomorrow= date.plusDays(1);
		
		System.out.println("Today : "+ date);
		
		System.out.println("Yesterday : " + yesterday);
		System.out.println("Tomorrow : "+ tomorrow);
		
		LocalDate expectedDate=date.plusDays(2);
		System.out.println(expectedDate);
		
		LocalDate experationDate=date.plusDays(30);
		
		LocalDate date2= date.plusDays(40);
		System.out.println(experationDate);
		System.out.println(date2);
		
		if(date2.isAfter(experationDate)) {
			System.out.println("delete this application");
		}else {
			System.out.println("Please complete your application");
		}
		
		if(tomorrow.isAfter(experationDate)) {
			System.out.println("delete this application");
		}else {
			System.out.println("Please complete your application");
		}
		
		LocalDate date1= LocalDate.of(2017, 1, 13);
		System.out.println(date1.isLeapYear());
		LocalDate date3= LocalDate.of(2016, 9, 23);
		System.out.println(date3.isLeapYear());
	}

}
