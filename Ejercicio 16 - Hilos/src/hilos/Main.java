package hilos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		  try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Numeros primos");
			  System.out.println("Introduce el primer numero:");
			  Primo numero1 = new Primo(sc.nextInt());
			  System.out.println("Introduce el segundo numero:");
			  Primo numero2 = new Primo(sc.nextInt());
			  System.out.println("Introduce el tercer numero numero:");
			  Primo numero3 = new Primo(sc.nextInt());
			  
			  Thread t1 = new Thread(numero1);
			  Thread t2 = new Thread(numero2);
			  Thread t3 = new Thread(numero3);
			  
			  
			  t1.start();
			  t2.start();
			  t3.start();
		}
	      
	      

	}

}
