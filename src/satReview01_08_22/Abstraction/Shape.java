package satReview01_08_22.Abstraction;

public abstract class Shape {

	private String color;
	

public Shape(String color) {
		this.color = color;
	}
public abstract double area();
public abstract void print();
protected String getColor() {
	return color;
}


	
}
