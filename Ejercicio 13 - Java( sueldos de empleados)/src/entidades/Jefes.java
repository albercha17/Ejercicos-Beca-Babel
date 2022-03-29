package entidades;

public class Jefes extends Empleado {


	private int incentivos;
	public Jefes(String nombre, int sueldoBase,int incentivos) {
		super(nombre, sueldoBase);
		this.incentivos=incentivos;
	}
	
	public int getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(int incentivos) {
		this.incentivos = incentivos;
	}
	@Override
	public void calcularSueldo() {
		this.sueldo+=incentivos;
	}

}
