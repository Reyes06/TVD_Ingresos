
package HumbertoChitay;

import HumbertoChitay.ServiciosCR.CR;
import Utils.ZipManager;
import java.io.File;
import java.util.HashMap;

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
    
    private static void eliminarArchivos(File directorio){
        for(File archivo : directorio.listFiles()){
            if(archivo.isDirectory()){
                eliminarArchivos(archivo);
            }
            archivo.delete();
        }
    }
    
    public static HashMap<paises, HashMap> procesarCobros(File zipPath){
        
        File humberto = new File("HumbertoChitay");
        if (!humberto.exists()) {
            humberto.mkdir();
        } else {
            eliminarArchivos(humberto);
        }
        
        ZipManager.unZip(zipPath, "HumbertoChitay");
        
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
                    analisisCobros = new ServiciosHN();
                    cobros = analisisCobros.procesarCobros(archivo);
                    cobrosPaises.put(paises.HN, cobros);
                    break;
                case "NI":
                    analisisCobros = new ServiciosNI();
                    cobros = analisisCobros.procesarCobros(archivo);
                    cobrosPaises.put(paises.NI, cobros);
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
