package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

/**
 * Clase que agrupa la información de el historial de varios vehiculos.
 * 
 * @author Samuel Ortiz, Amed Vargas
 * @since 2024 - 05
 * 
 */
public class Historial {
    private LocalDateTime fechaEntrada;
    private final Vehiculo vehiculo;
    private final Puesto puesto;

    /**
     * Metodo constructor de la clase historial.
     * 
     * @param fechaEntrada
     */
    public Historial(LocalDateTime fechaEntrada, Vehiculo vehiculo, Puesto puesto) {
        
        this.fechaEntrada = fechaEntrada;
        this.vehiculo = vehiculo;
        this.puesto = puesto;
    }   

    /**
     * Metodo que obtiene la fecha de entrada de un vehiculo.
     * 
     * @return
     */
    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * Metodo para obtener un vehiculo
     * 
     * @return
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Metodo para obtener un puesto
     * 
     * @return
     */
    public Puesto getPuesto() {
        return puesto;
    }

    public void calcularCosto(LocalDateTime fechaEntrada, Puesto puesto) {
        
    }

}
