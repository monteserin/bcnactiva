package com.pablomonteserin;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class InvitadoBO {

	public void alta(Invitado invitado) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(invitado);
		transaction.commit();
		session.close();
				
				
	}
	
	
	public void baja(Invitado invitado) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Query hqlQuery = session.createQuery("DELETE FROM Invitado WHERE nombre=(:condicion)");
		hqlQuery.setParameter("condicion", invitado.getNombre());
		hqlQuery.executeUpdate();
		
		
		transaction.commit();
		session.close();
				
				
	}
	
	public List<Invitado> consulta() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Query hqlQuery = session.createQuery(" FROM Invitado");
		List<Invitado> invitados = hqlQuery.list();
		
		
		session.close();
				
			return invitados;	
	}
	
}

