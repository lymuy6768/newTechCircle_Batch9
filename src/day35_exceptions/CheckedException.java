package day35_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		File file = new File("/user/techcircle/java23131");
		
		try {
			FileReader fr = new FileReader(file);
			
			int i;
			try {
				while((i=fr.read())!=-1){
					System.out.println((char)i);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I'm here");
	}

}
