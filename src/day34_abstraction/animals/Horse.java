package day34_abstraction.animals;

public class Horse extends Animal{
	public void walk() {
        System.out.println("I'm a Horse, I'm walking");
    }
    
    public void makeSound() {
        System.out.println("I'm a Horse, neighing!!");
}

	@Override
	public void eat() {
		System.out.println("Horse is eating apple!!!");
		
	}
}
