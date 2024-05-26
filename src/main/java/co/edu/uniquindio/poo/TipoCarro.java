package co.edu.uniquindio.poo;

public enum TipoCarro {
    CAMIONETA(TipoVehiculo.CARRO), 
    DEPORTIVO(TipoVehiculo.CARRO);

    private final TipoVehiculo tipoVehiculo;

    private TipoCarro(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }
}
