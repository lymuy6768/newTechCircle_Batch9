package day17_loopAndArray;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		int nums[] = { 2, 4, 1, 2, 5, 7 };

		System.out.println(Arrays.toString(nums));

		Arrays.sort(nums);

		System.out.println(Arrays.toString(nums));

		String fruits[] = { "Apple", "Orange", "Pear", "Banana" };

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);

			// System.out.println(Arrays.toString(fruits));

			Arrays.sort(fruits);
			// System.out.println(Arrays.toString(fruits));
			System.out.println("after sorting the fruits arrays");

			for (int a = 0; a< fruits.length; a++) {
				System.out.println(fruits[a]);

			}

		}
	}

}
