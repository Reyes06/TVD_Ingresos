
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eddy Reyes
 */
public class Conexion {
    
    
    public static Connection conectarApolloBR(){
        String URL = "jdbc:mysql://192.168.2.21:3306";
        String user = "ereyes";
        String password = "ge5Wg9rkesyJ";
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
    
    public static Connection conectarApolloGT(){
        String URL = "jdbc:mysql://192.168.2.21:5622";
        String user = "ereyes";
        String password = "fG4yqkgzWuaG";
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
}
