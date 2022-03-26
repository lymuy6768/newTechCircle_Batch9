package day32_inheritance.car;

public class Car {
	
	String brand,model,color,madeIn;
	int year,miles;
	double price;
	boolean hasEngine=true;
	boolean hasWheel=true;
	boolean hasTires=true;

	public void setInfo(String brand,String model,String color,String madeIn,int year,int miles,double price) {
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.madeIn=madeIn;
		this.year=year;
		this.miles=miles;
		this.price=price;
		
	}	
	public void drive() {
		System.out.println("Driving"+ brand+" "+ model);
		
	}public void park() {
		System.out.println("Parking"+ brand+" "+ model);
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", year=" + year + ", price=" + price
				+ "]";
	}
	
	
	

}
