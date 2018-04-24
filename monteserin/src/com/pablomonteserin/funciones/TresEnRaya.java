package com.pablomonteserin.funciones;

import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		String[] tablero = { "_", "_", "_", "_", "_", "_", "_", "_", "_" };
		TresEnRaya game = new TresEnRaya();
		game.showTablero(tablero);

		int contadorTurnos = 0;
		boolean haGanado = false;
		while (haGanado ==false) {
			if (contadorTurnos % 2 == 0) {
				game.juegaPlayer("X", tablero);
				haGanado= game.evaluateWin(tablero);
				if(haGanado)System.out.println("Enhorabuena X");
			} else {
				game.juegaPlayer("O", tablero);
				haGanado = game.evaluateWin(tablero);
				if(haGanado)System.out.println("Enhorabuena O");


			}
			contadorTurnos++;
		}

	}

	public void showTablero(String[] tablero) {
		System.out.println(tablero[0] + " | " + tablero[1] + " | " + tablero[2]);
		System.out.println(tablero[3] + " | " + tablero[4] + " | " + tablero[5]);
		System.out.println(tablero[6] + " | " + tablero[7] + " | " + tablero[8]);

	}

	public void juegaPlayer(String ficha, String[] tablero) {
		boolean haConseguidoMover = false;
		int pos=0;
		while(haConseguidoMover ==false) {
			System.out.println("Introduce la posicion");
			Scanner lector = new Scanner(System.in);
			 pos = lector.nextInt();
			 if(tablero[pos].equals("_")) {
				 haConseguidoMover = true;
			 }else {
				 System.out.println("Calamidad, esa posicion ya esta ocupada");
			 }
		}		
		tablero[pos] = ficha;
		this.showTablero(tablero);
	}
	public boolean evaluateWin(String []tablero) {
		if(tablero[0].equals(tablero[1]) &&tablero[0].equals(tablero[2]) && !tablero[0].equals("_")) {
			return true;
		}else if(tablero[3].equals(tablero[4]) &&tablero[3].equals(tablero[5]) && !tablero[3].equals("_")) {
			return true;
		}else if(tablero[6].equals(tablero[7]) &&tablero[6].equals(tablero[8]) && !tablero[6].equals("_")) {
			return true;
		}else if(tablero[0].equals(tablero[3]) &&tablero[0].equals(tablero[6]) && !tablero[0].equals("_")) {
			return true;
		}else if(tablero[1].equals(tablero[4]) &&tablero[1].equals(tablero[7]) && !tablero[1].equals("_")) {
			return true;
		}else if(tablero[2].equals(tablero[5]) &&tablero[2].equals(tablero[8]) && !tablero[2].equals("_")) {
			return true;
		}else if(tablero[0].equals(tablero[4]) &&tablero[0].equals(tablero[8]) && !tablero[0].equals("_")) {
			return true;
		}else if(tablero[2].equals(tablero[4]) &&tablero[2].equals(tablero[6]) && !tablero[2].equals("_")) {
			return true;
		}
		return false;
		
	}

}
