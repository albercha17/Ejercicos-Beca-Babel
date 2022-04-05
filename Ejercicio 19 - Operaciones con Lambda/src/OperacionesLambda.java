import java.util.Scanner;

interface InterfazOperar<T>{
	public T operacion(T a, T b);
}



public class OperacionesLambda {
	static void menu() {
		System.out.println("Elige una opcion:");
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.DIvidir");
		System.out.println("5.Potencia de un numero");
		System.out.println("6.Salir");
		System.out.println("");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menu();
		int opcion=0;
		while(opcion!=6) {
			System.out.println("Opcion:");
			opcion = sc.nextInt();
			System.out.println("");
			if(opcion==1) {
				System.out.println("SUMA");
				System.out.println("");
				System.out.println("Teclee el primer número:");
				int num1= sc.nextInt();
				System.out.println("Teclee el segudno número:");
				int num2= sc.nextInt();
				
				InterfazOperar <Integer> operacion= (n1,n2)-> n1+n2;
				
				System.out.println(num1+" + " + num2+" = "+ operacion.operacion(num1, num2));
			}
			else if(opcion==2) {
				System.out.println("RESTA");
				System.out.println("");
				System.out.println("Teclee el primer número:");
				int num1= sc.nextInt();
				System.out.println("Teclee el segudno número:");
				int num2= sc.nextInt();
				
				InterfazOperar <Integer> operacion= (n1,n2)-> n1-n2;
				
				System.out.println(num1+" - " + num2+" = "+ operacion.operacion(num1, num2));
			}
			else if(opcion==3) {
				System.out.println("MULTIPLICACION");
				System.out.println("");
				System.out.println("Teclee el primer número:");
				int num1= sc.nextInt();
				System.out.println("Teclee el segudno número:");
				int num2= sc.nextInt();
				
				InterfazOperar <Integer> operacion= (n1,n2)-> n1*n2;
				
				System.out.println(num1+" x " + num2+" = "+ operacion.operacion(num1, num2));
			}
			else if(opcion==4) {
				System.out.println("DIVISION");
				System.out.println("");
				System.out.println("Teclee el primer número:");
				int num1= sc.nextInt();
				System.out.println("Teclee el segudno número:");
				int num2= sc.nextInt();
				
				InterfazOperar <Integer> operacion= (n1,n2)-> n1/n2;
				
				System.out.println(num1+" / " + num2+" = "+ operacion.operacion(num1, num2));
			}

			else if(opcion==5) {
				System.out.println("POTENCIA DE UN NUMERO");
				System.out.println("");
				System.out.println("Teclee el número:");
				int num1= sc.nextInt();
				System.out.println("Teclee la potencia de el numero:");
				int num2= sc.nextInt();
				
				InterfazOperar <Integer> operacion= (n1,n2)-> {
					int potencia=n1;
					if(n2>0) {
					for(int i=0;i<n2-1;i++) {
						potencia*=n1;
					}}
					else
						potencia=1;
					return potencia;
				};
				
				System.out.println(num1+" elevado a " + num2+" = "+ operacion.operacion(num1, num2));
			}

			else if(opcion==6) {
				System.out.println("");
				System.out.println("SALISTE");
			}
			else {
				System.out.println("Opcion incorrecta.");
			}
		}
		}
}