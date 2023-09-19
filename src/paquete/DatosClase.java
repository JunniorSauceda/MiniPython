
package paquete;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.text.Style;
import javax.swing.text.StyledDocument;


public class DatosClase implements Serializable{
    
    private int sizeX, sizeY, locX, locY;
    private Color color, fontColor;
    
    protected ArrayList<String> atributos = new ArrayList<>();
    protected ArrayList<String> metodos = new ArrayList<>();
    
    
    
    private static final long serialVersionUID = 1L;

    
    private Font font;
    private int fontSize;
    
    private Font fontAtr;
    private String fontAtrFamily;
    private int fontAtrSize;
    
    
    private Color fgColor;
    private Color bgColor;
    
    private String titulo;

    public DatosClase() {
    }

    public DatosClase(int sizeX, int sizeY, int locX, int locY, String titulo, Color color) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.locX = locX;
        this.locY = locY;
        this.titulo = titulo;
        this.color = color;
    }

    

    public Font getFontAtr() {
        return fontAtr;
    }

    public void setFontAtr(Font fontAtr) {
        this.fontAtr = fontAtr;
    }

    public String getFontAtrFamily() {
        return fontAtrFamily;
    }

    public void setFontAtrFamily(String fontAtrFamily) {
        this.fontAtrFamily = fontAtrFamily;
    }

    public int getFontAtrSize() {
        return fontAtrSize;
    }

    public void setFontAtrSize(int fontAtrSize) {
        this.fontAtrSize = fontAtrSize;
    }
    
    

    public Color getFontColor() {
        return fontColor;
    }

    public void setFontColor(Color fontColor) {
        this.fontColor = fontColor;
    }

    

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public Color getFgColor() {
        return fgColor;
    }

    public void setFgColor(Color fgColor) {
        this.fgColor = fgColor;
    }

    public Color getBgColor() {
        return bgColor;
    }

    public void setBgColor(Color bgColor) {
        this.bgColor = bgColor;
    }
    
    

    

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }
    

   

    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public int getLocX() {
        return locX;
    }

    public void setLocX(int locX) {
        this.locX = locX;
    }

    public int getLocY() {
        return locY;
    }

    public void setLocY(int locY) {
        this.locY = locY;
    }

    public ArrayList<String> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<String> atributos) {
        this.atributos = atributos;
    }

    public ArrayList<String> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<String> metodos) {
        this.metodos = metodos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "DatosClasse{" + "sizeX=" + sizeX + ", sizeY=" + sizeY + ", locX=" + locX + ", locY=" + locY + ", atributos=" + atributos + ", metodos=" + metodos + ", titulo=" + titulo + '}';
    }
    
    
}
