package day33_polymorphism.homeworkDec30_review;

public class Employee extends Person {
	/*
	 * Create Employee class, make it subclass of Person. Employee IS A Person
	 * 
	 * name, age, gender, hourlyRate, jobTitle, ID setInfo, eat(), sleep(), work()
	 */
	
	double hourlyRate;
	String jobTitle;
	long ID;
	
	public void setInfo(String name,int age,char gender,double hourlyRate,String jobTitle,long ID) {
		super.setInfo(name, age, gender);
		this.hourlyRate=hourlyRate;//setinfo only for instance that super class dont have
		this.jobTitle=jobTitle;
		this.ID=ID;
	}
	
	public void work() {
		System.out.println("Employee is working.");
	}@Override
	public String toString() {
		return "Employee [hourlyRate=" + hourlyRate + ", jobTitle=" + jobTitle + ", ID=" + ID + ", name=" + name
				+ ", age=" + age + ", gender=" + gender + "]";
	}
}

