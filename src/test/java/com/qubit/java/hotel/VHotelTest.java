package com.qubit.java.hotel;

import java.util.Date;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin Oleaga
 * @version 1.0
 */
public class VHotelTest {

    VHotel instance = new VHotel();
    Hotel instance2 = new Hotel();

    public VHotelTest() {
        System.out.println("VHotel.java");
    }

    /*
     * Este código es una prueba JUnit que prueba el método tomarCliente().
     * Primero crea un nuevo objeto Cliente con los parámetros dados y luego crea un
     * nuevo cliente mediante el metodo nuevoCliente().
     * Luego llama al método tomarCliente() con el parámetro numeroHabitacion y lo
     * asigna a un nuevo objeto Cliente, c2. Finalmente, afirma que c2 no es nulo.
     */

    @org.junit.Test
    public void testTomarCliente() {
        System.out.println("  - Testing > tomarCliente()");
        int numeroHabitacion = 101;

        Date myDate = new Date();
        Cliente c1 = new Cliente("1-1234-1234", "Kevin", "Oleaga", "Garcia", "San Jose", myDate, myDate, 101);

        // ADD NEW CLIENT
        instance2.nuevoCliente(c1.dniCliente, c1.nombreCliente, c1.apellido1Cliente, c1.apellido1Cliente,
                c1.direccionCliente, c1.numeroHabitacion, c1.fechaEntrada, c1.fechaSalida);
        System.out.println("    - Cliente agregado:");
        System.out.println("        - DNI: " + c1.dniCliente + " / Nombre: " + c1.nombreCliente + " / Apellido1: "
                + c1.apellido1Cliente + " / Apellido2: " + c1.apellido2Cliente + " / Direccion: " + c1.direccionCliente
                + " / # Habitacion: " + c1.numeroHabitacion + " / FechaEntrada: " + c1.fechaEntrada + " / FechaSalida: "
                + c1.fechaSalida);

        // GET CLIENT
        Cliente c2 = instance.tomarCliente(numeroHabitacion);

        assertNotNull("El objeto cliente esta vacio", c2);
    }
}
