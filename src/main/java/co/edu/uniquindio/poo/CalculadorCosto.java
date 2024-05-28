package co.edu.uniquindio.poo;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * clase que genera el costo de un vehiculo en el estacionamiento
 * 
 */
public class CalculadorCosto {

    /**
     * Metodo que calcula el costo de estacionamiento basado en el tiempo
     * transcurrido entre una fecha y otra, y una tarifa por hora.
     * 
     * @param fechaEntrada
     * @param fechaSalida
     * @param tarifaPorHora
     * @return
     */
    public static double calcularCosto(LocalDateTime fechaEntrada, LocalDateTime fechaSalida, double tarifaPorHora) {
        assert fechaSalida != null : "El vehículo aún está estacionado, la fecha de salida es null.";

        Duration duracion = Duration.between(fechaEntrada, fechaSalida);

        long horasEstacionadas = duracion.toHours();

        if (duracion.toMinutes() % 60 != 0) {
            horasEstacionadas++;
        }

        return horasEstacionadas * tarifaPorHora;
    }
}
