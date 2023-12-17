package synergyfinalsproject;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Ken Computer
 */
public class Synergy_LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public Synergy_LogIn() {
        initComponents();

        Image image = new ImageIcon(this.getClass().getResource("Synergy (Resized Logo).jpg")).getImage();
        this.setIconImage(image);
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
        logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_Username = new javax.swing.JTextField();
        tf_Password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        login2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Synergy: Login");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(221, 238, 249));
        jPanel1.setPreferredSize(new java.awt.Dimension(772, 417));
        jPanel1.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/newLogo.png"))); // NOI18N
        jPanel1.add(logo);
        logo.setBounds(65, 94, 170, 148);

        title.setFont(new java.awt.Font("Jomhuria", 0, 70)); // NOI18N
        title.setForeground(new java.awt.Color(21, 41, 157));
        title.setText("Synergy");
        jPanel1.add(title);
        title.setBounds(83, 248, 142, 71);

        jLabel4.setFont(new java.awt.Font("Karma", 0, 24)); // NOI18N
        jLabel4.setText("Log in");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(380, 50, 64, 32);

        tf_Username.setFont(new java.awt.Font("Karma", 0, 14)); // NOI18N
        tf_Username.setForeground(new java.awt.Color(204, 204, 204));
        tf_Username.setText("Email");
        tf_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_UsernameActionPerformed(evt);
            }
        });
        jPanel1.add(tf_Username);
        tf_Username.setBounds(372, 117, 339, 30);

        tf_Password.setFont(new java.awt.Font("Karma", 0, 18)); // NOI18N
        tf_Password.setForeground(new java.awt.Color(204, 204, 204));
        tf_Password.setText("Password");
        jPanel1.add(tf_Password);
        tf_Password.setBounds(370, 200, 339, 30);

        login.setBackground(new java.awt.Color(217, 217, 217));
        login.setFont(new java.awt.Font("Karma", 0, 14)); // NOI18N
        login.setForeground(new java.awt.Color(6, 61, 134));
        login.setText("Back");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login);
        login.setBounds(370, 300, 90, 30);

        jLabel7.setFont(new java.awt.Font("Karma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(6, 61, 134));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(380, 170, 130, 32);

        jLabel8.setFont(new java.awt.Font("Karma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(6, 61, 134));
        jLabel8.setText("Username");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(380, 90, 130, 32);

        login2.setBackground(new java.awt.Color(49, 91, 2));
        login2.setFont(new java.awt.Font("Karma", 0, 14)); // NOI18N
        login2.setForeground(new java.awt.Color(255, 255, 255));
        login2.setText("Log In");
        login2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login2ActionPerformed(evt);
            }
        });
        jPanel1.add(login2);
        login2.setBounds(620, 300, 90, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        JFrame register = new Synergy_Registration();
        register.setVisible(true);
        dispose();

    }//GEN-LAST:event_loginActionPerformed

    private void tf_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_UsernameActionPerformed

    private void login2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login2ActionPerformed

        dataBaseV2 db = new dataBaseV2();
        Error_Display errorMSG = new Error_Display();

        String logUsername = tf_Username.getText();
        String logPassword = tf_Password.getText();

        if (db.getUsernameDB().contains(logUsername) && db.getPasswordDB().contains(logPassword)) {

            JFrame homePatient = new Synergy_HomePatientt();
            homePatient.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            homePatient.setVisible(true);

            if (this.isVisible()) {
                this.dispose();
            }

        } else {

            errorMSG.setVisible(true);
            errorMSG.displayError.append(("\nInvalid Username or Password Error: \nUsername or Password is not Found."));

        }
        
    }//GEN-LAST:event_login2ActionPerformed

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
            java.util.logging.Logger.getLogger(Synergy_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Synergy_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Synergy_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Synergy_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Synergy_LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JButton login2;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField tf_Password;
    private javax.swing.JTextField tf_Username;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
