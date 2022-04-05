package hilos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Numeros primos");
		  
		  Runnable primo1 = () -> {
			  System.out.println("Escriba un numero: ");
		      int numero1 = sc.nextInt();
			  int contador = 2;
			  boolean primo=true;
			  while ((primo) && (contador!=numero1)){
			    if (numero1 % contador == 0)
			      primo = false;
			    contador++;
			  }
			  if(primo)
				  System.out.println("El numero es primo");
			  else
				  System.out.println("El nuemero NO es primo");
		  };
	      Thread t1 = new Thread(primo1);
	      
	      t1.start();
	      
	  	}
	      

	}

