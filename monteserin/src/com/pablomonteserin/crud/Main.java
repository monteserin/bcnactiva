package com.pablomonteserin.crud;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Servicio servicio = new Servicio();

		while (true) {
			System.out.println("�Qu� quieres hacer?");
			System.out.println("1 - Insertar un nuevo alumno");
			System.out.println("2 - Eliminar un alumno");
			System.out.println("3 - Modificar un alumno");
			System.out.println("4 - Mostrar los alumnos almacenados");

			Scanner lector = new Scanner(System.in);
			int opcion = lector.nextInt();
			if (opcion == 1) {
				System.out.println("Introduce el nombre");
				
				
				String nombre = lector.next();
				
				boolean tieneNumero = nombre.matches(".*\\d+.*");
				if(tieneNumero) {
					System.out.println("El nombre introducido tiene numero");
					continue;
				}
				
				
				System.out.println("Introduce la edad");
				int edad = lector.nextInt();
				servicio.insertarAlumno(nombre, edad);

			} else if (opcion == 2) {
				System.out.println("�Qu� alumno quieres dar de baja?");
				String nombre = lector.next();
				servicio.eliminarAlumno(nombre);

			} else if (opcion == 3) {
				System.out.println("�Qu� alumno quieres modificar?");
				String nombre1 = lector.next();
				
				System.out.println("�Cu�l ser� su nuevo nombre?");
				String nombre2 = lector.next();
				
				System.out.println("�Cu�l ser� su nueva edad?");
				int edad2 = lector.nextInt();
				
				servicio.modificarAlumno(nombre1, nombre2, edad2);
				
				
			} else if (opcion == 4) {
				List<Alumno> alumnos = servicio.getAlumnos();

				Iterator<Alumno> it = alumnos.iterator();

				while (it.hasNext()) {
					Alumno a = it.next();
					System.out.println(a.getNombre() + " - " + a.getEdad());

				}
			}
		}
	}

}
