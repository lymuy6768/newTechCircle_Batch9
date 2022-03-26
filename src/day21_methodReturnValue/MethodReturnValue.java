package day21_methodReturnValue;

public class MethodReturnValue {

	public static void main(String[] args) {
		
		MethodReturnValue mr = new MethodReturnValue();
		mr.add2Value(2, 3);
		int result=mr.add2Value(2, 3);
		System.out.println(result);
		
		int result2=mr.add2Value(30, 25);
		System.out.println(result+result2);
		
		int result3=mr.add2Value(100, 200)+mr.add2Value(100, -200);
		
		System.out.println(result3);
		
		

	}

	public int add2Value(int a,int b) {
		int result=a+b;
		//System.out.println(result);
		return result;
	}
	
	
	
	
	
	
	
}
