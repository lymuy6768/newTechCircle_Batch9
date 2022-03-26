package Jan22_SatReview;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionsDemo {

	public static void main(String[] args) {
		
	/*	List <String> list = new ArrayList<>();
		
		list.add("a");
		list.add(0, "c");
		list.add("b");
		list.addAll(Arrays.asList("c","d","e"));
		
		System.out.println(list);
		System.out.println(list.indexOf("c"));
		System.out.println(list.lastIndexOf("e"));
	      // [c,a,b,c,d,e]
	      //  ^   ^
	      System.out.println(list.subList(0, 3));//keep 0, except 3,not including*/
		

/*Queue<String> queue = new ArrayDeque<>();
      queue.add("a");
      queue.add("b");
      queue.addAll(Arrays.asList("c", "d", "e"));
      System.out.println(queue);
      System.out.println("===========");

      // e -> d -> c -> b -> a
      // end                front

      queue.offer("z"); // if queue is full, return false
      queue.add("t"); // if queue is full, throw Exception
      System.out.println(queue);

      // see what is in front of the queue
      System.out.println(queue.peek()); // if queue is empty, return false
      System.out.println(queue.element()); // if queue is empty, throw Exception

      // to remove the front of the queue
      queue.clear();
//      System.out.println(queue.poll()); // if queue is empty, return null
      System.out.println(queue.remove()); // if queue is empty, throw Exception

      System.out.println(queue);*/
		
	/*	Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c", "d", "e"));
	      Set<String> set2 = new HashSet<>(Arrays.asList("c", "d", "e", "f", "g"));
	      // Set = contains No duplicate item, only unique, DO NOT rely on the order

	      // Union Operator
	      // ("a", "b", "c", "d", "e")
	      //           ("c", "d", "e", "f", "g")
	      set1.addAll(set2);
	      System.out.println(set1);

	      // Intersection Operator
	      set1.retainAll(set2);
	      System.out.println(set1);

	      // Difference
	      set1.removeAll(set2);
	      System.out.println(set1);*/
		
	/*	Map<String, Integer> map = new HashMap<>();
	      map.put("a", 1);
	      map.put("b", 2);
	      map.put("c", 3);
	      System.out.println(map);
	      System.out.println(map.values());
	      System.out.println(map.get("k"));
	      System.out.println(map.getOrDefault("c", 10));
	      System.out.println(map.containsKey("a"));
	      System.out.println(map.containsKey("z"));
//	      map.containsValue()
	      map.replace("c",4);
	      System.out.println(map);
	      Set<String> listOfKeys = map.keySet(); // [a,b,c]

	      for (String k: map.keySet()
	           ) {
	         System.out.println(k+"-"+map.get(k));}*/
	      String str = "mirror";
	     
	      Map<Character, Integer> map= new HashMap<>();
	      for (int i=0;i<str.length();i++) {
	    	  char key=str.charAt(i);
	    	  if(map.containsKey(key)) {
	    		  map.put(key, map.get(key)+1);
	      }else {
	    	  map.put(key,1);
	      }
	}System.out.println(map);

//String str = "mirror";
      // count the character.
      // output
      // "bubble" => b=3, u=1, l=1, e=1
      // "mirror" => m=1, i=1, r=3, o=1

     // access each character
  /*    Map<Character, Integer> map = new HashMap<>();
      for (int i = 0; i < str.length(); i++) {
         char key = str.charAt(i); // store Char in Var
         if(map.containsKey(key)) {
            map.put(key,map.get(key)+1); // increment the value of that key
         } else {
            map.put(key, 1); // set value of the char to 1
         }
      }
      System.out.println(map);*/

}
}