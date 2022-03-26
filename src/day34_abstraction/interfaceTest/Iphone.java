package day34_abstraction.interfaceTest;

public class Iphone implements Alarm {

	public void call() {
		System.out.println("Calling TechCircle");
	}
	public void playGame() {
		System.out.println("Playing game!!!");
	}
	public void attendingZoomMeeting() {
		System.out.println("Iphone Zoom app is processing!");
	}
	public void setAlarm() {
		System.out.println("Iphone: setting an alarm at 8:30 PM");
	}
	
}
