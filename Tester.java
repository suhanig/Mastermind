//Tester.java
import java.util.Scanner;

public class Tester {

	public static void main (String[] args) {
	

		Mastermind m1 = new Mastermind ();
		
			//constuctor?? m1??
			
			m1.buildBoard();
			m1.printBoard();
			
			//scanner class
			char[] guess = new char [4];
			Scanner scan = new Scanner (System.in);
			System.out.println("welcome to Mastermind");
			for (int x = 0; x < 4; x++) {
				System.out.print("Enter letter for your guess: ");
				guess[x] = scan.next().charAt(0);
			}
			System.out.println("Thanks for your guess...");
			 m1.addGuess(guess);
			//send it back
			//m1.buildBoard();
			m1.printBoard();
			
	} //close psvm
}
