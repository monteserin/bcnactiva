package com.pablomonteserin;

import java.util.Scanner;

public class Main3 {


	
	public static void main(String[] args) {
		//1 - RECOGIDA DE VALORES
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce la nota: ");
		int nota = lector.nextInt();
		
	
		
		//2 - CALCULO DEL RESULTADO
		String mensaje="";
		if(nota>5) {
			mensaje ="El exito es para los que perseveran. Y hacen descansos de 5 minutos";
		}else if(nota==5) {
			mensaje ="Todavía hay esperanza para tí";
		}else {
			mensaje = "ups...";
		}
		
		
		
		//3 - MOSTRAR RESULTADO
		System.out.println(mensaje);
	}
	
	
}
 

