
public class Resta {
	private int acumulada;
	Resta(){
		acumulada=0;
	}
	public int RestaNormal(int x, int y) {
		return x-y;
	}
	public int acumulada(int x) {
		acumulada-=x;
		return acumulada;
	}
	
}