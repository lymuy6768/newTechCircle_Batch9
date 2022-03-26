package December15_homework;

import java.util.Arrays;

public class dec15_HWTask1_5 {

	public static void main(String[] args) {
		// Create following utility method.
		// utility for String.
		// 1,

		/*
		 * input = aaabbbbccccccccdddddd char frequency of 'a' output : 3
		 * 
		 * returns the frequency of given char from the given string, as int
		 */
		dec15_HWTask1_5 tk = new dec15_HWTask1_5();

		int freqOfChar = tk.checkFrequenOfChar("aaaabbbccccdddd", 'a');
		System.out.println("Task1. Return the frequency of given char: ");
		System.out.println(freqOfChar);

		// 2,
		/*
		 * * input = aaabbbbccccccccdddddd
		 * 
		 * output : abcd
		 * 
		 * returns the unique characters for the given string
		 */
		String str = "aaaabBbbcccc";

		System.out.println("\nTask2. Return unique characters: ");
		System.out.println(tk.returnUniqueChar(str));

		/*
		 * 3 reverses the given string object and returns it
		 */
		String str2 = "techcircle";
		System.out.println("\nTask3. Reverse the given string: ");
		System.out.println(tk.reverseString(str2));

		// 4,
		/*
		 * verify if the string palindrome
		 */
		String str3 = "Level";

		System.out.println("\nTask4. verify if the string is palindrome");
		System.out.println(tk.isPalindrome(str3));

		// 5,
		/*
		 * verify if two strings are anagram, returns the boolean result
		 */
		String str5 = "art";
		String str6 = "rat";
		System.out.println("\nTask5. verify if the string are anagram");
		System.out.println(tk.areAnagram(str5, str6));
	}

	public int checkFrequenOfChar(String str, char character) {

		int freqOfChar = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == character) {
				freqOfChar++;
			}

		}
		return freqOfChar;

	}

	private String returnUniqueChar(String str) {

		str = str.toLowerCase();
		String result = String.valueOf(str.charAt(0));// to store all unique char into string,num to string

		for (int i = 0; i < str.length(); i++) {

			if (!result.contains(String.valueOf(str.charAt(i)))) {
				result += String.valueOf(str.charAt(i));
			}

		}
		return result;

	}

	public String reverseString(String str2) {
		String reverseStr="";
		for (int i = str2.length() - 1; i >= 0; i--) {
			
			reverseStr+= str2.charAt(i);

		}
		return reverseStr;

	}

	public boolean isPalindrome(String str3) {
		dec15_HWTask1_5 tk = new dec15_HWTask1_5();
		str3 = str3.toUpperCase();
		String str4 = tk.reverseString(str3);

		if (str3.equals(str4)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean areAnagram(String str5, String str6) {

		char charArr1[] = str5.toLowerCase().toCharArray();
		char charArr2[] = str6.toLowerCase().toCharArray();
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		return Arrays.equals(charArr1, charArr2);

	}
}