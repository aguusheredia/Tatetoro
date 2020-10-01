package Logica;

import java.util.Scanner;

//public class Tablero {
//	private int [][] board;
//	
//	public Tablero(){
//		board = new int[3][3];
//	}
//	
//	public int getSpace(int i,int j) {
//		return board[i][j];
//	}
//}

public class Tablero {

    private final int ROWS = 3;
    private final int COLUMNS = 3;
    char[][] board = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

    private int x;
    private int y;

    public void imprimirTablero() {

        System.out.println("Tablero de juego");
        for (int i = 0; i < ROWS; i++) {

            for (int j = 0; j < COLUMNS; j++) {
                System.out.print("" + board[i][j] + "");
                if (j < COLUMNS - 1) {
                    System.out.print(" ║ ");
                }

            }
            System.out.println("");
            if (i < COLUMNS - 1) {
                System.out.println("═   ═   ═");
            }
        }

    }

    public void conocerCoordenadas(int valor) {

        switch (valor) {
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
                System.out.println("No existe una posición");

        }

    }

    public boolean comprobarEspacioDisponible(int valor) {

        conocerCoordenadas(valor);
        boolean disponible = true;

        if (board[x][y] == 'X' || board[x][y] == 'O') {
            return false;
        } else {
            return true;
        }

    }

    public void asignarFichaTablero(char ficha, int valor) {
        conocerCoordenadas(valor);
        board[x][y] = ficha;
    }

    public boolean gana(char ficha) {
        for (int i = 0; i < board.length; i++)//horizontales
        {
            int cont = 0; //contador para saber cuantas fichas iguales hay
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]==ficha) {
                    cont++;
                }
            }
            if (cont == 3) {
                return true;
            }
        }

        for (int j = 0; j < board.length; j++)//verticales
        {
            int cont = 0; //contador para saber cuantas fichas iguales hay
            for (int i = 0; i < board.length; i++) {
                if (board[i][j]==ficha) {
                    cont++;
                }
            }
            if (cont == 3) {
                return true;
            }
        }

        //diagonal
        if ((board[0][0]==ficha) && (board[1][1]==ficha) && (board[2][2]==ficha)) {
            return true;
        }
        if ((board[0][2]==ficha) && (board[1][1]==ficha) && (board[2][0]==ficha)) {
            return true;
        }
        
        //parte tatetoro
        if((board[0][1]== ficha) && (board[1][0]==ficha) && (board[2][2]==ficha)) {
        	return true;        	
        }
//        if((board[0][1]== ficha) && (board[1][2]==ficha) && (board[2][0]==ficha)) {
//        	return true;        	
//        }
//        if((board[0][0]== ficha) && (board[1][2]==ficha) && (board[2][1]==ficha)) {
//        	return true;        	
//        }
//        if((board[0][2]== ficha) && (board[1][0]==ficha) && (board[2][1]==ficha)) {
//        	return true;        	
//        }
        	
        
//        	C
//        F	0 | x | 0
//        	x | 0 | x
//        	x | 0 | x 
//
//        	x | 0 | x
//        	x | 0 | x
//        	0 | x | 0

        return false;

    }

}
