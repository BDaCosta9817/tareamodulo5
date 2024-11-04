
package com.mycompany.figuras;

public class cuadrado extends forma {
    private final double lado;

    // Constructor para inicializar el lado
    public cuadrado(double lado) {
        this.lado = lado;
    }

    // Método específico para calcular el área
    public double calcularArea() {
        return lado * lado; // Fórmula para el área del cuadrado
    }

    // Sobrescribir el método dibujar
    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado de color " + getColor() + ".");
    }
}