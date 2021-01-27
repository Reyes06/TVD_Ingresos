
package HumbertoChitay;

import Utils.CsvManager;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Eddy Reyes
 */
public class ServiciosHN implements Servicios{

    
    public enum HN {
        CLUBDORADO1,
        CLUBDORADO2,
        CLUBDORADO3,
        YOMILLONARIO,
        CLUBDORADOPREMIUM,
        GANAMANIA,
        GUIASALUD, /*CLARO SALUD*/
        LAPROMO, /*RASPICLARO*/
        MEGAPROMO, /*RUTA 14*/
        ELCUPONAZO,
        MIDOCTOR, /*SUMMER PARTY*/
        PROMOVERANO /*RUTA 3671*/
    }
    
    @Override
    public HashMap procesarCobros(File csvPath) {
        HashMap<HN, Acumulador> datos = new HashMap();
        datos.put(HN.CLUBDORADO1, new Acumulador());
        datos.put(HN.CLUBDORADO2, new Acumulador());
        datos.put(HN.CLUBDORADO3, new Acumulador());
        datos.put(HN.YOMILLONARIO, new Acumulador());
        datos.put(HN.CLUBDORADOPREMIUM, new Acumulador());
        datos.put(HN.GANAMANIA, new Acumulador());
        datos.put(HN.GUIASALUD, new Acumulador());
        datos.put(HN.LAPROMO, new Acumulador());
        datos.put(HN.MEGAPROMO, new Acumulador());
        datos.put(HN.ELCUPONAZO, new Acumulador());
        datos.put(HN.MIDOCTOR, new Acumulador());
        datos.put(HN.PROMOVERANO, new Acumulador());
        
        
        LinkedList<String[]> tabla = CsvManager.read(csvPath);
        
        for (int i = 1; i < tabla.size(); i++) {
            String[] fila = tabla.get(i);
            Double dato = Double.valueOf(fila[8]);
            switch(fila[5]){
                case "350301 S CLUB DORADO 1":
                    datos.get(HN.CLUBDORADO1).agregar(dato);
                    break;
                case "350301 S CLUB DORADO 2":
                    datos.get(HN.CLUBDORADO2).agregar(dato);
                    break;
                case "350301 S CLUB DORADO 3":
                    datos.get(HN.CLUBDORADO3).agregar(dato);
                    break;
                case "350301 S CLUB DORADO PREMIUM":
                    datos.get(HN.CLUBDORADOPREMIUM).agregar(dato);
                    break;
                case "350301 S EL CUPONAZO 2 8260":
                    datos.get(HN.ELCUPONAZO).agregar(dato);
                    break;
                case "350301 S GANAMANIA":
                    datos.get(HN.GANAMANIA).agregar(dato);
                    break;
                case "350301 S LA PROMO 8260":
                    datos.get(HN.LAPROMO).agregar(dato);
                    break;
                case "350301 S MEGAPROMO 8700":
                    datos.get(HN.MEGAPROMO).agregar(dato);
                    break;
                case "350301 S PROMO VERANO 8700":
                    datos.get(HN.PROMOVERANO).agregar(dato);
                    break;
                case "350301 S YO MILLONARIO":
                    datos.get(HN.YOMILLONARIO).agregar(dato);
                    break;
                case "GUIA SALUD":
                    datos.get(HN.GUIASALUD).agregar(dato);
                    break;
                case "MIDOCTOR":
                    datos.get(HN.MIDOCTOR).agregar(dato);
                    break;
            }
        }
        return datos;
    }
}
