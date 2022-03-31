package entidades;

public class Guerrero extends Personajes {
	
	private int fuerza=10;
	
	public Guerrero() {
		this.tipo="guerrero";
	}
	@Override
	//Si tiene el arma indicada, habra una posibilidad de 3 que active su poder, y cause un 30 de da�o extra
	public int da�ar() {
		int alearotio= this.da�oMax-this.da�oMin;
		this.da�o=(int) (Math.random()*alearotio +1)+this.da�oMin;
		if((this.arma instanceof Espada)||(this.arma instanceof Arco)) {
			int x= (int) (Math.random()*3);
			if(x==1) {
				System.out.println("**** "+this.nombre+" ha usado su habilidad especial!! +30 de da�o en su ataque!!");
				if(this.critico()) {
					System.out.println("**** El ataque ha sido critico. +20 de da�o en este ataque!!!");
					this.da�o+=50;
					return this.da�o+50;
				}
				else
					this.da�o+=30;
					return this.da�o+30;
			}
		}
		if(this.critico()) {
			System.out.println("**** El ataque ha sido critico. +20 de da�o en este ataque!!!");
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

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public void setArma(Arma arma) {
		this.da�o=0;
		this.arma = arma;
		this.da�o= arma.getDa�o();
		this.da�oMin=arma.getDa�oMin();
		this.da�oMax=arma.getDa�oMax();
		if((this.arma instanceof Espada)||(this.arma instanceof Arco)) {
			this.da�o+= fuerza ;
			this.da�oMin+=fuerza;
			this.da�oMax+=fuerza;
		}
	}
}
