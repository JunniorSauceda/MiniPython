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
public class DatosDat implements Serializable {
    private String Metodo;
    private Color color;
    private Font font;

    public DatosDat(String Metodo, Color color, Font font) {
        this.Metodo = Metodo;
        this.color = color;
        this.font = font;
    }

    public String getMetodo() {
        return Metodo;
    }

    public void setMetodo(String Metodo) {
        this.Metodo = Metodo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }
}
