package day24_WrappierClass_ReviewMethod;

public class Autoboxing {

	public static void main(String[] args) {
		
		//convert primitive to object
		int a=10;
		Integer objA=a;//convert int to object so we can use the method.
		
		double d=objA.doubleValue();
		byte valueB=objA.byteValue();
		float f=objA.floatValue();
		
		System.out.println(a);
		System.out.println(objA);
		System.out.println(valueB);
		System.out.println(f);
		
		String str="true";
		//primitive			//object
		boolean condition=Boolean.parseBoolean(str);
		
		if(condition) {
		}
		
		String value="9.399";
		
		int valueInt= Integer.parseInt(value);
		double value2=Double.parseDouble(value);
		float value3=Float.parseFloat(value);
		byte value4=Byte.parseByte(value);
		System.out.println(valueInt);
		

	}

}
