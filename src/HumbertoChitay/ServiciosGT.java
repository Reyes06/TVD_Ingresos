
package HumbertoChitay;

import Utils.CsvManager;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eddy Reyes
 */
public class ServiciosGT extends Servicios{

    
    public enum GT {
        CLUBDORADO1,
        CLUBDORADO2,
        CLUBDORADO3,
        YOMILLONARIO,
        GANAMANIA,
        LAPROMO, /*PROMO 13X12*/
        ELCUPONAZO,
        CLAROSALUD,
        MEGAPROMO, /*RUTA 14*/
        RECARGAYGANA,
        FECHA
    }
    
    @Override
    public HashMap procesarCobros(File csvPath) {
        
        LinkedList<String[]> tabla = CsvManager.read(csvPath);
        
        HashMap<GT, Acumulador> datos = new HashMap();
        datos.put(GT.CLUBDORADO1, new Acumulador());
        datos.put(GT.CLUBDORADO2, new Acumulador());
        datos.put(GT.CLUBDORADO3, new Acumulador());
        datos.put(GT.YOMILLONARIO, new Acumulador());
        datos.put(GT.GANAMANIA, new Acumulador());
        datos.put(GT.LAPROMO, new Acumulador());
        datos.put(GT.ELCUPONAZO, new Acumulador());
        datos.put(GT.CLAROSALUD, new Acumulador());
        datos.put(GT.MEGAPROMO, new Acumulador());
        datos.put(GT.RECARGAYGANA, new Acumulador());
        
        if(!formatoValido(tabla.get(0))){
            JOptionPane.showMessageDialog(null, "Formato invalido para el archivo de cobros GT");
            return datos;
        } else {
            datos.put(GT.FECHA, new Acumulador(tabla.get(1)[0]));
        }
        
        
        for (int i = 1; i < tabla.size(); i++) {
            String[] fila = tabla.get(i);
            Double dato = Double.valueOf(fila[8]);
            switch(fila[5]){
                case "50150 S CLUBDORADO1":
                    datos.get(GT.CLUBDORADO1).agregar(dato);
                    break;
                case "50150 S CLUBDORADO2":
                    datos.get(GT.CLUBDORADO2).agregar(dato);
                    break;
                case "50150 S CLUBDORADO3":
                    datos.get(GT.CLUBDORADO3).agregar(dato);
                    break;
                case "50150 S YOMILLONARIO":
                    datos.get(GT.YOMILLONARIO).agregar(dato);
                    break;
                case "50150 S GANAMANIA":
                    datos.get(GT.GANAMANIA).agregar(dato);
                    break;
                case "50150 S LA PROMO":
                    datos.get(GT.LAPROMO).agregar(dato);
                    break;
                case "50150 S EL CUPONAZO":
                    datos.get(GT.ELCUPONAZO).agregar(dato);
                    break;
                case "50150 S CLARO SALUD":
                    datos.get(GT.CLAROSALUD).agregar(dato);
                    break;
                case "50150 S MEGAPROMO":
                    datos.get(GT.MEGAPROMO).agregar(dato);
                    break;
                case "TELEVIDA S RECARGA Y GANA":
                    datos.get(GT.RECARGAYGANA).agregar(dato);
                    break;
            }
        }
        return datos;
    }
}
