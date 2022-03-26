package day19_forEachLoop;

import java.util.Arrays;

public class LoopingMultidementionalArray {

	public static void main(String[] args) {
		
		int numArr1[]= {1,2,3,4,5};//1st row
		//				0 	1 2	 3   4
		int numArr2[]= {11,22,33,44,55};//2nd row
		//				0	1	2	3	4
		int numArr3[]= {111,222,333,444,555,666};//3rd row

		int nums[][]= {numArr1,numArr2,numArr3};
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(Arrays.toString(nums[i]));
	//	System.out.println("-----------");
			for(int j=0;j<nums[i].length;j++) {
		
		//	System.out.println(nums[i][j]);
			
			System.out.println("nums["+i+"]["+j+"]="+nums[i][j]);
	//	
		
		
			}	
	}
	}
}
