package com.pablomonteserin.ahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		String [] palabras = {"elefante", "amor", "casa"};
		int posicionAleatoria = (int) Math.floor(Math.random() * palabras.length);
		String palabra = palabras[posicionAleatoria];
		
		System.out.println(palabra);
		
		char [] letras = palabra.toCharArray();
		char [] letrasConGuiones = new char[letras.length];
		
		for(int i=0; i<letras.length; i++) {
			letrasConGuiones[i]='_';
		}
		
		System.out.println(letrasConGuiones);
		
		
		boolean hemosGanado = false;
		
		while(hemosGanado==false) {
		System.out.println("Introduce una letra");
		Scanner lector = new Scanner(System.in);
		char letraIntroducida =lector.next().charAt(0);
		
		for(int i=0; i<letras.length;i++) {
			if(letras[i]==letraIntroducida) {
				letrasConGuiones[i]=letraIntroducida;
			}
		}
		
		
		
		if(Arrays.equals(letras, letrasConGuiones)) {
			System.out.println("exito");
			hemosGanado=true;
		}
		System.out.println(letrasConGuiones);
		
		}
	}

}
