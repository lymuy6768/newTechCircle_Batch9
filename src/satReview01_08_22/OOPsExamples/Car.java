package satReview01_08_22.OOPsExamples;

public class Car {

	private int wheel;//read permission=getter
	private int maxSpeed;//read permission=getter
	private String color;//read/write permission=getter/setter
	private boolean isStart= false;//read/write permission=getter/setter
	
	public void start() {//setter of the 'isStart' field
		System.out.println("this car is starting");
		isStart=true;
	}
	public Car(int wheel, int maxSpeed, String color) {
		super();
		this.wheel = wheel;
		this.maxSpeed = maxSpeed;
		this.color = color;
	}
	public void stop() {//setter of the 'isStart' field
		System.out.println("this car is stopping");
		isStart=false;
	}
	public boolean carStatues() {
		return isStart;
	}
	
}
