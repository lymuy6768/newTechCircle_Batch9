package day32_inheritance.car;

public class BMW extends Car {
// Car is super class, BMW is sub class,and inherits all instance variable
//and instance method
	boolean isExpensive=true;
	boolean isLuxury=true;
	boolean breaksAlot=true;
	
	public BMW() {//BMW default constructor
		brand="BMW";
	}
	public BMW(String model, String color, int year, int miles,double price){
		//parameter constructor
		setInfo("BMW",model,color,"Germany",year,miles,price);
	}
	
	
	
	public void race() {
		System.out.println(brand+" "+ model+"is racing!");
	}
	
}
