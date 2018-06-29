package com.pablomonteserin.util;

import com.pablomonteserin.Reserva;
import com.pablomonteserin.ReservaValores;

public class ReservaUtil {

	public static ReservaValores getReservaValues(Reserva reserva) {
		int r1 = getCosteHotel(reserva.getNoches());
		int r2 = getCosteAvion(reserva.getDestino());
		int r3 = getCosteCoche(reserva.getNoches())	;
		int costeTotal = r1+r2+r3;
		ReservaValores reservaValores = new ReservaValores();
		reservaValores.setCosteHotel(r1);
		reservaValores.setCosteViaje(r2);
		reservaValores.setCosteAlquilerCoche(r3);
		reservaValores.setCosteTotal(costeTotal);
		return reservaValores;
		
	}
	
	
	private static int getCosteHotel(int noches) {
		return noches*140;
	}
	
	private static int getCosteAvion(String nombre) {
		if(nombre.equals("Oviedo")) {
			return 15;
		}else if(nombre.equals("Tokyo")) {
			return 700;
		}else if(nombre.equals("Madrid")) {
			return 90;
		}else if(nombre.equals("Barcelona")) {
			return 90;
		}else {
			return 0;
		}
	}
	
	private static int getCosteCoche(int noches) {
		int valor = noches*40;
		if(noches>=7) {
			valor = valor-50;
		}else if(noches>=3) {
			valor = valor-20;
		}
		return valor;
		
	}
}
