package Logica;

import javax.swing.ImageIcon;

public class Board {

 
    String[][] board;
    private int turn;
    private int x;
    private int y;
    private boolean winner;
    private ImageIcon player1;
    private ImageIcon player2;
    
    public Board () {
    	this.board = new String[][]{{"1", "2", "3"}, {"4", "5", "6"}, {"7","8","9"}};
    	this.turn = 0;
    	this.winner = false;
    }

    //Dada una posicion, devuelve las coordenadas en el tablero
    public void getCoordinates(int valor) {
        switch(valor){
            case 1:
                x = 0;
                y = 0;
                break;
            case 2:
                x = 0;
                y = 1;
                break;
            case 3:
                x = 0;
                y = 2;
                break;
            case 4:
                x = 1;
                y = 0;
                break;
            case 5:
                x = 1;
                y = 1;
                break;
            case 6:
                x = 1;
                y = 2;
                break;
            case 7:
                x = 2;
                y = 0;
                break;
            case 8:
                x = 2;
                y = 1;
                break;
            case 9:
                x = 2;
                y = 2;
                break;
            default:
                throw new RuntimeException("No existe cordenada");
        }
    }

    //Dada una posicion, verifica si dicha posicion se encuentra ocupada
    public boolean checkCoordinate(int value) {
        getCoordinates(value);
        if (board[x][y] == "X" || board[x][y] == "O") {
            return false;
        }
        else {
            return true;
        }
    }

    //Dado un jugador y una posicion, de ser posible, coloca su jugada en el tablero
    public void makeMove(String player, int value) {
    	getCoordinates(value);
        board[x][y] = player;
    }

    //Dado un jugador, verifica si el mismo gano el juego 
    public boolean controlGame(String player) {
    	if(turn>=4) {
	    	if ((board[0][0]==player) && (board[0][1]==player) && (board[0][2]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[0][0]==player) && (board[1][0]==player) && (board[2][0]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[0][0]==player) && (board[1][1]==player) && (board[2][2]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[0][1]==player) && (board[1][1]==player) && (board[2][1]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[0][1]==player) && (board[1][0]==player) && (board[2][2]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[0][1]==player) && (board[1][2]==player) && (board[2][0]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[0][2]==player) && (board[1][2]==player) && (board[2][2]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[1][0]==player) && (board[1][1]==player) && (board[1][2]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[1][0]==player) && (board[2][1]==player) && (board[0][2]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[1][2]==player) && (board[2][1]==player) && (board[0][0]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[2][0]==player) && (board[2][1]==player) && (board[2][2]==player)) {
	        	this.winner = true;
	            return true;
	        }
	    	if ((board[0][2]==player) && (board[1][1]==player) && (board[2][0]==player)) {
	        	this.winner = true;
	            return true;
	        }
    	}
        return false;
    }

    //Retorna quien es el encargado del turno actual
	public String returnPlayer() {
		if(turn % 2 == 0) {
			return "X";
		}
		else {
			return "O";
		}
	}
	
	//Pasa al siguiente turno
	public void passTurn() {
		turn++;
	}
	
    public int getTurn() {
		return turn;
	}

    
    //Dada una posicion presiona, se encarga de hacer las acciones necesarias
	public String pressButton(int position) {
		if (checkCoordinate(position)) {
			String player = returnPlayer();
			makeMove(player, position);
			if (controlGame(player)) { 
				return player;
			}
			passTurn();
			return player;
		}
		return "";
	}
	
	public boolean getGanador () {
		return this.winner;
	}
	
	public ImageIcon getPlayer1() {
		return player1;
	}

	public void setPlayer1(ImageIcon player1) {
		this.player1 = player1;
	}

	public ImageIcon getPlayer2() {
		return player2;
	}

	public void setPlayer2(ImageIcon player2) {
		this.player2 = player2;
	}
    
	
}