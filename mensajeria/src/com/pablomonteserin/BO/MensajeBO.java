package com.pablomonteserin.BO;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pablomonteserin.HibernateUtil;
import com.pablomonteserin.Entity.Mensaje;


public class MensajeBO {

	public void insertarMensajes(List<Mensaje>mensajes) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Iterator<Mensaje> it = mensajes.iterator();
		
		while(it.hasNext()) {
			Mensaje mensaje = it.next();
			session.save(mensaje);
		}
		
		
		transaction.commit();
		session.close();
	}
}
