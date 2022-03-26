package day31_encapsulation;

public class Circle {
	
	private double radius;
	private double diameter;
	private double PI=3.14;
	private double area;
	private double perimeter;
	
	public Circle(double radius){
		
		this.radius = radius;
		this.diameter = 2*radius;
		this.area =calculateArea();
		this.perimeter = calculatePerimeter();
	
	}


	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double PI) {
		this.PI = PI;
	}

	private double calculateArea() {
		return area=PI*radius*radius;
	}
	public void setArea(double area) {
		this.area=area;
	}

	public double calculatePerimeter() {
		
		return perimeter=PI*radius*2;

	
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	
		
	}public String toString() {
        
       return "radius : "+ radius+", diameter: "+ diameter+ ", PI: "+ PI+", area: "+ 
    		   calculateArea()+", perimeter: "+ calculatePerimeter();
        
}

}