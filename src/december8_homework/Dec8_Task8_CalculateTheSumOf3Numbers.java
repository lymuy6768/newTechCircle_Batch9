package december8_homework;

public class Dec8_Task8_CalculateTheSumOf3Numbers {

	public static void main(String[] args) {
		// Write a method that calculates the sum of 3 numbers

		Dec8_Task8_CalculateTheSumOf3Numbers sum3 = new Dec8_Task8_CalculateTheSumOf3Numbers();

		int result = sum3.sumOf3Numbers(10, 20, 30);
		int result1 = sum3.sumOf3Numbers(2, 2, 2);

		System.out.println(result);
		System.out.println(result1);

	}

	private static int sumOf3Numbers(int a, int b, int c) {

		int result = a + b + c;
		return result;

	}

}
