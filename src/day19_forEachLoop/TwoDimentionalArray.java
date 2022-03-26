package day19_forEachLoop;

import java.util.Arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		//				0 1 2 3 4
		int numArr1[]= {1,2,3,4,5};//1st row
		//				0 	1 2	 3   4
		int numArr2[]= {11,22,33,44,55};//2nd row
		//				0	1	2	3	4
		int numArr3[]= {111,222,333,444,555};//3rd row
		
		
		int nums[][]= {numArr1,numArr2,numArr3};
	//	int numArr4[][]= {{1,2,3,4,5},{11,22,33,44,55},{111,222,333,444,555}};
		System.out.println(Arrays.toString(numArr1));
		System.out.println(nums[0]);
		System.out.println(Arrays.toString(nums[0]));
		
		System.out.println(numArr1[0]);
		System.out.println(nums[0][0]);
		System.out.println(nums[1][2]);
		System.out.println(nums[2][1]);
		System.out.println(nums[0][3]);
		System.out.println(nums[2][4]);
		
		
		
		
	}

}
