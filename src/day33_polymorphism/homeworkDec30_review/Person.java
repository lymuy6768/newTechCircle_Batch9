package day33_polymorphism.homeworkDec30_review;

public class Person {
	/*
	 * Multilevel Inheritance in Java
	 * 
	 * Person name, age, gender setInfo, eat(), sleep()
	 */
	String name;
	int age;
	char gender;
	
	public void setInfo(String name,int age,char gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void eat() {
		System.out.println("Person is eating.");
	}
	public void sleep() {
		System.out.println("Person is sleeping.");
}
	public String toString() {
		return"{name: "+name+ ", age : "+age+" ,gender: "+gender+ ".}";
	}
}