package co.edu.uniquindio.poo;

public enum TipoVehiculo {
    CARRO(3500),
    MOTOHIBRIDA(2000),
    MOTOCLASICA(1500);

    private final int tarifa;

    private TipoVehiculo(int tarifa){
        this.tarifa = tarifa;
    }

    public int getTarifa() {
        return tarifa;
    }

    
        
}
