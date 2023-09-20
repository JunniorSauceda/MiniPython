/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;



import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Path2D;
import javax.swing.BorderFactory;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author dfcm9
 */


public class Rombo extends FormaGeneral implements MouseListener, MouseMotionListener, ActionListener{
    private JPopupMenu men = new JPopupMenu();
    private JMenuItem it2=new JMenuItem("Eliminar");
    private Color romboColor = Color.red; // Color predeterminado
    private JTextArea textPane;
    private Point inicial;
    private Rombo figselec;
    private boolean selec;
    private Color color=Color.red;
    
    public Rombo() {
        // Constructor: Configurar el panel y agregar componentes
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
        setSize(200,100);
        setBackground(Color.white);
        add(men);
        this.addMouseListener((MouseListener) this);
        this.addMouseMotionListener((MouseMotionListener) this);
        // Crear un JTextPane y agregarlo al centro del panel
       
        textPane = new JTextArea();
        textPane.setText("");
        textPane.setBackground(Color.white); // Establecer el fondo del JTextPane al color del panel
        textPane.setForeground(Color.black); // Establecer el color del texto en blanco
        textPane.setBorder(null); // Eliminar el borde del JTextPane
        
        
        // Cambiar el estilo de fuente del texto a negrita
        Font boldFont = new Font(textPane.getFont().getName(), Font.BOLD, textPane.getFont().getSize());
        textPane.setFont(boldFont);
        
        textPane.setBounds(30, (getHeight()/2)-10, 140, 20);

        /*GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;*/
        add(textPane);
    }
    
    public void setRomboColor(Color color) {
    this.romboColor = color;
    repaint(); // Vuelve a dibujar el componente para reflejar el nuevo color
    }

    public JPopupMenu getMen() {
        return men;
    }

    public void setMen(JPopupMenu men) {
        this.men = men;
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

        // Crear un rombo
        Path2D.Double rombo = new Path2D.Double();
        int width = getWidth();
        int height = getHeight();
        int midX = width / 2;
        int midY = height / 2;

        rombo.moveTo(midX, 0);          // Arriba
        rombo.lineTo(width, midY);      // Derecha
        rombo.lineTo(midX, height);      // Abajo
        rombo.lineTo(0, midY);          // Izquierda
        rombo.closePath();               // Conectar con el punto de inicio

        // Dibujar el rombo
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.fill(rombo);
    }
    
    public void paintback(Color c) {
        if(selec){
            color=c;
        repaint();
        }
    }
     public void mouseClicked(java.awt.event.MouseEvent evt) {
        figselec = Rombo.this;
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

    public JTextArea getText() {
        return textPane;
    }

    public void setTextPane(JTextArea textPane) {
        this.textPane = textPane;
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
    @Override
    public void actionPerformed(ActionEvent e) {
        String nvo=JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre");
        nvo+="  class";
    }

    public boolean isSelec() {
        return selec;
    }

    public void setSelec(boolean selec) {
        this.selec = selec;
    }
    
    public void setfont(Font F){
        if(selec){
            textPane.setFont(F);
        }
    }
    public void setItem(JMenuItem j){
        men.add(j);
    }
    public void settexto(Color c){
        textPane.setForeground(c);
    }

    @Override
    public String toString() {
        return "If "+textPane.getText();
    }
    
}
