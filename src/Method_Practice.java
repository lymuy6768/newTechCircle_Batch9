
public class Method_Practice {

	public static void main(String[] args) {
	//Create a method that accept 2 parameters and return sum of two numbers.	

	Method_Practice mp= new Method_Practice();
	int d=mp.sumOfTwoNumber(100, 200);
	int e=mp.sumOfTwoNumber(1000, 2000);
	int f=mp.sumOfTwoNumber(100, -200);
	
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	
	
	mp.printFullName("Lymuy", "Heng");
		
	}
	public static String printFullName(String firstName,String lastName) {
		
		String fullName= firstName+ " "+lastName;
		
		System.out.println(fullName);
		return fullName;
	}
	public int sumOfTwoNumber(int a,int b) {
		
		int result=a+b;
		return result;
	}
	//Create a method that accepts first and last name of the person and return full name.
}
