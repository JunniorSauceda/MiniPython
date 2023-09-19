/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.MenuItem;
import java.awt.Point;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.tree.DefaultTreeCellEditor;

/**
 *
 * @author Junnior Sauceda
 */
public class Proceso extends JPanel implements MouseListener, MouseMotionListener, ActionListener {

    private JPopupMenu men = new JPopupMenu();
    private JMenuItem it2=new JMenuItem("Eliminar");
    private JMenuItem it1=new JMenuItem("Eliminar");
    private Point inicial;
    private static Proceso figselec;
    private boolean selec = false;
    private JTextArea txt = new JTextArea();
    private JScrollPane sp1 = new JScrollPane(txt);
    private JPanel padre = null;
    private JSeparator s1 = new JSeparator();
    private JSeparator s2 = new JSeparator();
    private String sad = "";
    private String NAME;
    private Font Fon = txt.getFont();
    private boolean borrado=false;
    
    
    
    public Proceso() {
        it2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                borrado = true;
                JPanel xf = (JPanel) figselec.getParent();
                xf.remove(figselec);
                xf.repaint();



            }
        });
        
        men.add(it2);
        add(men);
        sp1.setPreferredSize(new Dimension(130, 25));
        this.addMouseListener((MouseListener) this);
        this.addMouseMotionListener((MouseMotionListener) this);
        this.setBackground(Color.red);
        this.setBounds(0, 0, 100, 150);
        this.setVisible(true);
        this.setBackground(Color.blue);
        this.setLocation(0, 0);
        this.setSize(150, 100);
        this.setBounds(0, 0, 150, 40);
        this.add(sp1);
        txt.setSize(100, 50);
        txt.setBounds(0, 40, 130, 50);
        txt.setSize(130, 50);
        sp1.setSize(100, 50);
        sp1.setBounds(0, 40, 130, 50);
        sp1.setSize(130, 50);
        sp1.setBackground(Color.blue);
        txt.setSize(130, 50);
        sp1.setSize(130, 50);

        
    }

    public void setfont(Font F){
        if(selec){
            txt.setFont(F);
        }
    }

    public JPopupMenu getMen() {
        return men;
    }

    public void setMen(JPopupMenu men) {
        this.men = men;
    }

    public Font getF() {
        return Fon;
    }

    

    public JTextArea getTxt() {
        return txt;
    }

    public void setTxt(JTextArea txt) {
        this.txt = txt;
    }


    public JScrollPane getSp1() {
        return sp1;
    }

    public void setSp1(JScrollPane sp1) {
        this.sp1 = sp1;
    }

   

    public JSeparator getS1() {
        return s1;
    }

    public void setS1(JSeparator s1) {
        this.s1 = s1;
    }

    public JSeparator getS2() {
        return s2;
    }

    public void setS2(JSeparator s2) {
        this.s2 = s2;
    }

    public String getSad() {
        return sad;
    }

    public void setSad(String sad) {
        this.sad = sad;
    }

    public Point getInicial() {
        return inicial;
    }

    public void setInicial(Point inicial) {
        this.inicial = inicial;
    }

    public static Proceso getFigselec() {
        return figselec;
    }

    public static void setFigselec(Proceso figselec) {
        Proceso.figselec = figselec;
    }

    public String getNAME() {
        return NAME;
    }

    

    public boolean isSelec() {
        return selec;
    }

    public void paintback(Color c) {
        if(selec){
            this.setBackground(c);
        sp1.setBackground(c);
        }
    }

    public void setSelec(boolean selec) {
        this.selec = selec;
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        figselec = Proceso.this;
        selec = !selec;
        if (evt.isMetaDown()) {
            men.show(this, evt.getX(), evt.getY());
        } else {
            
            figselec.setBorder(BorderFactory.createLineBorder(Color.black, 2));
            if (!selec) {
                figselec.setBorder(null);
            }
        }
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent evt) {
        inicial = SwingUtilities.convertPoint(this, evt.getPoint(), this.getParent());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        inicial = null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent evt) {
        Point lugar = SwingUtilities.convertPoint(this, evt.getPoint(), this.getParent());
        if (true) {
            Point nvalugar = this.getLocation();
            nvalugar.translate(lugar.x - inicial.x, lugar.y - inicial.y);
            nvalugar.x = Math.max(nvalugar.x, 0);
            nvalugar.y = Math.max(nvalugar.y, 0);
            nvalugar.x = Math.min(nvalugar.x, this.getParent().getWidth() - this.getWidth());
            nvalugar.y = Math.min(nvalugar.y, this.getParent().getHeight() - this.getHeight());
            this.setLocation(nvalugar);
            inicial = nvalugar;
        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    protected void paintcomponent(Graphics g) {
        super.paintComponent(g);
        if (selec) {
            Border borde = BorderFactory.createLineBorder(Color.black, 2);
        } else {
            setBorder(null);
        }
    }

    public JPanel getPadre() {
        return padre;
    }

    public void setPadre(JPanel padre) {
        this.padre = padre;
    }

    @Override
    public String toString() {
        return "NO";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        borrado = true;
                JPanel xf = (JPanel) figselec.getParent();
                xf.remove(figselec);
                xf.repaint();
    }
    public void setItem(JMenuItem j){
        men.add(j);
    }
    public void settexto(Color c){
        txt.setForeground(c);
    }
    
}

