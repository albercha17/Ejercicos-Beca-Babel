package entidades;

public class Trabajador extends Empleado {
	
	private int valoracion;
	public Trabajador(String nombre,int sueldoBase, int valoracion) {
		super(nombre,sueldoBase);
		this.valoracion=valoracion;
		
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	@Override
	public void calcularSueldo() {
		int sueldo=0;
		if(valoracion>=0&&valoracion<=4)
			sueldo+=0;
		else if(valoracion==5||valoracion==6)
			sueldo+=50;
		else if(valoracion==7||valoracion==8)
			sueldo+=100;
		else if(valoracion==9||valoracion==10)
			sueldo+=200;
		this.sueldo+=sueldo;
	}

}
