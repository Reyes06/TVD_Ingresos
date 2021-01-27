
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
    public static void procesarCobros(File zipPath){
        ZipManager.unZip(zipPath, "HumbertoChitay");
        
        File f = new File("HumbertoChitay");
        
        for(File archivo : f.listFiles()){
            
            Servicios analisisCobros;
                    
            switch(archivo.getName().split("_")[1]){
                case "GT":
                    break;
                case "SV":
                    break;
                case "HN":
                    break;
                case "NI":
                    break;
                case "CR":
                    analisisCobros = new ServiciosCR();
                    System.out.println(archivo.getAbsolutePath());
                    HashMap<CR, Acumulador> cobros = analisisCobros.procesarCobros(archivo);
                    Acumulador temp;
                    temp = cobros.get(CR.CLUBDORADO);
                    System.out.println("Club dorado");
                    System.out.println("Count: " + temp.getConteo());
                    System.out.println("Suma: " + temp.getSuma());
                    temp = cobros.get(CR.GRADUADOSVERANO);
                    System.out.println("Graduados Verano");
                    System.out.println("Count: " + temp.getConteo());
                    System.out.println("Suma: " + temp.getSuma());
                    temp = cobros.get(CR.GUIASALUD);
                    System.out.println("Guia salud");
                    System.out.println("Count: " + temp.getConteo());
                    System.out.println("Suma: " + temp.getSuma());
                    temp = cobros.get(CR.MIDOCTOR);
                    System.out.println("Mi doctor");
                    System.out.println("Count: " + temp.getConteo());
                    System.out.println("Suma: " + temp.getSuma());
                    temp = cobros.get(CR.SANTAREGALON);
                    System.out.println("Santa regalon");
                    System.out.println("Count: " + temp.getConteo());
                    System.out.println("Suma: " + temp.getSuma());
                    
                    break;
            }
            
            
        }
    }
}
