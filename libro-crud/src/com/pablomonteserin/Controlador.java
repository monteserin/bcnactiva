package com.pablomonteserin;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		LibroBO libroBO = new LibroBO();
		Libro libro = new Libro();
		if(action.equals("alta")) {
			String titulo = request.getParameter("titulo");
			String isbn = request.getParameter("isbn");
			int precio = Integer.parseInt(request.getParameter("precio"));
			libro.setTitulo(titulo);
			libro.setIsbn(isbn);
			libro.setPrecio(precio);
			libroBO.alta(libro);
		}else if(action.equals("baja")) {
			int id = Integer.parseInt(request.getParameter("id"));
			libro.setId(id);
			libroBO.baja(libro);
		}else if(action.equals("modificacion")) {
			String titulo = request.getParameter("titulo");
			String isbn = request.getParameter("isbn");
			int precio = Integer.parseInt(request.getParameter("precio"));
			int id = Integer.parseInt(request.getParameter("id"));

			libro.setTitulo(titulo);
			libro.setIsbn(isbn);
			libro.setPrecio(precio);
			libro.setId(id);
			libroBO.modificacion(libro);
		}else if(action.equals("consulta")) {
			List <Libro> libros = libroBO.consulta();
			Iterator<Libro> it = libros.iterator();
			while(it.hasNext()) {
				Libro l = it.next();
				response.getWriter().append(l.getTitulo() + "" + l.getPrecio());
			}
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
