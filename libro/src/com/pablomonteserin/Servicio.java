package com.pablomonteserin;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Servicio {
	public Libro getLibro(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Libro> hqlQuery = session.createQuery("SELECT l FROM Libro l WHERE id=(:condicion)");
		hqlQuery.setParameter("condicion", id);
		Libro libro = hqlQuery.getSingleResult();
		session.close();
		return libro;
	}
}
