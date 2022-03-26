package satReview01_08_22.Abstraction;

public class Main {

	public static void main(String[] args) {
		
	//	Shape shape1 = new Shape();//can not instantiate abstract class 
		
		Shape rectangle = new Rectangle("white",2,2);
		
		System.out.println(rectangle.area());
		rectangle.print();
		
		Circle circle = new Circle("red",4);
		Circle circle1 = new Circle("yello",3);
		
		circle.print();
		
		Shape shapes[]= {rectangle,circle,circle1};
		
		for(Shape s: shapes) {
			s.print();
		}

	}

}
