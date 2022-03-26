package day30_accessModifierA;

public class Modifiers {
	
	int a_default=10;//default access modifier
	
	private int b_private=20;
	protected int c_protected=30;
	public int d_public=40;

	void methodA() {
		System.out.println("Default");
	}
	private void methodB() {
		System.out.println("Private");
	}
	protected void methodC() {
		System.out.println("Protected");
	}
	public void methodD() {
		System.out.println("Public");
	}
	public void useAllTheVariable() {
		System.out.println(a_default);
		System.out.println(b_private);
		System.out.println(c_protected);
		System.out.println(d_public);
	}
	public void callAllTheMethods() {
		methodA();
		methodB();
		methodC();
		methodD();
	}
	public static void main(String[] args) {
		
	Modifiers m= new Modifiers();
	System.out.println(m.a_default);
	System.out.println(m.b_private);
	System.out.println(m.c_protected);
	System.out.println(m.d_public);
		
		
		
		
		
	}
}
