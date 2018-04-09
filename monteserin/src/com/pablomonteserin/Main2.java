package com.pablomonteserin;

import java.util.Scanner;

public class Main2 {


	
	public static void main(String[] args) {
		//1 - RECOGIDA DE VALORES
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce los grados centrigados: ");
		int gCentigrados = lector.nextInt();
		
	
		
		//2 - CALCULO DEL RESULTADO
		int gFahrenheit = gCentigrados*9/5+32;
		
		
		
		//3 - MOSTRAR RESULTADO
		System.out.println("Grados Fahrenheit: " + gFahrenheit);
	}
	
	
}
 

