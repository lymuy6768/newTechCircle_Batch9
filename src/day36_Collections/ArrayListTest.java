package day36_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		String [] topic= {"JAVA","SDET","TECHCIRCLE"};
		ArrayList <String> names= new ArrayList<>(Arrays.asList(topic));
		
		names.add("SQL");
		System.out.println(names.size());
		System.out.println(names);
		
		names.addAll(names);
		System.out.println(names.size());
		System.out.println(names);
		
		Collection<String> names2 = new ArrayList<>(Arrays.asList(topic));
		names2.add("JDBC");
		names2.addAll(names2);
		System.out.println(names2.size());
		System.out.println(names2);
		
		List<String> names3 = new ArrayList<>(Arrays.asList(topic));
		names3.add("JDBC");
		names3.addAll(names3);
		System.out.println(names3.size());
		System.out.println(names3);
		
		for(int i=0;i<names3.size();i++) {
			System.out.println(names3.get(i));
		}
		System.out.println("------------");
		for (String name:names3) {
			System.out.println(name);}
	
	//Iterator irfan = names3.iterator();
	
	Collection<Integer> nums = new LinkedList<>();
	nums.add(1);
	nums.addAll(Arrays.asList(1,2,3,4,5,6));
	
	Collection<Animal> animals= new LinkedList<>(Arrays.asList());
	
//	animals.add(new Animal());//can not instantiate abstract class
	
	animals.add(new Dog());
	animals.add(new Dog());
	animals.add(new Shark());
	animals.add(new Dog());
	animals.add(new Shark());
	animals.add(new Dog());
	
	for (Animal a:animals) {
		a.makeSound();
		a.move();
	}
	
	
	
	
}
}
