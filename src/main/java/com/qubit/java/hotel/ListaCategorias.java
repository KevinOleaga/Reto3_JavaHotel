package com.qubit.java.hotel;

import java.util.*;
import java.io.*;

public class ListaCategorias extends LinkedList implements Enumeration, Serializable {
    
    public ListaCategorias() {
    }//Constructor

    //Devuelve el siguiente elemento de la lista (INTERFACE).
    public Object nextElement() {
        return null;
    }//nextElement
    
    //Devuelve si la lista tiene m�s elementos (INTERFACE).
    public boolean hasMoreElements() {
        return false;
    }//hasMoreElements
    
}//ListaPrecios