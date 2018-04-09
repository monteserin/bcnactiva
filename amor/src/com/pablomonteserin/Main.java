package com.pablomonteserin;

public class Main {

	public static void main(String[] args) {

		Gato gato =null;
		System.out.println(gato);
		gato= new Gato();
		
		System.out.println(gato);
	}

}

class Gato{
	String nombre;
	int edad;
	
	void dormir() {
		
	}
}
