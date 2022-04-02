package Main;

import java.util.ArrayList;

import entidades.*;
public class main {
	static ArrayList<Personajes> listaP= new ArrayList<>();
	static ArrayList<Arma> listaA= new ArrayList<>();
	static ArrayList<String> listaDañar= new ArrayList<>();
	static ArrayList<String> listaAccion= new ArrayList<>();
	
	
	/**
	 * Crea una lista de armas, de personajes y de frases
	 */
	 static void crearLista() {
		 
		 //Armas
		 	//Espadas
		 Arma e1= new Espada("la espada Excálibur",30);
		 listaA.add(e1);
		 Arma e2= new Espada("la espada Garra", 25);
		 listaA.add(e2);
		 Arma e3= new Espada("un sable laser", 40);
		 listaA.add(e3);
		 Arma e4= new Espada("un palo del suelo", 5);
		 listaA.add(e4);
		 
		 	//Arcos
		 Arma ar1= new Arco("el arco de Robin Hood", 25);
		 listaA.add(ar1);
		 Arma ar2= new Arco("el arco de Cupido", 15);
		 listaA.add(ar2); 
		 Arma ar3= new Arco("el arco de Ojo de Alcón", 30);
		 listaA.add(ar3);
		 Arma ar4= new Arco("un tirachinas", 5);
		 listaA.add(ar4);
		 
		 	//Hechizos
		 Arma h1= new Hechizos("los hechizos prohibidos", 25);
		 listaA.add(h1);
		 Arma h2= new Hechizos("las magia oscura", 25);
		 listaA.add(h2);
		 
			//Rezos
		 Arma r1= new Rezos("sus cantos gregorianos", 15);
		 listaA.add(r1);
		 Arma r2= new Rezos("los cantos sagrados", 15);
		 listaA.add(r2);
		 
		 
		 //------------------------------------------------------------------------------------------------------
		 
		 //Personajes
		Personajes p1= new Guerrero();
		p1.setNombre("Conan El Bárbaro");
		
		listaP.add(p1);
		
		Personajes p3= new Guerrero();
		p3.setNombre("El Caballero Oscuro");
		listaP.add(p3);
		
		Personajes p2= new Mago();
		p2.setNombre("El Mago Blanco");
		listaP.add(p2);
		
		Personajes p4= new Mago();
		p4.setNombre("El Mago Negro");
		listaP.add(p4);
		
		Personajes p5= new Curandero();
		p5.setNombre("El Sanador");
		listaP.add(p5);
		
		Personajes p6= new Curandero();
		p6.setNombre("La Curandera");
		listaP.add(p6);
		
		Personajes p7= new Guerrero();
		p7.setNombre("El Cid Campeador");
		
		Personajes p8= new Mago();
		p8.setNombre("Gandalf El Gris");
		listaP.add(p8);
		
		Personajes p9= new Curandero();
		p9.setNombre("El Enferemero Asesino");
		listaP.add(p9);
		
		Personajes p10= new Mago();
		p10.setNombre("Harry Potter");
		listaP.add(p10);
		
		Personajes p11= new Guerrero();
		p11.setNombre("Ragnar Lodbrok");
		listaP.add(p11);
		
		//------------------------------------------------------------------------------------------------------
		 
		 //Acciones de dañar
		
		listaDañar.add(" ha dañado");
		listaDañar.add(" ha dado un buen golpe");
		listaDañar.add(" ha impactado contra");
		listaDañar.add(" ha conseguido dañar");
		listaDañar.add(" ha herido");
		
		// Acciones de accion
		listaAccion.add(" ha escupido a ");
		listaAccion.add(" está intendo solucionar sus problemas con ");
		listaAccion.add(" le ha puesto la zancadilla a ");
		listaAccion.add(" está maldiciendo a ");
		listaAccion.add(" está hablando mal de la madre de ");
		listaAccion.add(" esquivo el puñetazo de ");
		listaAccion.add(" se esta enamorando de ");
		listaAccion.add(" ha declarado su amor a ");
	}
	 
	 
	 /**
	  * Elige dos personajes al azar con un arma al azar
	  * @return devuelve una lista con los personajes y sus armas
	  */
	 static ArrayList<Personajes> elegirPersonaje(){
		 int x=0, y=0;
		 ArrayList<Personajes> listaP2= new ArrayList<>();
		 while(x==y) {
			 x= (int) (Math.random()*listaP.size());
			 y=(int) (Math.random()*listaP.size());
		 }
		 listaP2.add(listaP.get(x));
		 listaP2.add(listaP.get(y));
		 x=0;
		 y=0;
		 while(x==y) {
			 x= (int) (Math.random()*listaA.size());
			 y=(int) (Math.random()*listaA.size());
		 }
		 listaP2.get(0).setArma(listaA.get(x));
		 listaP2.get(1).setArma(listaA.get(y));
		 return listaP2;
	 }
	 
	 
	 /**
	  * Hace una parada (time numero de segundos) para que quede mas emocionante
	  */
	 public static void esperar(int x) {
		 int time=3;
		 if(time!=0)
			 time+=x;
		 try {
	            Thread.sleep(time*1000);
	         } catch (Exception e) {
	            System.out.println(e);
	         }
	 }
	 
	 
	 /**
	  * Funcion para no estar repitiendo codigo al mostar el personaje y su vida
	  * @param p es el personaje que quiero mostrar
	  * @return nombre+vida del personaje
	  */
	 public static String nombreYvida(Personajes p) {
		 return p.getNombre()+"("+p.getVida()+")";
	 }
	 
	 /**
	  * Coge una opcion aleatoria para que cada combate sea unico
	  * @param p1 primer personaje
	  * @param p2 segundo personaje
	  */
	 public static void jugar(Personajes p1, Personajes p2) {
		 System.out.println("");
		 System.out.println("****  "+nombreYvida(p1)+"  VS  "+nombreYvida(p2)+"  ****");
		 System.out.println("");
		 int opcion=(int) (Math.random()*4+1);
		 //Ataque
		 if(opcion==1) {
			 p1.esDañado(p2.dañar());
			 System.out.println(nombreYvida(p2)+listaDañar.get((int) (Math.random()*listaDañar.size()))+" (-"+p2.getDaño()+ 
					 " puntos) a "+ nombreYvida(p1));
		 }
		 else if(opcion==2) {
			 p2.esDañado(p1.dañar());
			 System.out.println(nombreYvida(p1)+listaDañar.get((int) (Math.random()*listaDañar.size()))+" (-"+p1.getDaño()+ 
					 " puntos) a "+ nombreYvida(p2));
		 }
		 //Accion ramdom
		 else if(opcion==3) {
			 System.out.println(p1.getNombre()+ listaAccion.get((int) (Math.random()*listaAccion.size()))+ p2.getNombre());
		 }
		 else if(opcion==4) {
			 System.out.println(p2.getNombre()+ listaAccion.get((int) (Math.random()*listaAccion.size()))+ p1.getNombre());
		 }
		 System.out.println("");
		 System.out.println("----------------------------------------------------------------------");
		 System.out.println("");
		 esperar(2);
	 }
	 
	 
	 static void inicio(Personajes p1, Personajes p2) {
		 System.out.println(p1.getNombre() + " luchará con "+p1.getArma().getNombre()+"(Entre "+p1.getDañoMin()+" y "+ p1.getDañoMax()+" de daño).");
		  if((p1 instanceof Guerrero)&&((p1.getArma() instanceof Espada)||(p1.getArma() instanceof Arco))) {
			  int fuerza= p1.getDaño()- p1.getArma().getDaño();
			  System.out.println("   >El arma \""+p1.getArma().getNombre()+"\" es de sus armas favoritas.");
			  System.out.println("   >Se le han sumado "+ fuerza+ " de daño al arma!!");
		  }
		  else if((p1 instanceof Mago)&&(p1.getArma() instanceof Hechizos)) {
			  int fuerza= p1.getDaño()- p1.getArma().getDaño();
			  System.out.println("   >Es especialista en hechizos!! Con"+p1.getArma().getNombre()+"No habrá nadie que le pare. ");
			  System.out.println("   >Se le han sumado "+ fuerza+ " de daño al hechizo!!");
			  System.out.println("   >Su ataque crítico ha incrementado en +10!!");
		  }
		  else if((p1 instanceof Curandero)&&(p1.getArma() instanceof Rezos)) {
			  int fuerza= p1.getDaño()- p1.getArma().getDaño();
			  System.out.println("   >Su especialidad son los rezos!! Con "+p1.getArma().getNombre()+" se curara 5 puntos de salud al atacar.");
			  System.out.println("   >Se le han sumado ademas "+ fuerza+ " de daño!!");
		  }
		  System.out.println("");
		  

		  esperar(2);
	 }
	 
	 
	 
	 
	 /*			REGLAS
	  * 
	  * El juego escogera al azar dos personajes diferentes con unas arma diferentes y lucharan hasta que uno de los dos
	  * se quede sin puntos de vida.
	  * Cada arma tiene un daño base, un daño minimo y un daño maximo(+30 de daño). Al atacar, se escogera un valor aleatorio entre
	  * el valor minimo y el maximo.
	  * Cada personaje tiene su arma favorita. Si este lucha con una de ellas, se activara una serie de mejoras;
	  * 	
	  * 	1.Guerrero-Espada/Arco: se le suma al daño base del arma los puntos de fuerza del personaje. Ademas tendra una posibilidad
	  * 							entre 1 de activar su SUPER(+30 de daño en su proximo ataque)
	  * 	2.Mago-Hechizos: se le suma al daño base del arma los puntos de inteligencia del personaje. Ademas tendra una posibilidad
	  * 							entre 1 de activar su SUPER(+15 de daño en su proximo ataque, +15 de vida y +10 en criticos).
	  * 	3.Curanderos-Rezos: se le suma al daño base del arma los puntos de sabiduria del personaje. Ademas tendra una posibilidad
	  * 							entre 1 de activar su SUPER(+30 de vida).
	  * 
	  * Ademas, hay un un 30% de posibilidades que el ataque sea critico, sumandole +20 de daño extra
	  * */
	 
	public static void main(String[] args) {
		
		crearLista();
		ArrayList<Personajes> personajesDuelo= elegirPersonaje();
		Personajes p1=personajesDuelo.get(0);
		Personajes p2=personajesDuelo.get(1);
		System.out.println("En una época antigua...");
		esperar(-1);
		 try {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } catch (Exception e) {
	            /*No hacer nada*/
	        }
		  System.out.println("En un reino muy muy lejano...");
		  esperar(-1);
		  System.out.println("Una batalla esta apunto de empezar!");
		  esperar(-1);
		  System.out.println("----------------------------------------------------------------------");
		  System.out.println("");
		  System.out.println("Un "+p1.getTipo()+" llamado "+p1.getNombre()+" esta apunto de enfrentarse "
		  		+ "contra un "+p2.getTipo()+" llamado "+p2.getNombre()+"." );
		  System.out.println("");
		  esperar(0);
		  
		  //Mensaje del arma que ha tocado( si es espcial te mostrara un mensaje diciendotelo)--------------------
		  
		  inicio(p1,p2);
		  inicio(p2,p1);
		  
		  //---------------------------------------------------------------------------
		  System.out.println("");
		  System.out.println("\n\n\n\n\n");
		  System.out.println("");
		  System.out.println("          QUE EMPIEZE EL COMBATE!!!!!");
		  System.out.println("");
		  System.out.println("----------------------------------------------------------------------");
		  System.out.println("");
		  esperar(0);
		  System.out.println("");
		  while(p1.getVida()>0 && p2.getVida()>0) {
			  jugar(p1,p2);
		  }
		  if(p1.getVida()>0)
			  System.out.println("Ha ganado "+ p1.getNombre());
		  else
			  System.out.println("Ha ganado "+ p2.getNombre());
		  System.out.println("\n\n\n\n\n");
	}
	
	 
}
