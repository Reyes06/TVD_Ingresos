package HumbertoChitay;

import Utils.CsvManager;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Eddy Reyes
 */
public class ServiciosCR implements Servicios{

    public enum CR {
        CLUBDORADO,
        MIDOCTOR, /*CLUB DORADO PREMIUM*/
        SANTAREGALON, /*PROMO MEGANAVIDAD*/
        GRADUADOSVERANO,
        GUIASALUD /*CLARO SALUD*/
    }
    
    @Override
    public HashMap<CR, Acumulador> procesarCobros(File csvPath) {
        
        HashMap<CR, Acumulador> datos = new HashMap();
        datos.put(CR.CLUBDORADO, new Acumulador());
        datos.put(CR.MIDOCTOR, new Acumulador());
        datos.put(CR.SANTAREGALON, new Acumulador());
        datos.put(CR.GRADUADOSVERANO, new Acumulador());
        datos.put(CR.GUIASALUD, new Acumulador());
        
        
        LinkedList<String[]> tabla = CsvManager.read(csvPath);
        
        for (int i = 1; i < tabla.size(); i++) {
            String[] fila = tabla.get(i);
            Double dato = Double.valueOf(fila[8]);
            switch(fila[5]){
                case "350250 S CLUB DORADO":
                    datos.get(CR.CLUBDORADO).agregar(dato);
                    break;
                case "350250 S Santa Regalon":
                    datos.get(CR.SANTAREGALON).agregar(dato);
                    break;
                case "GUIA SALUD":
                    datos.get(CR.GUIASALUD).agregar(dato);
                    break;
                case "MIDOCTOR":
                    datos.get(CR.MIDOCTOR).agregar(dato);
                    break;
                case "350250 S GRADUADOS DEL VERANO":
                    datos.get(CR.GRADUADOSVERANO).agregar(dato);
                    break;
            }
        }
        return datos;
    }
    
    
}
