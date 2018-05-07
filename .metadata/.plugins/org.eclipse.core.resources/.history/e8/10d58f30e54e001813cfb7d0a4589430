package com.pablomonteserin.depositos;

import java.util.Objects;

public class Deposito implements Comparable<Deposito>{
	private String nombre;
	private int largo;
	private int ancho;
	private int alto;
	
	
	



	public Deposito(String nombre, int largo, int ancho, int alto) {
		super();
		this.nombre = nombre;
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
	}


	@Override
	public boolean equals(Object obj) {
		
		Deposito deposito2 = (Deposito)obj;
		int volumen1 = largo*ancho*alto;
		int volumen2 = deposito2.alto*deposito2.ancho*deposito2.largo;
		if(volumen1==volumen2) return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(largo*ancho*alto);
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
