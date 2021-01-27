
package HumbertoChitay;

import HumbertoChitay.ServiciosCR.CR;
import Utils.ZipManager;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Eddy Reyes
 */
public class Analizador {
    
    public enum paises {
        GT,
        SV,
        HN,
        NI,
        CR
    }
    
    public static HashMap<paises, HashMap> procesarCobros(File zipPath){
        ZipManager.unZip(zipPath, "HumbertoChitay");
        File humberto = new File("HumbertoChitay");
        HashMap<paises, HashMap> cobrosPaises = new HashMap();
        Servicios analisisCobros;
        HashMap<CR, Acumulador> cobros;
                    
        for(File archivo : humberto.listFiles()){
            switch(archivo.getName().split("_")[1]){
                case "GT":
                    analisisCobros = new ServiciosGT();
                    cobros = analisisCobros.procesarCobros(archivo);
                    cobrosPaises.put(paises.GT, cobros);
                    break;
                case "SV":
                    analisisCobros = new ServiciosSV();
                    cobros = analisisCobros.procesarCobros(archivo);
                    cobrosPaises.put(paises.SV, cobros);
                    break;
                case "HN":
                    break;
                case "NI":
                    break;
                case "CR":
                    analisisCobros = new ServiciosCR();
                    cobros = analisisCobros.procesarCobros(archivo);
                    cobrosPaises.put(paises.CR, cobros);
                    break;
            }
            
            
        }
        
        return cobrosPaises;
    }
}
