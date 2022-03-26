package day30_encapsulation.Constructor;

public class DogObject {

	public static void main(String[] args) {
	
Dog dog1= new Dog();//created dog1 using default constructor of the dog class 

dog1.showInfo();

Dog dog2= new Dog("Neopolitan Mastiff");
dog2.showInfo();

Dog dog3= new Dog("Akita","Large");
dog3.showInfo();

Dog dog4=new Dog("Husky","Large",5,"white");
dog4.showInfo();

Dog dog5=new Dog();
dog5.breed="Pug";
dog5.size="Small";
dog5.age=3;
dog5.color="Black";

dog5.showInfo();
	}

}
