package day29_ClassAndObject.dog;

public class StudentObject {
public static void main(String[] args) {
	
	
	Student student1= new Student();
	student1.name="John";
	student1.age=12;
	student1.color="Fair";
	student1.sex="Male";
	
	student1.eat();
	student1.drink();
	student1.run();
	
	Student student2=new Student();
	student2.name="Sophia";
	student2.age=10;
	student2.color="Fair";
	student2.sex="Female";
	
	student2.eat();
	student2.drink();
	student2.run();
	
	Student student3=new Student();
	student3.name="Lily";
	student3.age=10;
}
}
