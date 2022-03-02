public class Suma {
	private int acumulada;
	Suma(){
		acumulada=0;
	}
	public int SumaNormal(int x, int y) {
		return x+y;
	}
	public int acumulada(int x) {
		acumulada+=x;
		return acumulada;
	}
	
}
