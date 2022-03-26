package day16_arrays;

public class arraySelf {

	public static void main(String[] args) {

		int a[] = new int[5];// declaration and instantiation

		a[0] = 10; // initialization
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;

//traversing array

		for (int i = 0; i < a.length; i++)// length is the property of array {

			System.out.println(a[i]);
		System.out.println(a.length);

		int b[] = { 33, 3, 4, 5 };
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);

			System.out.println("-------------");

			int arr[] = { 33, 3, 4, 5 };
			for (int j : arr) {
				System.out.println(j);
			}
			for (int c = 0; c < 3; c++) {
				for (int k = 0; k < 5; k++) {

					System.out.println(c);
				}

			}

		}

	}
}
