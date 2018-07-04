package com.pablomonteserin.beans;

import com.pablomonteserin.ITraductor;

public class TraductorEspanol implements ITraductor{
	public void traducir(String txt){
		System.out.println("texto traducido al español");
	}

	@Override
	public void traduceloPlease(String texto) {
		this.traducir(texto);
		
	}


}
