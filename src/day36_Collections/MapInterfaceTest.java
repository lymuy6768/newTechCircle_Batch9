package day36_Collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		
		System.out.println(map.get(101));
		
		System.out.println(map.get(102));
		
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		
		HashMap<String,Long> phoneNums = new HashMap<>();
		
		phoneNums.put("Irfan", 703_981_0343L);
		phoneNums.put("Shafkat", 703_965_5487L);
		phoneNums.put("Ken", 703_981_8743L);
		phoneNums.put("Illy", 703_451_0343L);
		
		System.out.println(phoneNums.get("Shafkat"));
		
		for(Map.Entry entry:phoneNums.entrySet()) {
			System.out.println(entry.getKey()+"  "+ entry.getValue());
		
		}
	}

}
