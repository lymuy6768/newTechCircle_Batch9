package day27_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineListTest {

	public static void main(String[] args) {
		
	ArrayList<Integer> nums= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
	ArrayList<Integer> nums2= new ArrayList<>(nums);	

	ArrayList<Integer> nums3= new ArrayList<>();
	
	System.out.println(nums.size());
	System.out.println(nums2.size());
	System.out.println(nums3.size());
	
	nums3.addAll(nums2);
	nums3.addAll(nums);
	System.out.println(nums);
	System.out.println(nums2);
	System.out.println(nums3);
	
	ArrayList<String> list1= new ArrayList<>(Arrays.asList("a","b","c","d"));
	ArrayList<String> list2= new ArrayList<>(Arrays.asList("e","f"));
	
	list1.addAll(list2);
	System.out.println(list1);
	
	list1.addAll(2, list2);
	System.out.println(list1);
	
	
	}

}
