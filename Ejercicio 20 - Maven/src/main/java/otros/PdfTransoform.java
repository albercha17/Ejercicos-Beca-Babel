package otros;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import Entidades.Coche;


public class PdfTransoform {
    public static void transformPDF(List<Coche> listC, String ruta) throws FileNotFoundException,
            DocumentException {

        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document,
                new FileOutputStream(ruta));
        
        
        document.open();
        
        Paragraph titulo = new Paragraph("Lista Vehículos PDF", new Font(FontFamily.COURIER, 18, Font.BOLD));
        titulo.setAlignment(Element.ALIGN_CENTER);
        
        
        document.add(titulo);
        
        for(Coche c:listC) {
        	document.add(new Paragraph(" "));
        	document.add(new Paragraph(" "));
        	document.add(new Paragraph("Coche "+c.getId()));
        	document.add(new Paragraph("  -Matricula "+c.getMatricula()));
        	document.add(new Paragraph("  -Marca "+c.getMarca()));
        	document.add(new Paragraph("  -Modelo "+c.getModelo()));
        	document.add(new Paragraph("  -Kilometros: "+c.getKilometros()+ " km"));
        }
        
        
        document.addTitle("Lista de coches");
        document.addAuthor("Alberto Chaves");
        document.addCreationDate();

        //  Cerrar documento
        document.close();
        //  Cerrar el escritor
        writer.close();
    }
}