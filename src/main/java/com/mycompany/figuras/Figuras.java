/*Blanca Da Costa Gomez Carcamo
 * 202310010031
 *Decripcion, poner en practica el concepto de herencia, donde creamos una superclase llamada forma
* y subclases donde llemas sus metodos como calcular area o volumen o en caso de la linea nos da su medida.
*Link para encontrar el documento del funcionamiento del codigo https://drive.google.com/file/d/1UnHNx7fB_rocbB-P68MIwcDdSi_IGf8S/view?usp=drive_link
*Link para encontrar video de explicacion del codigo https://youtu.be/W_v5BIDWnLs
 */

package com.mycompany.figuras;
import java.util.Scanner;
public class Figuras {
    public static void main(String[] args) {
        // Pedir datos para el círculo
        try (Scanner scanner = new Scanner(System.in)) {
            // Pedir datos para el círculo
            System.out.print("Ingrese el radio del círculo: ");
            double radio = scanner.nextDouble();
            circulo circulo = new circulo(radio);
            circulo.establecerColor("Rojo");
            circulo.dibujar();
            System.out.println("Radio del círculo: " + circulo.calcularRadio());
            System.out.println("Área del círculo: " + circulo.calcularArea());
            System.out.println(); // Línea en blanco para separar
            // Pedir datos para la línea
            System.out.print("Ingrese el largo de la línea: ");
            double largo = scanner.nextDouble();
            linea linea = new linea(largo);
            linea.establecerColor("Azul");
            linea.dibujar();
            System.out.println(); // Línea en blanco para separar
            // Pedir datos para el triángulo
            System.out.print("Ingrese la base del triángulo: ");
            double baseTriangulo = scanner.nextDouble();
            System.out.print("Ingrese la altura del triángulo: ");
            double alturaTriangulo = scanner.nextDouble();
            triangulo triangulo = new triangulo(baseTriangulo, alturaTriangulo);
            triangulo.establecerColor("Verde");
            triangulo.dibujar();
            System.out.println("Área del triángulo: " + triangulo.calcularArea());
            System.out.println(); // Línea en blanco para separar
            // Pedir datos para el cuadrados
            System.out.print("Ingrese el lado del cuadrado: ");
            double lado = scanner.nextDouble();
            cuadrado cuadrado = new cuadrado(lado);
            cuadrado.establecerColor("Amarillo");
            cuadrado.dibujar();
            System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
            System.out.println(); // Línea en blanco para separar
            
        }
    }
}
