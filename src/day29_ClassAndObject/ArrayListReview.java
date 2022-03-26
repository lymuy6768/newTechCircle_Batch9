package day29_ClassAndObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListReview {

	public static void main(String[] args) {
		
		Integer nums[]= {1,2,3,4,5,12,1,2,3,4,5};
		ArrayList <Integer> numsList= new ArrayList<>(Arrays.asList(nums));
		ArrayList<Integer> uniqueElements=new ArrayList<>();
		ArrayList<Integer> nonDuplicateElements=new ArrayList<>();
		ArrayList<Integer> duplicateElements=new ArrayList<>();
		
		System.out.println(numsList);
	//	Collections.frequency(null, nums)
		
		System.out.println(Collections.frequency(numsList, 1));
		System.out.println(Collections.frequency(numsList, 12));
	
		System.out.println(numsList.contains(4));
		System.out.println(numsList.contains(12));
		System.out.println(numsList.contains(6));
		
		System.out.println(uniqueElements);
		
		for(Integer num:numsList) {
			if(!uniqueElements.contains(numsList)) {
				uniqueElements.add(num);
			}						//check num in numlist
			if(Collections.frequency(numsList, num)==1) {
				nonDuplicateElements.add(num);
			}
			if(Collections.frequency(numsList, num)>1) {
				
			}
		}System.out.println(uniqueElements);
	}

}
