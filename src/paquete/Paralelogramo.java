/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 *
 * @author Junnior Sauceda
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Path2D;

public class Paralelogramo extends JPanel implements MouseListener, MouseMotionListener, ActionListener {
    private JTextArea txt=new JTextArea();
    private JPopupMenu men = new JPopupMenu();
    private JMenuItem it2=new JMenuItem("Eliminar");
    private Point inicial;
    private boolean selec=false;
    private Paralelogramo figselec;
    private JTextArea area=new JTextArea();
    private String Name;
    private int xPosition = -200;
    private Color color=Color.red;
    
    
    public Paralelogramo(){
        this.addMouseListener((MouseListener) this);
        this.addMouseMotionListener((MouseMotionListener) this);
        setLayout(null);
        setSize(100, 100);
        setPreferredSize(new Dimension(100, 100));
        setVisible(true);
        txt.setPreferredSize(new Dimension(80, 25));
        txt.setBounds(10, 40, 80, 25);
        add(txt);
        
    }
    @Override
    protected void paintComponent(Graphics g) {
          super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();

        Path2D path = new Path2D.Double();
        path.moveTo(0, 0);
        path.lineTo(width, 40);
        path.lineTo(width, height);
        path.lineTo(0, height - 40);
        path.closePath();

        g2d.setColor(color); // Cambia el color de fondo a tu elección
        g2d.fill(path);
    }
    public void actionPerformed(ActionEvent e) {
        JPanel p=(JPanel)getParent();
        p.remove(this);
        p.revalidate();
        p.repaint();
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
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        figselec=Paralelogramo.this;
        selec=!selec;
        setBorder(BorderFactory.createLineBorder(Color.black, 2));
        if(!selec){
            figselec.setBorder(null);
        }
        
    }
    public void paintback(Color c) {
        if(selec){
            color=c;
            repaint();
        }
    }
    public void setfont(Font F){
        if(selec){
            txt.setFont(F);
        }
    }
}