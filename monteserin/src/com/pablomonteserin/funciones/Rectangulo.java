package com.pablomonteserin.funciones;

public class Rectangulo {

	public static void main(String[] args) {
		
		
		Rectangulo rectangulo = new Rectangulo();
		rectangulo.calculaPerimetro(3, 4);
	}
	
	
	
	
	
	public void calculaPerimetro(int alto, int ancho) {
		int r = 2*alto + 2*ancho;
		System.out.println(r);
	}
}
