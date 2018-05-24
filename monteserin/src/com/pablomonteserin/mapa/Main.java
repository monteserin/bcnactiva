package com.pablomonteserin.mapa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Persona persona1 = new Persona("75367834E", "Nombre1");
		Persona persona2 = new Persona("68274736E", "Nombre2");
		
				
		
		
		
		Map map = new HashMap();
		map.put(persona1.getDni(), persona1);
		map.put(persona2.getDni(), persona2);
				
		Collection collection = map.values();
		Iterator<Persona> it = collection.iterator();
		
		Persona p1 = it.next();
		Persona p2 = it.next();
		
		
		
		

SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); 

try {
	Date fecha = formatter.parse("10-10-1982");
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	


		
		
	}
}