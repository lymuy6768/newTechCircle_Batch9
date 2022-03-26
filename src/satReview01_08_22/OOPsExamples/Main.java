package satReview01_08_22.OOPsExamples;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car(4,120,"White");
		Car car2= new Car(6,220,"red");
		
		car1.start();
		System.out.println(car1.carStatues());
		
		car1.stop();
		System.out.println(car1.carStatues());

	}

}
