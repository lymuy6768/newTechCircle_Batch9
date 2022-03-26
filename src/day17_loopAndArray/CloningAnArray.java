package day17_loopAndArray;

import java.util.Arrays;

public class CloningAnArray {

	public static void main(String[] args) {

		int a[] = { 1, 8, 5 };

		int b[] = new int[a.length];// assign empty array

		System.out.println(a.length);
		System.out.println(b.length);

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));// not assign any value yet

		b = a;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

}
