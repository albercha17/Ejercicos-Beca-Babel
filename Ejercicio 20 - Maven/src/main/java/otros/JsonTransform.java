package otros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import Entidades.Coche;

public class JsonTransform {

	public static void transoformarJSON(List<Coche> listC, String ruta) {
		File fichero = new File("src/main/resources/listaCoches.txt");
		fichero.delete();
		try(FileWriter fw = new FileWriter(ruta, true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			    {
			for(Coche c: listC) {
				out.println(c.toString());
			}
			} catch (IOException e) {
				System.out.println("No se ha podido guardar en el archivo.");
			}
	}
}
