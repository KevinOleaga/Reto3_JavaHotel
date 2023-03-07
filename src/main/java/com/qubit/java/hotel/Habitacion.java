package com.qubit.java.hotel;

//Clase Habitacion para almacenar los datos de cada habitaci�n.
//Las habitaciones se almacenan en ListaHabitaciones.

public class Habitacion {
    
    //N�mero de la habitaci�n.
    int numeroHabitacion;
    //�ndice de la categor�a de la habitaci�n en la lista de categor�as.
    int categoriaHabitacion;
    //Precio de la habitaci�n.
    int precioHabitacion;
    
    public Habitacion() {
        this.numeroHabitacion    = 0;
        this.categoriaHabitacion = 0;
        this.precioHabitacion    = 0;
    }//Constructor
    
}//Habitacion