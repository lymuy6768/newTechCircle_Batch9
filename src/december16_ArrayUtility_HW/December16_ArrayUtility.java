package december16_ArrayUtility_HW;

import java.util.Arrays;

public class December16_ArrayUtility<Charaterter> {
	public static void main(String[] args) {

		// Create following utility method.
		// utility for Array.

//	1,

		/*
		 * Create an method that accepts an array of int as parameter and returns the
		 * maximum number
		 */
		December16_ArrayUtility au = new December16_ArrayUtility();

		int[] arrNum = { -98, 20, 30, 40, 50, -450, 50 };
		System.out.println("1.Return maximum number:");
		System.out.println(au.returnMaxNumFromArray(arrNum));

//	2,

		/*
		 * Create an method that accepts an array of int as parameter and returns the
		 * minimum number from an array of integer
		 */
		System.out.println("\n2.Return minimum number:");
		System.out.println(au.returnMinNumFromArray(arrNum));

//	3,

		/*
		 * Create an method that accepts array of double as parameter and returns the
		 * minimum number from an array of double
		 */
		double[] arrNum1 = { 20.2, 85.9, 60.8, 3.1, 40.9 };
		System.out.println("\n3.Return minimum number from an array of double:");
		System.out.println(au.returnMinNumOfDouble(arrNum1));

//	4,
		/*
		 * Create an method that accepts array of double as parameter and returns the
		 * maximum number from an array of double
		 */
		System.out.println("\n4.Return the maximim number from an array of double:");
		System.out.println(au.returnMaxNumOfDouble(arrNum1));

//	5,
		/*
		 * Create a method that Combines two arrays of integers and returns the new
		 * array
		 */
		int arrNum2[] = { 11, 12, 3, 4, 4, 16, 7, 8 };
		int arrNum3[] = { 9, 10, 11, 12, 13, 14, 15, 16 };
		System.out.println("\n5.Combine two arrays of integers and return the new array:");
		System.out.println(Arrays.toString(au.combine2arraysOfInteger(arrNum2, arrNum3)));

//	6,

		/*
		 * Create a method that Combines two arrays of char and return the new array
		 */
		char arrChar[] = { 'a', 'b', 'c', 'd', 'e' };
		char arrChar1[] = { 'E', 'f', 'G', 'h', 'h', 'i' };
		System.out.println("\n6.Combine two arrays of char and return the new array: ");
		System.out.println(Arrays.toString(au.combine2ArraysOfChar(arrChar, arrChar1)));

//	7,

		/*
		 * Create a method that Combines two arrays of String and return the new array
		 */
		String str[] = { "apple", "banana", "orange", "grape", "pear", "banana" };
		String str1[] = { "guava", "leechi", "jackfruit", "starfruit", "durian" };
		System.out.println("\n7.Combine two arrays of String and return the new array: ");
		System.out.println(Arrays.toString(au.combine2StringArray(str, str1)));

//	8,
		/*
		 * Create a method that sorts the array of integers in descending order, and
		 * returns it as an array
		 */
		System.out.println("\n8.Sort the array of integers in descending order and return it:");
		System.out.println(Arrays.toString(au.sortIntegerInDescendingOrder(arrNum2)));

//	9,
		/*
		 * sorts the array of double in descending order, and returns it as an array
		 */

		System.out.println("\n9.Sort the array of double in descending order and return it:");
		System.out.println(Arrays.toString(au.sortDoubleInDescendingOrder(arrNum1)));

//	10,
		/*
		 * sorts the array of char in descending order, and returns it as an array
		 */

		System.out.println("\n10.Sort the array of char in dscending order and return it:");
		System.out.println(Arrays.toString(au.sortTheArrayOfCharInDescendingOrder(arrChar)));

//	11
		/*
		 * sorts the array of String in descending order, and returns it as an array
		 */

		System.out.println("\n11.Sort the array of string in descending order and return it:");
		System.out.println(Arrays.toString(au.sortTheArrayOfStringInDescendingOrder(str)));

//	12,
		/*
		 * replaces the [] with {} while printing the array
		 */

		System.out.println("\n12.Replace the [] with {} while printing the array:");
		au.replaceSquareBracketWithCurlyBracket(str);

//	13,
		/*
		 * adds element to the integer array
		 */
		System.out.println("\n13. Add element to the integer array:");
		System.out.println(Arrays.toString(au.addElementToTheIntegerArray(arrNum2, 2500)));

//	14,
		/*
		 * adds element to the double array
		 */
		System.out.println("\n14. Add element to the double array:");
		System.out.println(Arrays.toString(au.addElementToDoubleArray(arrNum1, 1200.80)));

//	15,
		/*
		 * adds element to the char array
		 */
		System.out.println("\n15. Add element to the char array:");
		System.out.println(Arrays.toString(au.addElementToCharArr(arrChar1, 'm')));

//	16,
		/*
		 * adds element to the String array
		 */
		System.out.println("\n16. Add element to the String array:");
		System.out.println(Arrays.toString(au.addElementToStringArr(str1, "mango")));

//	17,
		/*
		 * reverses an array of integer and returns it
		 */
		System.out.println("\n17. Reverse an array of integer and return it:");
		System.out.println(Arrays.toString(au.reverseAnIntegerArray(arrNum3)));

//	18,
		/*
		 * reverses an array of double and returns it
		 */
		double arrNum4[] = { 190.5, 20.5, 308.5, 40.5, 20.5, 250.5 };
		System.out.println("\n18. Reverse an array of double and return it:");
		System.out.println(Arrays.toString(au.reverseAnDoubleArray(arrNum4)));

//	19,
		/*
		 * reverses an array of char and returns it
		 */
		System.out.println("\n19. Reverse an array of char and return it:");
		System.out.println(Arrays.toString(au.reverseACharArray(arrChar1)));

//	20,
		/*
		 * reverses an array of String and returns it
		 */
		System.out.println("\n20. Reverse an array of string and return it:");
		System.out.println(Arrays.toString(au.reverseAStringArray(str1)));

//	21,
		/*
		 * removes the duplicates from an array of integers and returns it
		 */

		System.out.println("\n21. Remove duplicates from an array of integer and reture it:");
		System.out.println(Arrays.toString(au.removeduplicateIntegerArr(arrNum2)));

//	22,

		/*
		 * removes the duplicates from an array of double and returns it
		 */
		System.out.println("\n22. Remove the duplicate from an array of double and return it:");
		System.out.println(Arrays.toString(au.removeDuplicateDoubleArr(arrNum4)));

//	23,
		/*
		 * removes the duplicates from an array of char and returns it
		 */
		System.out.println("\n23. Remove the duplicate from an array of char and return it:");
		System.out.println(Arrays.toString(au.removeDuplicateCharArr(arrChar1)));

//	24,
		/*
		 * removes the duplicates from an array of String and returns it
		 */
		System.out.println("\n24. Remove the duplicate from an array of String and return it:");
		System.out.println(Arrays.toString(au.removeDuplicateStringArr(str)));

//	25,
		/*
		 * find the unique elements form an array of String and returns it
		 */

		System.out.println("\n25. Find unique elements from an array of String and return it:");
		System.out.println(Arrays.toString(au.findUniqueStringFromArray(str)));
//	26,
		/*
		 * find the unique elements form an array of integer and returns it
		 */
		System.out.println("\n26. Find the unique elements from an array of integer and returns it:");
		System.out.println(Arrays.toString(au.findUniqueIntegerFromArray(arrNum)));
		// System.out.println(Arrays);
//	27,
		/*
		 * find the unique elements form an array of double and returns it
		 */

		System.out.println("\n27.Find the unique elements from an array of double and return it:");
//	28,
		System.out.println(Arrays.toString(au.findUniqueDoubleFromArray(arrNum4)));
		/*
		 * find the unique elements form an array of char and returns it
		 */
		System.out.println("\n28. Find the unique elements from an array of char and return it:");
		System.out.println(Arrays.toString(au.findUniqueCharFromArray(arrChar1)));

	}

	public int returnMaxNumFromArray(int arrNum[]) {
		int maxNum = arrNum[0];
		for (int i = 0; i < arrNum.length; i++) {
			if (arrNum[i] > maxNum)
				maxNum = arrNum[i];
		}
		return maxNum;
	}

	public int returnMinNumFromArray(int arrNum[]) {
		int minNum = arrNum[0];
		for (int i = 0; i < arrNum.length; i++) {
			if (arrNum[i] < minNum)
				minNum = arrNum[i];
		}
		return minNum;

	}

	public double returnMinNumOfDouble(double arrNum1[]) {
		double minNum = arrNum1[0];
		for (int i = 0; i < arrNum1.length; i++) {
			if (arrNum1[i] < minNum)
				minNum = arrNum1[i];
		}
		return minNum;

	}

	public double returnMaxNumOfDouble(double arrNum1[]) {
		double maxNum = arrNum1[0];
		for (int i = 0; i < arrNum1.length; i++) {
			if (arrNum1[i] > maxNum)
				maxNum = arrNum1[i];
		}
		return maxNum;

	}

	public int[] combine2arraysOfInteger(int arrNum2[], int arrNum3[]) {
		int arrNum4[] = new int[arrNum2.length + arrNum3.length];
		int position = 0;
		for (int i = 0; i < arrNum2.length; i++) {
			arrNum4[position] = arrNum2[i];
			position++;
		}
		for (int i = 0; i < arrNum3.length; i++) {
			arrNum4[position] = arrNum3[i];
			position++;
		}
		return arrNum4;
	}

	public char[] combine2ArraysOfChar(char arrChar[], char arrChar1[]) {

		char newChar[] = new char[arrChar.length + arrChar1.length];
		int position = 0;

		for (int i = 0; i < arrChar.length; i++) {
			newChar[position] = arrChar[i];
			position++;
		}
		for (int i = 0; i < arrChar1.length; i++) {
			newChar[position] = arrChar1[i];
			position++;
		}
		return newChar;

	}

	public String[] combine2StringArray(String str[], String str1[]) {

		String newStr[] = new String[str.length + str1.length];
		int position = 0;
		for (int i = 0; i < str.length; i++) {
			newStr[position] = str[i];
			position++;
		}
		for (int i = 0; i < str1.length; i++) {
			newStr[position] = str1[i];
			position++;
		}

		return newStr;
	}

	public int[] sortIntegerInDescendingOrder(int arrNum2[]) {
		int tempNum[] = new int[arrNum2.length];
		Arrays.sort(arrNum2);
		for (int i = arrNum2.length - 1, j = 0; i >= 0; i--, j++) {// j check for each element
			tempNum[j] = arrNum2[i];
		}
		return tempNum;
	}

	public double[] sortDoubleInDescendingOrder(double arrNum1[]) {

		double tempNum[] = new double[arrNum1.length];
		Arrays.sort(arrNum1);

		for (int i = arrNum1.length - 1, j = 0; i >= 0; i--, j++) {
			tempNum[j] = arrNum1[i];

		}
		return tempNum;
	}

	public char[] sortTheArrayOfCharInDescendingOrder(char arrChar[]) {

		char tempChar[] = new char[arrChar.length];
		Arrays.sort(arrChar);

		for (int i = arrChar.length - 1, j = 0; i >= 0; i--, j++) {
			tempChar[j] = arrChar[i];
		}
		return tempChar;
	}

	public String[] sortTheArrayOfStringInDescendingOrder(String str[]) {
		String tempString[] = new String[str.length];
		Arrays.sort(str);

		for (int i = str.length - 1, j = 0; i >= 0; i--, j++) {
			tempString[j] = str[i];
		}
		return tempString;
	}

	public void replaceSquareBracketWithCurlyBracket(String str[]) {
		for (int i = 0; i < str.length; i++) {
			if (i == 0) {
				System.out.print("{" + str[i] + ",");
			} else if (i == str.length - 1) {
				System.out.print(str[i] + "}");
			} else {
				System.out.print(str[i] + ",");
			}
		}
		System.out.println();

	}

	public int[] addElementToTheIntegerArray(int arrNum2[], int elementToAdd) {

		int newIntArr[] = new int[arrNum2.length + 1];// assign new array length by adding 1

		for (int i = 0; i < arrNum2.length; i++) {
			newIntArr[i] = arrNum2[i];// keep all element in oldArray
		}
		newIntArr[newIntArr.length - 1] = elementToAdd;// add to the last index

		return newIntArr;
	}

	public double[] addElementToDoubleArray(double arrNum1[], double elementToAdd) {
		double newDoubleArr[] = new double[arrNum1.length + 1];

		for (int i = 0; i < arrNum1.length; i++) {
			newDoubleArr[i] = arrNum1[i];
		}
		newDoubleArr[newDoubleArr.length - 1] = elementToAdd;

		return newDoubleArr;
	}

	public char[] addElementToCharArr(char arrChar1[], char elementToAdd) {
		char newCharArr[] = new char[arrChar1.length + 1];

		for (int i = 0; i < arrChar1.length; i++) {
			newCharArr[i] = arrChar1[i];
		}
		newCharArr[newCharArr.length - 1] = elementToAdd;
		return newCharArr;
	}

	public String[] addElementToStringArr(String str1[], String elementToAdd) {
		String newStrArr[] = new String[str1.length + 1];

		for (int i = 0; i < str1.length; i++) {
			newStrArr[i] = str1[i];
		}
		newStrArr[newStrArr.length - 1] = elementToAdd;

		return newStrArr;
	}

	public int[] reverseAnIntegerArray(int arrNum3[]) {
		int reverseIntArr[] = new int[arrNum3.length];

		for (int i = arrNum3.length - 1, j = 0; i >= 0; i--, j++) {
			reverseIntArr[j] = arrNum3[i];
		}
		return reverseIntArr;
	}

	public double[] reverseAnDoubleArray(double arrNum4[]) {
		double reverseDoubleArr[] = new double[arrNum4.length];

		for (int i = arrNum4.length - 1, j = 0; i >= 0; i--, j++) {
			reverseDoubleArr[j] = arrNum4[i];
		}
		return reverseDoubleArr;
	}

	public char[] reverseACharArray(char arrChar1[]) {
		char reverseChar[] = new char[arrChar1.length];

		for (int i = arrChar1.length - 1, j = 0; i >= 0; i--, j++) {
			reverseChar[j] = arrChar1[i];
		}
		return reverseChar;
	}

	public String[] reverseAStringArray(String str1[]) {
		String reverseString[] = new String[str1.length];

		for (int i = str1.length - 1, j = 0; i >= 0; i--, j++) {
			reverseString[j] = str1[i];
		}
		return reverseString;
	}

	public int[] removeduplicateIntegerArr(int arrNum2[]) {
		int count = 0;
		Arrays.sort(arrNum2);
		for (int i = 0; i < arrNum2.length - 1; i++) {// length-1, it will not compare the last index to next element as
														// it is the last one
			if (arrNum2[i] != arrNum2[i + 1]) {// compare 1st element to 2nd element
				arrNum2[count++] = arrNum2[i];// add to the array
			}
		}
		arrNum2[count++] = arrNum2[arrNum2.length - 1];// when equal add to array and remove one length
		int newArr[] = new int[count];// create new array to store unique element
		for (int j = 0; j < count; j++) {
			newArr[j] = arrNum2[j];
		}
		return newArr;
	}

	public double[] removeDuplicateDoubleArr(double arrNum4[]) {
		int count = 0;
		Arrays.sort(arrNum4);
		for (int i = 0; i < arrNum4.length - 1; i++) {
			if (arrNum4[i] != arrNum4[i + 1]) {
				arrNum4[count++] = arrNum4[i];
			}
		}
		arrNum4[count++] = arrNum4[arrNum4.length - 1];
		double newArr[] = new double[count];
		for (int j = 0; j < count; j++) {
			newArr[j] = arrNum4[j];
		}
		return newArr;
	}

	public char[] removeDuplicateCharArr(char arrChar1[]) {
		String unique = "";

		for (int i = 0; i < arrChar1.length; i++) {

			if (!unique.contains(String.valueOf(arrChar1[i]))) {
				unique += String.valueOf(arrChar1[i]);
			}
		}
		char uniqueChar[] = new char[unique.length()];
		for (int i = 0; i < uniqueChar.length; i++) {
			uniqueChar[i] = unique.charAt(i);
		}
		return uniqueChar;
	}

	public String[] removeDuplicateStringArr(String str[]) {

		String unique = "";

		for (int i = 0; i < str.length; i++) {
			if (!unique.contains(String.valueOf(str[i]))) {
				if (i == str.length - 1) {
					unique += String.valueOf(str[i]);
				} else {
					unique += String.valueOf(str[i] + ",");
				}
			}
		}
		String result[] = unique.split(",");
		return result;

	}

	public String[] findUniqueStringFromArray(String str[]) {
		String unique = "";

		for (int i = 0; i < str.length; i++) {
			if (!unique.contains(String.valueOf(str[i]))) {
				if (i == str.length - 1) {
					unique += String.valueOf(str[i]);
				} else {
					unique += String.valueOf(str[i] + ",");
				}
			}
		}
		String result[] = unique.split(",");

		return result;
	}

	public int[] findUniqueIntegerFromArray(int arrNum2[]) {

		int count = 0;
		Arrays.sort(arrNum2);
		for (int i = 0; i < arrNum2.length - 1; i++) {
			if (arrNum2[i] != arrNum2[i + 1]) {
				arrNum2[count++] = arrNum2[i];
			}
		}
		arrNum2[count++] = arrNum2[arrNum2.length - 1];
		int newArr[] = new int[count];
		for (int j = 0; j < count; j++) {
			newArr[j] = arrNum2[j];
		}

		return newArr;

	}

	public double[] findUniqueDoubleFromArray(double arrNum4[]) {

		int count = 0;
		Arrays.sort(arrNum4);
		for (int i = 0; i < arrNum4.length - 1; i++) {
			if (arrNum4[i] != arrNum4[i + 1]) {
				arrNum4[count++] = arrNum4[i];
			}
		}
		arrNum4[count++] = arrNum4[arrNum4.length - 1];
		double newArr[] = new double[count];
		for (int j = 0; j < count; j++) {
			newArr[j] = arrNum4[j];
		}

		return newArr;
	}

	public char[] findUniqueCharFromArray(char arrChar1[]) {
		String unique = "";

		for (int i = 0; i < arrChar1.length; i++) {
			if (!unique.contains(String.valueOf(arrChar1[i]))) {
				unique += String.valueOf(arrChar1[i]);
			}

		}
		char uniqueChar[] = new char[unique.length()];
		for (int i = 0; i < uniqueChar.length; i++) {
			uniqueChar[i] = unique.charAt(i);

		}
		return uniqueChar;
	}
}