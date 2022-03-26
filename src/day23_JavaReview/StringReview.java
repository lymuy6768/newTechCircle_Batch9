package day23_JavaReview;

public class StringReview {
	
	public String reverseString(String str) {
		String reversed="";
		for (int i=str.length()-1;i>=0;i++) {
			reversed=reversed+str.charAt(i);
		}
		return reversed;
		
	
	
	

	}public static void main(String[] args) {
		
		String str ="Techcircle";
		String str2 = new String();
		
		System.out.println(str2.length());
		
		int a =str.length();
		System.out.println(a);
		System.out.println(str.length());
		
		int b=str2.length();
		
		if(a==0) {
			System.out.println(str+ "is empty string");
		}else {
			System.out.println(str.concat(" is not empty string"));
		}

		System.out.println(str.isEmpty());
		if(str.isEmpty()) {
			System.out.println();
		}
		System.out.println("-------------");
		String str1 ="TechCircle";
		String reversed=" ";
		for (int i = str1.length()-1; i >=0; i--) {
			System.out.println(str1.charAt(i));
			reversed=reversed+str.charAt(i);
			
		}System.out.println(reversed);
		System.out.println("-------");
	String str3=reversed.toUpperCase();
	String str4=reversed.toLowerCase();
	String str5=str3.substring(0,1)+str4.substring(1);//str3 keepE,str4 keep 
	System.out.println(str5);
	
		System.out.println(str3);//
	
		
		
		
	}

}
