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
public class Synergy_PasswordChange extends javax.swing.JFrame {

    /**
     * Creates new form Synergy_PasswordChange
     */
    public Synergy_PasswordChange() {
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
        L_firstName22 = new javax.swing.JLabel();
        TF_ConfirmNewPassword = new javax.swing.JTextField();
        L_firstName23 = new javax.swing.JLabel();
        TF_NewPassword1 = new javax.swing.JTextField();
        SaveNewPassword = new javax.swing.JButton();
        SaveNewPassword1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        L_firstName22.setBackground(new java.awt.Color(0, 0, 0));
        L_firstName22.setFont(new java.awt.Font("Karma", 1, 15)); // NOI18N
        L_firstName22.setForeground(new java.awt.Color(6, 61, 134));
        L_firstName22.setText("Confirm New Password");
        jPanel1.add(L_firstName22);
        L_firstName22.setBounds(10, 70, 240, 30);
        jPanel1.add(TF_ConfirmNewPassword);
        TF_ConfirmNewPassword.setBounds(10, 100, 230, 22);

        L_firstName23.setBackground(new java.awt.Color(0, 0, 0));
        L_firstName23.setFont(new java.awt.Font("Karma", 1, 15)); // NOI18N
        L_firstName23.setForeground(new java.awt.Color(6, 61, 134));
        L_firstName23.setText("New Password");
        jPanel1.add(L_firstName23);
        L_firstName23.setBounds(10, 10, 240, 30);
        jPanel1.add(TF_NewPassword1);
        TF_NewPassword1.setBounds(10, 40, 230, 22);

        SaveNewPassword.setText("Cancel");
        SaveNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveNewPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(SaveNewPassword);
        SaveNewPassword.setBounds(10, 150, 75, 23);

        SaveNewPassword1.setText("Save");
        jPanel1.add(SaveNewPassword1);
        SaveNewPassword1.setBounds(160, 150, 72, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveNewPasswordActionPerformed
        dispose();
        
        JFrame cancel = new Synergy_SettingsAdmin();
        cancel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cancel.setVisible(true);
        
        
    }//GEN-LAST:event_SaveNewPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Synergy_PasswordChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Synergy_PasswordChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Synergy_PasswordChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Synergy_PasswordChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Synergy_PasswordChange().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_firstName22;
    private javax.swing.JLabel L_firstName23;
    private javax.swing.JButton SaveNewPassword;
    private javax.swing.JButton SaveNewPassword1;
    private javax.swing.JTextField TF_ConfirmNewPassword;
    private javax.swing.JTextField TF_NewPassword1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
