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
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.JTextArea;

/**
 *
 * @author Junnior Sauceda
 */
public class Interfaz extends JPanel implements MouseListener, MouseMotionListener, ActionListener{
    
    private JPopupMenu men = new JPopupMenu();
    private JMenuItem it1=new JMenuItem("Renombrar");
    private JMenuItem it2=new JMenuItem("Eliminar");
    private ArrayList<JPanel> herencia=new ArrayList<>();
    private Point inicial;
    private static Interfaz figselec;
    private boolean selec=false;
    private JTextArea txt=new JTextArea();
    private JTextArea txt2=new JTextArea();
    private JScrollPane sp1=new JScrollPane(txt);
    private JScrollPane sp2=new JScrollPane(txt2);
    private JLabel nom=new JLabel("class");
    private JLabel nom2=new JLabel("            Metodos            ");
    private JPanel p1= new JPanel();
    private JPanel p2= new JPanel();
    private JSeparator s1=new JSeparator();
    private JSeparator s2=new JSeparator();
    private String sad="";
    private String NAME;
    private JPanel padre= new JPanel();
    
    public Interfaz(){
        
        
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
        
        this.addMouseListener((MouseListener)this);
        this.addMouseMotionListener((MouseMotionListener)this);
        this.setBackground(Color.red);
        this.setBounds(0, 0, 100, 80);
        this.setVisible(true);
        this.setBackground(Color.blue);
        this.setLocation(0, 0);
        this.setSize(150, 152);
        this.setBounds(0, 0, 170, 100);
        this.add(p1);
        this.add(s1);
        this.add(nom2);
        this.add(sp1);
        this.add(s2);
        nom.setSize(150, 50);
        nom.setBounds(0, 00, 150, 45);
        nom.setAlignmentX(nom.getWidth()/2);
        nom.setAlignmentY(nom.getHeight()/2);
        nom2.setSize(150, 50);
        nom2.setBounds(0, 00, 150, 40);
        nom2.setAlignmentX(nom.getWidth()/2);
        nom2.setAlignmentY(nom.getHeight()/2);
        p1.add(nom);
        p1.setSize(170, 50);
        p2.setSize(170, 40);
        p1.setPreferredSize(new Dimension(160, 20));
        p2.setPreferredSize(new Dimension(160, 15));
        sp1.setPreferredSize(new Dimension(160, 40));
        p1.setBounds(50, 0, 170, 30);
        p2.setBounds(10, 20, 170, 30);
        p1.setBackground(Color.blue);
        p2.setBackground(Color.blue);
        txt.setSize(170, 50);
        txt2.setSize(170, 50);
        txt.setBounds(0, 0, 170, 30);
        txt2.setBounds(0, 0, 170, 30);
        sp1.setSize(150, 20);
        sp2.setSize(150, 50);
        sp1.setBounds(5, 0, 150, 20);
        sp2.setBounds(0, 0, 150, 20);
        sp1.setBackground(Color.blue);
        sp2.setBackground(Color.blue);
        txt.setText(sad);
        txt2.setText(sad);
        p1.add(nom);
        
    }
    public ArrayList<JPanel> getHerencia() {
        return herencia;
    }

    public void setHerencia(ArrayList<JPanel> herencia) {
        this.herencia = herencia;
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

    public static Interfaz getFigselec() {
        return figselec;
    }

    public static void setFigselec(Interfaz figselec) {
        Interfaz.figselec = figselec;
    }
    
    public void setnom(String nvo){
        NAME=nvo.substring(0, nvo.length()-9);
        NAME=NAME.trim();
        nom.setText(nvo);
    }
    public boolean isSelec() {
        return selec;
    }
    public void paintback(Color c){
        this.setBackground(c);
        p1.setBackground(c);
        p2.setBackground(c);
    }
    
    public void setSelec(boolean selec) {
        this.selec = selec;
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        figselec=Interfaz.this;
        selec=!selec;
        figselec.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        if(!selec){
            figselec.setBorder(null);
        }
        
    }
    public String getNAME(){
        return NAME;
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
            
    @Override
    public String toString() {
        return nom.getText().substring(0, nom.getText().length()-9);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String nvo=JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre");
        nvo+="  class";
        setnom(nvo);
    }
    public void setfont(Font F){
        if(selec){
            txt.setFont(F);
            txt2.setFont(F);
        }
    }
    public void settexto(Color c){
        txt.setForeground(c);
        txt2.setForeground(c);
    }
}
