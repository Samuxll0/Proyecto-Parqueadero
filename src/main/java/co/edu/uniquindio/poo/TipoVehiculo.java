package co.edu.uniquindio.poo;

/**
 * Clase de tipo enumeración con la tarifa asociada a cada vehiculo.
 * 
 * @author Samuel Ortiz, Amed Vargas
 * @since 2024 - 05
 * 
 */
public enum TipoVehiculo {
    // Cada vehiculo tiene su tarifa.

    CARRO(3500),
    MOTOHIBRIDA(2000),
    MOTOCLASICA(1500);

    private final int tarifa;

    /**
     * Metodo constructor de la clase tipo enumeración.
     * 
     * @param tarifa tarifa de cada vehiculo.
     */
    private TipoVehiculo(int tarifa) {
        this.tarifa = tarifa;
    }

    /**
     * Metodo para obtener la tarifa de cada vehiculo.
     * 
     * @return
     */
    public int getTarifa() {
        return tarifa;
    }

}
