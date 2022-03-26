package day33_polymorphism.homeworkDec30_review;

public class Tester extends Employee {
	/*
	 * Create Tester class, make it subclass of Employee. Tester IS A Employee name,
	 * age, gender, hourlyRate, jobTitle, ID create default and parameterized
	 * Constructor and make following method available. eat(), sleep(), work(),
	 * testing(),...
	 */
	
	public Tester() {}
	public Tester(String name,int age,char gender,double hourlyRate,String jobTitle,long ID) {
		super.setInfo(name, age, gender, hourlyRate, jobTitle, ID);
	}
	public void testing() {
		System.out.println("Running smoke testing.");
	}
	public void work() {
		System.out.println("Testing my application!!");
	}
	}
