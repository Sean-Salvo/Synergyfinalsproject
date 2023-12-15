package synergyfinalsproject;


import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Ken Computer
 */
public class Synergy_Registration extends javax.swing.JFrame {

    /**
     * Creates new form HMS_Register
     */
    public Synergy_Registration() {
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

        TF_firstName = new javax.swing.JTextField();
        whitePanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        newBluePanel = new javax.swing.JPanel();
        L_firstName = new javax.swing.JLabel();
        L_firstName1 = new javax.swing.JLabel();
        TF_FirstName = new javax.swing.JTextField();
        TF_MiddleName = new javax.swing.JTextField();
        L_firstName3 = new javax.swing.JLabel();
        L_lastName = new javax.swing.JLabel();
        TF_day = new javax.swing.JTextField();
        L_gender = new javax.swing.JLabel();
        L_lastName1 = new javax.swing.JLabel();
        Gender1 = new javax.swing.JComboBox<>();
        TF_month1 = new javax.swing.JTextField();
        TF_day1 = new javax.swing.JTextField();
        L_lastName2 = new javax.swing.JLabel();
        TF_surname2 = new javax.swing.JTextField();
        Gender2 = new javax.swing.JComboBox<>();
        L_lastName3 = new javax.swing.JLabel();
        TF_cPassword = new javax.swing.JTextField();
        L_lastName4 = new javax.swing.JLabel();
        TF_phoneNum = new javax.swing.JTextField();
        L_lastName5 = new javax.swing.JLabel();
        TF_Email1 = new javax.swing.JTextField();
        L_password = new javax.swing.JLabel();
        TF_address = new javax.swing.JTextField();
        L_password1 = new javax.swing.JLabel();
        TF_password = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        L_password2 = new javax.swing.JLabel();
        L_password3 = new javax.swing.JLabel();
        L_password4 = new javax.swing.JLabel();
        login2 = new javax.swing.JButton();
        B_register = new javax.swing.JButton();
        TermsConditions = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        TF_firstName.setForeground(new java.awt.Color(255, 255, 255));
        TF_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_firstNameActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Synergy: Create Account");
        setResizable(false);

        whitePanel.setBackground(new java.awt.Color(221, 238, 249));
        whitePanel.setPreferredSize(new java.awt.Dimension(772, 417));
        whitePanel.setLayout(null);

        title.setFont(new java.awt.Font("Jomhuria", 0, 70)); // NOI18N
        title.setForeground(new java.awt.Color(21, 41, 157));
        title.setText("Synergy");
        whitePanel.add(title);
        title.setBounds(80, 251, 142, 60);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        newBluePanel.setBackground(new java.awt.Color(221, 238, 249));
        newBluePanel.setLayout(null);

        L_firstName.setBackground(new java.awt.Color(0, 0, 0));
        L_firstName.setFont(new java.awt.Font("Karma", 1, 28)); // NOI18N
        L_firstName.setForeground(new java.awt.Color(49, 91, 2));
        L_firstName.setText("Create Account");
        newBluePanel.add(L_firstName);
        L_firstName.setBounds(120, 60, 250, 47);

        L_firstName1.setBackground(new java.awt.Color(0, 0, 0));
        L_firstName1.setFont(new java.awt.Font("Karma", 1, 18)); // NOI18N
        L_firstName1.setForeground(new java.awt.Color(6, 61, 134));
        L_firstName1.setText("Middle Name");
        newBluePanel.add(L_firstName1);
        L_firstName1.setBounds(250, 120, 150, 30);

        TF_FirstName.setText("Owen");
        newBluePanel.add(TF_FirstName);
        TF_FirstName.setBounds(50, 150, 190, 22);

        TF_MiddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_MiddleNameActionPerformed(evt);
            }
        });
        newBluePanel.add(TF_MiddleName);
        TF_MiddleName.setBounds(250, 150, 190, 22);

        L_firstName3.setBackground(new java.awt.Color(0, 0, 0));
        L_firstName3.setFont(new java.awt.Font("Karma", 1, 18)); // NOI18N
        L_firstName3.setForeground(new java.awt.Color(6, 61, 134));
        L_firstName3.setText("First Name:");
        newBluePanel.add(L_firstName3);
        L_firstName3.setBounds(50, 120, 96, 30);

        L_lastName.setBackground(new java.awt.Color(0, 0, 0));
        L_lastName.setFont(new java.awt.Font("Karma", 1, 18)); // NOI18N
        L_lastName.setForeground(new java.awt.Color(6, 61, 134));
        L_lastName.setText("Status");
        newBluePanel.add(L_lastName);
        L_lastName.setBounds(250, 240, 91, 30);

        TF_day.setForeground(new java.awt.Color(102, 102, 102));
        TF_day.setText("Year");
        TF_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_dayActionPerformed(evt);
            }
        });
        newBluePanel.add(TF_day);
        TF_day.setBounds(180, 270, 60, 22);

        L_gender.setBackground(new java.awt.Color(0, 0, 0));
        L_gender.setFont(new java.awt.Font("Karma", 1, 18)); // NOI18N
        L_gender.setForeground(new java.awt.Color(6, 61, 134));
        L_gender.setText("Gender:");
        newBluePanel.add(L_gender);
        L_gender.setBounds(250, 180, 65, 30);

        L_lastName1.setBackground(new java.awt.Color(0, 0, 0));
        L_lastName1.setFont(new java.awt.Font("Karma", 1, 18)); // NOI18N
        L_lastName1.setForeground(new java.awt.Color(6, 61, 134));
        L_lastName1.setText("Contact Number");
        newBluePanel.add(L_lastName1);
        L_lastName1.setBounds(250, 300, 140, 30);

        Gender1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status", "Married", "Single" }));
        Gender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gender1ActionPerformed(evt);
            }
        });
        newBluePanel.add(Gender1);
        Gender1.setBounds(250, 270, 190, 22);

        TF_month1.setForeground(new java.awt.Color(102, 102, 102));
        TF_month1.setText("Month");
        TF_month1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_month1ActionPerformed(evt);
            }
        });
        newBluePanel.add(TF_month1);
        TF_month1.setBounds(50, 270, 60, 22);

        TF_day1.setForeground(new java.awt.Color(102, 102, 102));
        TF_day1.setText("Day");
        TF_day1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_day1ActionPerformed(evt);
            }
        });
        newBluePanel.add(TF_day1);
        TF_day1.setBounds(120, 270, 50, 22);

        L_lastName2.setBackground(new java.awt.Color(0, 0, 0));
        L_lastName2.setFont(new java.awt.Font("Karma", 1, 18)); // NOI18N
        L_lastName2.setForeground(new java.awt.Color(6, 61, 134));
        L_lastName2.setText("Birthdate");
        newBluePanel.add(L_lastName2);
        L_lastName2.setBounds(50, 240, 91, 30);

        TF_surname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_surname2ActionPerformed(evt);
            }
        });
        newBluePanel.add(TF_surname2);
        TF_surname2.setBounds(50, 210, 190, 22);

        Gender2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select gender", "Male", "Female", "Rather not say" }));
        Gender2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gender2ActionPerformed(evt);
            }
        });
        newBluePanel.add(Gender2);
        Gender2.setBounds(250, 210, 190, 22);

        L_lastName3.setBackground(new java.awt.Color(0, 0, 0));
        L_lastName3.setFont(new java.awt.Font("Karma", 1, 18)); // NOI18N
        L_lastName3.setForeground(new java.awt.Color(6, 61, 134));
        L_lastName3.setText("Surname:");
        newBluePanel.add(L_lastName3);
        L_lastName3.setBounds(50, 180, 91, 30);
        newBluePanel.add(TF_cPassword);
        TF_cPassword.setBounds(250, 450, 200, 22);

        L_lastName4.setBackground(new java.awt.Color(0, 0, 0));
        L_lastName4.setFont(new java.awt.Font("Karma", 1, 18)); // NOI18N
        L_lastName4.setForeground(new java.awt.Color(6, 61, 134));
        L_lastName4.setText("Address");
        newBluePanel.add(L_lastName4);
        L_lastName4.setBounds(50, 360, 91, 30);

        TF_phoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_phoneNumActionPerformed(evt);
            }
        });
        newBluePanel.add(TF_phoneNum);
        TF_phoneNum.setBounds(250, 330, 190, 22);

        L_lastName5.setBackground(new java.awt.Color(0, 0, 0));
        L_lastName5.setFont(new java.awt.Font("Karma", 1, 18)); // NOI18N
        L_lastName5.setForeground(new java.awt.Color(6, 61, 134));
        L_lastName5.setText("Email");
        newBluePanel.add(L_lastName5);
        L_lastName5.setBounds(50, 300, 91, 30);
        newBluePanel.add(TF_Email1);
        TF_Email1.setBounds(50, 330, 190, 22);

        L_password.setBackground(new java.awt.Color(0, 0, 0));
        L_password.setFont(new java.awt.Font("Karma", 1, 18)); // NOI18N
        L_password.setForeground(new java.awt.Color(6, 61, 134));
        L_password.setText("Confirm Password");
        newBluePanel.add(L_password);
        L_password.setBounds(250, 420, 180, 30);
        newBluePanel.add(TF_address);
        TF_address.setBounds(50, 390, 390, 22);

        L_password1.setBackground(new java.awt.Color(0, 0, 0));
        L_password1.setFont(new java.awt.Font("Karma", 1, 16)); // NOI18N
        L_password1.setText("Alreadt have an account?");
        newBluePanel.add(L_password1);
        L_password1.setBounds(70, 510, 190, 20);
        newBluePanel.add(TF_password);
        TF_password.setBounds(50, 450, 190, 22);

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        newBluePanel.add(jCheckBox1);
        jCheckBox1.setBounds(50, 490, 20, 19);

        L_password2.setBackground(new java.awt.Color(0, 0, 0));
        L_password2.setFont(new java.awt.Font("Karma", 1, 18)); // NOI18N
        L_password2.setForeground(new java.awt.Color(6, 61, 134));
        L_password2.setText("Password:");
        newBluePanel.add(L_password2);
        L_password2.setBounds(50, 420, 82, 30);

        L_password3.setBackground(new java.awt.Color(0, 0, 0));
        L_password3.setFont(new java.awt.Font("Karma", 1, 16)); // NOI18N
        L_password3.setForeground(new java.awt.Color(6, 61, 134));
        L_password3.setText("terms and conditions");
        newBluePanel.add(L_password3);
        L_password3.setBounds(160, 490, 170, 20);

        L_password4.setBackground(new java.awt.Color(0, 0, 0));
        L_password4.setFont(new java.awt.Font("Karma", 1, 16)); // NOI18N
        L_password4.setText("i accept the");
        newBluePanel.add(L_password4);
        L_password4.setBounds(70, 490, 100, 20);

        login2.setBackground(new java.awt.Color(49, 91, 2));
        login2.setFont(new java.awt.Font("Karma", 0, 14)); // NOI18N
        login2.setForeground(new java.awt.Color(255, 255, 255));
        login2.setText("Register");
        login2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login2ActionPerformed(evt);
            }
        });
        newBluePanel.add(login2);
        login2.setBounds(200, 550, 90, 30);

        jScrollPane2.setViewportView(newBluePanel);

        whitePanel.add(jScrollPane2);
        jScrollPane2.setBounds(310, 0, 470, 610);

        B_register.setFont(new java.awt.Font("Karma", 1, 12)); // NOI18N
        B_register.setText("Register");
        B_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_registerActionPerformed(evt);
            }
        });
        whitePanel.add(B_register);
        B_register.setBounds(55, 881, 75, 27);

        TermsConditions.setFont(new java.awt.Font("Karma", 1, 14)); // NOI18N
        TermsConditions.setForeground(new java.awt.Color(255, 255, 255));
        TermsConditions.setText("I agree to the terms and conditions");
        TermsConditions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TermsConditionsActionPerformed(evt);
            }
        });
        whitePanel.add(TermsConditions);
        TermsConditions.setBounds(55, 848, 253, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/newLogo.png"))); // NOI18N
        whitePanel.add(jLabel1);
        jLabel1.setBounds(60, 90, 170, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(whitePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(whitePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void B_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_registerActionPerformed
       
        // Object to setVisibility and append displayError specific Messages
        Error_Display errorMSG = new Error_Display();
        //Total amount of errors to be checked by the program: [7]
        
        //-------------------------------------------------------------------------------------------
        
        if (TF_firstName.getText().isEmpty()) {
            errorMSG.setVisible(true);
            errorMSG.displayError.append("Empty TextField Error: \nOne or More TextField is Empty.");
        } else if (TF_FirstName.getText().isEmpty()) {
            errorMSG.setVisible(true);
            errorMSG.displayError.append("Empty TextField Error: \nOne or More TextField is Empty.");
        } else if (TF_phoneNum.getText().isEmpty()) {
            errorMSG.setVisible(true);
            errorMSG.displayError.append("Empty TextField Error: \nOne or More TextField is Empty.");
        } else if (TF_password.getText().isEmpty()) {
            errorMSG.setVisible(true);
            errorMSG.displayError.append("Empty TextField Error: \nOne or More TextField is Empty.");
        } else if (TF_cPassword.getText().isEmpty()) {
            errorMSG.setVisible(true);
            errorMSG.displayError.append("Empty TextField Error: \nOne or More TextField is Empty.");
        } else if (TF_phoneNum.getText().isEmpty()) {
            errorMSG.setVisible(true);
            errorMSG.displayError.append("Empty TextField Error: \nOne or More TextField is Empty.");
        } else if (TF_address.getText().isEmpty()) {
            errorMSG.setVisible(true);
            errorMSG.displayError.append("Empty TextField Error: \nOne or More TextField is Empty.");
        } else if (TF_cPassword.getText().isEmpty()) {
            errorMSG.setVisible(true);
            errorMSG.displayError.append("Empty TextField Error: \nOne or More TextField is Empty.");

        } else {

            if (!TF_password.getText().equals(TF_cPassword.getText())) {
                errorMSG.setVisible(true);
                errorMSG.displayError.append("Mismatch Password Error: \nPassword and Confirmed Password do NOT match.");

            } else {

                if (!TF_password.getText().matches(".*[a-zA-Z].*") || !TF_password.getText().matches(".*\\d.*") || !TF_password.getText().matches(".*[^a-zA-Z\\d].*")) {
                    errorMSG.setVisible(true);
                    errorMSG.displayError.append("Missing Symbol and/or Number Error: \nPassword requires atleast ONE Symbol and ONE Number.");

                } else {

                    if (TF_password.getText().length() <= 5) { // [4]
                        errorMSG.setVisible(true);
                        errorMSG.displayError.append("Passowrd Length Error: \nPassword must atleast have 6 characters.");

                    } else {

                        if (TF_phoneNum.getText().matches(".*[a-zA-Z].*") || TF_phoneNum.getText().matches(".*[^\\d].*")) {
                            errorMSG.setVisible(true);
                            errorMSG.displayError.append("Phone Number Letter and/or Symbol Error: \nPhone Number TextField has a Letter and/or Number in it.");

                        } else {

                            if (TF_phoneNum.getText().length() != 11) {
                                errorMSG.setVisible(true);
                                errorMSG.displayError.append("Phone Number Length Error: \nPhone Number must have and should be equal to 11 digits.");

                            } else {

                                if (!TermsConditions.isSelected()) {
                                    errorMSG.setVisible(true);
                                    errorMSG.displayError.append("TOC unchecked Error: \nTerms And Condition Must be checked before you can create an account.");

                                } else {

                                    System.out.println("Program Successful"); // Temporary SysOut code for checking..
                                    // enter code here to open another JFrame..

                                }

                            }

                        }

                    }

                }

            }

        }
    }//GEN-LAST:event_B_registerActionPerformed

    private void TermsConditionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TermsConditionsActionPerformed

    }//GEN-LAST:event_TermsConditionsActionPerformed

    private void TF_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_firstNameActionPerformed
        String firstName = TF_firstName.getText();
        AccountsDataBase acc = new AccountsDataBase();
        acc.addData(firstName, firstName, firstName, firstName, firstName, firstName, firstName, firstName, firstName);
    }//GEN-LAST:event_TF_firstNameActionPerformed

    private void TF_MiddleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_MiddleNameActionPerformed
        String middleName = TF_MiddleName.getText();
         AccountsDataBase acc = new AccountsDataBase();
         acc.addData(middleName, middleName, middleName, middleName, middleName, middleName, middleName, middleName, middleName);
    }//GEN-LAST:event_TF_MiddleNameActionPerformed

    private void TF_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_dayActionPerformed

    private void Gender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gender1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gender1ActionPerformed

    private void TF_month1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_month1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_month1ActionPerformed

    private void TF_day1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_day1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_day1ActionPerformed

    private void TF_surname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_surname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_surname2ActionPerformed

    private void Gender2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gender2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gender2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void login2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login2ActionPerformed

    private void TF_phoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_phoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_phoneNumActionPerformed

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
            java.util.logging.Logger.getLogger(Synergy_Registration.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Synergy_Registration.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Synergy_Registration.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Synergy_Registration.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Synergy_Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_register;
    private javax.swing.JComboBox<String> Gender1;
    private javax.swing.JComboBox<String> Gender2;
    private javax.swing.JLabel L_firstName;
    private javax.swing.JLabel L_firstName1;
    private javax.swing.JLabel L_firstName3;
    private javax.swing.JLabel L_gender;
    private javax.swing.JLabel L_lastName;
    private javax.swing.JLabel L_lastName1;
    private javax.swing.JLabel L_lastName2;
    private javax.swing.JLabel L_lastName3;
    private javax.swing.JLabel L_lastName4;
    private javax.swing.JLabel L_lastName5;
    private javax.swing.JLabel L_password;
    private javax.swing.JLabel L_password1;
    private javax.swing.JLabel L_password2;
    private javax.swing.JLabel L_password3;
    private javax.swing.JLabel L_password4;
    private javax.swing.JTextField TF_Email1;
    private javax.swing.JTextField TF_FirstName;
    private javax.swing.JTextField TF_MiddleName;
    private javax.swing.JTextField TF_address;
    private javax.swing.JTextField TF_cPassword;
    private javax.swing.JTextField TF_day;
    private javax.swing.JTextField TF_day1;
    private javax.swing.JTextField TF_firstName;
    private javax.swing.JTextField TF_month1;
    private javax.swing.JTextField TF_password;
    private javax.swing.JTextField TF_phoneNum;
    private javax.swing.JTextField TF_surname2;
    private javax.swing.JCheckBox TermsConditions;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton login2;
    private javax.swing.JPanel newBluePanel;
    private javax.swing.JLabel title;
    private javax.swing.JPanel whitePanel;
    // End of variables declaration//GEN-END:variables
}
