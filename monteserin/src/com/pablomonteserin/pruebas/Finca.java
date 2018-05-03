package com.pablomonteserin.pruebas;


public class Finca implements Comparable<Finca>{
	
	private int ancho;
	private int largo;
	
public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}

}
	public int compareTo(Finca otherFinca){
		double productoThis = this.getAncho()*this.getLargo();
		double productoOther = otherFinca.getAncho()*otherFinca.getLargo();
		
		int valorDevuelto = 0;
		if(productoThis > productoOther)valorDevuelto=1;
		if(productoThis < productoOther)valorDevuelto=-1;
		if(productoThis == productoOther)valorDevuelto=0;
		return valorDevuelto;	
	}