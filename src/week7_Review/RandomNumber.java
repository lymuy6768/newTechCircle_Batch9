package week7_Review;

import java.util.Random;

public class RandomNumber {
	
	public int randomInt() {
		int min = 200;  
        int max = 400;  
    
        double a = Math.random()*(max-min+1)+min;   
        
        int b = (int)(Math.random()*(max-min+1)+min);  
        
        return b; 
	}
	public int randInt(int minNumber,int maxNumber) {
		int min=minNumber;
		int max=maxNumber;
		
		int b=(int)(Math.random()*(max-min));
		
		return b;
		
	
}
}