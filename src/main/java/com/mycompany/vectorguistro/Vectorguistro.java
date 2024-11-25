
package com.mycompany.vectorguistro;

import productos.Productos;


public class Vectorguistro {

    public static void main(String[] args) {
        Productos[] obcarros = new Productos[3];
        obcarros [0] = new Productos(" Mazda", "negro", 13000, 2003);
        obcarros [1] = new Productos(" Toyota", "gris", 12300, 2013);
        obcarros [2] = new Productos(" Chevrole", "rojo", 14000, 2012);
        
        for (Productos salidacarro : obcarros) {
            System.out.println(" Productos : "+salidacarro);
        }
        
        Productos nuevocarro = new Productos("Nizzan", "Azul", 13000*0.12, 2024);
        
       obcarros [0] = nuevocarro;
        for (Productos ncar : obcarros) {
            System.out.println(" nuevo: "+ncar);
            System.out.println(" hola  perros");
        }
    }
}
