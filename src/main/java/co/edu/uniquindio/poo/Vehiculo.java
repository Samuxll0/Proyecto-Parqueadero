package co.edu.uniquindio.poo;

/**
 * Clase que agrupa la información de un vehiculo.
 * 
 * @author Samuel Ortiz, Amed Vargas
 * @since 2024 - 05
 * 
 */
public class Vehiculo {
    private final String placa;
    private final String modelo;
    private final Propietario propietario;

    /**
     * Metodo constructor de la clase vehiculo.
     * 
     * @param placa
     * @param modelo
     * @param propietario
     */
    public Vehiculo(String placa, String modelo, Propietario propietario) {

        assert modelo != null && !modelo.isBlank() : "El modelo no puede ser nulo";
        assert placa != null && !placa.isBlank() : "La placa no puede ser nula";
        assert propietario != null : "El propietario no puede ser nulo";

        this.modelo = modelo;
        this.placa = placa;
        this.propietario = propietario;
    }

    /**
     * Metodo obtener para la placa del vehiculo
     * 
     * @return
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Metodo obtener para el modelo del vehiculo
     * 
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo obtener para el propietario del vehiculo
     * 
     * @return
     */
    public Propietario getPropietario() {
        return propietario;
    }

}
