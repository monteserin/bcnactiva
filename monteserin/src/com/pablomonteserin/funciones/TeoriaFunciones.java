package com.pablomonteserin.funciones;

public class TeoriaFunciones {

	public static void main(String[] args) {
		TeoriaFunciones obj =  new TeoriaFunciones();
		
		obj.calcularMetrhosHora(5);

	}
	
	public void calcularMetrhosHora(int param) {
		int r = param*1000;
		System.out.println("Los m/hora: " + r);
	}

}