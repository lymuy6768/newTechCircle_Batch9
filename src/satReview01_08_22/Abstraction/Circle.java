package satReview01_08_22.Abstraction;

public class Circle extends Shape{

	private int radius;

	public Circle(String color,int radius) {
		super(color);
	
		this.radius = radius;
	}
	public double area() {
		return Math.PI* Math.pow(radius, 2);}
	@Override
	public void print() {
		System.out.println("Circle color is: "+ super.getColor()
				+ " and area is: "+ area());
		
	}
}
