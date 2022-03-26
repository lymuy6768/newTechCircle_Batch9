package day32_inheritance.car;

public class Toyota extends Car {
	  // variable : brand, model, color. madeIn, year, miles, price 
    // method : setInfo, drive, park ,toString 


// isAffordable
	boolean isAfordable=true;
	
	public Toyota() {
		brand="Toyota";
	}
	
	public Toyota(String model,String color,int year, int miles,double price) {
		setInfo("Toyota",model,color,"Japan",year,miles,price);
	
	}
}
