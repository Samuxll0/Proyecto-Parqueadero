package co.edu.uniquindio.poo;

/**
 * Clase que agrupa la informacion de una moto en un estacionamiento.
 * 
 */
public class Moto extends Vehiculo {

    private int velocidadMaxima;
    private TipoMoto tipoMoto;

    /**
     * Metodo constructor de la clase moto
     * 
     * @param placa
     * @param modelo
     * @param propietario
     * @param velocidadMaxima
     * @param tipoMoto
     */
    public Moto(String placa, int modelo, Propietario propietario, int velocidadMaxima, TipoMoto tipoMoto) {
        super(placa, modelo, propietario);

        assert velocidadMaxima > 0 : "La velocidad máxima debe ser mayor a 0 (cero)";

        this.velocidadMaxima = velocidadMaxima;
        this.tipoMoto = tipoMoto;
    }

    /**
     * Metodo para obtener la velocidad maxima de una moto.
     * 
     * @return
     */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * Metodo para actualizar la velocidad maxima de una moto
     * 
     * @param velocidadMaxima
     */
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * Metodo para obtener el tipo de moto
     * 
     * @return
     */
    public TipoMoto getTipoMoto() {
        return tipoMoto;
    }

    /**
     * Metodo para actualizar el tipo de moto
     * 
     * @param tipoMoto
     */
    public void setTipoMoto(TipoMoto tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    /**
     * Metodo para calcular la tarifa de estacionamiento basado en la velocidad
     * maxima y las horas estacionadas
     * 
     * 
     */
    @Override
    public double calcularTarifa() {
        return getTarifaPorHora() * getHorasEstacionadas();
    }

    /**
     * Metodo para obtener la tarifa por hora basado en la velocidad maxima de la
     * moto
     * 
     */
    @Override
    public double getTarifaPorHora() {
        if (velocidadMaxima > 0 && velocidadMaxima <= 100) {
            return 5.0;
        } else if (velocidadMaxima > 100 && velocidadMaxima <= 150) {
            return 7.0;
        } else {
            return 10.0;
        }
    }
}
