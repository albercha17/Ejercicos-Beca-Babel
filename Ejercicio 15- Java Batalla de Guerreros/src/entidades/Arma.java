package entidades;

public abstract class Arma {
	protected String nombre;
	protected int da�o;
	protected int da�oMin;
	protected int da�oMax;
	
	protected Arma(String nombre, int da�o) {
		this.nombre= nombre;
		this.da�o=da�o;
		this.da�oMin=da�o;
		this.da�oMax=da�o+20;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDa�o() {
		return da�o;
	}
	public void setDa�o(int da�o) {
		this.da�o = da�o;
	}
	public int getDa�oMin() {
		return da�oMin;
	}
	public void setDa�oMin(int da�oMin) {
		this.da�oMin = da�oMin;
	}
	public int getDa�oMax() {
		return da�oMax;
	}
	public void setDa�oMax(int da�oMax) {
		this.da�oMax = da�oMax;
	}
	
}
