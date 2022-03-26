package Jan22_SatReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class task {

	public static void main(String[] args) {
		// Unique Device Name
		   //input:    ("Fan", "TV", "Fan", "Oven", "Fan", "TV")
		   //output:   ("Fan", "TV", "Fan1", "Oven", "Fan2", "TV1")

		   // write a method to find frequency of eachword.
		   // String str = "My name is Ben. This is Jerry and he is my brother?";
		
		String str = "mirror";
	      // count the character.
	      // output
	      // "bubble" => b=3, u=1, l=1, e=1
	      // "mirror" => m=1, i=1, r=3, o=1

	     // access each character
	      Map<Character, Integer> map = new HashMap<>();
	      for (int i = 0; i < str.length(); i++) {
	         char key = str.charAt(i); // store Char in Var
	         if(map.containsKey(key)) {
	            map.put(key,map.get(key)+1); // increment the value of that key
	         } else {
	            map.put(key, 1); // set value of the char to 1
	         }
	      }
	      System.out.println(map);
	   
		String str1= "My name is Ben. This is Jerry and he is my brother?";
		
		
		Map<Character, Integer> map1= new HashMap<>();
		for(int i=0;i<str1.length();i++) {
			str1.toLowerCase();
			char key=str1.charAt(i);
			if(map1.containsKey(key)) {
				map1.put(key, map1.get(key)+1);
			}else {
				map1.put(key, 1);
			}
		}System.out.println(map1);
		
		String[] names ={"Fan", "TV", "Fan", "Oven", "Fan", "TV"};
		
		ArrayList<String> names1= new ArrayList<>(Arrays.asList(names));
		
		for(int i= 0;i<names1.size();i++) {
			if(names1.contains(i)) {
				
			}
		}
		
	}

}
