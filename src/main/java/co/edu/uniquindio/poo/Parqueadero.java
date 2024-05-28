package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase que agrupa la informacion de un parqueadero.
 * 
 */
public class Parqueadero {
    private final int cantidadPuestos;
    private final Collection<Moto> motos;
    private final Collection<Carro> carros;
    private final Puesto[][] puestos;
    private final LinkedList<Registro> historialRegistros = new LinkedList<>();

    /**
     * Metodo constructor de la clase parqueadero
     * 
     * @param columnas
     * @param filas
     */
    public Parqueadero(int columnas, int filas) {
        assert columnas > 0 : "El número de columnas debe ser mayor a cero";
        assert filas > 0 : "El número de filas debe ser mayor a cero";

        this.cantidadPuestos = columnas * filas;

        motos = new LinkedList<>();
        carros = new LinkedList<>();

        puestos = new Puesto[columnas][filas];
        for (int posicionI = 0; posicionI < columnas; posicionI++) {
            for (int posicionJ = 0; posicionJ < filas; posicionJ++) {
                puestos[posicionI][posicionJ] = new Puesto(posicionI, posicionJ, null, columnas, filas);
            }
        }
    }

    /**
     * Metodo para obtener la cantidad de puestos del parqueadero
     * 
     * @return
     */
    public int getCantidadPuestos() {
        return cantidadPuestos;
    }

    /**
     * Metodo para verificar la disponibilidad de un puesto en base a su posicion
     * 
     * @param posicionI
     * @param posicionJ
     * @return
     */
    public boolean verificarDisponibilidad(int posicionI, int posicionJ) {
        if (posicionI < 0 || posicionI >= puestos.length || posicionJ < 0 || posicionJ >= puestos[0].length) {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de los límites del arreglo.");
        }
        return !puestos[posicionI][posicionJ].estaOcupado();
    }

    /**
     * Metodo para ocupar una posicion especifica con un vehiculo
     * 
     * @param posicionI
     * @param posicionJ
     * @param vehiculo
     */
    public void ocuparPuestos(int posicionI, int posicionJ, Vehiculo vehiculo) {
        if (verificarDisponibilidad(posicionI, posicionJ)) {
            LocalDateTime fechaEntrada = LocalDateTime.now(); // Obtener la fecha y hora actual

            puestos[posicionI][posicionJ].ocuparPuesto(vehiculo);

            Registro registro = new Registro(vehiculo, fechaEntrada, null); // Pasar fecha de entrada

            historialRegistros.add(registro);

            vehiculo.setRegistro(registro); // Asociar el registro con el vehículo
        } else {
            System.out.println("El puesto ya está ocupado.");
        }
    }

    /**
     * Metodo que busca un puesto disponible y parquea un vehiculo
     * 
     * @param vehiculo
     * @return
     */
    public boolean buscarYParquearVehiculo(Vehiculo vehiculo) {
        for (int posicionI = 0; posicionI < puestos.length; posicionI++) {
            for (int posicionJ = 0; posicionJ < puestos[0].length; posicionJ++) {
                if (verificarDisponibilidad(posicionI, posicionJ)) {
                    ocuparPuestos(posicionI, posicionJ, vehiculo);
                    return true;
                }
            }
        }
        System.out.println("No hay puesto disponible");
        return false;
    }

    /**
     * Metodo que libera un puesto en una posicion especifica.
     * 
     * @param posicionI
     * @param posicionJ
     */
    public void liberarPuesto(int posicionI, int posicionJ) {
        if (posicionI < 0 || posicionI >= puestos.length || posicionJ < 0 || posicionJ >= puestos[0].length) {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de los límites del arreglo.");
        }
        Puesto puesto = puestos[posicionI][posicionJ];
        if (puesto.estaOcupado()) {
            Vehiculo vehiculo = puesto.getVehiculo();

            LocalDateTime fechaSalida = LocalDateTime.now();

            // Buscar el registro correspondiente en el historial de registros
            Registro registro = null;
            for (Registro reg : historialRegistros) {
                if (reg.getVehiculo().equals(vehiculo) && reg.getFechaSalida() == null) {
                    registro = reg;
                    break;
                }
            }

            if (registro != null) {
                registro.setFechaSalida(fechaSalida);
                puesto.liberarPuesto();
            } else {
                System.err.println("No se encontró el registro correspondiente para el vehículo.");
            }
        }
    }

    /**
     * Metodo que obtiene el nombre del propietario del vehiculo en un puesto
     * especifico
     * 
     * @param posicionI
     * @param posicionJ
     * @return
     */
    public String obtenerPropietario(int posicionI, int posicionJ) {
        if (posicionI < 0 || posicionI >= puestos.length || posicionJ < 0 || posicionJ >= puestos[0].length) {
            return "Índice fuera de los límites del arreglo.";
        }
        if (puestos[posicionI][posicionJ].estaOcupado()) {
            return puestos[posicionI][posicionJ].getVehiculo().getPropietario().getNombre();
        } else {
            return "El puesto está vació.";
        }
    }

    /**
     * Metodo que agrega una moto a la coleccion de motos
     * 
     * @param moto
     */
    public void agregarMoto(Moto moto) {
        assert !validarPlacaMotoExiste(moto.getPlaca()) : "La placa ya existe";
        motos.add(moto);
    }

    /**
     * Metodo que obtiene una moto por su placa
     * 
     * @param placa
     * @return
     */
    public Moto getMoto(String placa) {
        Moto motoInteres = null;
        for (Moto moto : motos) {
            if (moto.getPlaca().equals(placa)) {
                motoInteres = moto;
            }
        }
        return motoInteres;
    }

    /**
     * Metodo que obtiene una coleccion no modificable de todas las motos en el
     * parqueadero
     * 
     * @return
     */
    public Collection<Moto> getMotos() {
        return Collections.unmodifiableCollection(motos);
    }

    /**
     * Metodo que agrega un carro a la coleccion de carros
     * 
     * @param carro
     */
    public void agregarCarro(Carro carro) {
        assert !validarPlacaCarroExiste(carro.getPlaca()) : "La placa ya existe";
        carros.add(carro);
    }

    /**
     * Metodo que obtiene un carro por su placa
     * 
     * @param placa
     * @return
     */
    public Carro getCarro(String placa) {
        for (Carro carro : carros) {
            if (carro.getPlaca().equals(placa)) {
                return carro;
            }
        }
        return null;
    }

    /**
     * Metodo que obtiene una coleccion no modificable de los carros en el
     * parqueadero
     * 
     * @return
     */
    public Collection<Carro> getCarros() {
        return Collections.unmodifiableCollection(carros);
    }

    /**
     * Metodo que valida si la placa de una moto existe en el parqueadero
     * 
     * @param placa
     * @return
     */
    private boolean validarPlacaMotoExiste(String placa) {
        for (Moto moto : motos) {
            if (moto.getPlaca().equals(placa)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo que valida si la placa de un carro existe en el parqueadero
     * 
     * @param placa
     * @return
     */
    private boolean validarPlacaCarroExiste(String placa) {
        for (Carro carro : carros) {
            if (carro.getPlaca().equals(placa)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo que obtiene el historial de registros de vehiculos en el parqueadero
     * 
     * @return
     */
    public LinkedList<Registro> getHistorialRegistros() {
        return historialRegistros;
    }

    /**
     * Metodo que obtiene la matriz de puestos del parqueadero
     * 
     * @return
     */
    public Puesto[][] getPuestos() {
        return puestos;
    }

    /**
     * Metodo que genera un reporte diario de los ingresos del parqueadero en base a
     * los vehiculos
     * 
     * @param fecha
     * @return
     */
    public Map<TipoVehiculo, Double> generarReporteDiario(LocalDate fecha) {
        Map<TipoVehiculo, Double> reporteDiario = inicializarReporte();

        for (Registro registro : historialRegistros) {
            if (esFechaIgual(registro, fecha)) {
                actualizarReporte(registro, reporteDiario);
            }
        }
        return reporteDiario;
    }

    /**
     * Metodo que genera un reporte mensual de los ingresos del parqueadero en base
     * a los vehiculos
     * 
     * @param mes
     * @param año
     * @return
     */
    public Map<TipoVehiculo, Double> generarReporteMensual(int mes, int año) {
        Map<TipoVehiculo, Double> reporteMensual = inicializarReporte();

        for (Registro registro : historialRegistros) {
            if (esMesYAñoIguales(registro, mes, año)) {
                actualizarReporte(registro, reporteMensual);
            }
        }
        return reporteMensual;
    }

    /**
     * Metodo que inicia un reporte con todos los vehiculos y valores iniciales en
     * cero
     * 
     * @return
     */
    private Map<TipoVehiculo, Double> inicializarReporte() {

        Map<TipoVehiculo, Double> reporte = new HashMap<>();

        for (TipoCarro tipoCarro : TipoCarro.values()) {
            reporte.put(tipoCarro.getTipoVehiculo(), 0.0);
        }

        for (TipoMoto tipoMoto : TipoMoto.values()) {
            reporte.put(tipoMoto.getTipoVehiculo(), 0.0);
        }
        return reporte;
    }

    /**
     * Metodo que verifica si la fecha de entrada del registro es igual a una fecha
     * dada
     * 
     * @param registro
     * @param fecha
     * @return
     */
    private boolean esFechaIgual(Registro registro, LocalDate fecha) {

        return registro.getFechaEntrada().toLocalDate().equals(fecha);
    }

    /**
     * Metodo que verifica si el mes y el año del registro son iguales a los dados.
     * 
     * @param registro
     * @param mes
     * @param año
     * @return
     */
    private boolean esMesYAñoIguales(Registro registro, int mes, int año) {

        LocalDate fechaEntrada = registro.getFechaEntrada().toLocalDate();

        return fechaEntrada.getMonthValue() == mes && fechaEntrada.getYear() == año;
    }

    /**
     * Metodo que actualiza el reporte con el costo del registro del vehiculo.
     * 
     * @param registro
     * @param reporte
     */
    private void actualizarReporte(Registro registro, Map<TipoVehiculo, Double> reporte) {
        double costo = registro.calcularCosto();

        Vehiculo vehiculo = registro.getVehiculo();

        if (vehiculo instanceof Moto) {
            reporte.compute(TipoVehiculo.MOTO, (tipo, acumulado) -> (acumulado == null) ? costo : acumulado + costo);
        } else if (vehiculo instanceof Carro) {
            TipoCarro tipoCarro = ((Carro) vehiculo).getTipoCarro();

            if (tipoCarro != null) {
                reporte.compute(tipoCarro.getTipoVehiculo(),
                        (tipo, acumulado) -> (acumulado == null) ? costo : acumulado + costo);
            } else {
                System.err.println("Tipo de vehículo desconocido: " + vehiculo.getClass().getSimpleName());
            }
        } else {
            System.err.println("Tipo de vehículo desconocido: " + vehiculo.getClass().getSimpleName());
        }
    }
}
