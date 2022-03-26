package december8_homework;

public class Dec8_Task4_1_ReverseRow {

	public static void main(String[] args) {

		/*
		 * 
		 * 
		 * int[][] arr2D = { {1,2,3} , {4,5,6,7,8} , {9,10,11,12,13} }; // 0 1 2
		 * 
		 * Create a program to print below output.
		 * 
		 * task1: 9 10 11 12 13 4 5 6 7 8 1 2 3
		 */
		int[][] arr2D = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 }, { 9, 10, 11, 12, 13 } };

		for (int r = arr2D.length - 1; r >= 0; r--) {
			// System.out.println(arr2D[i]);
			for (int c = 0; c < arr2D[r].length; c++) {
				System.out.print(arr2D[r][c] + " ");
			}
			System.out.println();
		}

	}

}
