package day29_ClassAndObject.dog;

public class Dog {
	
	//Instance variable,create directly after class
	String breed;
    String size;
    int age;
    String color;
	

    public void eat() {
        System.out.println(breed+ " Eating");

    }

    public void sleep() {
        System.out.println(breed+" Sleeping");

    }

    public void sit() {
        System.out.println(breed+" Sitting");

    }

    public void run() {
        System.out.println(breed+" running");
}
}