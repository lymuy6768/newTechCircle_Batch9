package day20_method;

public class CalculatorWithParameter {

	public static void main(String[] args) {
		
		CalculatorWithParameter calculator=new CalculatorWithParameter();
		
		calculator.addition(5, 15);
		calculator.addition(8, 2);
		
		calculator.subtraction(15, 5);
		
		calculator.multiplication(5, 5);
		
		calculator.division(100, 5);
		
		
	}
	
		public void addition(int a,int b) {
		//	int a=1;
		//	int b=2;
			int result=a+b;
			
			System.out.println(result);
	}	public void subtraction(int a,int b) {
		//int a=1;
		//int b=2;
		int result=a-b;
		
		System.out.println(result);
	}	
		public void multiplication(int a,int b) {
	//	int a=1;
	//	int b=2;
		int result=a*b;
		
		System.out.println(result);
		}
		public void division(int a,int b) {
		//	int a=1;
		//	int b=2;
			int result=a/b;
			
			System.out.println(result);




	}

}
