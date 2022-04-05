package hilos;

public class Primo implements Runnable {
	
	private int numero;
	
	public Primo(int num) {
		this.numero=num;
	}
	
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}

	public synchronized boolean esPrimo(){
		  int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}
	
	@Override
	public void run() {
		System.out.println();
		if(this.esPrimo())
			System.out.println("El numero "+ numero + " es primo.");
		else
			System.out.println("El numero "+ numero + " NO es primo.");
		
	}

}
