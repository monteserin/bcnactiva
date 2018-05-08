package com.pablomonteserin.excepciones;

public class PrecioDemasiadoAltoException extends Exception {
	@Override
	public void printStackTrace() {
		System.out.println("El precio es demasiado alto");
	}
}
