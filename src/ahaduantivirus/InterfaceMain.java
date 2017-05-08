/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahaduantivirus;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.awt.event.*;

/**
 *
 * @author EDEN
 */
public class InterfaceMain extends javax.swing.JFrame {

   File dir;
    public InterfaceMain() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        unhidePanel = new javax.swing.JPanel();
        systemScanPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        scanButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(Color.red);
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(51, 0, 0));
        jButton1.setForeground(new java.awt.Color(51, 51, 0));
        jButton1.setText("Full system scan");
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 140, 137, 49);

        jButton2.setBackground(new java.awt.Color(51, 0, 0));
        jButton2.setForeground(new java.awt.Color(51, 51, 0));
        jButton2.setText("Unhide Flash Drive");
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 210, 137, 49);

        jButton3.setBackground(new java.awt.Color(51, 0, 0));
        jButton3.setForeground(new java.awt.Color(51, 51, 0));
        jButton3.setText("Update ");
        jPanel1.add(jButton3);
        jButton3.setBounds(10, 290, 137, 45);

        mainPanel.setBackground(Color.GREEN);
        mainPanel.setBackground(new java.awt.Color(204, 0, 204));
        mainPanel.setOpaque(false);
        mainPanel.setLayout(null);

        unhidePanel.setOpaque(false);

        systemScanPanel.setBackground(new java.awt.Color(102, 0, 102));
        systemScanPanel.setFocusable(false);
        systemScanPanel.setOpaque(false);
        systemScanPanel.setPreferredSize(new java.awt.Dimension(450, 260));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jLabel6, org.jdesktop.beansbinding.ObjectProperty.create(), systemScanPanel, org.jdesktop.beansbinding.BeanProperty.create("opaque"));
        bindingGroup.addBinding(binding);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Select Drive:");

        jButton4.setText("Browse");
        jButton4.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JFileChooser file=new JFileChooser();
                    int rt=file.showOpenDialog(null);
                    if(rt==JFileChooser.APPROVE_OPTION){
                        dir=file.getCurrentDirectory();
                        scanButton.setEnabled(true);
                    }

                }
            }
        );

        scanButton.setText("Scan");
        scanButton.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Status:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("NOT SCANING");

        javax.swing.GroupLayout systemScanPanelLayout = new javax.swing.GroupLayout(systemScanPanel);
        systemScanPanel.setLayout(systemScanPanelLayout);
        systemScanPanelLayout.setHorizontalGroup(
            systemScanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, systemScanPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(systemScanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(systemScanPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(systemScanPanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(scanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(systemScanPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(systemScanPanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(493, 493, 493))
        );
        systemScanPanelLayout.setVerticalGroup(
            systemScanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, systemScanPanelLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(systemScanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(systemScanPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(scanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(systemScanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        scanButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Thread t=new Thread(
                        new Runnable(){
                            public void run(){
                                Antivirus.scanFiles(dir);
                            }
                        }
                    );
                    t.start();
                }
            }
        );

        javax.swing.GroupLayout unhidePanelLayout = new javax.swing.GroupLayout(unhidePanel);
        unhidePanel.setLayout(unhidePanelLayout);
        unhidePanelLayout.setHorizontalGroup(
            unhidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, unhidePanelLayout.createSequentialGroup()
                .addComponent(systemScanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        unhidePanelLayout.setVerticalGroup(
            unhidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, unhidePanelLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(systemScanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainPanel.add(unhidePanel);
        unhidePanel.setBounds(0, 0, 420, 270);

        jPanel1.add(mainPanel);
        mainPanel.setBounds(153, 105, 469, 250);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ahaduantivirus/Capture.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-6, -6, 650, 410);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 623, 640, 474);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ahaduantivirus/Capture.PNG"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-20, -20, 660, 440);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton scanButton;
    private javax.swing.JPanel systemScanPanel;
    private javax.swing.JPanel unhidePanel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
