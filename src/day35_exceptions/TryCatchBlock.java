package day35_exceptions;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		int a,b;
		a=7;
		b=0;
		try {
		System.out.println("Result : "+a/b);
		}catch(ArithmeticException e) {
			System.out.println("b is zero");
			e.printStackTrace();
		}
		System.out.println("Program is completed");

	}

}
