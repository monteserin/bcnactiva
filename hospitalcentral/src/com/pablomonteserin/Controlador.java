package com.pablomonteserin;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
		try {
			String action = request.getParameter("action");
			PacienteBO pacienteBO = new PacienteBO();
String pagina = "";
SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");

			if(action.equals("alta")) {
				String nombre=request.getParameter("nombre");
				String apellidos = request.getParameter("apellidos");
				String fecha = request.getParameter("fecha_alta");

					Date fechaConvertida = f.parse(fecha);
					
					Paciente paciente = new Paciente();
					paciente.setApellidos(apellidos);
					paciente.setNombre(nombre);
					paciente.setFecha_alta(fechaConvertida);
					pacienteBO.alta(paciente);
					pagina="index.jsp";

					
			}else if(action.equals("consulta")) {
				List<Paciente> pacientes = pacienteBO.consulta();
				request.setAttribute("pacientes", pacientes);
				pagina="consulta.jsp";
			}else if(action.equals("consultaPaciente")) {
				int id= Integer.parseInt(request.getParameter("id"));
				Paciente paciente = pacienteBO.getPaciente(id);
				request.setAttribute("paciente", paciente);
				pagina="modifica.jsp";

			}else if(action.equals("modifica")) {
				int id= Integer.parseInt(request.getParameter("identificador"));
				String nombre=request.getParameter("nombre");
				String apellidos = request.getParameter("apellidos");
				String fecha = request.getParameter("fecha_alta");
				
				Paciente paciente = new Paciente();
				paciente.setId(id);
				paciente.setNombre(nombre);
				paciente.setApellidos(apellidos);

				Date fechaConvertida = f.parse(fecha);

				paciente.setFecha_alta(fechaConvertida);

				pacienteBO.modifica(paciente);

				request.setAttribute("paciente", paciente);
				pagina="modifica.jsp";

			}
			request.getRequestDispatcher(pagina).forward(request, response);
			
			
		
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
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
