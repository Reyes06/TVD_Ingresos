
package DB;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eddy Reyes
 */
public class ApolloBR {
    
    public enum serviciosBR{
        GoFitness,
        Safaricom,
        Telkom,
        GuiaSalud,
        GuiaSaludSemanal
    }
    
    public HashMap obtenerCobrosAfrica(){
        Connection conexion = Conexion.conectarApolloBR();
        String query = "SELECT bil.send_date, susc.descripcion, bil.status, SUM(amount) amount, COUNT(*) AS cantidad " +
                        "FROM codigos_suscripcion.billing bil " +
                        "INNER JOIN codigos_suscripcion.suscripciones susc ON bil.subscription_id = susc.codigo_suscripcion " +
                        "WHERE send_date = CURDATE()-1 " +
                        "GROUP BY 1,2,3;";
        
        HashMap<serviciosBR, Cobro> tabla = new HashMap();
        Date f = new Date();
        f.setDate(f.getDate()-1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(f);
        tabla.put(serviciosBR.GoFitness, new Cobro(fecha, 0.0, 0));
        tabla.put(serviciosBR.Safaricom, new Cobro(fecha, 0.0, 0));
        tabla.put(serviciosBR.Telkom, new Cobro(fecha, 0.0, 0));
        try {
            PreparedStatement  sentencia = conexion.prepareStatement(query);
            ResultSet rs = sentencia.executeQuery();
            
            //Llenar la hashtable con los datos 
            while(rs.next()){
                switch(rs.getString(2)){
                    case "Entel PE - Go Fitness":
                        if(rs.getString(3).equals("CHARGED")){
                            tabla.put(serviciosBR.GoFitness, new Cobro(rs.getString(1), rs.getDouble(4), rs.getInt(5)));
                        }
                        break;
                    case "Play Safaricom - MobiAfya":
                        if(rs.getString(3).equals("CHARGED")){
                            tabla.put(serviciosBR.Safaricom, new Cobro(rs.getString(1), rs.getDouble(4), rs.getInt(5)));
                        }
                        break;
                    case "Telkom KE - Mobiafya":
                        if(rs.getString(3).equals("CHARGED")){
                            tabla.put(serviciosBR.Telkom, new Cobro(rs.getString(1), rs.getDouble(4), rs.getInt(5)));
                        }
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
    
    public HashMap obtenerCobrosPeru(){
        Connection conexion = Conexion.conectarApolloBR();
        String query = "SELECT \n" +
                        "    DATE(b.fecha_envio) AS fecha,\n" +
                        "    susc.descripcion,\n" +
                        "    b.cobro_exitoso,\n" +
                        "    b.id_suscripcion,\n" +
                        "    COUNT(b.msisdn) AS cobros,\n" +
                        "    sum(valor/100) AS TOTAL\n" +
                        "FROM\n" +
                        "    speedy.speedy_billing b\n" +
                        "        INNER JOIN\n" +
                        "    codigos_suscripcion.suscritos s ON s.celular = b.msisdn\n" +
                        "        AND s.codigo_suscripcion = b.id_suscripcion\n" +
                        "        INNER JOIN\n" +
                        "    codigos_suscripcion.suscripciones susc USING (codigo_suscripcion)\n" +
                        "WHERE\n" +
                        "    DATE(b.fecha_envio) = CURDATE()-1\n" +
                        "        AND b.cobro_exitoso = 'YES'\n" +
                        "GROUP BY DATE(b.fecha_envio) , b.cobro_exitoso , b.id_suscripcion;";
        
        HashMap<serviciosBR, Cobro> tabla = new HashMap();
        Date f = new Date();
        f.setDate(f.getDate()-1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(f);
        tabla.put(serviciosBR.GuiaSalud, new Cobro(fecha, 0.0, 0));
        tabla.put(serviciosBR.GuiaSaludSemanal, new Cobro(fecha, 0.0, 0));
        try {
            PreparedStatement sentencia = conexion.prepareStatement(query);
            ResultSet rs = sentencia.executeQuery();
            
            while(rs.next()){
                switch(rs.getString(2)){
                    case "Claro PE CERT - Guia Salud":
                        tabla.put(serviciosBR.GuiaSalud, new Cobro(rs.getString(1), rs.getDouble(6), rs.getInt(5)));
                        break;
                    case "Claro PE CERT - Guia Salud Semanal":
                        tabla.put(serviciosBR.GuiaSaludSemanal, new Cobro(rs.getString(1), rs.getDouble(6), rs.getInt(5)));
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
    
    
    public static void main (String[] args){
        ApolloBR abr = new ApolloBR();
        HashMap<serviciosBR, Cobro> tabla = abr.obtenerCobrosAfrica();
        
        System.out.println(tabla.get(serviciosBR.GoFitness).toString());
        System.out.println(tabla.get(serviciosBR.Safaricom).toString());
        System.out.println(tabla.get(serviciosBR.Telkom).toString());
        
        HashMap<serviciosBR, Cobro> tabla2 = abr.obtenerCobrosPeru();
        Cobro c = tabla2.get(serviciosBR.GuiaSalud);
        System.out.println(c.toString());
        
    }
}
