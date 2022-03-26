package week7_Review;

import java.util.Arrays;

public class Methods {

	public static void main(String[] args) {
		
		RandomNumber ran =  new RandomNumber();
		
		int x=ran.randomInt();
		
		int x2=ran.randInt(1, 100);
		
		int[] arr= {ran.randomInt(),ran.randomInt()};
		
		System.out.println(Arrays.toString(arr));
		
		int[] arr2=new int[100];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=ran.randomInt();
			
		}
		int [][]arr3= new int[100][100];
		for (int i = 0; i < arr3.length; i++) {
			for(int j=0;j<arr3[i].length;j++) {
				arr3[i][j]=ran.randomInt();
			}
			
		}System.out.println(Arrays.toString(arr3[1]));
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(Arrays.toString(arr3[i]));	
		}
		
		
	} 
	static void printHello() {
		System.out.println("Hello");
	}
	static void printThis(String x) {
		System.out.println(x);
	}
	static void printThis(String x,String x2) {
		System.out.println(x+x2);
	}
	static void printThis(String msg,int howManyTimesToPrint) {
		for (int i = 0; i <=howManyTimesToPrint; i++) {
			System.out.println(msg);
		}
		}
	static void printThis(int x,int x2) {
		System.out.println(x+x2);
	}
}
