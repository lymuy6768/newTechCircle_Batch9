package day35_exceptions;

public class ThrowException {

	public static void main(String[] args) {
		
//	public void wait5Second() {
		{	System.out.println("5 second delay");
	}
		
		try {
		Thread.sleep(5000);//checked exception
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
		System.out.println("End");

	}

}
