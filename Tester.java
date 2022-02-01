//Tester.java
//import java.util.Scanner;

public class Tester {

	public static void main (String[] args) {
		
		int turns = 0;
	

		Mastermind m1 = new Mastermind ();
		
			//constuctor?? m1??
			
			m1.buildBoard();
			m1.printBoard();
			
			m1.secretCode();
			
			//scanner class
			/* char[] guess = new char [4];
			Scanner scan = new Scanner (System.in);
			System.out.println("Welcome to Mastermind. Please enter your guess by using letters for the colors. 'B' for blue, 'R' for red, 'Y' for yellow, 'G' for green, 'O' for orange, and 'P' for purple.");
			for (int y = 0; y < 20; y+=2) {
				
				for (int x = 0; x < 4; x++) {
					System.out.print("Enter letter for your guess: ");
					guess[x] = scan.next().charAt(0);
				}
				//System.out.println("Thanks for your guess...");
			
			//System.out.println("Thanks for your guess..."); */
			 //m1.addGuess();
			//send it back
			//m1.buildBoard();
			m1.userGuess();
			
		}
	} //close psvm
