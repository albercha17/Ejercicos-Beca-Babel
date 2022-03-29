package Presentacion;
import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Coche;
import Negocio.SACoche;


public class main {
	public static void menu() {
		System.out.println("Base de datos de coches");
		System.out.println("-------------------------------------");
		System.out.println("�QUE DESEA HACER?");
		System.out.println("");
		System.out.println("1. Alta de coche\r\n"
				+ "2. Eliminar coche por id\r\n"
				+ "3. Modificar coche por id\r\n"
				+ "4. buscar coche por id\r\n"
				+ "5. buscar coche por matricula\r\n"
				+ "6. buscar coches por marca\r\n"
				+ "7. buscar coches por modelo\r\n"
				+ "8. listar todos los coches\r\n"
				+ "9. Salir de la aplicaci�n");
	}
	
	public static void main(String[] args) {
		SACoche saCoche = new SACoche();
		menu();
		Scanner lectura = new Scanner (System.in);
		System.out.println("---------------");
		System.out.println("Opcion:");
		int opcion = lectura.nextInt();
		while(opcion!=9) {
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
			else {
				System.out.println("Opcion INCORRECTA. Teclea una opcion valida(1-9)");
			}
			System.out.println("---------------");
			System.out.println("Opcion:");
			opcion = lectura.nextInt();
		}
		System.out.println("---------------");
		System.out.println("SALISTE DE LA APLICACION");
	}

}