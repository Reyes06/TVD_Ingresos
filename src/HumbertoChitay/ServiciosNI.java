
package HumbertoChitay;

import Utils.CsvManager;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Eddy Reyes
 */
public class ServiciosNI implements Servicios{

    public enum NI {
        CLUBDORADO1,
        MIDOCTOR, /*CLUB DORADO 2*/
        CLUBDORADO3,
        CLUBDORADOPREMIUM,
        YOMILLONARIO,
        CLUBDORADO4,
        GUIASALUD /*CLARO SALUD*/
    }
    
    @Override
    public HashMap procesarCobros(File csvPath) {
        HashMap<NI, Acumulador> datos = new HashMap();
        datos.put(NI.CLUBDORADO1, new Acumulador());
        datos.put(NI.MIDOCTOR, new Acumulador());
        datos.put(NI.CLUBDORADO3, new Acumulador());
        datos.put(NI.CLUBDORADOPREMIUM, new Acumulador());
        datos.put(NI.YOMILLONARIO, new Acumulador());
        datos.put(NI.CLUBDORADO4, new Acumulador());
        datos.put(NI.GUIASALUD, new Acumulador());
        
        LinkedList<String[]> tabla = CsvManager.read(csvPath);
        
        for (int i = 1; i < tabla.size(); i++) {
            String[] fila = tabla.get(i);
            Double dato = Double.valueOf(fila[8]);
            switch(fila[5]){
                case "350301 S CLUBDORADO1":
                    datos.get(NI.CLUBDORADO1).agregar(dato);
                    break;
                case "MIDOCTOR":
                    datos.get(NI.MIDOCTOR).agregar(dato);
                    break;
                case "350301 S CLUBDORADO3":
                    datos.get(NI.CLUBDORADO3).agregar(dato);
                    break;
                case "350301 S CLUBDORADOPREMIUM":
                    datos.get(NI.CLUBDORADOPREMIUM).agregar(dato);
                    break;
                case "350301 S YOMILLONARIO":
                    datos.get(NI.YOMILLONARIO).agregar(dato);
                    break;
                case "350301 S CLUBDORADO4":
                    datos.get(NI.CLUBDORADO4).agregar(dato);
                    break;
                case "GUIA SALUD":
                    datos.get(NI.GUIASALUD).agregar(dato);
                    break;
            }
        }
        return datos;
    }
}
