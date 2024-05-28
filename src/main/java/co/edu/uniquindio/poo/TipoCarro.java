package co.edu.uniquindio.poo;

/**
 * Clase de tipo enumeracion de tipos de carros
 * 
 */
public enum TipoCarro {
    CAMIONETA(TipoVehiculo.CARRO),
    DEPORTIVO(TipoVehiculo.CARRO);

    private final TipoVehiculo tipoVehiculo;

    /**
     * Metodo constructor de la clase tipo de carro
     * 
     * @param tipoVehiculo
     */
    private TipoCarro(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    /**
     * Metodo que obtiene un tipo de carro
     * 
     * @return
     */
    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }
}
