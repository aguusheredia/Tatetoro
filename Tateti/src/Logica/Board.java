package Logica;

public class Board {
	private final int ROW;
	private final int COLUMNS;
	private int turn;
	private int [][] board;
	
	Board(){
		ROW = 3;
		COLUMNS = 3;
		turn = 0;
		board = new int [ROW][COLUMNS];
	}
	
	private int getBoardSpace(int row,int column) {
		return board[row][column];
	}
	
	private void setBoardSpace(int row,int column,int player) {
		board[row][column] = player;
	}
	
	public void control(int row,int column) {
		if(row > this.ROW - 1 || row < 0 || column > this.COLUMNS - 1 || column < 0) {
			throw new IllegalArgumentException();
		}
	}
	
	public boolean BoardSpaceOccupied(int row,int column) {
		if(getBoardSpace(row, column) != 0) {
			return true;
		}
		return false;
	}
	
	public void makeMove(int row,int column,int player) {
		try {
			setBoardSpace(row, column, player);
			control(row,column);
		}
		catch (Exception e) {
			
		}
		
	}
	
	public boolean gameControl(int n) {
		
		if(board[0][0]==n && board[0][1]==n && board[0][2]==n) {
			return true;
		}
		if(board[0][0]==n && board[1][0]==n && board[2][0]==n) {
			return true;
		}
		if(board[0][0]==n && board[1][1]==n && board[2][2]==n) {
			return true;
		}
		if(board[0][1]==n && board[1][1]==n && board[2][1]==n) {
			return true;
		}
		if(board[0][1]==n && board[1][2]==n && board[2][0]==n) {
			return true;
		}
		if(board[0][1]==n && board[1][0]==n && board[2][2]==n) {
			return true;
		}
		if(board[0][2]==n && board[1][2]==n && board[2][2]==n) {
			return true;
		}
		if(board[0][2]==n && board[1][1]==n && board[2][0]==n) {
			return true;
		}
		if(board[1][0]==n && board[1][1]==n && board[1][2]==n) {
			return true;
		}
		if(board[1][0]==n && board[2][1]==n && board[0][2]==n) {
			return true;
		}
		if(board[1][2]==n && board[2][1]==n && board[0][0]==n) {
			return true;
		}
		if(board[2][0]==n && board[2][1]==n && board[2][2]==n) {
			return true;
		}
		return false;
	}
}
