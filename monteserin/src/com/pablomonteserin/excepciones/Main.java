package com.pablomonteserin.excepciones;

public class Main {
	public static void main(String args[]) {
		Servicios servicios = new Servicios();
		double valor = 0;
		try {
			valor = servicios.getPrecioConIva(666);
		} catch (PrecioDemasiadoAltoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(valor);
	}
}
