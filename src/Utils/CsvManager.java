
package Utils;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author Eddy Reyes
 */
public class CsvManager {
    
    public static LinkedList<String[]> read(String csvPath){
        CSVReader reader = null;
        LinkedList<String[]> tabla = new LinkedList();
        try {
           reader = new CSVReader(new FileReader(csvPath));
           String[] nextLine=null;
           

           while ((nextLine = reader.readNext()) != null) {
               tabla.add(nextLine);
           }
           reader.close();
        } catch (CsvValidationException | IOException e) {
            System.out.println("Hubo un error al interpretar el CCV");
        }
        return tabla;
    }
}
