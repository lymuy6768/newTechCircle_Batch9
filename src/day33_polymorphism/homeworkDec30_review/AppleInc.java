package day33_polymorphism.homeworkDec30_review;

public class AppleInc {

	/*
	 * Create AppleInc to test your multilevel inheritance AppleInc HAS A Tester
	 * Apple HAS A Developer
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
	Person p1= new Person();
	p1.setInfo("Irfan", 30, 'M');
	
	Employee p2=new Employee();
	p2.setInfo("Danny", 20, 'F', 65, "QA Tester", 100);
	
	Tester p3 = new Tester("Famira",20,'F',75,"Selenium Automation Engineer",101);
	
	Tester p4 = new Tester();
	p4.setInfo("Jandery", 20, 'F', 50, "QA Automation Engineer", 102);
	
	Developer p5 = new Developer("Henry",25,'M',75,"Java Backend developer",103);
	
	p1.eat();
	p1.sleep();
	
	p2.eat();
	p2.sleep();
	p2.work();
	
	p3.testing();
	p3.eat();
	p3.sleep();
	p3.work();
	
	p5.work();
	p5.code();
	p5.eat();
	p5.sleep();
	
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	System.out.println(p3.toString());
	System.out.println(p4.toString());
	System.out.println(p5.toString());
	}
	

}
