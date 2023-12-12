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
public class Direction extends javax.swing.JFrame {

    /**
     * Creates new form Direction
     */
    public Direction() {
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
        MedicalRec = new javax.swing.JButton();
        Settings = new javax.swing.JButton();
        InfoButton = new javax.swing.JButton();
        HomeButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MainPanel = new javax.swing.JPanel();
        HomeButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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

        HomeButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/Homeee.png"))); // NOI18N
        HomeButton1.setBorder(null);
        HomeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(HomeButton1);
        HomeButton1.setBounds(10, 60, 30, 24);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 20, 50, 380);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 3, true));
        MainPanel.setLayout(null);

        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/Backkk.png"))); // NOI18N
        HomeButton.setBorder(null);
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        MainPanel.add(HomeButton);
        HomeButton.setBounds(10, 20, 30, 32);

        jLabel6.setBackground(new java.awt.Color(0, 102, 255));
        jLabel6.setFont(new java.awt.Font("Karma", 0, 18)); // NOI18N
        jLabel6.setText("Turn left and you will arrive at your destination.");
        MainPanel.add(jLabel6);
        jLabel6.setBounds(20, 230, 430, 40);

        jLabel7.setBackground(new java.awt.Color(0, 102, 255));
        jLabel7.setFont(new java.awt.Font("Karma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("Patient Rooms 101 ");
        MainPanel.add(jLabel7);
        jLabel7.setBounds(50, 20, 210, 40);

        jLabel8.setBackground(new java.awt.Color(0, 102, 255));
        jLabel8.setFont(new java.awt.Font("Karma", 0, 18)); // NOI18N
        jLabel8.setText("Your Location");
        MainPanel.add(jLabel8);
        jLabel8.setBounds(20, 70, 210, 40);

        jLabel9.setBackground(new java.awt.Color(0, 102, 255));
        jLabel9.setFont(new java.awt.Font("Karma", 0, 18)); // NOI18N
        jLabel9.setText(">Straight ahead to patient's room.");
        MainPanel.add(jLabel9);
        jLabel9.setBounds(20, 150, 350, 40);

        jScrollPane1.setViewportView(MainPanel);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 20, 700, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

        JFrame back = new LogIn();
        back.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        back.setVisible(true);

        if (this.isVisible()) {
            this.dispose();
        }
    }//GEN-LAST:event_BackButtonActionPerformed

    private void MedicalRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicalRecActionPerformed
        JFrame settings = new MedicalInfo();
        settings.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        settings.setVisible(true);
        if (this.isVisible()) {
            this.dispose();
        }
    }//GEN-LAST:event_MedicalRecActionPerformed

    private void SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsActionPerformed
        JFrame settingsFrame = new SettingsNgPatient();
        settingsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        settingsFrame.setVisible(true);

        if (this.isVisible()) {
            this.dispose();
        }
    }//GEN-LAST:event_SettingsActionPerformed

    private void InfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoButtonActionPerformed
        JFrame info = new InfoAboutUsPatient();
        info.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        info.setVisible(true);
        if (this.isVisible()) {
            this.dispose();
        }
    }//GEN-LAST:event_InfoButtonActionPerformed

    private void HomeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButton1ActionPerformed
        JFrame home = new HomePatient();

        home.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        home.setVisible(true);

        if (this.isVisible()) {
            this.dispose();
        }
    }//GEN-LAST:event_HomeButton1ActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        JFrame home = new Map();
        home.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        home.setVisible(true);

        if (this.isVisible()) {
            this.dispose();
        }
    }//GEN-LAST:event_HomeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Direction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Direction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Direction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Direction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Direction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton HomeButton1;
    private javax.swing.JButton InfoButton;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton MedicalRec;
    private javax.swing.JButton Settings;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
