package week8;

import java.util.Scanner;

public class NumberGuessingGame {
	static int correctGuess=0;
	static int wrongGuess=0;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//make a game where the player guesses the number, if they
	    //guess the number correct 3 times they will win
	    //if they guess the number incorrect 10 times they lose
	    //random number should be 1-3
		
		while(true) {
	
	System.out.println("Guess a number between 1-3: ");
	int playerGuess=input.nextInt();
	int ranN=randomNum();
	
	if(playerGuess==ranN) {
		System.out.println("your guess" + playerGuess+"is right\n pc picked"+ranN);
		correctGuess++;
	}else {
		System.out.println("your guess"+ playerGuess+"is wrong\n pc picked"+ranN);
		wrongGuess++;
	}
		if(correctGuess==3) {
			System.out.println("you win");
			break;
		}else if(wrongGuess==10) {
			System.out.println("you lost");
			break;
		}
		input.close();
		}
	}private static int randomNum() {
	
		return  (int) ((Math.random() * (4 - 1)) + 1);
	}
	
	
	

}
