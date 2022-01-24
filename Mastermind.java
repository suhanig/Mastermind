
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
			
			
		} //closes for loop
			/*board.get(2).add(" "); 
			board.get(2).add(" "); 		
			board.get(2).add(" "); 
			board.get(2).add(" ");
			//now scoring
			board.get(2).add("="); 
			board.get(2).add(" "); 
			board.get(2).add(" ");
			board.add(new ArrayList<String>()); //create arraylist 4 second row
			board.get(3).add("-"); 
			board.get(3).add("-"); 		
			board.get(3).add("-"); 
			board.get(3).add("-");
			//now scoring
			board.get(3).add("="); 
			board.get(3).add(" "); 
			board.get(3).add(" ");board.get(0).add(" "); 
			board.get(4).add(" "); 		
			board.get(4).add(" "); 
			board.get(4).add(" ");
			//now scoring
			board.get(4).add("="); 
			board.get(4).add(" "); 
			board.get(4).add(" ");
			board.add(new ArrayList<String>()); //create arraylist 4 second row
			board.get(5).add("-"); 
			board.get(5).add("-"); 		
			board.get(5).add("-"); 
			board.get(5).add("-");
			//now scoring
			board.get(5).add("="); 
			board.get(5).add(" "); 
			board.get(5).add(" ");
			board.get(6).add(" "); 
			board.get(6).add(" "); 		
			board.get(6).add(" "); 
			board.get(6).add(" ");
			//now scoring
			board.get(6).add("="); 
			board.get(6).add(" "); 
			board.get(6).add(" ");
			board.add(new ArrayList<String>()); //create arraylist 4 second row
			board.get(7).add("-"); 
			board.get(7).add("-"); 		
			board.get(7).add("-"); 
			board.get(7).add("-");
			//now scoring
			board.get(7).add("="); 
			board.get(7).add(" "); 
			board.get(7).add(" ");
			board.get(8).add(" "); 
			board.get(8).add(" "); 		
			board.get(8).add(" "); 
			board.get(8).add(" ");
			//now scoring
			board.get(8).add("="); 
			board.get(8).add(" "); 
			board.get(8).add(" ");
			board.add(new ArrayList<String>()); //create arraylist 4 second row
			board.get(9).add("-"); 
			board.get(9).add("-"); 		
			board.get(9).add("-"); 
			board.get(9).add("-");
			//now scoring
			board.get(9).add("="); 
			board.get(9).add(" "); 
			board.get(9).add(" "); */
		
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
	

}
