package day20_method;

public class SayHello {

	public static void main(String[] args) {
		
		
		SayHello sh= new SayHello();
		sh.printHello("Irfan");
		sh.printHello("TechCircle");
		
		String students[]= {"Henry","Luba","Gulayat","Bahar","Yasin","Chachaya","Dilara"};
		for(String a:students) {
			System.out.println(a);
			
			sh.printHello(a);
		}
	}

	
	
	
	public void printHello(String str) {
		
	//	String str="TechCircle";
		System.out.println("Hello,"+ str);
		
		
		
	}
	
	
	
	
	
	
	
	
}
