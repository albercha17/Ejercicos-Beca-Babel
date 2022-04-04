package entidades;

public class Mago extends Personajes {
	
	private int inteligencia=10;
	
	public Mago() {
		this.tipo="mago";
	}
	
	//Si tiene el arma indicada, habra una posibilidad de 3 que active su poder, y cause un 15 de daño extra y recupera 15 en salud
	@Override
	public int dañar() {
		int alearotio= this.dañoMax-this.dañoMin;
		this.daño=(int) (Math.random()*alearotio +1)+this.dañoMin;
		if((this.arma instanceof Hechizos)) {
			int x= (int) (Math.random()*3);
			if(x==1) {
				System.out.println("**** "+this.nombre+" ha usado su habilidad especial!! +15 de daño en su ataque y recuperara 15 de vida!!");
				this.vida+=15;
				if(this.critico()) {
					System.out.println("**** El ataque ha sido critico. +30 de daño en este ataque!!!");
					this.daño+=45;
					return this.daño+45;
				}
				else
					this.daño+=15;
					return this.daño+15;
			}
				
		}
		if(this.critico()) {
			System.out.println("**** El ataque ha sido critico. +20 de daño en este ataque!!!");
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

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int fuerza) {
		this.inteligencia = fuerza;
	}

	public void setArma(Arma arma) {
		this.daño=0;
		this.arma = arma;
		this.daño= arma.getDaño();
		this.dañoMin=arma.getDañoMin();
		this.dañoMax=arma.getDañoMax();
		if(this.arma instanceof Hechizos) {
			this.daño+= inteligencia ;
			this.dañoMin+=inteligencia;
			this.dañoMax+=inteligencia;
		}
	}
}
