

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.entidad.Usuario;

/**
 * Servlet implementation class FormularioServlet
 */
@WebServlet("/FormularioServlet")
public class FormularioServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean encontradoNombre=false;
		boolean encontradoPassword=false;
		List<Usuario> myArrayList = new ArrayList<Usuario>(); 
		Usuario u= new Usuario("Alberto", "1234");
		Usuario a= new Usuario("Felix", "1234");
		Usuario b= new Usuario("Marcos", "1234");
		Usuario c= new Usuario("Nueria", "1234");
        myArrayList.add(u);
        myArrayList.add(a);
        myArrayList.add(b);
        myArrayList.add(c);
        
        String nombre= request.getParameter("nombre");
        String password= request.getParameter("password");
        Usuario user= new Usuario(nombre, password);
        
        for(int i=0; i<myArrayList.size();i++) {
        	if(nombre.equals(myArrayList.get(i).getNombre())) {
        		encontradoNombre=true;
        	}
        	else if(password.equals(myArrayList.get(i).getPassword())) {
        		encontradoPassword=true;
        	}
        }
        
        if(encontradoNombre && encontradoPassword) {
        	RequestDispatcher rd = request.getRequestDispatcher("bienvenido.jsp");
    		request.setAttribute("nombre", nombre);
    		rd.forward(request, response);
        }
        else {
        	RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
        	if(!encontradoPassword)
        		request.setAttribute("mensaje", "Usuaurio incorrecto.");
        	else if(!encontradoNombre)
        		request.setAttribute("mensaje", "Contraseña incorrecta.");
        	rd.forward(request, response);
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
