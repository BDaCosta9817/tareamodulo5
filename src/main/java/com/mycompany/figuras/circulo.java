
package com.mycompany.figuras;
public class circulo extends forma {
    private final double radio;

    // Constructor para inicializar el radio
    public circulo(double radio) {
        this.radio = radio;
    }

    // Método específico para calcular el área
    public double calcularArea() {
        return Math.PI * radio * radio; // Fórmula para el área del círculo
    }

    // Sobrescribir el método dibujar
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo de color " + getColor() + ".");
    }

    // Método para obtener el radio
    public double calcularRadio() {
        return radio;
    }
}