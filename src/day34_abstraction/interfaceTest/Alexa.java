package day34_abstraction.interfaceTest;

import java.time.LocalDateTime;

public class Alexa implements Alarm{

	public void alexaWhatTimeIsIt() {
		System.out.println("It is<"+ LocalDateTime.now()+">");
	}
	public void setAlarm() {
		System.out.println("Alexa: setting an alarm at 10 PM");
	}
}
