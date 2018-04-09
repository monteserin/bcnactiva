package com.pablomonteserin;

import java.util.Scanner;

public class Main4 {


	
	public static void main(String[] args) {
		//1 - RECOGIDA DE VALORES
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int n = lector.nextInt();
		
	
		
		//2 - CALCULO DEL RESULTADO
		String mensaje1="";
		if(n>=0) {
			mensaje1 ="es positivo";
		}else {
			mensaje1 ="es negativo";
		}
		
		String mensaje2="";
		if(n%2==0) {
			mensaje2 ="es par";
		}else {
			mensaje2 ="es impar";
		}
		
		String mensaje3="";
		if(n%5==0) {
			mensaje3 ="es multiplo de 5";
		}else {
			mensaje3 ="no es multiplo de 5";
		}
		
		String mensaje4="";
		if(n%10==0) {
			mensaje4 ="es multiplo de 10";
		}else {
			mensaje4 ="no es multiplo de 10";
		}
		
		String mensaje5="";
		if(n>100) {
			mensaje5 ="es mayor que 100";
		}else {
			mensaje5 ="no es mayor que 100";
		}
		
		//3 - MOSTRAR RESULTADO
		System.out.println(mensaje1);
		System.out.println(mensaje2);
		System.out.println(mensaje3);
		System.out.println(mensaje4);
		System.out.println(mensaje5);

	}
	
	
}
 

