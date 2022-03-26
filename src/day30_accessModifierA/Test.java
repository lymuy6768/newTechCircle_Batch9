package day30_accessModifierA;

public class Test {

	public static void main(String[] args) {
		
		Modifiers m=new Modifiers();
		System.out.println(m.a_default);
		m.methodA();
		
		System.out.println(m.c_protected);
		m.methodC();
		
		System.out.println(m.d_public);
		m.methodD();
		
		m.callAllTheMethods();//can call private, cos the method is in public void

	}

}
