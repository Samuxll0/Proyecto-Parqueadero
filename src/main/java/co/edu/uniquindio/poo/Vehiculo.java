package co.edu.uniquindio.poo;

/**
 * Clase abstracta que agrupa la informacion de un vehiculo
 * 
 */
public abstract class Vehiculo {
    private String placa;
    private int modelo;
    private Propietario propietario;
    private int horasEstacionadas;
    private double tarifaPorHora;
    private Registro registro;

    /**
     * Metodo constructor de la clase vehiculo
     * 
     * @param placa
     * @param modelo
     * @param propietario
     */
    public Vehiculo(String placa, int modelo, Propietario propietario) {
        assert placa != null && !placa.isBlank() : "La placa debe ser diferente de null";
        assert modelo > 0 : "El modelo del vehiculo debe ser mayor a 0 (cero)";
        assert propietario != null : "El propietario debe ser diferente de null";

        this.placa = placa;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    /**
     * Metodo que obtiene una placa de un vehiculo
     * 
     * @return
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Metodo que actualiza una placa de un vehiculo
     * 
     * @param placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Metodo que obtiene el modelo de un vehiculo
     * 
     * @return
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * Metodo que actualiza el modelo de un vehiculo
     * 
     * @param modelo
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo que obtiene el propietario del vehiculo
     * 
     * @return
     */
    public Propietario getPropietario() {
        return propietario;
    }

    /**
     * Metodo que actualiza el propietario de un vehiculo
     * 
     * @param propietario
     */
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    /**
     * Metodo que obtiene las horas estacionadas de un vehiculo
     * 
     * @return
     */
    public int getHorasEstacionadas() {
        return horasEstacionadas;
    }

    /**
     * Metodo que actualiza las horas estacionadas de un vehiculo
     * 
     * @param horasEstacionadas
     */
    public void setHorasEstacionadas(int horasEstacionadas) {
        this.horasEstacionadas = horasEstacionadas;
    }

    /**
     * Metodo que obtiene una tarifa por hora de un vehiculo
     * 
     * @return
     */
    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    /**
     * Metodo que actualiza una tarifa por hora de un vehiculo
     * 
     * @param tarifaPorHora
     */
    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    /**
     * Metodo que obtiene el registro de un vehiculo
     * 
     * @return
     */
    public Registro getRegistro() {
        return registro;
    }

    /**
     * Metodo que actualiza el registro de un vehiculo
     * 
     * @param registro
     */
    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    /**
     * Metodo abstracto para calcular la tarifa de un vehiculo
     * 
     * @return
     */
    public abstract double calcularTarifa();
}
