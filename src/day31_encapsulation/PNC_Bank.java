package day31_encapsulation;

public class PNC_Bank {

	public static void main(String[] args) {
		
		Employee p1= new Employee();//create instance employee by calling default constructor
	//	p1.age=30;
		p1.setAge(20);
	//	p1.gender='F';
		p1.setGender('F');
	//	p1.job_title="QA Automation Engineer";
		p1.setJob_title("QA Automation Engineer");
	//	p1.name="Dilara";
		p1.setName("Mary");
	//	p1.salary=20000;
		p1.setSalary(200000);
	//	p1.ssn="123-123-1234";
		p1.setSSN("123_123_1235");
		
/*	System.out.println(p1.toString());
	
	System.out.println(p1.getAge());
	System.out.println(p1.getName());
	System.out.println(p1.getJob_title());
	System.out.println(p1.getSalary());*/
	
//	p1.age=18;
//	p1.gender='F';
//	p1.job_title="QA Automation Engineer";
//	p1.name="Dilara";
//	p1.salary=120000;
//	p1.ssn="123-123-1234";

	Employee p2=new Employee("Jenny",30,"123-123-4567",'F',"SDET",135000,false,0);
	
	Employee p3=new Employee("Pete",26,"123-123-4568",'M',"Software Engineer",0,true,70);
	
	System.out.println(p1.calculationSalary());
	System.out.println(p2.calculationSalary());
	System.out.println(p3.calculationSalary());
	
	}

}
