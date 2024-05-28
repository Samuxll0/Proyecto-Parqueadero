package co.edu.uniquindio.poo;

/**
 * Clase que agrupa la informacion de un propietario de un vehiculo, en un
 * parqueadero
 * 
 */
public class Propietario {
    private String nombre;

    /**
     * Metodo constructor de la clase propietario
     * 
     * @param nombre
     */
    public Propietario(String nombre) {
        assert nombre != null && !nombre.isBlank() : "El nombre debe ser diferente de null";

        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene el nombre de un propietario
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que actualiza el nombre de un propietario
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
