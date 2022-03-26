package day29_ClassAndObject.dog;

public class DogObject {
	public static void main(String[] args) {
		Dog dog1 = new Dog(); // class instantiation, instance of dog class

        dog1.breed = "Napolitian Mastiff"; 
        dog1.size = "Large"; 
        dog1.age = 5; 
        dog1.color = "Black"; 

        dog1.eat();
        dog1.sleep(); 
        dog1.sit();
        dog1.run();
	
        Dog dog2=new Dog();
        
        dog2.breed="Maltese";
        dog2.size="Small";
        dog2.age=2;
        dog2.color="White";
        
        dog2.eat();
        dog2.sleep();
        dog2.sit();
        dog2.run();
        
        Dog dog3=new Dog();
        
        dog3.breed="Chow Chow";
        dog3.size="Medium";
        dog3.age=3;
        dog3.color="Brown";
        
        dog3.eat();
        dog3.sleep();
        dog3.sit();
        dog3.run();
	
	
	
	
	
	
	
	
	
	}

}

