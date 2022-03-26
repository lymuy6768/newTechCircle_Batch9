package day36_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		String [] topic= {"JAVA","SDET","TECHCIRCLE"};
		ArrayList <String> names= new ArrayList<>(Arrays.asList(topic));
		
		names.add("SQL");
	//	System.out.println(names.size());
	//	System.out.println(names);
		
		names.addAll(names);
	//	System.out.println(names.size());
	//	System.out.println(names);
		
		List<String> unique= new ArrayList<>();
		
		for(String name:names) {
		//	System.out.println(name);
			if(!unique.contains(name)) {
				unique.add(name);
			}
		}System.out.println(unique);
		
		Set <String> list1= new HashSet<>();
		System.out.println(list1);
		
		list1.add("TechCircle");
		list1.add("TechCircle");
		list1.add("irfan");
		list1.add("irfan");
		System.out.println(list1);
		
		HashSet <String> list2= new HashSet<>();
		Collection<String> list3= new HashSet<>();
		
		for(String name:names) {
			list2.add(name);
			list3.add(name);
			
		}System.out.println(list2);
		System.out.println(list3);
		
	}

}
