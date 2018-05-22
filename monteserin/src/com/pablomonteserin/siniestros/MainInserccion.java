package com.pablomonteserin.siniestros;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainInserccion {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Vehiculo v1 = new Vehiculo("matricula8", 3, 8, "marca1");
		Vehiculo v2 = new Vehiculo("matricula9", 3, 9, "marca2");
		
		
		List<Siniestro> siniestros1 = new ArrayList<Siniestro>();
		List<Siniestro> siniestros2 = new ArrayList<Siniestro>();
		
		
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date fecha1 = s.parse("10-10-1982");
			
			siniestros1.add(new Siniestro(fecha1,1000,v1));
			siniestros1.add(new Siniestro(fecha1,1200,v1));

			siniestros2.add(new Siniestro(fecha1,1400,v2));
			siniestros2.add(new Siniestro(fecha1,1100,v2));

			v1.setSiniestros(siniestros1);
			v2.setSiniestros(siniestros2);
			
			session.save(v1);
			session.save(v2);
			
			transaction.commit();
			session.close();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
