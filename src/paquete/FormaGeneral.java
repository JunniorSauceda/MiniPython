/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

/**
 *
 * @author Junnior Sauceda
 */
public class FormaGeneral extends JPanel {
    protected JTextArea indice=new JTextArea();
    private ArrayList<FormaGeneral> Hijos=new ArrayList<>();
    public FormaGeneral(String I,Font F) {
        indice.setFont(F);
        indice.setText(I);
    }

    public FormaGeneral(String txt) {
        indice.setText(txt);
    }

    public FormaGeneral() {
    }
    
    public JTextArea getIndice() {
        return indice;
    }
    public String getIndices() {
        return indice.getText();
    }
    public void setIndice(JTextArea indice) {
        this.indice = indice;
    }

    public ArrayList<FormaGeneral> getHijos() {
        return Hijos;
    }

    public void setHijos(ArrayList<FormaGeneral> Hijos) {
        this.Hijos = Hijos;
    }
    public void setHijo(FormaGeneral H){
        Hijos.add(H);
    }

    @Override
    public String toString() {
        return indice.getText();
    }
    
}
