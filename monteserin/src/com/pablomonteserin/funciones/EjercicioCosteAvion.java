package com.pablomonteserin.funciones;

import java.util.Scanner;

public class EjercicioCosteAvion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca el n�mero de noches: ");
		int numNoches = scanner.nextInt();
		
		System.out.println("Introduzca la ciudad de destino");
		String destino = scanner.next();

		EjercicioCosteAvion costeViaje = new EjercicioCosteAvion();
		int resultado1 = costeViaje.costeHotel(numNoches);
		int resultado2 = costeViaje.costeAvion(destino);
		int resultado3 = costeViaje.costeAlquilerCoche(numNoches);
		
		int sumaCostes = resultado1 + resultado2;
		System.out.println("Coste total: " + sumaCostes);
	}
	
	public int costeHotel(int n) {
		return n*140;
	}
	
	public int costeAvion(String ciudad) {
		if(ciudad.equals("Oviedo")) {
			return 15;
		}else if(ciudad.equals("Tokyo")) {
			return 700;
		}else if(ciudad.equals("Madrid")) {
			return 90;
		}else if(ciudad.equals("Barcelona")) {
			return 90;
		}
		return 0;
	}
	
	public int costeAlquilerCoche(int n) {
		int valorDevuelto = n*40;
		
		if(n>=7) {
			valorDevuelto = valorDevuelto-50;
		}else if(n>=3) {
			valorDevuelto = valorDevuelto - 20;
		}
		return valorDevuelto;
	}
	

}
