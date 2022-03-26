package day34_abstraction.interfaceTest;

import java.time.LocalDateTime;

public class clock implements Alarm{

	public void showCurrentTime() {
		System.out.println("It is <"+ LocalDateTime.now()+">");
	}
	public void setAlarm() {
		System.out.println("Clock: setting an alarm at 9 PM");
	}

}
