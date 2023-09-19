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
public class DatosInter implements Serializable{
    private String Metodos,Nombre;
    private Color c;
    private Font font;

    public DatosInter(String Metodos, String Nombre, Color c, Font font) {
        this.Metodos = Metodos;
        this.Nombre = Nombre;
        this.c = c;
        this.font = font;
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

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }
    
    
}
