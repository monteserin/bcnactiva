package com.pablomonteserin;

import java.util.Scanner;

public class ContarNumeros {

	public static void main(String[] args) {
		
	int n=0;
		int contadorNumeros=0;
		
		while(n!=-1) {
			System.out.println("Introduce un numero");
			Scanner lector = new Scanner(System.in);
			n = lector.nextInt();
			
			if(n%10==2) {
				contadorNumeros++;
			}
		}
		
		System.out.println(contadorNumeros);

	}

}
