package day32_inheritance.concept;

public class Test {

	public static void main(String[] args) {
		
		SuperClass sp=new SuperClass();
		System.out.println(sp.name);
		sp.learningJava();
		
		SubClass sc= new SubClass();
		sc.teaching();
		
		System.out.println(sc.name);
		sc.learningJava();
		
		
	}

}
