
//player vs. computer

//2D array list makes up board

//secret does not get printed each time

//secret is 5 non repeat pins

//how many turns or tries

//class: board, game, player

import java.util.ArrayList;
import java.util.Scanner;


public class Mastermind {
	
	private String firstPos;
	private String secondPos;
	private String thirdPos;
	private String fourthPos;
	int n = 1;
	
	//declare memory spot
	ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>> (); //creates placeholder in memory
	
	public void buildBoard () {//building the outline of the boar. try to put this into a for or wjile loop?
			
		
		
			for (int x = 0; x < 20; x+=2) { //for loop to repeat the board to have 20 rows in total for 10 total guesses
			board.add(new ArrayList<String>());  //board<list1, list2...>    board.get(0)  //'append'
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
			//introuding scoring row
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
	
	//method to add test guess to board?
	public void addGuess (char[] arrChar, int turns) {  // ['R', 'B', 'Y', 'G' ]
		
		for (int i = 0; i < 4; i++) { //for loop for each row
			//iterate thru each element in the [] arrchar
			board.get(turns).set(i, String.valueOf(arrChar[i]) ); 
			//put each letter into the arrayList
		}
		
		
		
	}
	
	
	

	public void printBoard() {
	
	System.out.println(" Guesses \t Scores");
	
	for (int p=0; p<20; p++) { //print board of 20 rows
	System.out.println(board.get(p));
	}
	/*System.out.println(board.get(1));
	System.out.println(board.get(3));
	System.out.println(board.get(4));
	System.out.println(board.get(5));
	System.out.println(board.get(6));
	System.out.println(board.get(7));
	System.out.println(board.get(8));
	System.out.println(board.get(9)); */
	
	}
	
	public void secretCode () { //has computer generate random secret code for player to be guessing
		
		int random = (int) (Math.random() * 7);
		String [] arr = { "R", "Y", "G", "B", "O", "P" };
		firstPos = arr [random];
		random = (int) (Math.random() * 6);
		secondPos = arr [random];
		
		//all while loops belo are ensuring that there are no repeats
			while (firstPos.equals(secondPos)) {
				
				random = (int) (Math.random() * 6);
				secondPos = arr[random];
				
			}
		random = (int) (Math.random() * 6);
		thirdPos = arr[random];
			while (firstPos.equals(thirdPos) || secondPos.equals(thirdPos) ) {
				
				random = (int) (Math.random() * 6);
				thirdPos = arr[random];
				
			}
		random = (int) (Math.random() * 6);
		fourthPos = arr[random];
		
			while (firstPos.equals(fourthPos) || secondPos.equals(fourthPos) || thirdPos.equals(fourthPos) ) {
				
				random = (int) (Math.random() * 6);
				fourthPos = arr[random];
			}
			
		System.out.println(firstPos + secondPos + thirdPos + fourthPos);
		
	} // closes secretCode
	
	
	
	public void userGuess () { //code for taking in user input and comparing it to the computer's generated secret code 
		
		
		Scanner scan = new Scanner (System.in);
		
		int guesses = 0; 
		
		for (int y = 0; y < 20; y+=2) {
			
			guesses = guesses + 1;
			
			System.out.println("Welcome to Mastermind. Please enter your guess by using letters for the colors. 'B' for blue, 'R' for red, 'Y' for yellow, 'G' for green, 'O' for orange, and 'P' for purple.");
			
			System.out.println("Enter letter for your guess: ");
			String letterOne = scan.nextLine();
			
			System.out.println("Enter letter for your guess: ");
			String letterTwo = scan.nextLine();
			
			System.out.println("Enter letter for your guess: ");
			String letterThree = scan.nextLine();
			
			System.out.println("Enter letter for your guess: ");
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
			
			//checking if user input is right color but also in the right LOCATION
			
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
			
			for (int m=0; m<n; m++) {
				System.out.println(board.get(m));
				System.out.println(board.get(m+1));
				
			}
			n = n + 2;
			 
			 if (gameOverWin == 4) {
				 y = 20;
			}
			
	}
	
			
			
			
			
			
			
		
				
		
		
}

}
