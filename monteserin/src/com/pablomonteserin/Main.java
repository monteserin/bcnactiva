package com.pablomonteserin;

import java.util.Scanner;

public class Main {


	
	public static void main(String[] args) {
		//1 - RECOGIDA DE VALORES
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el alto: ");
		int alto = lector.nextInt();
		
		System.out.println("Introduce el ancho: ");
		int ancho = lector.nextInt();
		
		//2 - CALCULO DEL RESULTADO
		int perimetro = 2*ancho+2*alto;
		int area = ancho*alto;
		
		
		//3 - MOSTRAR RESULTADO
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: "+ area);
	}
	
	
}
 

