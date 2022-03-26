package day24_WrappierClass_ReviewMethod;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		
		String str2= "TechCircle,techcircle,TECHCIRCLE";
		String arr2[]=str2.split(",");// split by , or by space
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		String email="techcircle@gmail.com";
		
		String emailArr[]=email.split("@");
		System.out.println(emailArr[0]);
		System.out.println(emailArr[1]);
		

	}

}
