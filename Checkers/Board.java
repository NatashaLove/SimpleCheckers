package Checkers;
//no import because in the same package
public class Board{
	
	private Piece[][] board= new Piece[8][8];//array of spots for pieces (hypothetic)
	
	public void set (Piece p, int x, int y){
		//error if x or y are <7
		
		board[x][y] = p;
	}
	
	public boolean checkOccup (int x, int y){
		
		return (board[x][y] !=null);// true if occupied
		
	}
	
	//class-Piece.enum
	//use board to access pieces color
	public Piece.COLOR checkColor (int x, int y){
		return board[x][y].getColor();
	}
	
}