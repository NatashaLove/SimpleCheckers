import java.util.*;
import Checkers.*;

public class Play {
	public static void main (String [] args) {
	
		Board board = new Board();
		
		//create loop for creating black and red pieces 
		
		Piece r1=new Piece();
		//r1=Piece.COLOR.RED;
		r1.set(Piece.Color.RED);// class.enum.value
		Piece b1=new Piece();
		b1.set(Piece.Color.BLACK);// class.enum.value
		
		board.set(r1,0,0);
		board.set(b1,7,7);
		
	}
}