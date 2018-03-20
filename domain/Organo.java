
package domain;

/**
 *
 * @author richar
 */
public class Organo {
    
    private String nombre;
    private String funcion;

    public Organo() {
    }

    public Organo(String nombre, String funcion) {
        this.nombre = nombre;
        this.funcion = funcion;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    
    
}
