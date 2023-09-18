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
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.JTextArea;
import javax.swing.tree.DefaultTreeCellEditor;

/**
 *
 * @author Junnior Sauceda
 */
public class Abstractpanel extends JPanel implements MouseListener, MouseMotionListener,ActionListener {
 private JPopupMenu men = new JPopupMenu();
    private JMenuItem it1=new JMenuItem("Renombrar");
    private JMenuItem it2=new JMenuItem("Eliminar");
    
    private ArrayList<JPanel> herencia = new ArrayList<>();
    private Point inicial;
    private static Abstractpanel figselec;
    private boolean selec = false;
    private JTextArea txt = new JTextArea();
    private JTextArea txt2 = new JTextArea();
    private JTextArea txtA = new JTextArea();
    private JScrollPane sp1 = new JScrollPane(txt);
    private JScrollPane sp2 = new JScrollPane(txt2);
    private JScrollPane spA = new JScrollPane(txtA);
    private JLabel nom = new JLabel("class");
    private JLabel nom2 = new JLabel("            Metodos            ");
    private JLabel nom3 = new JLabel("          atributos          ");
    private JLabel nom4 = new JLabel("        Metodo Abstracto          ");
    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    private JPanel p3 = new JPanel();
    private JPanel p4 = new JPanel();
    private JSeparator s1 = new JSeparator();
    private JSeparator s2 = new JSeparator();
    private String sad = "                 ";
    private String NAME;
    private JPanel padre = new JPanel();

    public Abstractpanel() {
        it1.addActionListener(this);
        it2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                JPanel xf = (JPanel) figselec.getParent();
                xf.remove(figselec);
                xf.repaint();



            }
        });
        men.add(it1);
        men.add(it2);
        
        this.addMouseListener((MouseListener) this);
        this.addMouseMotionListener((MouseMotionListener) this);
        this.setBackground(Color.red);
        this.setBounds(0, 0, 100, 100);
        this.setVisible(true);
        this.setBackground(Color.blue);
        this.setLocation(0, 0);
        this.setSize(150, 152);
        this.setBounds(0, 0, 170, 130);
        this.add(p1);
        this.add(s1);
        this.add(nom4);
        this.add(p4);
        spA.setPreferredSize(new Dimension(150, 45));
        this.add(spA);
        this.add(s2);
        nom.setSize(150, 50);
        nom.setBounds(0, 00, 150, 40);
        nom.setAlignmentX(nom.getWidth() / 2);
        nom.setAlignmentY(nom.getHeight() / 2);
        nom2.setSize(150, 50);
        nom2.setBounds(0, 00, 150, 40);
        nom2.setAlignmentX(nom.getWidth() / 2);
        nom2.setAlignmentY(nom.getHeight() / 2);

        nom4.setSize(150, 50);
        nom4.setBounds(0, 00, 150, 40);
        nom4.setAlignmentX(nom.getWidth() / 2);
        nom4.setAlignmentY(nom.getHeight() / 2);
        p1.add(nom);
        p1.setSize(170, 50);
        p2.setSize(170, 60);
        p3.setSize(170, 60);
        p4.setSize(170, 60);
        p1.setBounds(50, 10, 170, 50);
        p2.setBounds(10, 90, 170, 60);
        p3.setBounds(10, 150, 170, 60);
        p4.setBounds(10, 150, 170, 60);
        p1.setBackground(Color.blue);
        p2.setBackground(Color.blue);
        p3.setBackground(Color.blue);
        p4.setBackground(Color.blue);
        txt.setSize(170, 50);
        txt2.setSize(170, 50);
        txtA.setSize(170, 50);
        txt.setBounds(0, 0, 170, 50);
        txt2.setBounds(0, 0, 170, 50);
        txtA.setBounds(0, 0, 170, 50);
        sp1.setSize(150, 50);

        spA.setSize(150, 50);
        sp1.setBounds(0, 0, 150, 50);

        spA.setBounds(0, 0, 150, 50);
        sp1.setBackground(Color.blue);

        spA.setBackground(Color.blue);
        txt.setText(sad);
        txt2.setText(sad);
        txtA.setText(sad);
        p1.add(nom);

    }

    public JTextArea getTxtA() {
        return txtA;
    }

    public void setTxtA(JTextArea txtA) {
        this.txtA = txtA;
    }

    public JTextArea getTxt() {
        return txt;
    }

    public void setTxt(JTextArea txt) {
        this.txt = txt;
    }

    public JTextArea getTxt2() {
        return txt2;
    }

    public void setTxt2(JTextArea txt2) {
        this.txt2 = txt2;
    }

    public JScrollPane getSp1() {
        return sp1;
    }

    public void setSp1(JScrollPane sp1) {
        this.sp1 = sp1;
    }

    public JScrollPane getSp2() {
        return sp2;
    }

    public void setSp2(JScrollPane sp2) {
        this.sp2 = sp2;
    }

    public JLabel getNom() {
        return nom;
    }

    public void setNom(JLabel nom) {
        this.nom = nom;
    }

    public JLabel getNom2() {
        return nom2;
    }

    public void setNom2(JLabel nom2) {
        this.nom2 = nom2;
    }

    public JLabel getNom3() {
        return nom3;
    }

    public void setNom3(JLabel nom3) {
        this.nom3 = nom3;
    }

    public JPanel getP1() {
        return p1;
    }

    public void setP1(JPanel p1) {
        this.p1 = p1;
    }

    public JPanel getP2() {
        return p2;
    }

    public void setP2(JPanel p2) {
        this.p2 = p2;
    }

    public JPanel getP3() {
        return p3;
    }

    public void setP3(JPanel p3) {
        this.p3 = p3;
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

    public static Abstractpanel getFigselec() {
        return figselec;
    }

    public static void setFigselec(Abstractpanel figselec) {
        Abstractpanel.figselec = figselec;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public JPanel getPadre() {
        return padre;
    }

    public void setPadre(JPanel padre) {
        this.padre = padre;
    }

    public void setnom(String nvo) {
        NAME = nvo.substring(0, nvo.length() - 14);
        NAME = NAME.trim();
        nom.setText(nvo);
    }

    public boolean isSelec() {
        return selec;
    }

    public void paintback(Color c) {
        this.setBackground(c);
        p1.setBackground(c);
        p2.setBackground(c);
        p3.setBackground(c);
        p4.setBackground(c);
    }

    public void setSelec(boolean selec) {
        this.selec = selec;
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {

        figselec = Abstractpanel.this;
        selec = !selec;
        if (evt.isMetaDown()) {

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

    @Override
    public String toString() {
        return nom.getText().substring(0, nom.getText().length() - 14);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nvo=JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre");
        nvo+="  class";
        setnom(nvo);
    }
    public void setfont(Font F){
        if(selec){
            txtA.setFont(F);
            txt2.setFont(F);
            txt.setFont(F);
        }
    }
}
