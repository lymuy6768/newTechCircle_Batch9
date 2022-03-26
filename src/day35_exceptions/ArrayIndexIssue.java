package day35_exceptions;

public class ArrayIndexIssue {

	public static void main(String[] args) {
		try {
		int nums[]= {1,2,3,4,5};
		
		System.out.println(nums[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("Line number 11");

	}

}
