package ChainOfResponsability;

/**
 *
 * @author Johans
 */
public class Vehiculo extends ObjetoBasico{

    
    protected String descripcion;
    
    public Vehiculo(String decripcion){
        this.descripcion = descripcion;
    }
    
    @Override
    protected String getDescripcion() {
        return descripcion;
    }
    
}
