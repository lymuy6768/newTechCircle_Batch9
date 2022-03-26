package december8_homework;

import java.util.Arrays;

public class Dec8_Task5_FindMaxAndMinValue {

	public static void main(String[] args) {
		/*
		 * Task5:
		 * 
		 * int[][] arr2D = { {1,2,3,4}, {5,600} , {7,8,9}, {10,11,12}, {13,14,15, 16,
		 * 17} };
		 * 
		 * Create a java program to find max and min value of arr2D.
		 */
		int[][] arr2D = { { 1, 2, 3, 4 }, { 5, 600 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15, 16, 17 } };

		int maxValue = arr2D[0][0];
		int minValue = arr2D[0][0];

		for (int r = 0; r < arr2D.length; r++) {
			for (int c = 0; c < arr2D[r].length; c++) {

				if (arr2D[r][c] > maxValue) {
					maxValue = arr2D[r][c];

				}

				if (arr2D[r][c] < minValue) {
					minValue = arr2D[r][c];
				}

			}
		}
		System.out.println("Minimum value is: " + minValue);
		System.out.println("Maximum value is: " + maxValue);

	}

}
