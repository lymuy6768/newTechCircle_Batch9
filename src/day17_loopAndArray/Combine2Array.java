package day17_loopAndArray;

import java.util.Arrays;

public class Combine2Array {

	public static void main(String[] args) {

		// write a program to combine below 2 arrays
		// output:{1,2,3,4,5,6,7,8,9,10}
		int num1[] = { 1, 2, 3, 4, 5 };
		int num2[] = { 6, 7, 8, 9, 10 };

		int num3[] = new int[num1.length + num2.length];

		System.out.println(num3.length);
		int position = 0;

		System.out.println(Arrays.toString(num3));

		for (int i = 0; i < num1.length; i++) {
			num3[position] = num1[i];
			position++;
		}
		System.out.println(Arrays.toString(num3));


		for (int i = 0; i < num2.length; i++) {
			num3[position] = num2[i];
			position++;
		}
		System.out.println(Arrays.toString(num3));

	}

}
