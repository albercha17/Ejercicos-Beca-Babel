package entidades;

public abstract class Empleado {
	protected String nombre;
	protected int sueldo;

	public Empleado(String nombre, int sueldoBase){
		this.nombre = nombre;
		sueldo= sueldoBase;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public abstract void calcularSueldo();
}
