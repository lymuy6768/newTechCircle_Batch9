package day25_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormattingTest {

	public static void main(String[] args) {
		
		 DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy, EEEE");
		 DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE'T'hh:mm a, MMMM/dd/yyyy");
		 DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEE,hh:mm a, MMMM/dd/yy");
		 LocalDate today= LocalDate.now();
		 System.out.println(today);
		 
		 LocalDateTime today1=LocalDateTime.now();
		 System.out.println(today1.format(dtf));
		 System.out.println(today1.format(dtf2));
		

	}

}
