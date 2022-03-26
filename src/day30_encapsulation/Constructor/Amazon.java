package day30_encapsulation.Constructor;

public class Amazon {

	public static void main(String[] args) {
		
		Employee Aim=new Employee();
		Aim.showInfo();
		Aim.employeeId=20001;
		Aim.jobTitle="SDET";
		Aim.salary= 150000;
		Aim.name="Aim";
		
		Aim.showInfo();
		//calling parameterized constructor of the employee class
		Employee Henry=new Employee("Henry","Software Engineer",20002,180000);
		Henry.showInfo();
	}

}
