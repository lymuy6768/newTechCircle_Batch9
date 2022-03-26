package december8_homework;

import java.util.Arrays;

public class Dec8_Task1_MoveAll0ToTheEndOfArray {

	public static void main(String[] args) {
		// Task1:

		/*
		 * Write a Java program to move all 0's to the end of an array. Maintain the
		 * relative order of the other (non-zero) array elements.
		 * 
		 * int[] array_nums = {0,0,1,0,3,0,5,0,6};
		 * 
		 * 
		 * Original array: 0 0 1 0 3 0 5 0 6 After moving 0's to the end of the array: 1
		 * 3 5 6 0 0 0 0 0
		 */
		int[] arrayNums = { 0, 0, 1, 0, 3, 0, 5, 0, 6 };
		int[] newArr = new int[arrayNums.length];

		int position = 0;

		for (int i = 0; i < arrayNums.length; i++) {
			System.out.println(arrayNums[i]);
			if (arrayNums[i] != 0) {

				newArr[position] = arrayNums[i];
				position++;

			}
		}

		System.out.println(Arrays.toString(arrayNums));

		System.out.println(Arrays.toString(newArr));

	}
}