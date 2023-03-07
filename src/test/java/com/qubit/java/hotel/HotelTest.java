package com.qubit.java.hotel;

import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Kevin Oleaga
 * @version 1.0
 */
public class HotelTest {

    Hotel instance = new Hotel();

    public HotelTest() {
        System.out.println("HotelTest.java");
    }

    /*
     * Este código es una prueba unitaria que prueba el método tomarCategoria().
     * Crea un nuevo objeto Categoria con los parámetros dados, luego llama el
     * metodo nuevaCategoria() con los parametros del objeto c1 y crea una nueva
     * categoria.
     * Finalmente, verifica si el objeto Categoria recuperado es igual al que se
     * agregó mediante el metodo tomarCategoria().
     */
    @Test
    public void testTomarCategoria() {
        System.out.println("  - Testing > tomarCategoria()");
        Categoria c1 = new Categoria("Premium", 500, "Obtiene servicio premium");

        // ADD CATEGORY
        instance.nuevaCategoria(c1.idCategoria, c1.precioCategoria, c1.descripcionCategoria);
        System.out.println("    - Categoria agregada:");
        System.out.println("        - Nombre: " + c1.idCategoria + " / Precio: " + c1.precioCategoria
                + " / Descripcion: " + c1.descripcionCategoria);

        // GET CATEGORY
        Categoria c2 = instance.tomarCategoria(0);
        System.out.println("    - Categoria obtenida:");
        System.out.println("        - Nombre: " + c2.idCategoria + " / Precio: " + c2.precioCategoria
                + " / Descripcion: " + c2.descripcionCategoria);

        assertEquals("La categoria insertada es distinta a la consultada / ", c1.idCategoria, c2.idCategoria);
    }

    /*
     * Este código es una prueba para el método tomarCliente().
     * Primero crea un nuevo objeto Cliente con algunos parámetros y lo agrega a la
     * instancia de la clase.
     * Luego, agrega un nuevo cliente mediante el metodo nuevoCliente()
     * Finalmente obtiene el cliente mediante el metodo tomarCliente() y lo almacena
     * en la instancia c2.
     * Por ultimo, comprueba si el Cliente insertado es igual al recuperado.
     */

    @Test
    public void testTomarCliente() {
        System.out.println("  - Testing > tomarCliente()");
        Date myDate = new Date();
        Cliente c1 = new Cliente("1-1234-1234", "Kevin", "Oleaga", "Garcia", "San Jose", myDate, myDate, 101);

        // ADD NEW CLIENT
        instance.nuevoCliente(c1.dniCliente, c1.nombreCliente, c1.apellido1Cliente, c1.apellido1Cliente,
                c1.direccionCliente, c1.numeroHabitacion, c1.fechaEntrada, c1.fechaSalida);
        System.out.println("    - Cliente agregado:");
        System.out.println("        - DNI: " + c1.dniCliente + " / Nombre: " + c1.nombreCliente + " / Apellido1: "
                + c1.apellido1Cliente + " / Apellido2: " + c1.apellido2Cliente + " / Direccion: " + c1.direccionCliente
                + " / # Habitacion: " + c1.numeroHabitacion + " / FechaEntrada: " + c1.fechaEntrada + " / FechaSalida: "
                + c1.fechaSalida);

        // GET CLIENT
        Cliente c2 = instance.tomarCliente(0);
        System.out.println("    - Cliente obtenido:");
        System.out.println("        - DNI: " + c2.dniCliente + " / Nombre: " + c2.nombreCliente + " / Apellido1: "
                + c2.apellido1Cliente + " / Apellido2: " + c2.apellido2Cliente + " / Direccion: " + c2.direccionCliente
                + " / # Habitacion: " + c2.numeroHabitacion + " / FechaEntrada: " + c2.fechaEntrada + " / FechaSalida: "
                + c2.fechaSalida);

        assertEquals("El cliente insertado es distinto al consultado / ", c1.dniCliente, c2.dniCliente);
    }
}
