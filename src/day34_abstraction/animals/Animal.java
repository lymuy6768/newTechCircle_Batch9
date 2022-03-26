package day34_abstraction.animals;

public abstract class Animal {
	public void walk() {
		System.out.println("walking!");
	}
	public void makeSound() {
		System.out.println("Animal is making sound!!");
	}
	public abstract void eat();
	
}
