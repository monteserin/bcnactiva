package com.pablomonteserin.modificadores;

public abstract class Persona {
	public void bailar() {
		System.out.println("uuuu que bien bailo");
	}
	
	public void cantar(String cancion) {
		System.out.println("Me encanta la cancion" + cancion);
	}

	public abstract void susurrar();
	
}
