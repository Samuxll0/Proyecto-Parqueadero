package co.edu.uniquindio.poo;

public record Propietario(String nombre, String apellido) {
    
    public Propietario{
        assert nombre != null: "El nombre no puede ser nulo";
        assert apellido != null: "El apellido no puede ser nulo";
    }
}
