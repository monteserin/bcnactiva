package com.pablomonteserin.crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Servicio {
	List<Alumno> alumnos = new ArrayList<Alumno>();
	
		public void insertarAlumno(String nombre, int edad) {
			Alumno alumno = new Alumno(nombre, edad);
			alumnos.add(alumno);
		}
		
		public List<Alumno> getAlumnos(){
			return alumnos;
		}
		
		public void eliminarAlumno(String nombre) {
			Iterator <Alumno>it = alumnos.iterator();
			while(it.hasNext()) {
				Alumno a = it.next();
				if(nombre.equals(a.getNombre())) {
					it.remove();
				}
			}
		}
		
		public void modificarAlumno(String nombre, String nuevoNombre, int nuevaEdad) {
			Iterator <Alumno>it = alumnos.iterator();
			while(it.hasNext()) {
				Alumno a = it.next();
				if(nombre.equals(a.getNombre())) {
					a.setNombre(nuevoNombre);
					a.setEdad(nuevaEdad);
				}
			}
		}
}
