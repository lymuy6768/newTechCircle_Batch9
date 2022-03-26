package day24_WrappierClass_ReviewMethod;

import java.util.Arrays;

public class UniqueCharacter {

	public static void main(String[] args) {
		
		String myString="irfan";
		System.out.println(myString.contains("a"));
		
		int nums[]= {20,20,30,40,50,50,50};
		String str="";
		
		for(int a=0;a<nums.length;a++) {
			String num=nums[a]+"";//convert number to string
			System.out.println(num);
			if(!str.contains(num)) {
				str+=num+",";//split by ,
			}
		}
		System.out.println(str);
		
		str=str.substring(0, str.length()-1);
		System.out.println(str);
		
		String numArr[]=str.split(",");
		System.out.println(Arrays.toString(numArr));
		
		
		
		
		
		
	}

}
