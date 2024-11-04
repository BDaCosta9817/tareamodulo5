
package com.mycompany.figuras;

public class triangulo extends forma {
    private final double base;
    private final double altura;

    // Constructor para inicializar la base y altura
    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método específico para calcular el área
    public double calcularArea() {
        return 0.5 * base * altura; // Fórmula para el área del triángulo
    }

    // Sobrescribir el método dibujar
    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo de color " + getColor() + ".");
    }
}