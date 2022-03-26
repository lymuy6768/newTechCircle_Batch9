package day34_abstraction.animals;

public class Dog extends Animal {
	public void walk() {
		System.out.println("I am a dog, i am walking!!");
	}
//	public void makeSound() {
//		System.out.println("I am a dog, i am barking Woof Woof Woof!!");
	//}
	@Override
	public void eat() {
		System.out.println("Dog is eating food!");
	}
}
