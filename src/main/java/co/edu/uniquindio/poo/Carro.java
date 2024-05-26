package co.edu.uniquindio.poo;

public class Carro extends Vehiculo {

    private TipoCarro tipoCarro;

    public Carro(TipoCarro tipoCarro, String placa, int modelo, Propietario propietario) {
        super(placa, modelo, propietario);

        this.tipoCarro = tipoCarro;
      
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    @Override
    public double calcularTarifa() {
        return getTarifaPorHora() * getHorasEstacionadas();
    }

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
