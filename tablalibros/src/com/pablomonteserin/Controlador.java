package com.pablomonteserin;

import java.io.IOException;
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
	
	
	if(action.equals("consulta")) {
		List<Libro> libros = libroBO.consulta();
		request.setAttribute("libros", libros);
	}else if(action.equals("alta")){
		String titulo = request.getParameter("nuevoTitulo");
		int precio = Integer.parseInt(request.getParameter("nuevoPrecio"));
		Libro libro = new Libro();
		libro.setTitulo(titulo);
		libro.setPrecio(precio);
		libroBO.alta(libro);
		List<Libro> libros = libroBO.consulta();
		request.setAttribute("libros", libros);
	}else if (action.equals("borrar")) {
		Libro libro = new Libro();
		int id= Integer.parseInt(request.getParameter("identificador"));
		libro.setId(id);
		libroBO.baja(libro);
		List<Libro> libros = libroBO.consulta();
		request.setAttribute("libros", libros);
	}else if(action.equals("modificar")) {
		Libro libro = new Libro();
		int id= Integer.parseInt(request.getParameter("identificador"));
		libro.setId(id);
		libro.setTitulo(request.getParameter("titulomodificar"));
		int precio = Integer.parseInt(request.getParameter("preciomodificar"));
		libro.setPrecio(precio);

		libroBO.modificacion(libro);
		List<Libro> libros = libroBO.consulta();
		request.setAttribute("libros", libros);	
	}
	request.getRequestDispatcher("consulta.jsp").forward(request,  response);;

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
