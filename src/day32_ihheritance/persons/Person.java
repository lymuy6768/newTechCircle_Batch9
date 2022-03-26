package day32_ihheritance.persons;

public class Person {
	String name;
	int age;
	char gender;
	
	public Person() {}
	public Person(String name,int age, char gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void setInfo(String name,int age,char gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void eat() {
		System.out.println(name+ " is eatting!");
	}
	public void sleep() {
		System.out.println(name + " is sleeping");
	}
	
}
