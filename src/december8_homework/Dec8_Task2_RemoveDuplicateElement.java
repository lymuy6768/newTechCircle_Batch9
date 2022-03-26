package december8_homework;

import java.util.Arrays;

public class Dec8_Task2_RemoveDuplicateElement {

	public static void main(String[] args) {
//		Task2
		/*
		 * 
		 * Write a Java program to remove the duplicate elements of a given array.
		 * Sample array: [20, 20, 30, 40, 50, 50, 50] After removing the duplicate
		 * elements the program should return 4 as the new length of the array.
		 * 
		 * 
		 * 
		 * output: Original array length: 7 Array elements are: 20 20 30 40 50 50 50 The
		 * new length of the array is: 4 Array elements are: 20 30 40 50
		 */

		int[] arrNum = { 20, 20, 30, 40, 50, 50, 50 };
		int count = 0;

		Arrays.sort(arrNum);
		System.out.println(Arrays.toString(arrNum));

		for (int i = 0; i < arrNum.length - 1; i++) {
			if (arrNum[i] != arrNum[i + 1])// compare 1st with 2nd element
			{
				arrNum[count++] = arrNum[i];
			}
		}
		arrNum[count++] = arrNum[arrNum.length - 1];// once they are equal,add one,n reduce the original length by 1.
		int newArr[] = new int[count];
		for (int j = 0; j < count; j++) {
			newArr[j] = arrNum[j];

		}
		System.out.println("The new array length is: " + newArr.length);
		System.out.print((Arrays.toString(newArr)));
	}

}
