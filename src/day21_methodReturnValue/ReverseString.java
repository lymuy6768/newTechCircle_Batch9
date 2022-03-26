package day21_methodReturnValue;

public class ReverseString {

	public static void main(String[] args) {
		//ABC to //CBA
		StringBuilder sb= new StringBuilder();
		
		sb.append("ABC");// string concatenating
		sb.append("DEF");
		
		sb.reverse();
		sb.append(123);
		
		System.out.println(sb.toString());

		ReverseString rs = new ReverseString();
		
		
		String result = rs.reverseString("ABC123123123");
		
		System.out.println(result);
		
}
	public String reverseString(String str) {
StringBuilder sb = new StringBuilder();
		
		sb.append(str);
		
		return sb.reverse().toString();
		
	

		
		
}
}