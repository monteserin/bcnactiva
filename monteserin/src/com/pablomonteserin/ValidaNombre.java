package com.pablomonteserin;

import java.util.Scanner;

public class ValidaNombre {

	public static void main(String[] args) {

		
		boolean datosCorrectos=false;
		
		while(datosCorrectos==false) {
			System.out.println("Introduce tu nombre");
			Scanner lector = new Scanner(System.in);
			
			String nombre = lector.nextLine();
			if(nombre.equals("")) {
				System.out.println("Vamos mal");
			}else {
				System.out.println("Son correctos los datos introducidos");
				String respuesta = lector.next();
				if(respuesta.equals("si")) {
					System.out.println("es correcto");
				}else {
					System.out.println("no es currecto");
				}
			}
			
	
		}
		

	}

}
