package com.pablomonteserin.pruebas;

public class Main {

	public static void main(String[] args) {
		Punto2D p1 = new Punto2D(3,4, "p1");
		Punto2D p2 = new Punto2D(3,4, "p2");
		
		if(p1.equals(p2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("NO son iguales");
		}
		
		

	}

}
