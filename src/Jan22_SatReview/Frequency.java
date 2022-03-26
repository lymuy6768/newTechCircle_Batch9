package Jan22_SatReview;

import java.util.HashMap;

public class Frequency {
	static void findFrequency(String str) {
        HashMap<Character, Integer>map = new HashMap<>();
        
        Character.toLowerCase(0);
        for(int i = 0; i < str.length(); i++){
            char key = str.charAt(i);
            if(key!=' '&& key!='.' && key!='?') {
                if (!map.containsKey(key)) {
                	
                    map.put(key, 1);
                } else {
                    map.put(key, map.get(key)+1);
                }
            }
        }
        System.out.print(map.toString());
    }

    public static void main(String[] args) {
        String  str = "My name is Ben. This is Jerry and he is my brother?";
        findFrequency(str);

}
}