package day31_encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
	/*
	create a class called ShoppingList
				create 5 objects of Item and store them into ArrayList of Items
				calculate the total cost of all Items in the list
	 */
	
	ArrayList<String> item=new ArrayList<>(Arrays.asList("shoes","jeans","shirt","belt","hat"));

	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ArrayList<String> item=new ArrayList<>(Arrays.asList("shoes","jeans","shirt","belt","hat"));
		for(int i=0;i<item.size();i++)
		System.out.println(item.size());
	}
}
