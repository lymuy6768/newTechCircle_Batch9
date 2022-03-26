package day25_LocalDateTime;

import java.time.LocalDate;

public class Birthday {

	public static void main(String[] args) {

		Birthday bd = new Birthday();
		bd.happyBirthday(1997, 1, 16);
		bd.printAge(1900, 12, 13);
	}

	public void happyBirthday(int year, int month, int day) {
		LocalDate today=LocalDate.now();
		LocalDate date1=LocalDate.of(year,month, day);
		int month1=today.getMonthValue();
		int day1=today.getDayOfMonth();
		
		int month2=date1.getMonthValue();
		int day2=date1.getDayOfMonth();
		
		
		
		if(month1==month2 && day1==day2) {
			System.out.println("Happy Birthday!!!");
		}else {
			System.out.println("it's not your birthday-_-");
		}
	}public void printAge(int year,int month, int day) {
		LocalDate today=LocalDate.now();
		LocalDate date1=LocalDate.of(year, month, day);
		int year1= today.getYear();
		int year2=date1.getYear();

		{System.out.println(year1-year2);
}
	}}