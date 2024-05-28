package co.edu.uniquindio.poo;

/**
 * Clase de tipo enumeracion de un tipo de moto
 * 
 */
public enum TipoMoto {
    MOTO_CLASICA(TipoVehiculo.MOTO),
    MOTO_HIBRIDA(TipoVehiculo.MOTO);

    private final TipoVehiculo tipoVehiculo;

    /**
     * Metodo constructor de la clase tipo de moto
     * 
     * @param tipoVehiculo
     */
    private TipoMoto(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    /**
     * Metodo que obtiene un tipo de moto
     * 
     * @return
     */
    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }
}
