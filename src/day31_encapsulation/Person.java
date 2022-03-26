package day31_encapsulation;

public class Person {
	
	private String name;
	private String phone;
	private int age;
	private char gender;
	
	public Person(String name, String phone, int age, char gender) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	

}
