/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;

/**
 *
 * @author Junnior Sauceda
 */
public class DatosAbstrac implements Serializable{
    private String Metodos,Nombre;
    private Color color;
    private Font f;

    public DatosAbstrac(String Metodos, String Nombre, Color color, Font f) {
        this.Metodos = Metodos;
        this.Nombre = Nombre;
        this.color = color;
        this.f = f;
    }

    public String getMetodos() {
        return Metodos;
    }

    public void setMetodos(String Metodos) {
        this.Metodos = Metodos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Font getF() {
        return f;
    }

    public void setF(Font f) {
        this.f = f;
    }

    @Override
    public String toString() {
        return "DatosAbstrac{" + "Metodos=" + Metodos + ", Nombre=" + Nombre + ", color=" + color + ", f=" + f + '}';
    }
    
    
}
