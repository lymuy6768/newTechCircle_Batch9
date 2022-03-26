package december8_homework;

import java.util.Arrays;

public class Dec8_Task7_MaxAndMinAndUniqueValue {

	public static void main(String[] args) {
//		1. create a function that can print out the maximum number from any given integer array
//			2. create a function that can print out the minimum number from any given integer array
//			3. create a function that can print the unique elements from the array

		Dec8_Task7_MaxAndMinAndUniqueValue mNU = new Dec8_Task7_MaxAndMinAndUniqueValue();
		int arr[] = { 20, 30, 40, -50, 8860, 20, 120, 30 };
		mNU.maxNumberFromArr(arr);
		mNU.minimumNumberFromArr(arr);

		mNU.printUniqueElements(arr);

	}

	public static void printUniqueElements(int[] arr) {
		int count = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[count++] = arr[i];
			}
		}
		arr[count++] = arr[arr.length - 1];
		int newArr[] = new int[count];
		for (int j = 0; j < count; j++) {
			newArr[j] = arr[j];
		}
		System.out.println(Arrays.toString(newArr));
	}

	private static int minimumNumberFromArr(int arr[]) {

		int minNumber = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minNumber)
				minNumber = arr[i];

		}
		System.out.println("The min number is: " + minNumber);
		return minNumber;

	}

	private static int maxNumberFromArr(int arr[]) {

		int maxNumber = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxNumber)
				maxNumber = arr[i];
		}
		System.out.println("The max number is: " + maxNumber);
		return maxNumber;

	}
}