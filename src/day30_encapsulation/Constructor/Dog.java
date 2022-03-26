package day30_encapsulation.Constructor;

public class Dog {
	
	//Instance variable,create directly after class
	String breed;
    String size;
    int age;
    String color;
    
    //Constructors
    //Default constructor
    
    public Dog() {}
//parameterized constructor
    public Dog(String fbreed) {
    	breed=fbreed;
    } public Dog(String fbreed,String fsize) {
    	breed=fbreed;
    	size=fsize;
    }
    public Dog(String fbreed,String fsize,int fage, String fcolor) {
    	breed=fbreed;
    	size=fsize;
    	age=fage;
    	color=fcolor;
    
    }public void showInfo() {
    	System.out.println("Breed:"+breed);
    	System.out.println("Size:"+size);
    	System.out.println("age:"+age);
    	System.out.println("color:"+color);
    
    
    } 
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
