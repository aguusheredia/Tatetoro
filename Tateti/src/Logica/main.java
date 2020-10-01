package Logica;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablero tictacInstance = new Tablero();
		tictacInstance.imprimirTablero();

		Scanner opcion = new java.util.Scanner(System.in);
		int dato;
		boolean ganador = false;
		char ficha;
		for (int turno = 1; turno <= 9; turno++) {
			boolean valido = true;
			ficha = (turno % 2 == 0) ? 'X' : 'O';
			do {
				System.out.println("Seleccione una opcion (1-9): ");
				dato = opcion.nextInt();
				valido = tictacInstance.comprobarEspacioDisponible(dato);
			} while (!valido);
			tictacInstance.asignarFichaTablero(ficha, dato);
			tictacInstance.imprimirTablero();
			if (turno > 5)
				if (tictacInstance.gana(ficha)) {
					System.out.println("Ganó " + ficha);
					ganador = true;
					break;
				}
		}
		if (!ganador) {
			System.out.println("Empate!");
			}

		}
}
