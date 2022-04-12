package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import Integracion.DAOUsuario;
import entidades.Usuario;

/**
 * Servlet implementation class FormularioServlet
 */
@WebServlet("/usuario/password")
public class ComprobarUserServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.addHeader("Access-Control-Allow-Origin", "*");
		
		
		DAOUsuario daoU= new DAOUsuario();
		Usuario usuario=null;
		JSONObject validado = new JSONObject();
		try {
			usuario = daoU.buscarPorCorreo(request.getParameter("usuario"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(usuario==null) {
			System.out.println("No existe un usuario con ese correo.");
			validado.put("validado", false);
			
		}
		else {
			if(usuario.getPassword().equals(request.getParameter("password"))) {
				System.out.println("Bienvenido");
				validado.put("validado", true);
			}
			else {
				System.out.println("La contraseña es incorrecta.");
				validado.put("validado", false);
			}
		}

		    response.getWriter().write(validado.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOUsuario daoU= new DAOUsuario();
		Usuario usuario=null;
		JSONObject validado = new JSONObject();
		try {
			usuario = daoU.buscarPorCorreo(request.getParameter("usuario"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(usuario==null) {
			System.out.println("No existe un usuario con ese correo.");
			validado.put("validado", false);
			
		}
		else {
			if(usuario.getPassword().equals(request.getParameter("password"))) {
				System.out.println("Bienvenido");
				validado.put("validado", true);
			}
			else {
				System.out.println("La contraseña es incorrecta.");
				validado.put("validado", false);
			}
		}
	}

}
