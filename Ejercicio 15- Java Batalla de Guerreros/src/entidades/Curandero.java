package entidades;

public class Curandero extends Personajes {
	
	private int sabiduria=10;
	
	public Curandero() {
		this.tipo="curandero";
	}
	@Override
	//Si tiene el arma indicada, habra una posibilidad de 3 que active su poder, y cause  recupera 30 en salud
	public int dañar() {
		int alearotio= this.dañoMax-this.dañoMin;
		this.daño=(int) (Math.random()*alearotio +1)+this.dañoMin;
		if((this.arma instanceof Rezos)) {
			this.vida+=5;
			int x= (int) (Math.random()*3);
			if(x==1) {
				System.out.println("**** "+this.nombre+" ha usado su habilidad especial!! +30 de vida!!");
				this.vida+=30;
			}
				
		}
		if(this.critico()) {
			System.out.println("**** El ataque ha sido critico. +30 de daño en este ataque!!!");
			this.daño+=20;
			return this.daño+20;
		}
		else
			return this.daño;
	}

	@Override
	public void esDañado(int x) {
		this.vida-=x;
		if(this.vida<0)
			this.vida=0;
		
	}

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int fuerza) {
		this.sabiduria = fuerza;
	}

	public void setArma(Arma arma) {
		this.daño=0;
		this.arma = arma;
		this.daño= arma.getDaño();
		this.dañoMin=arma.getDañoMin();
		this.dañoMax=arma.getDañoMax();
		if(this.arma instanceof Rezos) {
			this.daño+= sabiduria ;
			this.dañoMin+=sabiduria;
			this.dañoMax+=sabiduria;
		}
		
	}
}
