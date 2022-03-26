package week8;

import java.util.Scanner;

public class SlotMachineProject {
//		Slot Machine Project
		//
//			over view- make a slot machine that will display 3
//			numbers. player should get some starting cash.  
//			If player has zero money they they should see they lost or cant play.
//			Numbers for the jack pots and how much it cost to play are up to you. 
		//
		//
		//
		//
		//
//			requirments 
		//
		//
		//
		//
		//
//			req 1. if all 3 numbers match, player should get the  mega jackpot (highest payout)
		//
//			req 2. if one number is above 80 player should win jack pot level 1 (lowest)
		//
//			req 3. if 2 numbers are about 80 player should win jack pot level 2 (middle pay out)
		//
//			req 4. if all 3 numbers are about 80, player should get jack pot level 3 (second from highest)
		//
//			req 5. player should be able to see how much money they have. 
//			 
		//
//			 Hints: use the random number class to get your 3 random numbers. 
//			 use scanner class for user input. use methods to make your code more easy to write and read.   

			static Scanner input = new Scanner(System.in);
			static int playersMoney = 0;
			
			static int megaJackPot= 200;
			static int level1= 20;
			static int level2=60;
			static int level3=100;

			public static void main(String[] args) {
				start();

			}

			private static void start() {

				
				while (playersMoney >= 0) {
		       
					
					if(playersMoney<=0) {
					askPlayerForMoney();
					}
					
					
					
						playSlot();
					

				}

			}

			private static void playSlot() {
				showCash();
				System.out.println("each play is $10\n press one to play");
				int playersChoice=input.nextInt();
				if(playersChoice==1) {
					playersMoney-=10;
					showRandomNumbers();
				}
				
				
			}

			private static void showCash() {
			
									//you have $100
				System.out.println("you have $"+playersMoney);
				
			}

			private static void showRandomNumbers() {
				int ran1=randomNum();
				int ran2=randomNum();
				int ran3=randomNum();
				
				
				System.out.println(ran1+" "+ran2+" "+ran3);
				checkForWin(ran1,ran2,ran3);
				
				
			}

			private static void checkForWin(int ran1, int ran2, int ran3) {
				
				if(ran1==ran2&&ran1==ran3) {
					giveMegaJackPot();
					return;
				}
				
				
				int[] arr= new int[]{ran1,ran2,ran3};
				int count=0;
				
				for (int i = 0; i < arr.length; i++) {
					if(arr[i]>=80) {
						count++;
					}
				}
				
				if(count==0) {
					
				}else if(count==1) {
					giveJackPotLevel1();
				}else if(count==2) {
					giveJackPotLevel2();
				}else if (count==3) {
					giveJackPotLevel3();
				}
				
				
				count=0;
				
				
				
			}

			private static void giveJackPotLevel3() {
				System.out.println("you won the level 3 on jack pot");
				playersMoney+=level3;
			}

			private static void giveJackPotLevel2() {
				System.out.println("you won the level 2 on jack pot");
				playersMoney+=level2;
			}

			private static void giveJackPotLevel1() {
				System.out.println("you won the level 1 on jack pot");
				playersMoney+=level1;
			}

			private static void giveMegaJackPot() {
				System.out.println("********Congrats you won the mega jackpot *************");
				
				
				playersMoney+=megaJackPot;
				
			}

			private static void askPlayerForMoney() {
				// Please insert money
				
					System.out.println("Please insert money");
					playersMoney = input.nextInt();
				
			}

			private static int randomNum() {
				return (int) ((Math.random() * (100 - 0)) + 0);
			}

	

	

}
