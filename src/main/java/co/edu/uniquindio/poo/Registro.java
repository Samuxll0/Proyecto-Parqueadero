package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

/**
 * Clase que agrupa la informacion de un registro
 * 
 */
public class Registro {

    private Vehiculo vehiculo;
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaSalida;

    /**
     * Metodo constructor de la clase registro con fecha de salida
     * 
     * @param vehiculo
     * @param fechaEntrada
     * @param fechaSalida
     */
    public Registro(Vehiculo vehiculo, LocalDateTime fechaEntrada, LocalDateTime fechaSalida) {

        this.vehiculo = vehiculo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    /**
     * Metodo constructor de la clase registro sin fecha de salida
     * 
     * @param vehiculo
     * @param fechaEntrada
     */
    public Registro(Vehiculo vehiculo, LocalDateTime fechaEntrada) {

        this.vehiculo = vehiculo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = null;
    }

    /**
     * Metodo que obtiene una fecha de entrada
     * 
     * @return
     */
    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * Metodo que obtiene una fecha de salida
     * 
     * @return
     */
    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Metodo que obtiene un vehiculo
     * 
     * @return
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Metodo que actualiza la fecha de salida
     * 
     * @param fechaSalida
     */
    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * Metodo que calcula el costo de un vehiculo
     * 
     * @return
     */
    public double calcularCosto() {
        return CalculadorCosto.calcularCosto(fechaEntrada, fechaSalida, vehiculo.getTarifaPorHora());
    }
}
