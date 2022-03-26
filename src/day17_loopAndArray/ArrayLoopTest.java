package day17_loopAndArray;

public class ArrayLoopTest {

	public static void main(String[] args) {

//		0	1  2  3  4
		int[] nums = { 33, 22, 11, 44, 55 };

		System.out.println(nums[2]);
		for (int i = 0; i < nums.length; i++) {// i<5,5 is hardcode value
			// System.out.println(i);
			System.out.println(nums[i]);

		}
		for (int i = 0; i < nums.length; i++) {
			// System.out.println(i);
			System.out.println("nums[0]=33");

			System.out.println("nums[" + i + "]=" + nums[i]);

		}

	}

}
