package com.pablomonteserin.BO;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.pablomonteserin.HibernateUtil;
import com.pablomonteserin.Entity.Usuario;

public class UsuarioBO {

	public Usuario consultaUsuario(Usuario usuario) {
		Usuario respuesta;
		try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query <Usuario>hqlQuery = session.createQuery("FROM Usuario WHERE name=(:condicion1) AND password=(:condicion2)");
		hqlQuery.setParameter("condicion1", usuario.getName());
		hqlQuery.setParameter("condicion2", usuario.getPassword());
		 respuesta = hqlQuery.getSingleResult();

		session.close();
		}catch(NoResultException e) {
			respuesta = null;
		}
		return respuesta;
	}
	
	public List<Usuario> getUsuarios() {
		List<Usuario> respuesta;
		try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query <Usuario>hqlQuery = session.createQuery("FROM Usuario");
		 respuesta = hqlQuery.list();

		session.close();
		}catch(NoResultException e) {
			respuesta = null;
		}
		return respuesta;
	}
	
	
}
