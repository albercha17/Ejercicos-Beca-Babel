package Presentacion;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.JSONObject;

import com.itextpdf.text.DocumentException;

import Entidades.Coche;
import Negocio.SACoche;
import otros.JsonTransform;
import otros.PdfTransoform;


public class main {
	public static void menu() {
		System.out.println("Base de datos de coches");
		System.out.println("-------------------------------------");
		System.out.println("¿QUE DESEA HACER?");
		System.out.println("");
		System.out.println("1. Alta de coche\r\n"
				+ "2. Eliminar coche por id\r\n"
				+ "3. Modificar coche por id\r\n"
				+ "4. Buscar coche por id\r\n"
				+ "5. Buscar coche por matricula\r\n"
				+ "6. Buscar coches por marca\r\n"
				+ "7. Buscar coches por modelo\r\n"
				+ "8. Listar todos los coches\r\n"
				+ "9. Exportar los coches a un fichero en formato JSON \r\n"
				+ "10. Exportar los coches a un fichero excel \r\n"
				+ "11. Salir de la aplicación");
	}
	

	
	public static void main(String[] args) throws FileNotFoundException, DocumentException {
		SACoche saCoche = new SACoche();
		int intentos=3;
		boolean identificado=false;
		System.out.println("IDENTIFICATE");
		System.out.println("");
		Scanner lectura = new Scanner (System.in);
		while(!identificado && intentos>0) {
			
			System.out.println("Usuario:");
			String usuario = lectura.next();
			System.out.println("Contraseña:");
			String password = lectura.next();
			identificado=saCoche.validarUsuario(usuario,password);
			if(!identificado) {
				System.out.println("ERROR DE USUARIO. USUARIO Y/O CONTRASEÑA INCORRECTA.");
				intentos--;
				System.out.println("TE QUEDAN "+intentos+ " INTENTOS.");
				System.out.println(" ");
			}
		}
		
		if(identificado) {
			menu();
			
			System.out.println("---------------");
			System.out.println("Opcion:");
			int opcion = lectura.nextInt();
			while(opcion!=11) {
				if(opcion==1) {
					
					//Pido datos por consola
					System.out.println("Matricula:");
					String matricula = lectura.next();
					System.out.println("Marca:");
					String marca = lectura.next();
					System.out.println("Modelo:");
					String modelo = lectura.next();
					System.out.println("Numero de kilometros:");
					int kilometros = lectura.nextInt();
					
					Coche coche = new Coche(matricula,marca, modelo, kilometros);
					
					System.out.println(saCoche.altaCoche(coche));
					
				}
				else if(opcion==2) {
					System.out.println("Id del coche a borrar:");
					int id = lectura.nextInt();
					System.out.println(saCoche.borrarCoche(id));
				}
				else if(opcion==3) {
					//Pido datos por consola
					System.out.println("Id del coche a modificar:");
					int id = lectura.nextInt();
					System.out.println("DATOS NUEVOS:");
					System.out.println("Matricula:");
					String matricula = lectura.next();
					System.out.println("Marca:");
					String marca = lectura.next();
					System.out.println("Modelo:");
					String modelo = lectura.next();
					System.out.println("Numero de kilometros:");
					int kilometros = lectura.nextInt();
					
					Coche coche = new Coche(matricula,marca, modelo, kilometros);
					coche.setId(id);
					System.out.println(saCoche.modificarCoche(coche));
				}
				else if(opcion==4) {
					System.out.println("Buscar por id:");
					int id = lectura.nextInt();
					System.out.println(saCoche.buscarPorId(id));
				}
				else if(opcion==5) {
					System.out.println("Buscar por matricula:");
					String id = lectura.next();
					System.out.println(saCoche.buscarPorMatricula(id));
				}

				else if(opcion==6) {
					System.out.println("Buscar coches por marca:");
					String marca = lectura.next();
					System.out.println(saCoche.buscarPorMarca(marca));
				}

				else if(opcion==7) {
					System.out.println("Buscar coches por modelo:");
					String modelo = lectura.next();
					System.out.println(saCoche.buscarPorModelo(modelo));
				}
				else if(opcion==8) {
					System.out.println(saCoche.listarCoches());
				}
				else if(opcion==9) {
					JsonTransform.transoformarJSON(saCoche.getListaC(),"src/main/resources/listaCoches.txt");
				}
				else if(opcion==10) {
					PdfTransoform.transformPDF(saCoche.getListaC(),"src/main/resources/listaCoches.pdf");
				}
				else {
					System.out.println("Opcion INCORRECTA. Teclea una opcion valida(1-9)");
				}
				System.out.println("---------------");
				System.out.println("Opcion:");
				opcion = lectura.nextInt();
			}
		}
		
		System.out.println("---------------");
		System.out.println("SALISTE DE LA APLICACION");
	}

}