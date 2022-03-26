package day20_method;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator calculator= new Calculator();
		calculator.addition();
		calculator.subtraction();
		calculator.multiplication();
		calculator.division();
		
}
	public void addition() {
		int a=1;
		int b=2;
		int result=a+b;
		
		System.out.println(result);
}	public void subtraction() {
	int a=1;
	int b=2;
	int result=a-b;
	
	System.out.println(result);
}	
	public void multiplication() {
	int a=1;
	int b=2;
	int result=a*b;
	
	System.out.println(result);
	}
	public void division() {
		int a=1;
		int b=2;
		int result=a/b;
		
		System.out.println(result);


	}
}