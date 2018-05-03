package com.pablomonteserin.depositos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Deposito d1 = new Deposito("d1", 1,1,1);
		Deposito d2 = new Deposito("d2", 2,2,2);
		Deposito d3 = new Deposito("d3", 3,3,3);
		Deposito d4 = new Deposito("d4", 4,4,4);
		Deposito d5 = new Deposito("d5", 5,5,5);
		
		
		List <Deposito> depositos = new ArrayList<Deposito>();
		depositos.add(d5);
		depositos.add(d1);
		depositos.add(d3);
		depositos.add(d4);
		depositos.add(d2);
		Collections.sort(depositos);
		
		
		
		d1.compareTo(d2);
		
		Iterator<Deposito> it = depositos.iterator();
		while(it.hasNext()) {
			Deposito d = it.next();
			System.out.println(d.getNombre());
		}
		
		
		
		if(d1.equals(d2)) {
			System.out.println("son iguales");
		}else {
			System.out.println("son diferentes");
		}
		
	}

}