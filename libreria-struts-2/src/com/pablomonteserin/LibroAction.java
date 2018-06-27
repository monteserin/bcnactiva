package com.pablomonteserin;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class LibroAction extends ActionSupport{
	private Libro libro;
	
	private List<Libro> libros;
	
	public String consulta() {
		LibroBO libroBO = new LibroBO();

		libros = libroBO.consulta();
		return SUCCESS;
	}
	
	public String alta() {
		LibroBO libroBO = new LibroBO();
		libroBO.alta(libro);
		return SUCCESS;
	}

	public String muestraLibro() {
		LibroBO libroBO = new LibroBO();
libro = libroBO.getLibro(libro);
		return SUCCESS;
	}
	
	
	
	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
	
}
