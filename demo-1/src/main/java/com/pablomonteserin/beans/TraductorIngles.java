package com.pablomonteserin.beans;

import com.pablomonteserin.ITraductor;

public class TraductorIngles implements ITraductor {
	public void translate(String txt){
		System.out.println("texto traducido al español");
	}

	@Override
	public void traduceloPlease(String texto) {
		this.translate(texto);
		
	}
}
