package day32_inheritance.concept;

public class AudioBook extends Book{
	
	int length;
	String narrator;
	
	public void listen() {
		type="AudioBook";
		System.out.println("Listening audio book: ");
		System.out.println("Title: "+ title);
		System.out.println("Author: "+ author);
		System.out.println("length: "+ length);
		System.out.println("narrator: "+ narrator);
		System.out.println("price: "+ price);
		System.out.println("Type: "+ type);
	}

}
