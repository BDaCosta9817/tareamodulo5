
package com.mycompany.figuras;

public class linea extends forma {
    private final double largo;

    // Constructor para inicializar el largo
    public linea(double largo) {
        this.largo = largo;
    }

    // Sobrescribir el método dibujar
    @Override
    public void dibujar() {
        System.out.println("Dibujando una línea de color " + getColor() + ".");
    }
}