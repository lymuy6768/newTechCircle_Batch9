import java.util.Scanner;

public class Practice_Homework1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int input;
			
			do{
				System.out.println("Please enter an integer between 1-10: ");
				input=scan.nextInt();
			
			}
			while (input<1 || input>10) ;
			System.out.println(input + "is between 1-10."+"\nFinish!");
		scan.close();
	}

}
