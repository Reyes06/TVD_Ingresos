
package HumbertoChitay;

/**
 *
 * @author Eddy Reyes
 */
public class Acumulador {
    private Integer conteo;
    private Double suma;
    private String fecha;

    public String getFecha() {
        return fecha;
    }
    
    public Acumulador(){
        conteo = 0;
        suma = 0.0;
    }
    
    public Acumulador(String fecha){
        this.fecha = fecha;
    }
    
    public Integer getConteo(){
        return this.conteo;
    }
    
    public Double getSuma(){
        return this.suma;
    }
    
    public void agregar (Double dato){
        this.suma += dato;
        this.conteo += 1;
    }
}
