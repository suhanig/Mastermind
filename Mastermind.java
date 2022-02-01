
//player vs. computer

//2D array list makes up board

//secret does not get printed each time

//secret is 5 non repeat pins

//how many turns or tries

//class: board, game, player

import java.util.ArrayList;
import java.util.Scanner;


public class Mastermind { //main MASTERMIND header. where all the code is for this game. unable to execution, however, without tester.
	
	//private variables so they can be used in 2 methods
	private String firstPos; 
	private String secondPos;
	private String thirdPos;
	private String fourthPos;
	
	//declare memory spot
	ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>> (); //creates placeholder in memory
	
	public void buildBoard () {//builds board. sets up the array
			
		
			for (int x = 0; x < 20; x+=2) { //for loop to repeat the board to have 20 rows in total for 10 total guesses
			board.add(new ArrayList<String>()); 
			//introducing the guessing board
			board.get(x).add(" "); 
			board.get(x).add(" "); 		
			board.get(x).add(" "); 
			board.get(x).add(" ");
			//now scoring
			board.get(x).add("="); 
			board.get(x).add(" "); 
			board.get(x).add(" ");
			board.add(new ArrayList<String>()); //create arraylist 4 second row
			//x++; 
			//introducing scoring row
			board.get(x+1).add("-"); 
			board.get(x+1).add("-"); 		
			board.get(x+1).add("-"); 
			board.get(x+1).add("-");
			//now scoring
			board.get(x+1).add("="); 
			board.get(x+1).add(" "); 
			board.get(x+1).add(" ");
			
			
		} 
		
	}
	//NOT using this method below anymore.
	//method to add test guess to board?
	/* public void addGuess (char[] arrChar, int turns) {  // ['R', 'B', 'Y', 'G' ]
		
		for (int i = 0; i < 4; i++) { //for loop for each row
			//iterate thru each element in the [] arrchar
			board.get(turns).set(i, String.valueOf(arrChar[i]) ); 
			//put each letter into the arrayList
		}
		
		
		
	} */
	
	
	
// NOT using this method below anymore. printing in the userGuess method so that the whole board doesnt print out after each guess
	/* public void printBoard() {
		
	//rules for mastermind:

	
	System.out.println(" Guesses \t Scores");
	
	for (int p=0; p<20; p++) { //print board of 20 rows
	System.out.println(board.get(p));
	}
	System.out.println(board.get(1));
	System.out.println(board.get(3));
	System.out.println(board.get(4));
	System.out.println(board.get(5));
	System.out.println(board.get(6));
	System.out.println(board.get(7));
	System.out.println(board.get(8));
	System.out.println(board.get(9)); 
	
	} */ 
	
	public void rules () { //rules method to print out the rule of Mastermind
		System.out.println("Welcome to Mastermind! In this game, the computer will generate a random sequence of four colors");
		System.out.println("The objective of this game is to guess this randomized, secret code");
		System.out.println("When prompted, you may guess a color one at a time");
		System.out.println("You may use 'B' for blue, 'R' for red, 'Y' for yellow, ");
		System.out.println("G' for green, 'O' for orange, and 'P' for purple");
		System.out.println("If a color you guess is a color in the secret code, but is in the wrong position, you will recieve a 'wh' (white) pin");
		System.out.println("If a color you guess is a color in the secret code, and is in the right position, you will recieve a 'bl' (black) pin");
		System.out.println("You may NOT repeat colors in your guess. he secret code has NO repeats of colors.");
		System.out.println("You will get 10 guesses for each secret code. Good luck!");
	}
	
	public void secretCode () { //has computer generate random secret code for player to be guessing
		
		
		int random = (int) (Math.random() * 6); //setting up the idea that there are 6 colors and the computer will have to generate a random copde using those 6
		String [] arr = { "R", "Y", "G", "B", "O", "P" }; //6 colors in an array
		firstPos = arr [random]; //setting first of 4 positions to a random color from the array
		random = (int) (Math.random() * 6);
		secondPos = arr [random]; //setting second position to a random color
		
		//all while loops belo are ensuring that there are no repeats
			while (firstPos.equals(secondPos)) { //chcking to make sure irst position and second position are NOT repeated colors
				
				random = (int) (Math.random() * 6);
				secondPos = arr[random]; //if first position and second position are the same color, second position changes 
				
			}
		random = (int) (Math.random() * 6);
		thirdPos = arr[random]; //repeats the same process for the third position
			while (firstPos.equals(thirdPos) || secondPos.equals(thirdPos) ) { //checks to see if 1st and 2nd positions overlap with 3rd position color
				
				random = (int) (Math.random() * 6);
				thirdPos = arr[random]; //if there is a repeat, 3rd position changes
				
			}
		random = (int) (Math.random() * 6);
		fourthPos = arr[random]; //repeats the same process for the fourth position
		
			while (firstPos.equals(fourthPos) || secondPos.equals(fourthPos) || thirdPos.equals(fourthPos) ) { //checks to see i 1st, 2nd, or 3rd overlap with 4th position color
				
				random = (int) (Math.random() * 6);
				fourthPos = arr[random]; //if there is a repeat, 4th position changes
			}
			
		System.out.println(firstPos + secondPos + thirdPos + fourthPos); //finalized secret code
		
	} // closes secretCode
	
	
	
	public void userGuess () { //code for taking in user input and comparing it to the computer's generated secret code 
		
		
		Scanner scan = new Scanner (System.in); //introducing scanner called scan
		
		int guesses = 0; 
		
		for (int y = 0; y < 20; y+=2) { //every 2 because 2 rows are used for each turn in the array
			
			guesses = guesses + 1; //counting the amount of guesses 
			
			//System.out.println("Welcome to Mastermind. Please enter your guess by using letters for the colors. 'B' for blue, 'R' for red, 'Y' for yellow, 'G' for green, 'O' for orange, and 'P' for purple.");
			// taking user input and scanning it below
			
			System.out.print("Enter letter for your guess: ");
			String letterOne = scan.nextLine();
			
			System.out.print("Enter letter for your guess: ");
			String letterTwo = scan.nextLine();
			
			System.out.print("Enter letter for your guess: ");
			String letterThree = scan.nextLine();
			
			System.out.print("Enter letter for your guess: ");
			String letterFour = scan.nextLine();
			
			board.get(y).set(0, letterOne);
			board.get(y).set(1, letterTwo);
			board.get(y).set(2, letterThree);
			board.get(y).set(3, letterFour);
			
			String black = "bl"; //if user guesses right color in right location
			String white = "wh"; //if user guesses right color in wrong location
			
			int gameOverWin = 0;
			
			//checking to see if any of the user input is the right color. will give a white pin
			
			if (board.get(y).get(0).equals(firstPos) || board.get(y).get(0).equals(secondPos) || board.get(y).get(0).equals(thirdPos) || board.get(y).get(0).equals(fourthPos) ) {
				board.get(y+1).set(5, white);
			}
			
			if (board.get(y).get(1).equals(firstPos) || board.get(y).get(1).equals(secondPos) || board.get(y).get(1).equals(thirdPos) || board.get(y).get(1).equals(fourthPos) ) {
				board.get(y).set(6, white);
			}

			if (board.get(y).get(2).equals(firstPos) || board.get(y).get(2).equals(secondPos) || board.get(y).get(2).equals(thirdPos) || board.get(y).get(2).equals(fourthPos) ) {
				board.get(y).set(5, white);
			}
			
			if (board.get(y).get(3).equals(firstPos) || board.get(y).get(3).equals(secondPos) || board.get(y).get(3).equals(thirdPos) || board.get(y).get(3).equals(fourthPos) ) {
				board.get(y+1).set(6, white);
			}
			
			//checking if user input is right color but also in the right LOCATION. will give a black pin
			
			if (board.get(y).get(0).equals(firstPos)) {
				board.get(y+1).set(5, black);
				gameOverWin = gameOverWin + 1;
			}
			
			if (board.get(y).get(1).equals(secondPos)) {
				board.get(y).set(6, black);
				gameOverWin = gameOverWin + 1;
			}
			if (board.get(y).get(2).equals(thirdPos)) {
				board.get(y).set(5, black);
				gameOverWin = gameOverWin + 1;
			}
			if (board.get(y).get(3).equals(fourthPos)) {
				board.get(y+1).set(6, black);
				gameOverWin = gameOverWin + 1;
			}
			
			for (int m=0; m<=y; m+=2) { //printing out the sufficient lines for each guess 
				System.out.println(board.get(m)); 
				System.out.println(board.get(m+1));
				
			}
			 
			 if (gameOverWin == 4) {//if code is cracked
				 y = 20;
				 System.out.println("Congrats! You cracked the code!");
			}
			
			
	}
	
			
			
			
			
			
			
		
				
		
		
}

}
