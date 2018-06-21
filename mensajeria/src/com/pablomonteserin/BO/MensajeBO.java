package com.pablomonteserin.BO;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pablomonteserin.HibernateUtil;
import com.pablomonteserin.Entity.Mensaje;
import com.pablomonteserin.Entity.Usuario;


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
	
	
	public List<Mensaje> getMensajesUsuarioLogueado(Usuario usuario){
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Query hqlQuery = session.createQuery("SELECT m FROM Mensaje m WHERE m.destinatario.id = (:condicion)");
		hqlQuery.setParameter("condicion", usuario.getId());
		
		List <Mensaje> mensajes = hqlQuery.list();
		session.close();
		return mensajes;
	}
}
