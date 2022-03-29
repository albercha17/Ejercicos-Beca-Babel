package entidades;

import java.util.ArrayList;

public class Directivos extends Empleado {
	
	private ArrayList<Empleado> listaEmpleados;
	public Directivos(String nombre, int sueldoBase,ArrayList<Empleado> listaEmpleados) {
		super(nombre, sueldoBase);
		this.listaEmpleados=listaEmpleados;
	}
	@Override
	public void calcularSueldo() {
		this.sueldo+= this.listaEmpleados.size()*100;
		
	}
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
}
