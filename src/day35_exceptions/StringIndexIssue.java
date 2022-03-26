package day35_exceptions;

public class StringIndexIssue {

	public static void main(String[] args) {
		String str = "Welcome";
		
		char chars[] = str.toCharArray();
		try {
		for(int i=0;i<=chars.length;i++) {
		System.out.println(chars[i]);
		}
		}catch(Exception e) {
			System.out.println("String index problem");
		//	e.printStackTrace();
		}
	}

}
