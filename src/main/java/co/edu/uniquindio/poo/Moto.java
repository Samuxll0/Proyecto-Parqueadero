package co.edu.uniquindio.poo;

public class Moto extends Vehiculo{
    private double velocidadMaxima;

    public Moto(String placa, String modelo, double velocidadMaxima){
        super (placa, modelo);

        assert velocidadMaxima > 0.0: "La velocidad no puede ser negativa";
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
      
}
