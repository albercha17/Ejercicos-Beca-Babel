package coches;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Entidades.Coche;
import Negocio.SACoche;

class SACocheTest {

	@Test
	void testValidarDatos() {
		 SACoche saC= new SACoche();
		//Coches con matricula erronea
		Coche c1 = new Coche("19996FDH", "Citroen",  "Sport", 200);
		Coche c2 = new Coche("199FDH", "Citroen",  "Sport", 200);
		
		assertEquals(saC.validarDatos(c1),"La matricula debe tener 7 digitos.");
		assertEquals(saC.validarDatos(c2),"La matricula debe tener 7 digitos.");
		
		//Kilometros negativos
		 Coche c3 = new Coche("1999FDH", "Citroen",  "Sport", -200);
		 assertEquals(saC.validarDatos(c3),"Los kilometros deben de ser positivos");
		 
		 //Coche posible
		 Coche c4 = new Coche("1999FDH", "Citroen",  "Sport", 200);
		 assertEquals(saC.validarDatos(c4),null);
	}

}
