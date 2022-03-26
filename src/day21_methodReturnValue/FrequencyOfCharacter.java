package day21_methodReturnValue;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		
		String str="TechCircle";
		char targetChar='C';
		
		FrequencyOfCharacter fc= new FrequencyOfCharacter();
		
		int count=fc.frequencyOfTargetCharacter(str, targetChar);
		
		System.out.println(count);
	
	
	}	
	public int frequencyOfTargetCharacter(String str, char targetChar) {
	//	String str="Java";
	//	char targetChar='a';
		int count=0;
		
		for(int i=0;i<str.length();i++) {
		//	System.out.println(str.charAt(i));
			if(str.charAt(i)==targetChar) {
				count++;
			}
			
	}//System.out.println("Character<"+targetChar+"> occured"+count+" times");
		
	return count;
	

}
}