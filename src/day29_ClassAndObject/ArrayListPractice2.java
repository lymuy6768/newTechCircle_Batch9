package day29_ClassAndObject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListPractice2 {

	public static void main(String[] args) {
	
		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		ArrayList <LocalDate> dates= new ArrayList<>();

		dates.add(date);
		System.out.println(dates);
		
		dates.add(LocalDate.of(1999, 10, 10));
		dates.add(LocalDate.of(2000, 10, 10));
		dates.add(LocalDate.of(2001, 10, 10));
		dates.add(LocalDate.of(2002, 10, 10));
		dates.add(LocalDate.of(2003, 10, 10));
		
		System.out.println(dates);
		
		//Remove all the date that is before October 10,2001
	//	ArrayList <LocalDate> newDates=new ArrayList<>();
		
		Iterator iter=dates.iterator();
		
		while(iter.hasNext()) {
		//	System.out.println(iter.next());
		LocalDate d=(LocalDate) iter.next();
			if(d.isBefore(LocalDate.of(2001, 10, 10))) {
				iter.remove();
		}
		//	dates.removeIf(p->p.isAfter(LocalDate.of(2000, 10, 10)));
	}System.out.println(dates);
	System.out.println("-----------");
//	System.out.println(dates);
	
		Integer num1[]= {1,2,3,4};
		Integer num2[]= {11,22,33,44};
		Integer num3[]= {111,222,333,444};
		
		ArrayList <Integer[]> numList= new ArrayList <>();//
		numList.add(num1);
		numList.add(num2);
		numList.add(num3);
		
		System.out.println(Arrays.toString(numList.get(0)));
		System.out.println(Arrays.toString(numList.get(1)));
		System.out.println(Arrays.toString(numList.get(2)));
		System.out.println("=================================");
					//name of each element (integers)
		for(Integer[] integers:numList) {//each element of numlist is another integer array
		for(Integer a:integers){//a is each element of collection
			System.out.println(a);
		}
	}
		String fruits[]= {"Apple","Banana","Orange","Pear","Mango"};
		String names[]= {"TechCircle","Irfan","Java","SDET"};
		String cars[]= {"Tesla","BMW","Honda"};
		
		ArrayList<String[]> namelist=new ArrayList<>();
		
		namelist.add(fruits);
		namelist.add(cars);
		namelist.add(names);
		System.out.println("+++++++++++++++++++++");
		for(int i=0;i<namelist.size();i++) {
		//	System.out.println(Arrays.toString(namelist.get(i)));
			String elements[]=namelist.get(i);
		//	System.out.println(Arrays.toString(elements));
			System.out.println("--------------");
			for(int a=0;a<elements.length;a++) {
				System.out.println(elements[a]);
			}
		}
		
		
		
		
		
	}
}
