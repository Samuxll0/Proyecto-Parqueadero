package co.edu.uniquindio.poo;

public class Vehiculo {
    private final String placa;
    private final String modelo;

    public Vehiculo(String placa, String modelo){
        
        assert modelo != null && !modelo.isBlank(): "El modelo no puede ser nulo";
        assert placa != null && !placa.isBlank(): "La placa no puede ser nula";

        this.modelo = modelo;
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

       
}
