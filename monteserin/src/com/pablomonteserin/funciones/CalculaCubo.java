package com.pablomonteserin.funciones;

public class CalculaCubo {
	
	public void calculaCubo(int n) {
		int r = n*n*n;
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		CalculaCubo calcula = new CalculaCubo();
		calcula.calculaCubo(3);
	}
}
