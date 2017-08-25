/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrames;
//import AppPackage.AnimationClass.*;

import MyFrames.MyPanels.Panel2;
import MyFrames.MyPanels.Panel3;
import MyFrames.MyPanels.Panel4;
import MyFrames.MyPanels.Panel5;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

/**
 *
 * @author root
 */
public class Frame1 extends javax.swing.JInternalFrame {
        GridBagLayout layout=new GridBagLayout();
        Panel5 p5;
        Panel2 p2;
        Panel3 p3;
        Panel4 p4;
        
        
    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();
    
        p5=new Panel5();
        p2=new Panel2();
        p3=new Panel3();
        p4=new Panel4();
        dynamicPanel.setLayout(layout);
        GridBagConstraints g=new GridBagConstraints();
        g.gridx=0;
        g.gridy=0;
        dynamicPanel.add(p5,g);
        g.gridx=0;
        g.gridy=0;
        dynamicPanel.add(p2,g);
        g.gridx=0;
        g.gridy=0;
        dynamicPanel.add(p3,g);
        g.gridx=0;
        g.gridy=0;
        dynamicPanel.add(p4,g);
        p5.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelButton = new javax.swing.JPanel();
        btnPanel1 = new javax.swing.JButton();
        btnPanel2 = new javax.swing.JButton();
        btnPanel3 = new javax.swing.JButton();
        btnPanel4 = new javax.swing.JButton();
        dynamicPanel = new javax.swing.JPanel();

        setClosable(true);
        setTitle("Installtion");

        PanelButton.setBackground(new java.awt.Color(195, 235, 155));

        btnPanel1.setText("Java");
        btnPanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanel1ActionPerformed(evt);
            }
        });

        btnPanel2.setText("Add User");
        btnPanel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanel2ActionPerformed(evt);
            }
        });

        btnPanel3.setText("Hadoop");
        btnPanel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanel3ActionPerformed(evt);
            }
        });

        btnPanel4.setText("Nodes");
        btnPanel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanel4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelButtonLayout = new javax.swing.GroupLayout(PanelButton);
        PanelButton.setLayout(PanelButtonLayout);
        PanelButtonLayout.setHorizontalGroup(
            PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        PanelButtonLayout.setVerticalGroup(
            PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnPanel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnPanel2)
                .addGap(46, 46, 46)
                .addComponent(btnPanel3)
                .addGap(48, 48, 48)
                .addComponent(btnPanel4)
                .addGap(57, 57, 57))
        );

        getContentPane().add(PanelButton, java.awt.BorderLayout.LINE_START);

        dynamicPanel.setBackground(new java.awt.Color(178, 215, 206));

        javax.swing.GroupLayout dynamicPanelLayout = new javax.swing.GroupLayout(dynamicPanel);
        dynamicPanel.setLayout(dynamicPanelLayout);
        dynamicPanelLayout.setHorizontalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );
        dynamicPanelLayout.setVerticalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        getContentPane().add(dynamicPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanel1ActionPerformed
        p5.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPanel1ActionPerformed

    private void btnPanel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanel2ActionPerformed
        // TODO add your handling code here:

        p5.setVisible(false);
        p2.setVisible(true);
        p3.setVisible(false);
        p4.setVisible(false);
    }//GEN-LAST:event_btnPanel2ActionPerformed

    private void btnPanel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanel3ActionPerformed
        p5.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
        p4.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnPanel3ActionPerformed

    private void btnPanel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanel4ActionPerformed


        p5.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPanel4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelButton;
    private javax.swing.JButton btnPanel1;
    private javax.swing.JButton btnPanel2;
    private javax.swing.JButton btnPanel3;
    private javax.swing.JButton btnPanel4;
    private javax.swing.JPanel dynamicPanel;
    // End of variables declaration//GEN-END:variables
}
