package com.pablomonteserin.funciones;

import java.util.Scanner;

public class CalculadoraConReturn {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el primer n�mero:");
		int n1 = lector.nextInt();
		
		System.out.println("Introduce el segundo n�mero:");
		int n2 = lector.nextInt();
		System.out.println("Introduce la operaci�n a realizar:");
		String op = lector.next();
		CalculadoraConReturn calc = new CalculadoraConReturn();
		int r = 0;
		if(op.equals("+")) {
			r = calc.sumar(n1, n2);
		}else if(op.equals("-")) {
			r = calc.restar(n1, n2);

		}else if(op.equals("*")) {
			r = calc.multiplicar(n1, n2);

		}else if(op.equals("/")) {
			r = calc.dividir(n1, n2);
		}
		System.out.println(r);

	}
	
	public int sumar(int n1 , int n2) {
		int r = n1+n2;
		return r;
	}
	
	public int restar(int n1 , int n2) {
		int r = n1-n2;
		return r;
	}
	
	public int multiplicar(int n1 , int n2) {
		int r = n1*+n2;
		return r;
	}
	
	public int dividir(int n1 , int n2) {
		int r = n1/n2;
		return r;
	}
	

}
