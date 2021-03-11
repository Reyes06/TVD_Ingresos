
package DB;

/**
 *
 * @author Eddy Reyes
 */
public class Cobro {
    
    private final String fecha;
    private final Double amount;
    private final Integer cantidad;
    
    public Cobro(String fecha, Double amount, Integer cantidad){
        this.fecha = fecha;
        this.amount = amount;
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public Double getAmount() {
        return amount;
    }

    public Integer getCantidad() {
        return cantidad;
    }
    
    @Override
    public String toString(){
        return "Fecha: " + fecha + " Amount: " + amount + " Cantidad: " + cantidad;
    }
    
}
