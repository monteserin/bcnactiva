package com.pablomonteserin;

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Libro libro = new Libro();
		libro.setTitulo("aaaaaaaaaaaaaaaa");
		libro.setPrecio(12);
		libro.setIsbn("asdagh");
		session.save(libro);
		session.close();

	}

}
