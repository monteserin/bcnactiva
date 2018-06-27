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
	
	public List<Libro> consulta(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("FROM Libro");
		List<Libro> libros  = query.list();
		session.close();
		return libros;
	}
	public Libro  getLibro(Libro libro){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Libro l = session.get(Libro.class, libro.getId());
		session.close();
		return l;
	}
	
}
