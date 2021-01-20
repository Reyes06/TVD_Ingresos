
package HumbertoChitay;

/**
 *
 * @author Eddy Reyes
 */
public class Acumulador {
    private Integer conteo;
    private Double suma;
    
    public Acumulador(){
        conteo = 0;
        suma = 0.0;
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
