package com.pablomonteserin.excepciones;

public class Servicios {

	public double getPrecioConIva(int numero) throws PrecioDemasiadoAltoException {
		double valorDevuelto =  numero*1.16d;
		
		if(valorDevuelto>100) {
			throw new PrecioDemasiadoAltoException();
		}
		return valorDevuelto;
	}
}
