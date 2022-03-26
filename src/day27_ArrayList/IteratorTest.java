package day27_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
		
		Iterator i=nums.iterator();
		while(i.hasNext()) {//has next check if u have next element
			System.out.println(i.next());//check next element
		}
		
		
		
		int count=0;
		
		do{
			System.out.print(nums.get(count));
			System.out.print(",");
			count++;
		}
		while(count<nums.size());
		
	}

}
