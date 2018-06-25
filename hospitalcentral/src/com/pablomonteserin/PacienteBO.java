package com.pablomonteserin;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class PacienteBO {
	public void alta(Paciente paciente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		session.save(paciente);

		transaction.commit();
		session.close();
	}
	
	public List<Paciente> consulta() {
		Session session = HibernateUtil.getSessionFactory().openSession();
Query query = session.createQuery("FROM Paciente");
List <Paciente> pacientes = query.list();
		

		session.close();
		return pacientes;
	}
	
	
	public Paciente getPaciente(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
Query<Paciente> query = session.createQuery("FROM Paciente p WHERE p.id=(:condicion)");
query.setParameter("condicion", id);
Paciente paciente = query.getSingleResult();
		

		session.close();
		return paciente;
	}
	
	
	public Paciente modifica(Paciente paciente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		session.update(paciente);

		transaction.commit();
		session.close();
		return paciente;
	}
}
