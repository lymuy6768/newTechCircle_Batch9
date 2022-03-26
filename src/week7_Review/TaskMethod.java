package week7_Review;

import java.util.Arrays;

public class TaskMethod {

	public static void main(String[] args) {
		
		int[] x4=makeArr(10);
		fillOutArry(x4);
		printArr(x4);
		changeAllIdexsToZero(x4);
		
		

	}

	private static void changeAllIdexsToZero(int[] x4) {
		for (int i = 0; i < x4.length; i++) {
			x4[i]=0;
			System.out.println();
		}		
	}

	private static void printArr(int[] x4) {
		System.out.println(Arrays.toString(x4));
		
	}

	private static void fillOutArry(int[] x4) {
	//	RandomNumber ran=new RandomNumber();
	for (int i = 0; i < x4.length; i++) {
	//	x4[i]=ran.randomInt();
	}
		
	}

	private static int[] makeArr(int i) {
		int []x= new int[i];
		return x;
	}
	
		
	
	}
		

