/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package synergyfinalsproject;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Test
 */
public class PatientInfoShow extends javax.swing.JFrame {

    /**
     * Creates new form PatientInfoShow
     */
    public PatientInfoShow() {
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
        Door = new javax.swing.JButton();
        Settings = new javax.swing.JButton();
        InfoButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
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
        jCalendar1 = new com.toedter.calendar.JCalendar();

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

        Door.setIcon(new javax.swing.ImageIcon(getClass().getResource("/synergyfinalsproject/Doooorr.png"))); // NOI18N
        Door.setBorder(null);
        Door.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoorActionPerformed(evt);
            }
        });
        jPanel2.add(Door);
        Door.setBounds(10, 120, 30, 23);

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

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 2, true));
        jPanel6.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(0, 102, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Floor 1");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(230, 160, 50, 20);

        jLabel9.setBackground(new java.awt.Color(0, 102, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Floor 1");
        jPanel6.add(jLabel9);
        jLabel9.setBounds(30, 0, 40, 20);

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Room 1", "Room 2", "Room 3", "Room 4", "Room 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(jList3);

        jPanel6.add(jScrollPane17);
        jScrollPane17.setBounds(10, 20, 100, 230);

        jLabel11.setBackground(new java.awt.Color(0, 102, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Floor Plan");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        jPanel3.add(jPanel5);
        jPanel5.setBounds(10, 50, 140, 310);

        jLabel5.setBackground(new java.awt.Color(0, 102, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Welcome, ");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 10, 140, 28);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jPanel4.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 3, true));
        jPanel10.setLayout(null);

        jLabel14.setBackground(new java.awt.Color(0, 102, 255));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Health Conditions - ");
        jPanel10.add(jLabel14);
        jLabel14.setBounds(20, 250, 120, 20);
        jPanel10.add(jSeparator2);
        jSeparator2.setBounds(0, 50, 270, 0);
        jPanel10.add(jSeparator3);
        jSeparator3.setBounds(0, 50, 270, 0);

        jLabel4.setBackground(new java.awt.Color(0, 102, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Name:");
        jPanel10.add(jLabel4);
        jLabel4.setBounds(460, 180, 50, 10);

        jLabel15.setBackground(new java.awt.Color(0, 102, 255));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel15.setText("Patient Information");
        jPanel10.add(jLabel15);
        jLabel15.setBounds(40, 10, 190, 28);

        jLabel16.setBackground(new java.awt.Color(0, 102, 255));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Room Number - ");
        jPanel10.add(jLabel16);
        jLabel16.setBounds(20, 40, 100, 20);

        jLabel17.setBackground(new java.awt.Color(0, 102, 255));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Patient Name -");
        jPanel10.add(jLabel17);
        jLabel17.setBounds(20, 70, 100, 20);

        jLabel18.setBackground(new java.awt.Color(0, 102, 255));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Patient ID - ");
        jPanel10.add(jLabel18);
        jLabel18.setBounds(20, 100, 100, 20);

        jLabel19.setBackground(new java.awt.Color(0, 102, 255));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Admitted Date - ");
        jPanel10.add(jLabel19);
        jLabel19.setBounds(20, 130, 100, 20);

        jLabel20.setBackground(new java.awt.Color(0, 102, 255));
        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("Discharge Date -");
        jPanel10.add(jLabel20);
        jLabel20.setBounds(20, 160, 100, 20);

        jLabel21.setBackground(new java.awt.Color(0, 102, 255));
        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("Assigned Doctor - ");
        jPanel10.add(jLabel21);
        jLabel21.setBounds(20, 190, 130, 10);

        jLabel22.setBackground(new java.awt.Color(0, 102, 255));
        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setText("Notes - ");
        jPanel10.add(jLabel22);
        jLabel22.setBounds(20, 220, 110, 17);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setColumns(20);
        jTextArea2.setTabSize(0);
        jTextArea2.setText("test\ntest");
        jTextArea2.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel10.add(jScrollPane2);
        jScrollPane2.setBounds(130, 70, 130, 20);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea3.setColumns(20);
        jTextArea3.setTabSize(0);
        jTextArea3.setEnabled(false);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel10.add(jScrollPane3);
        jScrollPane3.setBounds(130, 250, 130, 20);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea4.setColumns(20);
        jTextArea4.setTabSize(0);
        jTextArea4.setText("test");
        jTextArea4.setEnabled(false);
        jScrollPane4.setViewportView(jTextArea4);

        jPanel10.add(jScrollPane4);
        jScrollPane4.setBounds(130, 40, 130, 20);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea5.setColumns(20);
        jTextArea5.setTabSize(0);
        jTextArea5.setEnabled(false);
        jScrollPane5.setViewportView(jTextArea5);

        jPanel10.add(jScrollPane5);
        jScrollPane5.setBounds(130, 100, 130, 20);

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea7.setColumns(20);
        jTextArea7.setTabSize(0);
        jTextArea7.setEnabled(false);
        jScrollPane7.setViewportView(jTextArea7);

        jPanel10.add(jScrollPane7);
        jScrollPane7.setBounds(130, 130, 130, 20);

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea8.setColumns(20);
        jTextArea8.setTabSize(0);
        jTextArea8.setEnabled(false);
        jScrollPane8.setViewportView(jTextArea8);

        jPanel10.add(jScrollPane8);
        jScrollPane8.setBounds(130, 160, 130, 20);

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea9.setColumns(20);
        jTextArea9.setTabSize(0);
        jTextArea9.setEnabled(false);
        jScrollPane9.setViewportView(jTextArea9);

        jPanel10.add(jScrollPane9);
        jScrollPane9.setBounds(130, 190, 130, 20);

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea10.setColumns(20);
        jTextArea10.setTabSize(0);
        jTextArea10.setEnabled(false);
        jScrollPane10.setViewportView(jTextArea10);

        jPanel10.add(jScrollPane10);
        jScrollPane10.setBounds(130, 220, 130, 20);

        jPanel4.add(jPanel10);
        jPanel10.setBounds(10, 10, 270, 290);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(160, 50, 290, 310);

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea6.setForeground(new java.awt.Color(255, 204, 0));
        jTextArea6.setRows(5);
        jTextArea6.setText("textField\nTextField");
        jScrollPane6.setViewportView(jTextArea6);

        jPanel3.add(jScrollPane6);
        jScrollPane6.setBounds(120, 10, 334, 30);

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
        jPanel8.setBounds(460, 50, 220, 120);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jPanel19.setLayout(null);

        jCalendar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        jPanel19.add(jCalendar1);
        jCalendar1.setBounds(0, 0, 220, 130);

        jPanel3.add(jPanel19);
        jPanel19.setBounds(460, 180, 220, 180);

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

    private void DoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoorActionPerformed
        JFrame settings = new RoomAdminListview();
        settings.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        settings.setVisible(true);
        if (this.isVisible()) {
            this.dispose();
        }
    }//GEN-LAST:event_DoorActionPerformed

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

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked

        if(jList3.getSelectedIndex() == 0) {
            JFrame RoomInfo = new PatientInfoShow();
            
            RoomInfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            RoomInfo.setVisible(true);
                    if (this.isVisible()) {
        this.dispose();
    }
           
        }
    }//GEN-LAST:event_jList3MouseClicked

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
            java.util.logging.Logger.getLogger(PatientInfoShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientInfoShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientInfoShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientInfoShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientInfoShow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton Door;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton InfoButton;
    private javax.swing.JButton Settings;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    // End of variables declaration//GEN-END:variables
}