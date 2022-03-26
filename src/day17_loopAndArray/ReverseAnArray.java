package day17_loopAndArray;

public class ReverseAnArray {

	public static void main(String[] args) {

		String fruits[] = { "Apple", "Orange", "Pear", "Banana" };

		String expectedArray[] = { "Banana", "Pear", "Orange", "Apple" };

		System.out.println(fruits.length);
		String fruits2[] = new String[fruits.length];

		System.out.println(fruits.length);

		System.out.println(fruits2[0]);
		System.out.println(fruits2[1]);
		System.out.println(fruits2[2]);
		System.out.println(fruits2[3]);

		fruits2[0] = fruits[3];
		fruits2[1] = fruits[2];
		fruits2[2] = fruits[1];
		fruits2[3] = fruits[0];

		System.out.println(fruits2[0]);
		System.out.println(fruits2[1]);
		System.out.println(fruits2[2]);
		System.out.println(fruits2[3]);

		System.out.println("------------");

		for (int i = fruits.length - 1; i >= 0; i--) {
			System.out.print(fruits[i]);
			if (i != 0) {
				System.out.print(",");
			}
		}

	}

}
