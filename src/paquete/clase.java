/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paquete;

import java.awt.Point;

/**
 *
 * @author Junnior Sauceda
 */
public class clase extends javax.swing.JPanel {

    /**
     * Creates new form clase
     */
    public clase() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        tf_Cnom = new javax.swing.JTextField();
        tf_Vnom = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        tf_Mnom = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        tf_Cnom.setBackground(new java.awt.Color(255, 255, 255));
        tf_Cnom.setForeground(new java.awt.Color(0, 0, 0));
        tf_Cnom.setText("Class Name()");
        tf_Cnom.setBorder(null);

        tf_Vnom.setBackground(new java.awt.Color(255, 255, 255));
        tf_Vnom.setForeground(new java.awt.Color(0, 0, 0));
        tf_Vnom.setText("Variable Name");
        tf_Vnom.setBorder(null);

        tf_Mnom.setBackground(new java.awt.Color(255, 255, 255));
        tf_Mnom.setForeground(new java.awt.Color(0, 0, 0));
        tf_Mnom.setText("Method Name()");
        tf_Mnom.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tf_Cnom)
            .addComponent(jSeparator1)
            .addComponent(jSeparator3)
            .addComponent(tf_Vnom)
            .addComponent(tf_Mnom, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tf_Cnom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(tf_Mnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_Vnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        inic= evt.getPoint();
        
    }//GEN-LAST:event_formMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        if(true&&(evt.getXOnScreen()<=820&&evt.getYOnScreen()<490)){
           move(((int)evt.getXOnScreen()), ((int)evt.getYOnScreen()));
        }
    }//GEN-LAST:event_formMouseDragged

    Point inic;
    Point nvopnt;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField tf_Cnom;
    private javax.swing.JTextField tf_Mnom;
    private javax.swing.JTextField tf_Vnom;
    // End of variables declaration//GEN-END:variables
}
