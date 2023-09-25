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
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;



public class InicioFin extends FormaGeneral implements MouseListener, MouseMotionListener, ActionListener{
     private JPopupMenu men = new JPopupMenu();
    private JMenuItem it2=new JMenuItem("Eliminar");
    
    private Point inicial;
    private boolean selec;
    private InicioFin figselec;
    private JTextArea area=new JTextArea();
    private JScrollPane sp1=new JScrollPane(area);
    private String Name;
    private Color color=Color.red;
    
    public InicioFin(){
        it2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel xf = (JPanel) figselec.getParent();
                xf.remove(figselec);
                xf.repaint();



            }
        });
        men.add(it2);
        add(men);
        setLayout(null);
        this.addMouseListener((MouseListener)this);
        this.addMouseMotionListener((MouseMotionListener)this);
        this.setSize(150, 90);
        this.setPreferredSize(new Dimension(150, 90));
        area.setLineWrap(true);
        sp1.setPreferredSize(new Dimension(80, 25));
        sp1.setBounds(22, 35, 100, 25);
        area.setBounds(22, 35, 106, 30);
        area.setBackground(Color.white);
        area.setLayout(getLayout());
        this.add(sp1);
    }

    public JTextArea getArea() {
        return area;
    }

    public void setArea(JTextArea area) {
        this.area = area;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();
        
        Graphics2D g2d = (Graphics2D) g;
        
        // Crear una forma de cápsula horizontal
        Shape capsuleShape = new RoundRectangle2D.Double(0, height / 4, width, height / 2, height / 2, height / 2);
        
        // Rellenar la forma con un color
        g2d.setColor(color); // Cambia el color como desees
        g2d.fill(capsuleShape);
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
        figselec = InicioFin.this;
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
    public void paintback(Color c) {
        if (selec){
            color=c;
            repaint();
        }
    }
    public void setfont(Font F){
        if(selec){
            area.setFont(F);
        }
    }

    public JPopupMenu getMen() {
        return men;
    }

    public void setMen(JPopupMenu men) {
        this.men = men;
    }
    public void setItem(JMenuItem j){
        men.add(j);
    }
    public void settexto(Color c){
        area.setForeground(c);
    }

    public boolean isSelec() {
        return selec;
    }

    public void setSelec(boolean selec) {
        this.selec = selec;
    }

    @Override
    public String toString() {
        return "#InicioFin: " + area.getText()  ;
    }
    
}
