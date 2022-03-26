package day34_abstraction.animals;

public class AnimalTest {

	public static void main(String[] args) {
	
//		Animal a = new Animal();//can not create instance of an abstract class
//		a.makeSound();
//		a.walk();
		
		Dog d = new Dog();
		d.makeSound();
		d.walk();
		
		Animal d2= new Dog();
		d2.makeSound();
		d2.walk();
		d2.eat();
		
		Animal animals[]= {d,d2,new Dog(),new Horse(),new Cat()};
	//	System.out.println(animals.length);
		System.out.println("------------------------");
		for(int i=0;i<animals.length;i++) {
			animals[i].eat();
			animals[i].makeSound();
			animals[i].walk();
			System.out.println("++++++++++++++++++++++++");
		}
		
		

	}

}
