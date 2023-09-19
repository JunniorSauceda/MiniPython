/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;
import javax.swing.JPanel;

/**
 *
 * @author Junnior Sauceda
 */
public class DatosHerencia implements Serializable {
    private String Atributos,Metodos,Nombre;
    private JPanel Padre;
    private Color color;
    private Font Fon;

    public DatosHerencia(String Atributos, String Metodos, String Nombre, JPanel Padre, Color color, Font Fon) {
        this.Atributos = Atributos;
        this.Metodos = Metodos;
        this.Nombre = Nombre;
        this.Padre = Padre;
        this.color = color;
        this.Fon = Fon;
    }

    public String getAtributos() {
        return Atributos;
    }

    public void setAtributos(String Atributos) {
        this.Atributos = Atributos;
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

    public JPanel getPadre() {
        return Padre;
    }

    public void setPadre(JPanel Padre) {
        this.Padre = Padre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Font getFon() {
        return Fon;
    }

    public void setFon(Font Fon) {
        this.Fon = Fon;
    }
    
}
