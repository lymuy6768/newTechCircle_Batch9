package homeWork_Dec15Review;

public class reverseStrPalindrome {

	public static void main(String[] args) {
		
		reverseStrPalindrome hw=new reverseStrPalindrome();
		String str1 = "TechCircle";
		
		String str2 = hw.reverse(str1);
		
		System.out.println(str2);

	}

	//task3. Reverse String

	public String reverse(String str) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		return sb.toString();
	
		
	}
	public boolean isPalindrome(String str) {
		return false;
		
	}
	
}
