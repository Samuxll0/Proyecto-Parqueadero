package co.edu.uniquindio.poo;

/**
 * Clase que crea los puestos de un parqueadero
 * 
 */
public class Puesto {
    private int posicionI;
    private int posicionJ;
    private Vehiculo vehiculo;

    /**
     * Metodo constructor de la clase puesto
     * 
     * @param posicionI
     * @param posicionJ
     * @param vehiculo
     * @param columnas
     * @param filas
     */
    public Puesto(int posicionI, int posicionJ, Vehiculo vehiculo, int columnas, int filas) {
        assert posicionI >= 0 && posicionI < columnas : "PosiciónI debe estar dentro de los límites (0 a columnas-1)";
        assert posicionJ >= 0 && posicionJ < filas : "PosiciónJ debe estar dentro de los límites (0 a filas-1)";

        this.posicionI = posicionI;
        this.posicionJ = posicionJ;
        this.vehiculo = vehiculo;
    }

    /**
     * Metodo que obtiene una posicion I
     * 
     * @return
     */
    public int getPosicionI() {
        return posicionI;
    }

    /**
     * Metodo que actualiza una posicion I
     * 
     * @param posicionI
     */
    public void setPosicionI(int posicionI) {
        this.posicionI = posicionI;
    }

    /**
     * Metodo que obtiene una posicion J
     * 
     * @return
     */
    public int getPosicionJ() {
        return posicionJ;
    }

    /**
     * Metodo que actualiza una posicion J
     * 
     * @param posicionJ
     */
    public void setPosicionJ(int posicionJ) {
        this.posicionJ = posicionJ;
    }

    /**
     * Metodo que verifica si un puesto esta ocupado
     * 
     * @return
     */
    public boolean estaOcupado() {
        return vehiculo != null;
    }

    /**
     * Metodo que agrega un vehiculo a un puesto libre
     * 
     * @param vehiculo
     */
    public void ocuparPuesto(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Metodo que libera un puesto
     * 
     */
    public void liberarPuesto() {
        this.vehiculo = null;
    }

    /**
     * Metodo que obtiene un vehiculo
     * 
     * @return
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
