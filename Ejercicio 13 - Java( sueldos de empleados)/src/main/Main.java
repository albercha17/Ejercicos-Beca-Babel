package main;

import java.util.ArrayList;

import entidades.*;

public class Main {
	public static void main(String[] args) {
		
		
		
		Trabajador t1= new Trabajador("Pedro", 1500, 6);
		Trabajador t2= new Trabajador("Alberto", 1500, 9);
		Trabajador t3= new Trabajador("Nuria", 1500, 7);
		
		Jefes j1= new Jefes("Felix", 2000, 400);
		Jefes j2= new Jefes("Marta", 2000, 600);
		
		ArrayList<Empleado> listaEmpleadosD1= new ArrayList<>();
		listaEmpleadosD1.add(t1);
		listaEmpleadosD1.add(t2);
		listaEmpleadosD1.add(j1);
		
		Directivos d1= new Directivos("Pequeño jefe Babel", 2000, listaEmpleadosD1);
		
		ArrayList<Empleado> listaEmpleadosD2= new ArrayList<>();
		listaEmpleadosD2.add(t1);
		listaEmpleadosD2.add(t2);
		listaEmpleadosD2.add(t3);
		listaEmpleadosD2.add(j1);
		listaEmpleadosD2.add(j2);
		listaEmpleadosD2.add(d1);
		Directivos d2= new Directivos("Gran jefe Babel", 2000, listaEmpleadosD2);
		
		// MEto todos los empleados a la lista general
		ArrayList<Empleado> listaEmpleados= new ArrayList<>();
		listaEmpleados.add(t1);
		listaEmpleados.add(t2);
		listaEmpleados.add(t3);
		listaEmpleados.add(j1);
		listaEmpleados.add(j2);
		listaEmpleados.add(d1);
		listaEmpleados.add(d2);
		
		System.out.println("----------------------");
		System.out.println("SUELDOS DE EMPLEADOS");
		System.out.println(" ");
		for(Empleado empleado : listaEmpleados){
			empleado.calcularSueldo();
			System.out.println("+"+empleado.getNombre()+ " gana " + empleado.getSueldo()+ "€");
			if(empleado instanceof Directivos) {
				System.out.println("  Trabajan para el:");
				for(Empleado subempleado : ((Directivos) empleado).getListaEmpleados()) {
					System.out.println("   -"+ subempleado.getNombre());
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
		System.out.println("----------------------");
	}
}