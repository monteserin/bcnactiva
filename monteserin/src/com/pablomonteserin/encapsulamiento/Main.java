package com.pablomonteserin.encapsulamiento;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		
		ArrayList <String>arrayList = new ArrayList<String>();
		arrayList.add("vaca");
		arrayList.add("perro");
		arrayList.add("elefante");
		Iterator<String> it = arrayList.iterator();
		while(it.hasNext()){
			String cadena =it.next();
			System.out.println(cadena);
		}
	}
	
	
	public List<Alumno> list(){
		return alumnos;
	}
	
	
	
	ArrayList<Alumno> alumnos = new ArrayList();
	
	public void insertarAlumno(String nombre, int edad) {
		
		
	}
	
	public void insertarAlumno(Alumno alumno) {
		
	}
	
	
	
	

}
