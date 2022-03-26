package day17_loopAndArray;

import java.util.Arrays;

public class ArrayEqual {

	public static void main(String[] args) {

		int nums1[] = { 1, 2, 3, 4, 5 };
		int nums2[] = { 5, 4, 3, 2, 1 };
		int nums3[] = { 1, 10, 20 };

		System.out.println(nums1.equals(nums2));

		System.out.println(Arrays.toString(nums2));
		Arrays.sort(nums1);// sort before compare
		Arrays.sort(nums2);

		System.out.println(Arrays.toString(nums2));

		System.out.println(Arrays.equals(nums1, nums2));

		System.out.println(Arrays.equals(nums1, nums3));
		System.out.println(Arrays.equals(nums2, nums3));

	}

}
