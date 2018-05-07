package com.pablomonteserin.depositosConstructor;


public class Deposito implements Comparable<Deposito>{
	private String nombre;
	public int largo;
	private int ancho;
	private int alto;
	
	
	
	public Deposito() {
		super();
		System.out.println("con constructor vacio");
	}

	public Deposito(int largo, int ancho) {
		super();
		this.largo = largo;
		this.ancho = ancho;
	}


	public Deposito(String nombre, int largo, int ancho, int alto) {
		super();
		this.nombre = nombre;
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getLargo() {
		return largo;
	}


	public void setLargo(int largo) {
		
		this.largo = largo;
	}


	public int getAncho() {
		return ancho;
	}


	public void setAncho(int ancho) {
		this.ancho = ancho;
	}


	public int getAlto() {
		return alto;
	}


	public void setAlto(int alto) {
		this.alto = alto;
	}


	@Override
	public int compareTo(Deposito d2) {
		int vol1 = largo*ancho*alto;
		int vol2 = d2.largo*d2.ancho*d2.alto;
		if(vol1==vol2)return 0;
		else if(vol1>vol2)return 1;
		else return -1;
		
	}
	
	
}
