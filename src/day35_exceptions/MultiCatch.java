package day35_exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		
		String str="TechCircle";
		try {
		char lastChar = str.charAt(9);
		
		char lastChar1= str.charAt(str.length()-1);
		System.out.println(lastChar);
		
		char chars[]= str.toCharArray();
		for (int i=0;i<=chars.length;i++) {
			System.out.println(str.charAt(i));
		}
		}catch(StringIndexOutOfBoundsException e) {//from the base to the top
			e.printStackTrace();
			
		}catch(ArrayIndexOutOfBoundsException e) {
		//	e.printStackTrace();
			System.out.println("Array index issue");
		}catch(Exception e) {
			e.printStackTrace();
		}catch(Throwable a) {// otherwise it can handle
			a.printStackTrace();
		}finally {
			System.out.println("Clean up code here");
		}
			
		
	}

}
