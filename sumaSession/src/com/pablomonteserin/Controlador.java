package com.pablomonteserin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	int n1 = Integer.parseInt(request.getParameter("n1"));	
	int n2 = Integer.parseInt(request.getParameter("n2"));	
	
	int resultadoRequest = n1+n2;
	
	HttpSession session = request.getSession();
	
	
	int resultadoSession = 0;
	if(session.getAttribute("resultadoSession")!=null) {
		resultadoSession=(int) session.getAttribute("resultadoSession");
	}
	
	 resultadoSession = resultadoSession + resultadoRequest;
	 request.setAttribute("resultadoRequest", resultadoRequest);
	 session.setAttribute("resultadoSession", resultadoSession);
	 
	 request.getRequestDispatcher("index.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
