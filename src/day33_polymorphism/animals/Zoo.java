package day33_polymorphism.animals;

public class Zoo {

	public static void main(String[] args) {
		
		Cat c= new Cat();
		c.walk();
		c.makeSound();
	//	test(c);
		
		Dog d=new Dog();
		d.walk();
		d.makeSound();
	//	test(d);
		
		Horse h= new Horse();
		h.walk();
		h.makeSound();
	//	test(h);
		
//		Animal a= new Cat();
//		a.walk();
//		a.makeSound();

	}
	public static void test(Cat c) {
		c.walk();
		c.makeSound();
	}
	public static void test(Dog d) {
		d.walk();
		d.makeSound();
	}
	public static void test(Horse h) {
		h.walk();
		h.makeSound();
	}
}
