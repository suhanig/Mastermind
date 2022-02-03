//Tester.java
//import java.util.Scanner;

public class Tester { //responsible for exectutioning the code written in the Mastermind header

	public static void main (String[] args) { //opens psvm
		
		//int turns = 0;
	

		Mastermind m1 = new Mastermind (); //so tester can call on code from Mastermind.java
		
			//constuctor?? m1??
			m1.rules(); //calls on method that explains and prints out the rules of the game 
			//lays out structure of board. prints a black board out before starting the game
			m1.buildBoard(); //calls on the buildBoard method
			//m1.printBoard(); //calls on the printBoard method
			
			m1.secretCode(); //calls on secretCode method
			
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
			m1.userGuess(); //calls on userGuess method
			
		}
	} //close psvm
	
	
	
	//THNGS LEFT TO DO:
		//hide secret code. it shouldnt print out
		//make sure rules are clear enough
		//readMe file
		//go throigh checklist/requirments on schoology
	
