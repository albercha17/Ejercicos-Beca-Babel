package Negocio;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;

import org.json.JSONObject;

import Entidades.Coche;
import Integracion.DAOCoche;

public class SACoche {
	
	DAOCoche daoCoche;
	
	public SACoche() {
		daoCoche= new DAOCoche();
	}
	/**
	 * Comprobara que no existe la matricula del coche en la BD y da de alta el coche
	 * @param c es el coche que queremos dar de alta
	 * @return devuelve un mensaje: uno de confirmacion si todo ha ido bien
	 * o una de error si ha pasado algo
	 */
	public String altaCoche(Coche c) {
		if(validarDatos(c)!=null)
			return validarDatos(c);
		if(daoCoche.buscarPorMatricula(c.getMatricula())==null) {
			boolean alta=daoCoche.altaCoche(c);
		if(alta) {
			return "El coche con matricula "+ c.getMatricula() + " ha sido dado de alta.";
		}
		else {
			return "No se ha podido crear el usuario. Comprueba los datos.";
		}
		}
		return "La matricula ya se encuentra en la base de datos, compruebela de nuevo.";
	}
	
	/**
	 * Da de baja el coche
	 * @param c es el coche que queremos dar de alta
	 * @return devuelve un mensaje: uno de confirmacion si todo ha ido bien
	 * o una de error si ha pasado algo
	 */
	public String borrarCoche(int id) {
		if(daoCoche.eliminarCoche(id)) {
			return "Se ha dado de baja el coche con el id " + id;
		}
		return "No se ha podido dar de baja el coche con el id " + id;
	}
	
	/*Probelma: si no pongo clave primaria la matricula, no puedo saber si cuando modifico la 
	matricula ya existe o no, Asi que al modificarlo si puedo crear coche con dos matriculas
	Si no tendria que poner las primary keys. pero no quiero para probar el busqueda de matricula
	y el error.*/
	public String modificarCoche(Coche c) {
		if(daoCoche.modificarCoche(c)) {
			return "Se ha modificado el coche con el id " + c.getId();
		}
		else {
			return "Error en la base de datos. No se ha encontrado el coche con id "+ c.getId();
		}
		
		
	}
	public String buscarPorId(int id) {
		Coche x=daoCoche.buscarPorId(id);
		if(x!=null) {
			return "Coche con id "+id+":"+"\r\n"
				+ "    -Matricula: "+x.getMatricula()+"\r\n"
				+ "    -Marca: "+x.getMarca()+"\r\n"
				+ "    -Modelo: "+x.getModelo()+"\r\n"
				+ "    -Kilometros: "+x.getKilometros()+"\r\n";
		}
		else {
			return "No se ha encontrado el coche con id "+ id;
		}
		
		
	}
	public String buscarPorMatricula(String matricula) {
		Coche x=daoCoche.buscarPorMatricula(matricula);
		if(x!=null) {
			return "Coche con matricula "+matricula+":"+"\r\n"
				+ "    -ID: "+x.getId()+"\r\n"
				+ "    -Marca: "+x.getMarca()+"\r\n"
				+ "    -Modelo: "+x.getModelo()+"\r\n"
				+ "    -Kilometros: "+x.getKilometros()+"\r\n";
		}
		else {
			return "No se ha encontrado el coche con la matricula "+ matricula;
		}
		
		
	}
	
	public String buscarPorMarca(String marca) {
		String x="";
		List<Coche> listaC=daoCoche.buscarPorMarca(marca);
		if(listaC.isEmpty()) {
			return "No hay coches en la base de datos con la marca "+marca;
		}
		else {
			for(Coche c: listaC) {
				x+="-Coche con ID: "+c.getId()+"\r\n"
						+ "    -Matricula: "+c.getMatricula()+"\r\n"
						+ "    -Marca: "+c.getMarca()+"\r\n"
						+ "    -Modelo: "+c.getModelo()+"\r\n"
						+ "    -Kilometros: "+c.getKilometros()+"\r\n";
			}
			return "La lista de coches son:\r\n"
					+x;
		}
	}
	
	public String buscarPorModelo(String modelo) {
		String x="";
		List<Coche> listaC=daoCoche.buscarPorModelo(modelo);
		if(listaC.isEmpty()) {
			return "No hay coches en la base de datos con el modelo "+modelo;
		}
		else {
			for(Coche c: listaC) {
				x+="-Coche con ID: "+c.getId()+"\r\n"
						+ "    -Matricula: "+c.getMatricula()+"\r\n"
						+ "    -Marca: "+c.getMarca()+"\r\n"
						+ "    -Modelo: "+c.getModelo()+"\r\n"
						+ "    -Kilometros: "+c.getKilometros()+"\r\n";
			}
			return "La lista de coches son:\r\n"
					+x;
		}
	}
	
	public String listarCoches() {
		String x="";
		List<Coche> listaC=daoCoche.listarCoches();
		if(listaC.isEmpty()) {
			return "No hay coches en la base de datos";
		}
		else {
			for(Coche c: listaC) {
				x+="-Coche con ID: "+c.getId()+"\r\n"
						+ "    -Matricula: "+c.getMatricula()+"\r\n"
						+ "    -Marca: "+c.getMarca()+"\r\n"
						+ "    -Modelo: "+c.getModelo()+"\r\n"
						+ "    -Kilometros: "+c.getKilometros()+"\r\n";
			}
			return "La lista de coches son:\r\n"
					+x;
		}
	}
	public List<Coche> getListaC(){
		List<Coche> listaC=daoCoche.listarCoches();
		
		return listaC;
	}
	public String validarDatos(Coche c) {
		if(c.getMatricula().length()!=7)
			return "La matricula debe tener 7 digitos.";
		if(c.getKilometros()<0)
			return "Los kilometros deben de ser positivos";
		return null;
	}
	
	
	public boolean validarUsuario(String usuario, String password) {

		try {
			HttpRequest request = HttpRequest.newBuilder()
					  .uri(new URI("http://localhost:8080/Ejercico21/usuario/password?usuario="+usuario+"&password="+password))
					  .GET()
					  .build();
			
			HttpClient client = HttpClient.newHttpClient();
			
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			JSONObject json = new JSONObject(response.body());
            return json.getBoolean("validado");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}
}
