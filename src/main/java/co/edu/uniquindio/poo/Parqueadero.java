package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedList;

/**
 * Clase que agrupa la informacion de un parqueadero.
 * 
 * @author Samuel Ortiz, Amed Vargas
 * @since 2024 - 05
 * 
 */
public class Parqueadero {
    private final int maximoFilas;
    private final int maximoColumnas;
    
    private Collection <Vehiculo> vehiculos;
    private Hashtable <String, Puesto> puestos;
    private Collection <Propietario> propietarios;
    private Collection <Historial> historiales;

    /**
     * Metodo constructor de la clase parqueadero
     */
    public Parqueadero(int maximoFilas, int maximoColumnas){
        assert maximoFilas > 0: "El maximo de filas debe ser positivo";
        assert maximoColumnas > 0: "El maximo de columnas debe ser positivo";

        this.maximoFilas = maximoFilas;
        this.maximoColumnas = maximoColumnas;

        vehiculos = new LinkedList<>();
        puestos = new Hashtable<>();
        propietarios = new LinkedList<>();
        historiales = new LinkedList<>();
    }

    /**
     * Metodo para obtener un vehiculo de una coleccion de vehiculos
     * 
     * @return
     */
    public Collection<Vehiculo> getVehiculos(){
        return Collections.unmodifiableCollection(vehiculos);
    }

    /**
     * Metodo para obtener un propietario del parqueadero.
     * 
     * @return
     */
    public Collection<Propietario> getPropietarios(){
        return Collections.unmodifiableCollection(propietarios);
    }

    public Collection<Historial> getHistoriales(){
        return Collections.unmodifiableCollection(historiales);
    }


}
