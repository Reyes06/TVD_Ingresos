
package HumbertoChitay;

import Utils.CsvManager;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eddy Reyes
 */
public class ServiciosSV extends Servicios{

    
    public enum SV {
        CLUBDORADO,
        YOMILLONARIO,
        MIDOCTOR, /*CLUB DORADO PREMIUM*/
        ELCUPONAZO,
        GUIASALUD, /*CLARO SALUD*/
        MEGAPROMO, /*SUENOS DE NAVIDAD*/
    }
    
    @Override
    public HashMap procesarCobros(File csvPath) {
        HashMap<SV, Acumulador> datos = new HashMap();
        datos.put(SV.CLUBDORADO, new Acumulador());
        datos.put(SV.YOMILLONARIO, new Acumulador());
        datos.put(SV.MIDOCTOR, new Acumulador());
        datos.put(SV.ELCUPONAZO, new Acumulador());
        datos.put(SV.GUIASALUD, new Acumulador());
        datos.put(SV.MEGAPROMO, new Acumulador());
        
        LinkedList<String[]> tabla = CsvManager.read(csvPath);
        
        if(!formatoValido(tabla.get(0))){
            JOptionPane.showMessageDialog(null, "Formato invalido para el archivo de cobros SV");
            return datos;
        }
        
        for (int i = 1; i < tabla.size(); i++) {
            String[] fila = tabla.get(i);
            Double dato = Double.valueOf(fila[8]);
            switch(fila[5]){
                case "350402 S CLUB DORADO":
                    datos.get(SV.CLUBDORADO).agregar(dato);
                    break;
                case "350402 S EL CUPONAZO":
                    datos.get(SV.ELCUPONAZO).agregar(dato);
                    break;
                case "350402 S MEGAPROMO":
                    datos.get(SV.MEGAPROMO).agregar(dato);
                    break;
                case "350402 S YO MILLONARIO":
                    datos.get(SV.YOMILLONARIO).agregar(dato);
                    break;
                case "GUIA SALUD":
                    datos.get(SV.GUIASALUD).agregar(dato);
                    break;
                case "MIDOCTOR":
                    datos.get(SV.MIDOCTOR).agregar(dato);
                    break;
            }
        }
        return datos;
    }
}
