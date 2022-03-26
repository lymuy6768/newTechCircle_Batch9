package december8_homework;

public class Dec8_Task4_3_ReverseAllElement {

	public static void main(String[] args) {
		/*
		 * task3: 13 12 11 10 9 8 7 6 5 4 3 2 1
		 */

		int[][] arr2D = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 }, { 9, 10, 11, 12, 13 } };

		for (int r = arr2D.length - 1; r >= 0; r--) {
			for (int c = arr2D[r].length - 1; c >= 0; c--) {
				System.out.print(arr2D[r][c] + " ");
			}
			System.out.println();
		}
	}

}
