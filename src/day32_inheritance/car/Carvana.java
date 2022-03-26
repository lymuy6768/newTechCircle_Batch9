package day32_inheritance.car;

public class Carvana {

	public static void main(String[] args) {
		
		BMW x5= new BMW();
		System.out.println(x5.brand);
		
		System.out.println(x5.toString());
		
		BMW car2=new BMW("x5","white",2022,105,65000);
		
		car2.drive();//these 2 method from superclasee
		car2.park();
		car2.race();//race method from sub class
		System.out.println(car2.toString());
		System.out.println("-------------------");
		Toyota camry= new Toyota("Camry","white",2021,208,23000);
		camry.drive();
		camry.park();
		System.out.println(camry.toString());
		System.out.println(camry.isAfordable);
	}

}
