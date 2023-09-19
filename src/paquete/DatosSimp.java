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
public class DatosSimp implements Serializable{
    private int width,length;
    private String Atrib,Meth,Nombre;
    private Color color;
    private Font font;

    public DatosSimp(int width, int length, String Atrib, String Meth,String Nombre, Color color, Font font) {
        this.width = width;
        this.length = length;
        this.Atrib = Atrib;
        this.Meth = Meth;
        this.color = color;
        this.font = font;
        this.Nombre=Nombre+" class";
    }

    public DatosSimp() {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getAtrib() {
        return Atrib;
    }

    public void setAtrib(String Atrib) {
        this.Atrib = Atrib;
    }

    public String getMeth() {
        return Meth;
    }

    public void setMeth(String Meth) {
        this.Meth = Meth;
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

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
}
