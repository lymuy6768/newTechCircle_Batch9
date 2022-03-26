package day30_encapsulation.Constructor;

public class Puppy {

	/*public Puppy(String name) {// default constructor,
		System.out.println("Passed Name is:" +name);
	}

	
	public static void main(String[] args) {
		Puppy myPuppy=new Puppy("tommy");
	}*/
	
	String name;
	
	public Puppy() {}//default constructor
	
	//parameterized constructor
	public Puppy(String str) {// the same class name Puppy ,
		name=str;
	}
}
