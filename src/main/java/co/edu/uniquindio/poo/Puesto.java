package co.edu.uniquindio.poo;

/**
 * Clase que agrupa la informacion de unos puestos
 * @author Samuel Ortiz, Amed Vargas
 * @since 2024 - 05
 * 
 */
public class Puesto {
    private final String numeroPuestos;
    private final String posicionX;
    private final String posicionY;

    /**
     * Constructor de la clase puestos
     * 
     * @param numeroPuestos
     * @param posicionX
     * @param posicionY
     */
    public Puesto(String numeroPuestos, String posicionX, String posicionY){

        assert numeroPuestos != null && !numeroPuestos.isBlank(): "El numero de puestos no puede ser nulo";
        assert posicionX != null && !posicionX.isBlank(): "La posicion X no puede ser nula";
        assert posicionY != null && !posicionY.isBlank(): "La posicion Y no puede ser nula";
        
        this.numeroPuestos = numeroPuestos;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    /**
     * Clase para obtener un numero de puestos
     * 
     * @return
     */
    public String getNumeroPuestos() {
        return numeroPuestos;
    }

    /**
     * Clase para obtener una posición X
     * 
     * @return
     */
    public String getPosicionX() {
        return posicionX;
    }

    /**
     * Clase para obtener una posicion Y
     * 
     * @return
     */
    public String getPosicionY() {
        return posicionY;
    }

}
