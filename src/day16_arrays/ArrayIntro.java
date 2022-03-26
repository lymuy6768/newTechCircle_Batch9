package day16_arrays;

public class ArrayIntro {

	public static void main(String[] args) {

		int numbers[] = new int[6];
		System.out.println(numbers[0]);
		System.out.println(numbers[4]);
		System.out.println(numbers[5]);

		numbers[0] = 60;
		System.out.println(numbers[0]);

		numbers[1] = 60;
		numbers[2] = 60;
		numbers[3] = 60;
		numbers[4] = 60;
		numbers[5] = 60;
		numbers[2] = 100;
		System.out.println("----------------");

		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);

		System.out.println(numbers[5]);
		System.out.println("----------");

		String Cars[] = { "BMW", "Ford", "Mazda", "Tesla", "Toyota" };

		System.out.println("Cars at Element 1: " + Cars[0]);
		System.out.println("Cars at Element 2: " + Cars[1]);
		System.out.println("Cars at Element 3: " + Cars[2]);
		System.out.println("Cars at Element 4: " + Cars[3]);
		System.out.println("Cars at Element 5: " + Cars[4]);
		System.out.println("Cars at Element 6: " + Cars[5]);

	}

}
