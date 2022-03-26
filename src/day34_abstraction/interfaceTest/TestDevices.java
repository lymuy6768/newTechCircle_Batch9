package day34_abstraction.interfaceTest;

import java.util.ArrayList;

public class TestDevices {

	public static void main(String[] args) {
		
		Iphone a = new Iphone();
		a.attendingZoomMeeting();
		a.call();
		a.playGame();
		a.setAlarm();
		
		Alexa b = new Alexa();
		b.alexaWhatTimeIsIt();
		b.setAlarm();
		
		clock c = new clock();
		c.showCurrentTime();
		c.setAlarm();
		
		Alarm x= new Iphone();//can call only method in interface Alarm
		x.setAlarm();
		System.out.println(x.size);

	
	testAlarm(a);
	testAlarm(b);
	testAlarm(c);
	
	ArrayList<Alarm> list= new ArrayList<>();
	list.add(a);
	list.add(b);
	list.add(c);
	
	for(int i=0;i<list.size();i++) {
		System.out.println(i);
		list.get(i).setAlarm();
		System.out.println(list.get(i).size);
	}
	
	
	
	
	
	
	}
	public static void testAlarm(Alarm a) {
		a.setAlarm();
	}
}
