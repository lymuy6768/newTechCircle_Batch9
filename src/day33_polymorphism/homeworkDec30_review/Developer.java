package day33_polymorphism.homeworkDec30_review;

public class Developer extends Employee{
	/*
	 * Create Developer class, make it subclass of Employee. Developer IS A Employee
	 * name, age, gender, hourlyRate, jobTitle, ID create default and parameterized
	 * Constructor and make following method available. eat(), sleep(), work(),
	 * code()...
	 */
	
	public Developer() {}
	public Developer(String name,int age,char gender,double hourlyRate,String jobTitle,long ID) {
		super.setInfo(name, age, gender, hourlyRate, jobTitle, ID);
	}
	public void code() {
		System.out.println("coding");
	}
	public void work() {
		System.out.println("Developing new functionality!!");
	}
	public void eat() {
		System.out.println("eating pizza in my desk!!");
	}
	public void sleep() {
		System.out.println("sleeping only 4 hours!!!");
	}	
	
	@Override
	public String toString() {
		return "Developer [hourlyRate=" + hourlyRate + ", jobTitle=" + jobTitle + ", ID=" + ID + ", name=" + name
				+ ", age=" + age + ", gender=" + gender + "]";
	}
}
