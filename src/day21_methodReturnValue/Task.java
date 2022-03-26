package day21_methodReturnValue;

public class Task {

	public static void main(String[] args) {
//		1. create a method that can find the addition of two numbers
//      method name: additionOf2Numbers
//      
//      2. create a method that can find the addition of three numbers
//              method name: additionOf3Numbers
//              
//      3. create a method that can find the addition of four numbers
//              method name: additionOf4Numbers
		
		Task tk= new Task();
		
		System.out.println(tk.addition(2, 5));
		
		System.out.println(tk.addition(1, 0.5, 0.5));
		
		
		System.out.println(tk.addition(5, 5, 5, 5));
		
		
		

	}
	public int addition(int a,int b) {
		return a+b;
	}
	public double addition(double a, double b) {
		return a+b;
	}
	
	public double addition(int a,int b,double c) {
		return a+b+c;
	}
	public double addition(int a,double b, double c) {
		return a+b+c;
	}
	
	public int addition(int a, int b, int c, int d) {
		return a+b+c+d;
	}
}
