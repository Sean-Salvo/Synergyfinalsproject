package synergyfinalsproject;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;

public class Synergy_HomeAdmin extends javax.swing.JFrame {

    DefaultListModel<String> modelPendingList = new DefaultListModel();
    DefaultListModel<String> modelAdminHistory = new DefaultListModel();
    dataBaseV2 db = new dataBaseV2();
    
    public Synergy_HomeAdmin() {
        initComponents();
        
        pendingList.setModel(modelPendingList);
        adminHistory.setModel(modelAdminHistory);
        
        if(!db.getAppointmentsDB().isEmpty()){
        
        for(int a = 0; a < db.getAppointmentsDB().size(); a++){
            
            for(int b = 0; b < db.getAppointmentsDB().get(a).size(); b++){
                
                modelPendingList.addElement(db.getUsernameDB().get(b) + "   " + db.getAppointmentsDB().get(a).get(b));
                
            }
            
        }
        
        } else {
            
            System.out.println("Error");
            
        }
        
        if(!db.getAppointmentsSuccessDB().isEmpty()){
            
            for(int a = 0; a < db.getAppointmentsSuccessDB().size(); a++){
            
            for(int b = 0; b < db.getAppointmentsSuccessDB().get(a).size(); b++){
                
                modelAdminHistory.addElement(db.getUsernameDB().get(b) + "   " + db.getAppointmentsSuccessDB().get(a).get(b));
                
            }
            
        }
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        adminHistory = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pendingList = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adminName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LogOut = new javax.swing.JButton();
        PatientAbout = new javax.swing.JButton();
        HomeButon = new javax.swing.JButton();
        PatientSettings = new javax.swing.JButton();
        SideMenuu = new javax.swing.JLabel();
        WholeBackground = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Name", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Write a note..\n");
        jScrollPane3.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(584, 140, 140, 90);

        jScrollPane4.setViewportView(adminHistory);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(110, 90, 440, 280);

        jLabel8.setFont(new java.awt.Font("Karma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(6, 61, 134));
        jLabel8.setText("Note");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(590, 110, 130, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/requestAppointment (1).png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(570, 90, 180, 160);

        pendingList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendingListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(pendingList);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(580, 280, 150, 100);

        jLabel7.setFont(new java.awt.Font("Karma", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(6, 61, 134));
        jLabel7.setText("PENDING APPOINTMENTS");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(590, 250, 130, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/requestAppointment (1).png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(570, 210, 180, 210);

        adminName.setFont(new java.awt.Font("Karma", 0, 24)); // NOI18N
        adminName.setForeground(new java.awt.Color(6, 61, 134));
        adminName.setText("adminname");
        jPanel1.add(adminName);
        adminName.setBounds(240, 40, 180, 40);

        jLabel5.setFont(new java.awt.Font("Karma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(6, 61, 134));
        jLabel5.setText("Welcome,");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 40, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/adminAppointment (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 40, 480, 380);

        LogOut.setBackground(new java.awt.Color(221, 238, 249));
        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/newLogOuy (1).png"))); // NOI18N
        LogOut.setBorder(null);
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jPanel1.add(LogOut);
        LogOut.setBounds(30, 290, 30, 30);

        PatientAbout.setBackground(new java.awt.Color(221, 238, 249));
        PatientAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/newInfo (1).png"))); // NOI18N
        PatientAbout.setBorder(null);
        PatientAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientAboutActionPerformed(evt);
            }
        });
        jPanel1.add(PatientAbout);
        PatientAbout.setBounds(30, 220, 30, 30);

        HomeButon.setBackground(new java.awt.Color(221, 238, 249));
        HomeButon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/newHome (1).png"))); // NOI18N
        HomeButon.setBorder(null);
        HomeButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButonActionPerformed(evt);
            }
        });
        jPanel1.add(HomeButon);
        HomeButon.setBounds(30, 90, 30, 30);

        PatientSettings.setBackground(new java.awt.Color(221, 238, 249));
        PatientSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/newGear (2).png"))); // NOI18N
        PatientSettings.setBorder(null);
        PatientSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientSettingsActionPerformed(evt);
            }
        });
        jPanel1.add(PatientSettings);
        PatientSettings.setBounds(30, 150, 30, 30);

        SideMenuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/Side Menu (2).png"))); // NOI18N
        SideMenuu.setMaximumSize(new java.awt.Dimension(50, 313));
        jPanel1.add(SideMenuu);
        SideMenuu.setBounds(20, 0, 60, 420);

        WholeBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/backgroundblue (1).png"))); // NOI18N
        jPanel1.add(WholeBackground);
        WholeBackground.setBounds(80, 10, 700, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 772, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PatientSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientSettingsActionPerformed
        dispose();
        JFrame home = new Synergy_SettingsAdmin();
        home.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        home.setVisible(true);
    }//GEN-LAST:event_PatientSettingsActionPerformed

    private void HomeButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButonActionPerformed
        dispose();
        JFrame home = new Synergy_HomeAdmin();
        home.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        home.setVisible(true);

    }//GEN-LAST:event_HomeButonActionPerformed

    private void PatientAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientAboutActionPerformed
        dispose();
        JFrame home = new Synergy_AdminInfo();
        home.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        home.setVisible(true);
    }//GEN-LAST:event_PatientAboutActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        dispose();
        JFrame login = new Synergy_LogIn();
        login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        login.setVisible(true);
    }//GEN-LAST:event_LogOutActionPerformed

    private void pendingListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingListMouseClicked

        int select = pendingList.getSelectedIndex();

        Synergy_PendingAppointment pending = new Synergy_PendingAppointment(select);
        pending.setVisible(true);
        dispose();

    }//GEN-LAST:event_pendingListMouseClicked

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
            java.util.logging.Logger.getLogger(Synergy_HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Synergy_HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Synergy_HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Synergy_HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Synergy_HomeAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeButon;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton PatientAbout;
    private javax.swing.JButton PatientSettings;
    private javax.swing.JLabel SideMenuu;
    private javax.swing.JLabel WholeBackground;
    private javax.swing.JList<String> adminHistory;
    private javax.swing.JLabel adminName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> pendingList;
    // End of variables declaration//GEN-END:variables
}
