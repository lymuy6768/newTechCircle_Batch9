package day34_abstraction.animals;

public class Cat extends Animal{
	public void walk() {
		System.out.println("I am a cat, i am walking!!");
	}
	public void makeSound() {
		System.out.println("I am a cat, i am meowing meow! meow! meow!!");
	}
	@Override
	public void eat() {
		System.out.println("Cat is eating fish!!!");
		
	}
}
