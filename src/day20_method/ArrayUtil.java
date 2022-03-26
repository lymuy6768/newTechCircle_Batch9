package day20_method;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayUtil {

//get max value from an array of integer

	public void maxValueFromIntegerArray(int nums[]) {
		

		int maxValue = nums[0];

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > maxValue) {
				maxValue = nums[i];
			}

		}

		System.out.println(maxValue);
	}

	public static void main(String[] args) {
		 
		int nums1[] = {12,2,3,4,4,6}; // 12
		int nums2[] = {12,2,3,4,4,66};//66
		int nums3[] = {12,2,333,4,4,66};//333
		
		ArrayUtil au = new ArrayUtil();
		
		au.maxValueFromIntegerArray(nums2); //66
		
		au.maxValueFromIntegerArray(nums3);
		
		au.maxValueFromIntegerArray(nums1);
		
		
		
		int arr[] = {10,20,30,40,50,60};
		
		
		au.addElementToAnIntegerArray(arr,400);
		
		
		au.reverseString("nafri");
		
		
	}

	public void addElementToAnIntegerArray(int arr[], int newElement) {

		
		int targetArr[] = new int[arr.length+1];
		
		System.out.println(Arrays.toString(targetArr));

		for(int i = 0 ; i < arr.length; i++) {
			targetArr[i] = arr[i];
		}
		
		targetArr[targetArr.length-1] = newElement;
		
		System.out.println(Arrays.toString(targetArr));
		
		
		
	}
	
	//Create a method to add one element to given array
	int arr[] = {1,3,5,7};
	int newElement = 9;
	
//	output:
//			[1,3,5,7,9]
	
	
	
	
	//Create a method to reverse a string
//	input : abc
//	output: cba
	
	public void reverseString(String input) {
		

		String reverseStr = "";

		for(int i = input.length()-1 ; i >=0 ; i--) {
			String singleLetter = String.valueOf(input.charAt(i));
			reverseStr = reverseStr + singleLetter;
		}
		
		System.out.println(reverseStr);
		
				
				}


}