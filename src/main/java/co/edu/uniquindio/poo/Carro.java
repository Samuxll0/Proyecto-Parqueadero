package co.edu.uniquindio.poo;

/**
 * Clase que agrupa la informacion de un carro en un estacionamiento.
 * 
 */
public class Carro extends Vehiculo {

    private TipoCarro tipoCarro;

    /**
     * Metodo constructor de la clase carro.
     * 
     * @param tipoCarro
     * @param placa
     * @param modelo
     * @param propietario
     */
    public Carro(TipoCarro tipoCarro, String placa, int modelo, Propietario propietario) {
        super(placa, modelo, propietario);

        this.tipoCarro = tipoCarro;

    }

    /**
     * Metodo que obtiene el tipo de carro
     * 
     * @return
     */
    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    /**
     * Metodo que permite actualizar el tipo de carro
     * 
     * @param tipoCarro
     */
    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    /**
     * Metodo que calcula la tarifa de estacionamiento basado en el tipo de carro y
     * horas estacionadas.
     * 
     */
    @Override
    public double calcularTarifa() {
        return getTarifaPorHora() * getHorasEstacionadas();
    }

    /**
     * Metodo que obtiene la tarifa por hora basada en el tipo de carro
     * 
     */
    @Override
    public double getTarifaPorHora() {
        switch (tipoCarro) {
            case CAMIONETA:
                return 15.0;
            case DEPORTIVO:
                return 20.0;

            default:
                return 10.0;
        }
    }
}
