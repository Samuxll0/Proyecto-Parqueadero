package co.edu.uniquindio.poo;

/**
 * Clase de tipo registro que agrupa los datos de un propietario.
 * 
 * @author Samuel Ortiz, Amed Vargas.
 * @since 2024 - 05
 * 
 */
public record Propietario(String nombre, String apellido) {

    /**
     * Metodo constructor de la clase propietario.
     * 
     * @param nombre
     * @param apellido
     * 
     */
    public Propietario {
        assert nombre != null : "El nombre no puede ser nulo";
        assert apellido != null : "El apellido no puede ser nulo";
    }
}
