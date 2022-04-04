package entidades;

import Main.main;

public class Fortaleza {
		private String nombre;
		private Personajes jefe;
		public Fortaleza(String nombre, Personajes jefe) {
			this.nombre = nombre;
			this.jefe=jefe;
		}
		
		public synchronized void entrar(Personajes p1){
			if(p1.getVida()>0)
				System.out.println("@@@@@@@@ Ha entrado en la fortaleza "+ p1.getNombre()+ " @@@@@@@@");
			while(p1.getVida()>0 && jefe.getVida()>0) {
				main.jugar(p1, jefe, 0);

				if(jefe.getVida()<=0) {
					 if(jefe.getVida()<=0) {
						  System.out.println("");
						  System.out.println( p1.getNombre()+" es el heroe del pueblo.");
						  System.out.println("Ha derrotado a "+jefe.getNombre()+ ".La gente corea su nombre");
					  }
				}
				if(p1.getVida()<=0) {
					if(this.jefe instanceof JefeFinal) {
						Personajes x= ((JefeFinal) this.jefe).getpFinal();
					if(x.getNombre().equals(p1.getNombre())) {
						System.out.println(jefe.getNombre()+ " ha derrotado a todo el ejercito.El reino esta en peligro.");
					}
				}
				}
			}
			
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Personajes getJefe() {
			return jefe;
		}

		public void setJefe(Personajes jefe) {
			this.jefe = jefe;
		}
		
		
	}
