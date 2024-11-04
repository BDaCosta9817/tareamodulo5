
package com.mycompany.figuras;
public abstract class forma {
    private String color;

    // Método establecercolor
    public void establecerColor(String color) {
        this.color = color;
    }

    // Método para color
    public String getColor() {
        return color;
    }

    // Método para dibujar
    public abstract void dibujar();
}