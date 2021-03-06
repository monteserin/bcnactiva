package com.pablomonteserin.siniestros;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;



public class MainConsulta {

	public static void main(String[] args) {

		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("Listar las matr�culas de todos los veh�culos");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Vehiculo> hqlQuery1 = session.createQuery("FROM  Vehiculo");
		List<Vehiculo> vehiculos = hqlQuery1.list();
		Iterator<Vehiculo> it = vehiculos.iterator();
		while(it.hasNext()) {
			Vehiculo v = it.next();
			System.out.println(v.getMatricula());
		}
		
		
		System.out.println("========================================");
		
		// LA CONSULTA NO DEVUELVE LOS DATOS ORDENADOS

		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("Listar la matr�cula y la marca de todos los veh�culos ordenados por n�mero de ruedas (NO FUNCIONA).");
		Query<Vehiculo> hqlQuery2 = session.createQuery("SELECT v FROM  Vehiculo v ORDER BY v.ruedas");
		List<Vehiculo> vehiculos2 = hqlQuery2.list();
		Iterator<Vehiculo> it2 = vehiculos2.iterator();
		while(it2.hasNext()) {
			Vehiculo v = it2.next();
			System.out.println(v.getMatricula()+ " - "+ v.getMarca() + " - Num. ruedas: " + v.getRuedas());
		}
		

		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("Listar la matr�cula de todos los veh�culos que tengan m�s de dos asientos y m�s de dos ruedas. No puede salir marca6");
		Query<Vehiculo> hqlQuery3 = session.createQuery("SELECT v FROM  Vehiculo v WHERE v.ruedas>2 AND v.asientos>2");
		List<Vehiculo> vehiculos3 = hqlQuery3.list();
		Iterator<Vehiculo> it3 = vehiculos3.iterator();
		while(it3.hasNext()) {
			Vehiculo v = it3.next();
			System.out.println(v.getMatricula()+ " - "+ v.getMarca() + " - " + v.getRuedas());
		}
		


		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("Listar la matr�cula de todos los veh�culos que tengan m�s de dos asientos o m�s de dos ruedas.");
		Query<Vehiculo> hqlQuery4 = session.createQuery("SELECT v FROM  Vehiculo v WHERE v.ruedas>2 OR v.asientos>2");
		List<Vehiculo> vehiculos4 = hqlQuery4.list();
		Iterator<Vehiculo> it4 = vehiculos4.iterator();
		while(it4.hasNext()) {
			Vehiculo v = it4.next();
			System.out.println(v.getMatricula()+ " - "+ v.getMarca() + " - " + v.getRuedas());
		}
		
		

		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		Query<Vehiculo> hqlQuery5 = session.createQuery("SELECT v FROM  Vehiculo v WHERE length(v.matricula)<6");
		List<Vehiculo> vehiculos5 = hqlQuery5.list();
		Iterator<Vehiculo> it5 = vehiculos5.iterator();
		System.out.println("Listar la matr�cula de todos los veh�culos que tengan una matr�cula de menos de seis caracteres (where length(v.matricula)<?).");
		while(it5.hasNext()) {
			Vehiculo v = it5.next();
			System.out.println(v.getMatricula()+ " - "+ v.getMarca() + " - " + v.getRuedas());
		}
		
		
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		Query<Vehiculo> hqlQuery6 = session.createQuery("SELECT v FROM  Vehiculo v JOIN v.siniestros s WHERE s.perdida>1000");
		List<Vehiculo> vehiculos6 = hqlQuery6.list();
		Iterator<Vehiculo> it6 = vehiculos6.iterator();
		System.out.println("Listar la matr�cula de todos los veh�culos que hayan tenido un siniestro con perdida mayor de 1000 euros.");
		while(it6.hasNext()) {
			System.out.println("hola");
			Vehiculo v = it6.next();
			System.out.println(v.getMatricula()+ " - "+ v.getMarca() + " - " + v.getRuedas());
		}
		
		
		
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		Query<VehiculoSiniestro> hqlQuery7 = session.createQuery("SELECT new com.pablomonteserin.siniestros.VehiculoSiniestro(v, s.perdida) FROM  Vehiculo v JOIN v.siniestros s WHERE s.perdida>1000");
		List<VehiculoSiniestro> vehiculos7 = hqlQuery7.list();
		Iterator<VehiculoSiniestro> it7 = vehiculos7.iterator();
		System.out.println("Listar la matr�cula de todos los veh�culos que hayan tenido un siniestro con perdida mayor de 1000 euros. Mostrar a cuanto ascendi� la p�rdida. ");
		while(it7.hasNext()) {
			System.out.println("hola");
			VehiculoSiniestro vs = it7.next();
			System.out.println(vs.getVehiculo().getMatricula() + " - " + vs.getPerdida());
		}
		
		
		
		
		session.close();

	}

}
