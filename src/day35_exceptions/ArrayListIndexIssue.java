package day35_exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIndexIssue {

	public static void main(String[] args) {
		
		try {
		ArrayList<String> fruits= 
				new ArrayList<>(Arrays.asList("Apple","Pear","Banan"));
		
		System.out.println(fruits.get(4));
		}catch(Exception e) {
			e.printStackTrace();
		}System.out.println("after exception handling");
	}

}
