/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
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
public class FormaGeneral extends JPanel implements MouseListener, MouseMotionListener, ActionListener {
    private FormaGeneral figselec=new FormaGeneral();
    private boolean selec=false;
    private Point inicial= null;
    private JTextArea txt=new JTextArea();
    private JPopupMenu men = new JPopupMenu();
    private JMenuItem it1=new JMenuItem("Eliminar");
    public FormaGeneral() {
        this.addMouseListener((MouseListener) this);
        this.addMouseMotionListener((MouseMotionListener) this);
        setSize(100, 100);
        setBackground(Color.blue);
        setPreferredSize(new Dimension(100, 100));
        txt.setPreferredSize(new Dimension(80, 25));
        add(txt);
    }
    
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        it1.addActionListener(this);
        men.add(it1);
        figselec=FormaGeneral.this;
        selec=!selec;
        figselec.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        if(!selec){
            figselec.setBorder(null);
        }
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent evt) {
        inicial=SwingUtilities.convertPoint(this, evt.getPoint(), this.getParent());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        inicial=null;
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
        Point lugar= SwingUtilities.convertPoint(this,evt.getPoint(), this.getParent());
        if(true){
            Point nvalugar= this.getLocation();
            nvalugar.translate(lugar.x-inicial.x, lugar.y-inicial.y);
            nvalugar.x=Math.max(nvalugar.x, 0);
            nvalugar.y=Math.max(nvalugar.y, 0);
            nvalugar.x=Math.min(nvalugar.x, this.getParent().getWidth()-this.getWidth());
            nvalugar.y=Math.min(nvalugar.y, this.getParent().getHeight()-this.getHeight());
            this.setLocation(nvalugar);
           inicial=nvalugar;
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
    protected void paintcomponent(Graphics g){
        super.paintComponent(g);
        if (selec) {
            Border borde=BorderFactory.createLineBorder(Color.black, 2);
        }
        else{
            setBorder(null);
        }
    }
    
    public void paintback(Color c){
        this.setBackground(c);
    }
    public void actionPerformed(ActionEvent e) {
        JPanel p=(JPanel)getParent();
        p.remove(this);
        p.revalidate();
        p.repaint();
    }
}
