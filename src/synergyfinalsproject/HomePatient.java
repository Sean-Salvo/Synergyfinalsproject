/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package synergyfinalsproject;

import javax.swing.JFrame;

/**
 *
 * @author Test
 */
public class HomePatient extends javax.swing.JFrame {

    /**
     * Creates new form HomePatient
     */
    public HomePatient() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        MedicalRec = new javax.swing.JButton();
        Settings = new javax.swing.JButton();
        InfoButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        TakeMe = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/Logo.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 10, 40, 30);

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/Abbo.png"))); // NOI18N
        BackButton.setBorder(null);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel2.add(BackButton);
        BackButton.setBounds(10, 300, 30, 23);

        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/Homeee.png"))); // NOI18N
        HomeButton.setBorder(null);
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        jPanel2.add(HomeButton);
        HomeButton.setBounds(10, 60, 30, 24);

        MedicalRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/Screenshot 2023-12-10 161729.png"))); // NOI18N
        MedicalRec.setBorder(null);
        MedicalRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicalRecActionPerformed(evt);
            }
        });
        jPanel2.add(MedicalRec);
        MedicalRec.setBounds(10, 120, 30, 23);

        Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/Geaar_1.png"))); // NOI18N
        Settings.setBorder(null);
        Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsActionPerformed(evt);
            }
        });
        jPanel2.add(Settings);
        Settings.setBounds(10, 180, 30, 23);

        InfoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/Abbb.png"))); // NOI18N
        InfoButton.setBorder(null);
        InfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoButtonActionPerformed(evt);
            }
        });
        jPanel2.add(InfoButton);
        InfoButton.setBounds(10, 240, 30, 23);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 20, 50, 380);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 3, true));
        jPanel3.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));

        TakeMe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/aLocation.png"))); // NOI18N
        TakeMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TakeMeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TakeMe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TakeMe, javax.swing.GroupLayout.PREFERRED_SIZE, 154, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5);
        jPanel5.setBounds(10, 200, 300, 160);

        jLabel5.setBackground(new java.awt.Color(0, 102, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Welcome, ");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 10, 140, 28);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jPanel4.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/HospiPic.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(0, 0, 300, 140);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(10, 50, 300, 140);

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea6.setForeground(new java.awt.Color(255, 204, 0));
        jTextArea6.setRows(5);
        jTextArea6.setText("textField\nTextField");
        jScrollPane6.setViewportView(jTextArea6);

        jPanel3.add(jScrollPane6);
        jScrollPane6.setBounds(120, 10, 250, 30);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jPanel8.setLayout(null);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jPanel11.setLayout(null);
        jPanel8.add(jPanel11);
        jPanel11.setBounds(460, 10, 110, 150);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jPanel12.setLayout(null);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jPanel13.setLayout(null);
        jPanel12.add(jPanel13);
        jPanel13.setBounds(460, 10, 110, 150);

        jPanel8.add(jPanel12);
        jPanel12.setBounds(460, 10, 110, 150);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jPanel14.setLayout(null);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jPanel15.setLayout(null);
        jPanel14.add(jPanel15);
        jPanel15.setBounds(460, 10, 110, 150);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jPanel16.setLayout(null);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jPanel17.setLayout(null);
        jPanel16.add(jPanel17);
        jPanel17.setBounds(460, 10, 110, 150);

        jPanel14.add(jPanel16);
        jPanel16.setBounds(460, 10, 110, 150);

        jPanel8.add(jPanel14);
        jPanel14.setBounds(460, 10, 110, 150);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jPanel18.setLayout(null);
        jPanel8.add(jPanel18);
        jPanel18.setBounds(20, 190, 50, 140);

        jPanel3.add(jPanel8);
        jPanel8.setBounds(320, 50, 190, 140);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jPanel20.setLayout(null);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jPanel21.setLayout(null);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jPanel22.setLayout(null);
        jPanel21.add(jPanel22);
        jPanel22.setBounds(350, 200, 160, 160);

        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea1.setRows(5);
        jTextArea1.setText("Take a note...\n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.add(jPanel19);
        jPanel19.setBounds(320, 200, 190, 160);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6);
        jPanel6.setBounds(520, 50, 160, 310);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(70, 20, 690, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

        JFrame back = new HomeAdmin();
        if (back != null) {
            back.dispose();
        }

        // Close the current frame
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        JFrame home = new HomeAdmin();
        home.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        home.setVisible(true);

        if (this.isVisible()) {
            this.dispose();
        }
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void MedicalRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicalRecActionPerformed
        JFrame settings = new RoomAdminListview();
        settings.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        settings.setVisible(true);
        if (this.isVisible()) {
            this.dispose();
        }
    }//GEN-LAST:event_MedicalRecActionPerformed

    private void SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsActionPerformed
        JFrame settingsFrame = new SettingsNgAdmin();
        settingsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        settingsFrame.setVisible(true);

        if (this.isVisible()) {
            this.dispose();
        }
    }//GEN-LAST:event_SettingsActionPerformed

    private void InfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoButtonActionPerformed
        JFrame info = new Synergy_InfoAboutUS();
        info.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        info.setVisible(true);
        if (this.isVisible()) {
            this.dispose();
        }

    }//GEN-LAST:event_InfoButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TakeMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TakeMeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TakeMeActionPerformed

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
            java.util.logging.Logger.getLogger(HomePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton InfoButton;
    private javax.swing.JButton MedicalRec;
    private javax.swing.JButton Settings;
    private javax.swing.JButton TakeMe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea6;
    // End of variables declaration//GEN-END:variables
}