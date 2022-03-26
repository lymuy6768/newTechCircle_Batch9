package day31_encapsulation;

public class LoginPage {
	public static void main(String[] args) {
		
		Credentials c=new Credentials();
		
		c.setUserName("techcircle");
		c.setPassword("password1");
		System.out.println("Enter user name "+ c.getUserName());
		System.out.println("Enter password "+ c.getPassword());
	}
	

}
