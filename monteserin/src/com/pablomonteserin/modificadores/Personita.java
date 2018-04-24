package com.pablomonteserin.modificadores;

public class Personita extends Persona{

	public Personita(){
		
	}
	
	public void bailar() {
		System.out.println("yo soy una personita bailando");
	}
	public void cantar() {
		System.out.println("Odio cantar");
	}

	@Override
	public void susurrar() {
		System.out.println("adfgasdg");
		
	}
	
}
