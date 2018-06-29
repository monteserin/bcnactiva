package com.pablomonteserin;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pablomonteserin.util.HibernateUtil;

public class ReservaBO {

	public void salvarReserva (Reserva reserva) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(reserva);
		transaction.commit();
		session.close();
	}
}
