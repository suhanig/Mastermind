
//player vs. computer

//2D array list makes up board

//secret does not get printed each time

//secret is 5 non repeat pins

//how many turns or tries

//class: board, game, player

import java.util.ArrayList;

public class Mastermind {
	
	//declare memory spot
	ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>> (); //creates placeholder in memory
	
	public void buildBoard () {
			
		board.add(new ArrayList<String>());  //board<list1, list2...>    board.get(0)  //'append'
		
		board.get(0).add(" "); 
		board.get(0).add(" "); 		
		board.get(0).add(" "); 
		board.get(0).add(" ");
		//now scoring
		board.get(0).add("="); 
		board.get(0).add(" "); 
		board.get(0).add(" ");
		board.add(new ArrayList<String>()); //create arraylist 4 second row
		board.get(1).add("-"); 
		board.get(1).add("-"); 		
		board.get(1).add("-"); 
		board.get(1).add("-");
		//now scoring
		board.get(1).add("="); 
		board.get(1).add(" "); 
		board.get(1).add(" ");
	}
	
	//method to add test guess to board?
	public void addGuess (char[] arrChar) {  // ['R', 'B', 'Y', 'G' ]
		
		for (int i = 0; i < 4; i++) {
			//iterate thru each element in the [] arrchar
			board.get(0).set(i, String.valueOf(arrChar[i]) );
			//put each letter into the arrayList
		}
		
		
		
	}
	
	
	

	public void printBoard() {
	
	System.out.println(" Guesses \t Scores");
	
	System.out.println(board.get(0));
	System.out.println(board.get(1));
	
	}
	

}
