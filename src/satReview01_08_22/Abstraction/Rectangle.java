package satReview01_08_22.Abstraction;

public class Rectangle extends Shape{

	private double length;
	private double width;
	
	public Rectangle(String color,double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		
		return length*width;
	}

	@Override
	public void print() {
		System.out.println("Rectangle color is: "+ super.getColor()
				+ " and area is: "+ area());		
	}
	
	
	
}
