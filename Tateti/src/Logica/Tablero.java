package Logica;

public class Tablero {

 
    String[][] board = {{"1", "2", "3"}, {"4", "5", "6"}, {"7","8", "9"}};
    private int turno = 0;
    private int x;
    private int y;
    private boolean ganador;
    
    public Tablero () {
    	turno = 0;
    	ganador = false;
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
                throw new RuntimeException("No hay existe cordenada");

        }

    }

    public boolean comprobarEspacioDisponible(int valor) {

        conocerCoordenadas(valor);
        if (board[x][y] == "X" || board[x][y] == "O") {
            return false;
        } else {
            return true;
        }

    }

    public void asignarFichaTablero(String ficha, int valor) {
    	conocerCoordenadas(valor);
        board[x][y] = ficha;
    }

    public boolean gana(String ficha) {
        for (int i = 0; i < board.length; i++)//horizontales
        {
            int cont = 0; //contador para saber cuantas fichas iguales hay
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]==ficha) {
                    cont++;
                }
            }
            if (cont == 3) {
            	this.ganador = true;
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
            	this.ganador = true;
                return true;
            }
        }

        //diagonal
        if ((board[0][0]==ficha) && (board[1][1]==ficha) && (board[2][2]==ficha)) {
        	this.ganador = true;
            return true;
        }
        if ((board[0][2]==ficha) && (board[1][1]==ficha) && (board[2][0]==ficha)) {
        	this.ganador = true;
            return true;
        }
        
        //parte tatetoro
        if((board[0][1]== ficha) && (board[1][0]==ficha) && (board[2][2]==ficha)) {
        	this.ganador = true;
        	return true;        	
        }
        if((board[0][1]== ficha) && (board[1][2]==ficha) && (board[2][0]==ficha)) {
        	this.ganador = true;
        	return true;        	
        }
        if((board[0][0]== ficha) && (board[1][2]==ficha) && (board[2][1]==ficha)) {
        	this.ganador = true;
        	return true;        	
        }
        if((board[0][2]== ficha) && (board[1][0]==ficha) && (board[2][1]==ficha)) {
        	this.ganador = true;
        	return true;        	
        }
        	
        return false;

    }

	public String devolverFicha() {
		if(turno % 2 == 0) {
			return "X";
		}
		else {
			return "O";
		}
	}
	public void aumentarTurno() {
		turno++;
	}
    public int getTurno() {
		return turno;
	}

	public String pressButton(int position) {
		if (comprobarEspacioDisponible(position)) {
			String ficha = devolverFicha();
			asignarFichaTablero(ficha, position);
			if (gana(ficha)) 
				System.out.println("El ganador es: " + ficha);
			
			aumentarTurno();
			return ficha;
		}
		
		return "";
	}
	
	public boolean getGanador () {
		return this.ganador;
	}
    
	
}