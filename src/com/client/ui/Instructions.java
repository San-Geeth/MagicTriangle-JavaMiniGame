/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author Sangeeth Nawarathna
 */
public class Instructions extends javax.swing.JFrame {

    boolean status = true;
    /**
     * Creates new form Instructions
     */
    public Instructions() {
        initComponents();
        
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/instructionsWithoutAnswers-01.jpg")));
        
        if(lblImage.getIcon() != new javax.swing.ImageIcon(getClass().getResource("/images/instructionsWithoutAnswers-01.jpg"))){
            lblImageNumber.setText("1");
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnPlayGame = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblImageNumber = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        rd3 = new javax.swing.JRadioButton();
        rd4 = new javax.swing.JRadioButton();
        rd5 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/instructionsWithoutAnswers-01.jpg"))); // NOI18N

        jLabel2.setText("1. You will be provided traingle with blanks to fill like above.");

        jLabel3.setText("2. You must fill all the blanks with integer values.");

        jLabel4.setText("3. Sum of the values you enter to the blanks on one side must equal to the each sum of the values in other two sides.");

        jLabel5.setText("4. That means each sum of the values of the sides must be equal. ");

        jLabel6.setText("5. You will have 3 levels.");

        jLabel7.setText("6. Each level has 5 rounds.");

        jLabel8.setText("6. You have only 3 attempts to win the game.");

        btnPlayGame.setText("PLAY");
        btnPlayGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayGameActionPerformed(evt);
            }
        });

        jLabel9.setText("Image");

        lblImageNumber.setText("1");

        jLabel11.setText("of 5");

        rdGroup.add(rd1);
        rd1.setSelected(true);
        rd1.setText("1");
        rd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd1ActionPerformed(evt);
            }
        });

        rdGroup.add(rd2);
        rd2.setText("2");
        rd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd2ActionPerformed(evt);
            }
        });

        rdGroup.add(rd3);
        rd3.setText("3");
        rd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd3ActionPerformed(evt);
            }
        });

        rdGroup.add(rd4);
        rd4.setText("4");
        rd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd4ActionPerformed(evt);
            }
        });

        rdGroup.add(rd5);
        rd5.setText("5");
        rd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPlayGame))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImageNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(374, 374, 374))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rd1)
                .addGap(18, 18, 18)
                .addComponent(rd2)
                .addGap(18, 18, 18)
                .addComponent(rd3)
                .addGap(18, 18, 18)
                .addComponent(rd4)
                .addGap(18, 18, 18)
                .addComponent(rd5)
                .addGap(296, 296, 296))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rd1)
                            .addComponent(rd2)
                            .addComponent(rd3)
                            .addComponent(rd4)
                            .addComponent(rd5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblImageNumber)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPlayGame)
                        .addContainerGap())))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * If player clicks Play button after the reading instructions, Instructions UI will close and player will redirect to main interface.
     * @param evt Action event
     */
    private void btnPlayGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayGameActionPerformed
  
         this.setVisible(false);
         new home().setVisible(true);
    }//GEN-LAST:event_btnPlayGameActionPerformed

    
    /**
     * If player select the No. 1 radio button, image in the label will change to "/images/instructionsWithoutAnswers-01.jpg"
     * @param evt Action event
     */
    private void rd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd1ActionPerformed

       if( rd1.isSelected()){
           lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/instructionsWithoutAnswers-01.jpg")));
           lblImageNumber.setText("1");
       };
    }//GEN-LAST:event_rd1ActionPerformed

    
    
    /**
     * If player select the No. 2 radio button, image in the label will change to "/images/instructionsWithoutAnswers-01.jpg"
     * @param evt Action event
     */
    private void rd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd2ActionPerformed

        if( rd2.isSelected()){
           lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/instructions.jpg")));
           lblImageNumber.setText("2");
       };
    }//GEN-LAST:event_rd2ActionPerformed

    
    /**
     * If player select the No. 3 radio button, image in the label will change to "/images/invalid1.jpg"
     * @param evt Action Event
     */
    private void rd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd3ActionPerformed
       
         if( rd3.isSelected()){
           lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invalid1.jpg")));
           lblImageNumber.setText("3");
       };
    }//GEN-LAST:event_rd3ActionPerformed

    
    /**
     * If player select the No. 4 radio button, image in the label will change to "/images/invalid2.jpg"
     * @param evt Action Event
     */
    private void rd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd4ActionPerformed
       
        if( rd4.isSelected()){
           lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invalid2.jpg")));
           lblImageNumber.setText("4");
       };
    }//GEN-LAST:event_rd4ActionPerformed

    
    /**
     * If player select the No. 5 radio button, image in the label will change to "/images/invalid3.jpg"
     * @param evt Action event
     */
    private void rd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd5ActionPerformed
        // TODO add your handling code here:
        if( rd5.isSelected()){
           lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invalid3.jpg")));
           lblImageNumber.setText("5");
       };
    }//GEN-LAST:event_rd5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instructions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlayGame;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblImageNumber;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd2;
    private javax.swing.JRadioButton rd3;
    private javax.swing.JRadioButton rd4;
    private javax.swing.JRadioButton rd5;
    private javax.swing.ButtonGroup rdGroup;
    // End of variables declaration//GEN-END:variables
}
