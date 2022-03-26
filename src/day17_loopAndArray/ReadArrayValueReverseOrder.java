package day17_loopAndArray;

public class ReadArrayValueReverseOrder {

	public static void main(String[] args) {

		// 0 1 2 3 4
		int[] nums = { 33, 22, 11, 44, 55 };

		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		System.out.println("----------");

		for (int i = nums.length - 1; i >= 0; i--) { // -1,cos length is start with 1,so has 1 extra
			System.out.print(nums[i]);

			if (i != 0) {
				System.out.print(",");// remove ,when the condition to run to 0,
			}
		}
	}

}
