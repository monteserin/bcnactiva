package com.pablomonteserin;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class LibroBO {
	public void alta(Libro libro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(libro);
		transaction.commit();
		session.close();
	}
	public void baja(Libro libro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.remove(libro);
		transaction.commit();
		session.close();
	}
	public void modificacion(Libro libro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(libro);
		transaction.commit();
		session.close();
	}
	public List<Libro> consulta() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM Libro");	
		List<Libro> libros = hqlQuery.list();
		session.close();
		return libros;
	}

}
