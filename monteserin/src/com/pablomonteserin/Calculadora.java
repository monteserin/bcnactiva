package com.pablomonteserin;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		//1 - RECOGIDA DE VALORES
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int n1 = lector.nextInt();
		System.out.println("Introduce el segundo numero");
		int n2 = lector.nextInt();
		System.out.println("Introduce la operacion a realizar");
		String op = lector.next();
		
		//2 - LOGICA DE LA APLICACION
		
		int resultado = 0;
		if(op.equals("suma")) {
			resultado = n1+n2;
		}else if(op.equals("resta")) {
			resultado = n1-n2;
		}else if(op.equals("division")) {
			resultado = n1/n2;
		}else if(op.equals("multiplicacion")) {
			resultado = n1*n2;
		}
		
		//3 - mostrar el resultado
		System.out.println(resultado);
		
	}
}
