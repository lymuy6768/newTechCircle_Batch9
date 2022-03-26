package day30_encapsulation;

public class LocalVariables {
int A=50;
	public void methodA(){
		int a=10;//local variable only in this code block,only in specific method,it can accessible in this code block
		System.out.println(a);
	}
	public void methodB(){
		int a=20;//a is local varialbe
		System.out.println(a);

}
	public int methodC() {
		int a=30;//a is local varialbe
		return a;
	}
	public void methodD() {
		int a=A+20;//a is local varialbe,A is instance variable
		
	}
	
	public static void main(String[] args) {
		LocalVariables lv=new LocalVariables();
		lv.methodA();
		lv.methodB();
		int a=lv.methodC();
		System.out.println(a);
		
		for (int i = 0; i < 6; i++) {//i is local varialbe
			System.out.println(i);
			int b=i+1;//b is local variable
		}
		lv.methodD();
		System.out.println(lv.A);
}
}