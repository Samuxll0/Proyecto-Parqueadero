package co.edu.uniquindio.poo;

/**
 * Clase que agrupa los datos de una moto
 * 
 * @author Samuel Ortiz, Amed Vargas
 * @since 2024 - 05
 * 
 */
public class Moto extends Vehiculo {
    private double velocidadMaxima;

    /**
     * Metodo constructor de la clase moto
     * 
     * @param placa
     * @param modelo
     * @param propietario
     * @param velocidadMaxima
     * 
     */
    public Moto(String placa, String modelo, Propietario propietario, double velocidadMaxima) {
        super(placa, modelo, propietario);

        assert velocidadMaxima > 0.0 : "La velocidad no puede ser negativa";
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * Metodo para obtener la velocidad maxima de una moto
     * 
     * @return
     */
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

}
