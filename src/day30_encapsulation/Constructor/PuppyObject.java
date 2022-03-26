package day30_encapsulation.Constructor;

public class PuppyObject {
	
	public static void main(String[] args) {
		Puppy tom=new Puppy();// calling default constructor or the puppy class
		System.out.println(tom.name);//default value of string, null,because no assign value to()
		
		Puppy john=new Puppy("John");//calling parameter constructor
		System.out.println(john.name);
	}

}
