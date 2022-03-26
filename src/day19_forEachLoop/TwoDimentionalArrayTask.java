package day19_forEachLoop;

import java.util.Arrays;

public class TwoDimentionalArrayTask {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};
        int[] b = {5,6};
        int[] c = {7,8,9};
        int[] d = {10,11,12};
        int[] e = {13,14,15,16, 17};
		
       int nums[][]= {a,b,c,d,e};
       
       for(int[]irfan:nums) {//for each loop 1[]
    	//   System.out.println(Arrays.toString(irfan));
    	   
    	   for(int value:irfan) {
    		   System.out.println(value);
    	   }
    	   
    	   
    	   
       }
       
       
       
       
       
       
       
       
       
       
       
       
//        for(int i=0;i<a.length;i++) {
//        	int arr[]=nums[i];
//        	
//        	System.out.println(Arrays.toString(arr));
//      //  	System.out.println(Arrays.toString(nums[i]));
//        	
//        	for(int j=0;j<arr.length;j++) {
//       		System.out.println(arr[j]);
//        	
//        	
//        }
//        }
        }	

	}


