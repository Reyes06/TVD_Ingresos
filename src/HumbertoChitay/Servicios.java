package HumbertoChitay;

import java.io.File;
import java.util.HashMap;

/**
 *
 * @author Eddy Reyes
 */
public abstract class Servicios {
    
    public abstract HashMap procesarCobros(File csvPath);
    
    public boolean formatoValido(String[] cabeceraCsv){
        return cabeceraCsv[0].equals("FECHA") && cabeceraCsv[5].equals("CTM_CONTENT_TYPE") && cabeceraCsv[8].equals("TSD_TOTAL_AMT");
    }
    
}
