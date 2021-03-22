
package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eddy Reyes
 */
public class ApolloGT {
    
    public enum servicios {
        MiDoctor,
        Miximania,
        GuiaSalud,
        ClubDoradoGT,
        ClubDoradoPA
    }
    
    public HashMap obtenerCobrosMiDoctor(){
        Connection conexion = Conexion.conectarApolloGT();
        String query =  "SELECT\n" +
                        "  DATE(b.fecha_envio) AS fecha,\n" +
                        "  susc.descripcion,\n" +
                        "  b.cobro_exitoso,\n" +
                        "  b.id_suscripcion,\n" +
                        "  COUNT(b.msisdn) AS cobros,\n" +
                        "  (b.valor*COUNT(b.msisdn)) AS Total\n" +
                        "FROM\n" +
                        "  speedy.speedy_billing b\n" +
                        "  INNER JOIN codigos_suscripcion.suscritos s\n" +
                        "    ON s.celular = b.msisdn\n" +
                        "    AND s.codigo_suscripcion = b.id_suscripcion\n" +
                        "  INNER JOIN codigos_suscripcion.suscripciones susc USING (codigo_suscripcion)\n" +
                        "WHERE DATE(b.fecha_envio) = curdate()-1\n" +
                        "  AND b.cobro_exitoso = 'YES'\n" +
                        "  AND b.id_suscripcion=578\n" +
                        "  AND b.valor>0\n" +
                        "GROUP BY DATE(b.fecha_envio),\n" +
                        "  b.cobro_exitoso,	\n" +
                        "  b.id_suscripcion\n" +
                        "  ORDER BY fecha DESC;\n";
        
        HashMap<ApolloGT.servicios, Cobro> tabla = new HashMap();
        Date f = new Date();
        f.setDate(f.getDate()-1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(f);
        tabla.put(ApolloGT.servicios.MiDoctor, new Cobro(fecha, 0.0, 0));
        try {
            PreparedStatement  sentencia = conexion.prepareStatement(query);
            ResultSet rs = sentencia.executeQuery();
            
            //Llenar la hashtable con los datos 
            while(rs.next()){
                tabla.put(ApolloGT.servicios.MiDoctor, new Cobro(rs.getString(1), rs.getDouble(6), rs.getInt(5)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ApolloBR.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ApolloBR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tabla;
    }
    
    public HashMap obtenerCobrosPanama(){
        Connection conexion = Conexion.conectarApolloGT();
        String query =  "SELECT DATE(b.fecha_envio) AS fecha,\n" +
                        "       susc.descripcion,\n" +
                        "       b.id_suscripcion,\n" +
                        "       COUNT(b.msisdn) AS cobros,\n" +
                        "       ROUND(SUM(b.valor),2) AS amount\n" +
                        "FROM speedy.speedy_billing b\n" +
                        "INNER JOIN codigos_suscripcion.suscritos s ON s.celular = b.msisdn\n" +
                        "AND s.codigo_suscripcion = b.id_suscripcion\n" +
                        "INNER JOIN codigos_suscripcion.suscripciones susc USING (codigo_suscripcion)\n" +
                        "WHERE DATE(b.fecha_envio) = CURDATE()-1\n" +
                        "  AND b.cobro_exitoso = 'YES'\n" +
                        "GROUP BY DATE(b.fecha_envio),\n" +
                        "         b.cobro_exitoso,\n" +
                        "         b.id_suscripcion\n" +
                        "ORDER BY fecha_envio desc;";
        
        HashMap<ApolloGT.servicios, Cobro> tabla = new HashMap();
        Date f = new Date();
        f.setDate(f.getDate()-1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(f);
        tabla.put(ApolloGT.servicios.MiDoctor, new Cobro(fecha, 0.0, 0));
        tabla.put(ApolloGT.servicios.GuiaSalud, new Cobro(fecha, 0.0, 0));
        tabla.put(ApolloGT.servicios.Miximania, new Cobro(fecha, 0.0, 0));
        tabla.put(ApolloGT.servicios.ClubDoradoGT, new Cobro(fecha, 0.0, 0));
        tabla.put(ApolloGT.servicios.ClubDoradoPA, new Cobro(fecha, 0.0, 0));
        try {
            PreparedStatement  sentencia = conexion.prepareStatement(query);
            ResultSet rs = sentencia.executeQuery();
            
            //Llenar la hashtable con los datos 
            while(rs.next()){
                switch(rs.getString(2)){
                    case "Guia Salud Claro Panama":
                        tabla.put(ApolloGT.servicios.GuiaSalud, new Cobro(rs.getString(1), rs.getDouble(5), rs.getInt(4)));
                        break;
                    case "Club Dorado Premium - Claro GT SMT":
                        tabla.put(ApolloGT.servicios.ClubDoradoGT, new Cobro(rs.getString(1), rs.getDouble(5), rs.getInt(4)));
                        break;
                    case "Mi Doctor Claro GT - SMT":
                        tabla.put(ApolloGT.servicios.MiDoctor, new Cobro(rs.getString(1), rs.getDouble(5), rs.getInt(4)));
                        break;
                    case "MIXIMANIA CLARO PA":
                        tabla.put(ApolloGT.servicios.Miximania, new Cobro(rs.getString(1), rs.getDouble(5), rs.getInt(4)));
                        break;
                    case "CLUB DORADO CLARO PA":
                        tabla.put(ApolloGT.servicios.ClubDoradoPA, new Cobro(rs.getString(1), rs.getDouble(5), rs.getInt(4)));
                        break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ApolloBR.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ApolloBR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tabla;
    }
}
