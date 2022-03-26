package day25_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateOfMethod {

	public static void main(String[] args) {
		
		LocalDate date1= LocalDate.of(2019, 3, 3);
		System.out.println(date1);
		
		LocalDate productWarrantyExperationDate=date1.plusYears(3);
		System.out.println(productWarrantyExperationDate);
		
		LocalDate today= LocalDate.now();
		
		if(today.isBefore(productWarrantyExperationDate)) {
			System.out.println("We can replace your product");
		}else {
			System.out.println("Buy the product again");
		}
			System.out.println(date1.isLeapYear());
			
		LocalDate date2=LocalDate.of(2020, 10, 29);
		System.out.println(date2.isLeapYear());
		
		System.out.println(date2.getDayOfMonth());
		System.out.println(date2.getYear());
		System.out.println(date2.getMonthValue());
		System.out.println(date2.getMonth());
		
		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		LocalDateTime now=date.atTime(20, 13, 30);
		System.out.println(now);
		

	}

}
