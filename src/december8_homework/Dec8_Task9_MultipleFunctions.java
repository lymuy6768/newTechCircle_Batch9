package december8_homework;

import java.util.Arrays;

public class Dec8_Task9_MultipleFunctions {

	public static void main(String[] args) {
//		1. create a function that can check if the given integer is positive, negative or zero
//			2. create a function that can calculate the grade of the student
//			3. create a function that can print out the combination of two integer arrays
//			4. create a function that can print a string without the duplicated characters
//			        "aaabbbccc"
//			        abc
//			5.  write a method that can print out the full name of a person in regular format
//			            ex:
//			               fullName("teChCirCle", "SCHOOL");
//			               	output:
//			               		"Techcircle School"
		Dec8_Task9_MultipleFunctions mf = new Dec8_Task9_MultipleFunctions();
		
		int num = 1;
		System.out.println("1.  " + mf.checkInteger(num));
		
		int score=100;
		System.out.println("2.  "+ "your grade is: "+mf.checkGrade(score));
		
		int num1[] = { 1, 2, 3, 4, 5, 6 };
		int num2[] = { 7, 8, 9, 10, 11 };
		mf.combine2IntegerArray(num1, num2);
		
		String str = "aaabbbccc";
		System.out.println("4.  "+mf.printUniqueChar(str));;
		
		mf.printFullName("5.  "+"TechCircle", "School");
}

	private String checkInteger(int num) {
		String result = "";

		if (num >=1) {
			result = "postive number";
		}
		if (num == 0) {
			result = "Zero number";

		} else if (num < 0) {
			result = "Negative number";
		}
		return result;

	}

	public String checkGrade(int score) {
		

		String grade = "";

		if (score >96&& score<=100) {
			grade="A+";
				
			} else if (score >92 && score <= 96) {
			grade="A";
			} else if (score >89 && score <= 92) {
			grade = "A-";
			} else if (score >86 && score <= 89) {
			grade = "B+";
			} else if (score >82 && score <= 86) {
			grade="B";
			} else if (score >79 && score <= 82) {
			grade = "B-";
			} else if (score >76 && score <= 79) {
			grade = "C+";
			} else if (score >72 && score <= 76) {
			grade="C";
			} else if (score >69 && score <= 72) {
			grade = "C-";
			} else if (score >66 && score <= 69) {
			grade = "D+";
			} else if (score >64 && score <= 66) {
			grade = "D";
			} else {
			grade = "F";
			}
		return grade;
	}
	private void combine2IntegerArray(int[] num1, int[] num2) {
		int result[] = new int[num1.length + num2.length];

		for (int i = 0; i < num1.length; i++) {
			result[i] = num1[i];
		}
		for (int i = 0, j = num1.length; i < num2.length; i++, j++) {// check 2 arr
			result[j] = num2[i];
		}
		System.out.println("3.  " + Arrays.toString(result));

	}

	public String printUniqueChar(String str) {
		
		String unique = "";

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			String s = String.valueOf(currentChar);
			if (!unique.contains(s)) {
				unique = unique + s;
			}
		}
		return unique;
		
	}public void printFullName(String firstName,String lastName) {
	
		firstName= firstName.toUpperCase().substring(0, 1)+firstName.toLowerCase().substring(1);
		lastName=lastName.toUpperCase().substring(0, 1)+lastName.toLowerCase().substring(1);
		String fullName= firstName+" "+lastName;
		System.out.println(fullName);

	}

}
