package day21_methodReturnValue;

import java.util.Arrays;

public class DescendingOrder {

	public static void main(String[] args) {
	
		
	
	
	
	}

	
	
	
	
	
	
	public int[] intArrayDescendingOrder(int arr[]) {
		
		int input[]= {2,4,1,3,5};
		
		Arrays.sort(input);
		int resultArr[]= new int[input.length];
		//System.out.println(Arrays.toString(input));
		
		int index=0;
	for(int i=input.length-1;i>=0;i-- ) {
			//System.out.println(input[i]);
			
			resultArr[index]=input[i];
			index++;
		
	}
	return resultArr;
	
	}
	}
