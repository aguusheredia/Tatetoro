package Logica;

public class Tablero {
	private int [][] board;
	
	public Tablero(){
		board = new int[3][3];
	}
	
	public int getSpace(int i,int j) {
		return board[i][j];
	}
}
