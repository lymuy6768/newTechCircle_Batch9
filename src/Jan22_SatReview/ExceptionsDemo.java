package Jan22_SatReview;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {

	public static void main(String[] args) {
	
		ExceptionsDemo.show();
		
		FileReader reader = null;
		      try {
		         reader = new FileReader("text.txt"); //FileInputStream
		         System.out.println("File Found!");
		         int value = reader.read();
		         Thread.sleep(1000);
		      }
		      catch (Exception e) {
		         e.printStackTrace();
		      }
		      finally {
		         try {
		            if (reader != null)
		               reader.close();
		         } catch (IOException e) {
		            e.printStackTrace();
		         }
		      }
		      
		      System.out.println("Finished");

	}
	public static void show() {
	//	sayHi(name:null);
	}
	public static void sayHi(String name) {
		System.out.println("Hi, "+ name.toUpperCase());
	}
	
	
	
}
