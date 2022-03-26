package day27_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		ArrayList<String> names= new ArrayList<>();
		
		names.add("TechCircle");
		names.add("Luba");
		names.add("Tom");
		names.add("Bahar");
		
		System.out.println(names.size());//length
		System.out.println(names.get(0));//to get each element
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		
		
		//Create list of integer and add 1 to 10 to the list;
		
		ArrayList<Integer> nums= new ArrayList<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);
		
		System.out.println(nums.size());
		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));
		System.out.println(nums.get(3));
		System.out.println(nums.get(4));
		System.out.println(nums.get(5));
		System.out.println(nums.get(6));
		System.out.println(nums.get(7));
		System.out.println(nums.get(8));
		System.out.println(nums.get(9));
		
		System.out.println("------------");
		for(int a=1;a<11;a++) {
			nums.add(a);
			}
		System.out.println(nums);
		
		nums.set(2, 30);
		System.out.println(nums);
		
		ArrayList<String> groceryList= new ArrayList<String>();
		
		groceryList.add("Water");
		groceryList.add("Egg");
		groceryList.add("Bread");
		groceryList.add("Milk");
		
		groceryList.set(0, "Soda");
		
		System.out.println(groceryList);
		
		groceryList.remove(0);
		System.out.println(groceryList);
		
		groceryList.remove(groceryList.size()-1);
		System.out.println(groceryList);
		
	}
	
	

}
