package com.pablomonteserin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pablomonteserin.BO.MensajeBO;
import com.pablomonteserin.BO.UsuarioBO;
import com.pablomonteserin.Entity.Mensaje;
import com.pablomonteserin.Entity.Usuario;

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
		UsuarioBO usuarioBO = new UsuarioBO();
		MensajeBO mensajeBO = new MensajeBO();
		String pagina="index.jsp";
		//El objeto session nos permitirá acceder a la sesion y almacenar y recuperar
		//valores de ese ámbito
		HttpSession session = request.getSession();
		if(action.equals("login")) {
			String nombre = request.getParameter("nombre");
			String password = request.getParameter("password");
			Usuario usuario = new Usuario();
			usuario.setName(nombre);
			usuario.setPassword(password);
			Usuario usuarioRespuesta = usuarioBO.consultaUsuario(usuario);
			if(usuarioRespuesta!=null) {
				System.out.println("exito");
				
				//Salvo el usuario en la sesión, ya que lo utilizaré más adelante
				session.setAttribute("usuario", usuarioRespuesta);
				pagina = "menu.jsp";
			}else {
				System.out.println("fracaso");
				pagina = "loginerror.jsp";

			}
			
		}else if(action.equals("paginaInserccion")) {
			List<Usuario> usuarios = usuarioBO.getUsuarios();
			request.setAttribute("usuarios", usuarios);
			pagina = "enviar-mensaje.jsp";
		}else if(action.equals("enviarmensaje")) {
			String [] idsUsuarios = request.getParameterValues("usuarios[]");
			Usuario usuarioLogueado = (Usuario) session.getAttribute("usuario");
			String texto = request.getParameter("texto");
			List<Mensaje> mensajes = new ArrayList<Mensaje>();
			
			for(int i=0; i<idsUsuarios.length; i++) {
				Mensaje mensaje = new Mensaje();
				Usuario destinatario = new Usuario();
				destinatario.setId(Integer.parseInt(idsUsuarios[i]));
				Usuario remitente = new Usuario();
				remitente.setId(usuarioLogueado.getId());
				mensaje.setDestinatario(destinatario);
				mensaje.setRemitente(remitente);
				mensaje.setTexto(texto);	
				mensajes.add(mensaje);
			}
			mensajeBO.insertarMensajes(mensajes);
		}else if(action.equals("consulta")) {
			Usuario u = (Usuario) session.getAttribute("usuario");
			System.out.println(u.getMensajes().size());
			System.out.println(u);
			
		}
		
		request.getRequestDispatcher(pagina).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
