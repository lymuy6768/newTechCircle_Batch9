package day30_encapsulation.Constructor;

public class Employee {
	//instance variable
	int employeeId;
	String jobTitle;
	double salary;
	String name;
	
//default constructor
	public Employee() {}
	
	//parameterized constuctor
	public Employee(String fname,String fjobTitle,int femployeeId,double fsalary) {
		name=fname;
		jobTitle=fjobTitle;
		employeeId=femployeeId;
		salary=fsalary;
	}
	
	public void showInfo() {
		System.out.println("employeeId:"+ employeeId);
		System.out.println("job title:"+ jobTitle);
		System.out.println("salary:"+ salary);
		System.out.println("name:"+ name);
	}
	
	
}
