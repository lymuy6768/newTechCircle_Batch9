package day21_methodReturnValue;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading md= new MethodOverLoading();
		
		System.out.println(md.sumOfTwoNum(3, 5));
		System.out.println(md.sumOfTwoNum(4, 5.5));
		
		md.sumOfTwoNum();
		System.out.println(md.sumOfTwoNum(0.4, 0.8));
		
		
		

	}

	public int sumOfTwoNum(int a,int b) {
		return a+b;
		
	}
	
	public double sumOfTwoNum(int a,double b) {
		return a+b;
	}
	public double sumOfTwoNum(double a,double b) {
		return a+b;
	}
	public void sumOfTwoNum() {
		int a=5;
		int b=4;
		System.out.println(a+b);
	}
}