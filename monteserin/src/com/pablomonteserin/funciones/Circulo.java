package com.pablomonteserin.funciones;

import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un radio");
		int ra = lector.nextInt();
		circulo.calculaPerimetro(ra);
		circulo.calculaArea(ra);
		
	}

	public void calculaPerimetro(int radio) {
		double r = 2*Math.PI*radio;
		System.out.println(r);
	}
	
	public void calculaArea(int radio) {
		double r = 3.14d*radio*radio;
		System.out.println(r);
	}
}
