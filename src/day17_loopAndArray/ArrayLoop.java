package day17_loopAndArray;

public class ArrayLoop {

	public static void main(String[] args) {
		// 0 1 2 3 4
		int[] nums = { 33, 22, 11, 44, 55 };

		System.out.println(nums.length);// length is attic

		System.out.println(nums[4]);

		System.out.println(nums[nums.length - 1]);

		System.out.println("--------------");
		String str = "abc";
		System.out.println(str.length());// length is method of string

		System.out.println(str.charAt(str.length() - 1));
		System.out.println("-----------");

	}

}
