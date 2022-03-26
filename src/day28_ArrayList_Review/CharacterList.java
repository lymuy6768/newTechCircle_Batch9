package day28_ArrayList_Review;

public class CharacterList {

	public static void main(String[] args) {
		
		Character char1='A';//autoboxing
		Character char2='1';
		Character char3='*';
		
		System.out.println(Character.isAlphabetic(char1));
		System.out.println(Character.isAlphabetic(char2));
		System.out.println(Character.isAlphabetic(char3));
		
		System.out.println(Character.isDigit(char1));
		System.out.println(Character.isDigit(char2));
		System.out.println(Character.isDigit(char3));
		System.out.println("--------------------------");
		System.out.println(Character.isLetterOrDigit(char1));
		System.out.println(Character.isLetterOrDigit(char2));
		System.out.println(Character.isLetterOrDigit(char3));
		
		System.out.println(Character.isLetter(char1));
		System.out.println(Character.isLetter(char2));
		System.out.println(Character.isLetter(char3));
	}

}
