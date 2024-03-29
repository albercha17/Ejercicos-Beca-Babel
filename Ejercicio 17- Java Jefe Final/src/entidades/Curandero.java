package entidades;

public class Curandero extends Personajes {
	
	private int sabiduria=10;
	
	public Curandero() {
		this.tipo="curandero";
	}
	@Override
	//Si tiene el arma indicada, habra una posibilidad de 3 que active su poder, y cause  recupera 30 en salud
	public int da�ar() {
		int alearotio= this.da�oMax-this.da�oMin;
		this.da�o=(int) (Math.random()*alearotio +1)+this.da�oMin;
		if((this.arma instanceof Rezos)) {
			this.vida+=5;
			int x= (int) (Math.random()*3);
			if(x==1) {
				System.out.println("**** "+this.nombre+" ha usado su habilidad especial!! +30 de vida!!");
				this.vida+=30;
			}
				
		}
		if(this.critico()) {
			System.out.println("**** El ataque ha sido critico. +30 de da�o en este ataque!!!");
			this.da�o+=20;
			return this.da�o+20;
		}
		else
			return this.da�o;
	}

	@Override
	public void esDa�ado(int x) {
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
		this.da�o=0;
		this.arma = arma;
		this.da�o= arma.getDa�o();
		this.da�oMin=arma.getDa�oMin();
		this.da�oMax=arma.getDa�oMax();
		if(this.arma instanceof Rezos) {
			this.da�o+= sabiduria ;
			this.da�oMin+=sabiduria;
			this.da�oMax+=sabiduria;
		}
		
	}
}
