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
		InvitadoBO invitadoBO = new InvitadoBO();
		String pagina ="index.jsp";
		if(action.equals("alta")) {
			String nombre = request.getParameter("nombre");
			Invitado invitado = new Invitado();
			invitado.setNombre(nombre);
			invitadoBO.alta(invitado);
		}else if(action.equals("baja")) {
			String nombre = request.getParameter("nombre");
					Invitado invitado = new Invitado();
					invitado.setNombre(nombre);
					invitadoBO.baja(invitado);
		}else if(action.equals("consulta")) {
pagina = "consulta.jsp";
					List <Invitado> invitados = invitadoBO.consulta();
					request.setAttribute("invitados", invitados);
		}
		
		request.getRequestDispatcher(pagina).forward(request,response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
