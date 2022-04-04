package entidades;

public class JefeFinal extends Personajes {
	private Personajes pFinal;
	
	public JefeFinal(int vida, int da�o, Personajes pFinal) {
		this.vida=vida;
		this.tipo="Jefe Final";
		this.da�o=da�o;
		this.da�oMin=da�o;
		this.da�oMax=da�o+30;
		this.pFinal=pFinal;
	}
	
	@Override
	//Si tiene el arma indicada, habra una posibilidad de 3 que active su poder, y cause un 30 de da�o extra
	public int da�ar() {
		int alearotio= this.da�oMax-this.da�oMin;
		this.da�o=(int) (Math.random()*alearotio +1)+this.da�oMin;
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

	public void setArma(Arma arma) {
		if(arma!=null) {
			this.da�o=0;
		this.arma = arma;
		this.da�o= arma.getDa�o();
		this.da�oMin=arma.getDa�oMin();
		this.da�oMax=arma.getDa�oMax();
	}
	}

	public Personajes getpFinal() {
		return pFinal;
	}

	public void setpFinal(Personajes pFinal) {
		this.pFinal = pFinal;
	}
	
}
