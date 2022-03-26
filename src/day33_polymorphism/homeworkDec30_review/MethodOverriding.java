package day33_polymorphism.homeworkDec30_review;

public class MethodOverriding {

	public static void main(String[] args) {
		
//p1 can only access in person super class
		Person p1= new Tester("Famira",20,'F',75,"Selenium Automation Engineer",101);
		
		Person p2= new Developer("Jandery", 20, 'F', 50, "Front end react developer", 102);

		p1.eat();
		p1.sleep();
		
		System.out.println(p1.toString());
		
		p2.eat();
		p2.sleep();
		
		System.out.println(p2.toString());
	
	}

}
