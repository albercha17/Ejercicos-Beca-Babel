import java.util.Scanner;

public class main {
	public static void sumar(Suma suma) {
		   
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Suma");
		    //SUMAR DOS NUMEROS
		    System.out.println("Primer numero para sumar:");
		    String x = sc.nextLine();
		    System.out.println("Segundo numero para sumar:");
		    String y = sc.nextLine();
		    System.out.println("La suma de "+x+"+"+y+" es "+suma.SumaNormal(Integer.parseInt(x), Integer.parseInt(y)));
		    //ACUMULAR
		    System.out.println("Primer numero para acumular:");
		    String z = sc.nextLine();
		    System.out.println("Acumulada: "+suma.acumulada(Integer.parseInt(z)));
		    System.out.println("Segundo numero para acumular:");
		    z = sc.nextLine();
		    System.out.println("Acumulada: "+suma.acumulada(Integer.parseInt(z)));
		    System.out.println("Tercer numero para acumular:");
		    z = sc.nextLine();
		    System.out.println("Acumulada: "+suma.acumulada(Integer.parseInt(z)));
		    System.out.println("Cuarto numero para acumular:");
		    z = sc.nextLine();
		    System.out.println("Acumulada: "+suma.acumulada(Integer.parseInt(z)));
		   
	}
	
	public static void restar(Resta resta) {
		   
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Resta");
		    //SUMAR DOS NUMEROS
		    System.out.println("Primer numero para restar:");
		    String x = sc.nextLine();
		    System.out.println("Segundo numero para restar:");
		    String y = sc.nextLine();
		    System.out.println("La resta de "+x+"-"+y+" es "+resta.RestaNormal(Integer.parseInt(x), Integer.parseInt(y)));
		    //ACUMULAR
		    System.out.println("Primer numero para acumular:");
		    String z = sc.nextLine();
		    System.out.println("Acumulada: "+resta.acumulada(Integer.parseInt(z)));
		    System.out.println("Segundo numero para acumular:");
		    z = sc.nextLine();
		    System.out.println("Acumulada: "+resta.acumulada(Integer.parseInt(z)));
		    System.out.println("Tercer numero para acumular:");
		    z = sc.nextLine();
		    System.out.println("Acumulada: "+resta.acumulada(Integer.parseInt(z)));
		    System.out.println("Cuarto numero para acumular:");
		    z = sc.nextLine();
		    System.out.println("Acumulada: "+resta.acumulada(Integer.parseInt(z)));
		   
	}
	
	public static void main (String[] args) {
		Resta resta=new Resta();
		Suma suma=new Suma();
		Scanner sc = new Scanner(System.in);
		System.out.println("Que desea hacer?");
		System.out.println("1.Sumar.");
	    System.out.println("2.Restar.");
	    System.out.println("3.Salir.");
	   
	    String z = sc.nextLine();
	    while(Integer.parseInt(z)!=3) {
	    if(Integer.parseInt(z)==1) {
	    	sumar(suma);
	    	System.out.println("Que desea hacer?");
			System.out.println("1.Sumar.");
		    System.out.println("2.Restar.");
		    System.out.println("3.Salir.");
	     	z = sc.nextLine();}
	    else if(Integer.parseInt(z)==2) {
	    	restar ( resta);
	    	System.out.println("Que desea hacer?");
			System.out.println("1.Sumar.");
		    System.out.println("2.Restar.");
		    System.out.println("3.Salir.");
	    	z = sc.nextLine();}
	    else
	    	System.out.println("Opcion incorrecta. Prueba otra vez.");
	    	 z = sc.nextLine();
	    }
	   System.out.println("Saliste.");
	  }
}
