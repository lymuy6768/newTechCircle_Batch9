package day28_ArrayList_Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
		ArrayList <Double> list1=new ArrayList<>();
		list1.add(0.2);
		list1.add(9.9);
		
		ArrayList<Double> list2=new ArrayList<>(Arrays.asList(1.2,1.2,3.3,4.5,5.0,6.5,1.7));
		//list1.addAll(list2);
		
		list1.addAll(1, list2);
		System.out.println(list1);
		
		//Create a program to remove all numbers that less than 3 from list1
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i)+",");
			
			if(list1.get(i)<3 ){
				list1.remove(i);
			}
		}System.out.println(list1);
		
		System.out.println("----------------");
			Iterator itr=list1.iterator();
			
			while(itr.hasNext()) {
				double d=(double) itr.next();//unboxing
				if(d<3) {
					itr.remove();
				}
				
			}System.out.println(list1);
			System.out.println("-------------");
//	        Collect all the name that ends with character a
//	        Collect all the name that begin with character L
//	        Collect all the name that contains character r
			
			String names = "Gulhayat,Aim,Yasin,Anuwat,Brekhna,Chatchaya,Daniel,Erdni,"
	                + "Henry,Jandery,Karakat,Liubov, luck, Merfu, Naran, Onanong, Parween, Pete, Bahar, Siri,"
	                + "Victoria, Maria, Unyada, Narisa, Warawat";
			
			ArrayList<String> names1= new ArrayList<>();
			
			ArrayList<String> nameEndWithA = new ArrayList<>();
			
			ArrayList<String> nameStartWithL = new ArrayList<>();
			ArrayList<String> nameContainR = new ArrayList<>();
			
			String arr[]=names.split(",");
			System.out.println(names1);
			System.out.println(names1.size());
			System.out.println("-----------------");
		for(String name:names1) {
			if(name.endsWith("a")) {
				nameEndWithA.add(name);
			}if(name.startsWith("L")) {
				nameStartWithL.add(name);
			}if(name.contains("R")) {
				nameContainR.add(name);
			}
		}System.out.println(nameEndWithA);
		System.out.println(nameStartWithL);
		System.out.println(nameContainR);
		}
	
	}


