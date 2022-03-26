package day28_ArrayList_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractNumberFromString {

	public static void main(String[] args) {
		
		String str="abc123)(*456$%^&def";
	//Create a program to extract number from the string above
		
		String digit="";
		String letters="";
		String specialCharacters="";
		
		char chars[]=str.toCharArray();//convert str to charArray
		//ArrayList<Character> list=new ArrayList<>();
		for(char c:chars){
			if(Character.isDigit(c)) {
				digit+=c;
			}else if(Character.isAlphabetic(c)) {
				letters+=c;
			}else {
				specialCharacters+=c;
			}
	}System.out.println(digit);
	System.out.println(letters);
	System.out.println(specialCharacters);
//Extract the letters
	//Extract all special characters
	
	ArrayList <String> color= new ArrayList<>(Arrays.asList("Red","Green","Orange","White","Black"));
	ArrayList<String> reverseColor=new ArrayList<>();//create new empty list to store reverse color
	
	System.out.println(color);
	
	for(int i=color.size()-1;i>=0;i--) {
		reverseColor.add(color.get(i));//get the reverse color and add to new reversecolor
	}
	System.out.println(reverseColor);
	
	//write a Java program of swap two elements in an array list
	
	ArrayList<String> color1= new ArrayList<>(Arrays.asList("Red","Green","Black","White","Pink"));
	//ArrayList<String> swapColor= new ArrayList<>();
	
	color1.set(0, "black");
	color1.set(2, "Red");
	System.out.println(color1);
	
	
	
}
}