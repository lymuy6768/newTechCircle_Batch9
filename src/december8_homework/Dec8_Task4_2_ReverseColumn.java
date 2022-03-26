package december8_homework;

public class Dec8_Task4_2_ReverseColumn {

	public static void main(String[] args) {
		/*
		 * task2: 3 2 1 8 7 6 5 4 13 12 11 10 9
		 */

		int[][] arr2D = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 }, { 9, 10, 11, 12, 13 } };

		/*
		 * 3 2 1 8 7 6 5 4 13 12 11 10 9
		 */
		for (int r = 0; r < arr2D.length; r++) {

			for (int c = arr2D[r].length - 1; c >= 0; c--) {
				System.out.print(arr2D[r][c] + " ");

			}
			System.out.println();
		}

	}
}