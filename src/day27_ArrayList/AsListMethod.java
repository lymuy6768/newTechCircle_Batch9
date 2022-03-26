package day27_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class AsListMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println(nums);
		
		
		ArrayList<String> names= new ArrayList<>(Arrays.asList("Book","Pen","Laptop","table","chair"));
		System.out.println(names);
		
		
	//Create a loop to print 1 to 100,and add all the even number to list1,add all the odd numbers to list 2.	
		ArrayList<Integer> evenNums= new ArrayList<>();
		ArrayList<Integer> oddNums= new ArrayList<>();
		for(int i=1;i<101;i++) {
			if(i%2==0) {
				evenNums.add(i);
				
			}else {
				oddNums.add(i);
			}
			
		}System.out.println(evenNums);
		System.out.println(oddNums);
		
		
		
		
		
		
	}

}
