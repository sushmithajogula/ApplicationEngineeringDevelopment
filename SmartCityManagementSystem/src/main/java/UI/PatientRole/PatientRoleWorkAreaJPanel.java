/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PatientRole;

import Project.SmartCity.SmartCity;
import Project.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author harooniqbal
 */
public class PatientRoleWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientRoleWorkAreaJPanel
     */
    private JPanel userProcessContainer;

    private UserAccount userAccount;
    
    private SmartCity business;
    

    public PatientRoleWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, SmartCity business) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    initComponents();
        this.business = business;
        this.userAccount = account;
        this.userProcessContainer = userProcessContainer;
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelpatientpanel = new javax.swing.JLabel();
        jButtonbookappointment = new javax.swing.JButton();
        jButtonviewhistory = new javax.swing.JButton();
        jButtongetprescription1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButtonviewprescription1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jSplitPane1.setDividerLocation(180);
        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(174, 221, 131));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));

        jLabelpatientpanel.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabelpatientpanel.setForeground(new java.awt.Color(0, 51, 51));
        jLabelpatientpanel.setText("PATIENT PANEL");

        jButtonbookappointment.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jButtonbookappointment.setForeground(new java.awt.Color(0, 51, 51));
        jButtonbookappointment.setText("Book Appointment");
        jButtonbookappointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbookappointmentActionPerformed(evt);
            }
        });

        jButtonviewhistory.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jButtonviewhistory.setForeground(new java.awt.Color(0, 51, 51));
        jButtonviewhistory.setText("View History");
        jButtonviewhistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonviewhistoryActionPerformed(evt);
            }
        });

        jButtongetprescription1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jButtongetprescription1.setForeground(new java.awt.Color(0, 51, 51));
        jButtongetprescription1.setText("Get Prescription");
        jButtongetprescription1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtongetprescription1ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/patienticon.png")); // NOI18N
        jLabel10.setText("jLabel10");

        jButtonviewprescription1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jButtonviewprescription1.setForeground(new java.awt.Color(0, 51, 51));
        jButtonviewprescription1.setText("View Prescription");
        jButtonviewprescription1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonviewprescription1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonviewprescription1)
                    .addComponent(jButtonviewhistory, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonbookappointment)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelpatientpanel))
                    .addComponent(jButtongetprescription1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(91, 91, 91)
                .addComponent(jLabelpatientpanel)
                .addGap(49, 49, 49)
                .addComponent(jButtonbookappointment)
                .addGap(50, 50, 50)
                .addComponent(jButtonviewhistory)
                .addGap(45, 45, 45)
                .addComponent(jButtongetprescription1)
                .addGap(39, 39, 39)
                .addComponent(jButtonviewprescription1)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 238, 204));
        jPanel2.setForeground(new java.awt.Color(0, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/patientbg.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonbookappointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbookappointmentActionPerformed
        // TODO add your handling code here:
        PatientBookAppointmentPanel bov = new PatientBookAppointmentPanel(this.userProcessContainer, this.userAccount, this.business);
        jSplitPane1.setRightComponent(bov); 
        
    }//GEN-LAST:event_jButtonbookappointmentActionPerformed

    private void jButtonviewhistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonviewhistoryActionPerformed
        // TODO add your handling code here:
        PatientViewAppointmentHistoryPanel bov = new PatientViewAppointmentHistoryPanel(this.userProcessContainer, this.userAccount, this.business);
        jSplitPane1.setRightComponent(bov);
    }//GEN-LAST:event_jButtonviewhistoryActionPerformed

    private void jButtongetprescription1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtongetprescription1ActionPerformed
        // TODO add your handling code here:
        PatientGetPrescriptionPanel bov = new PatientGetPrescriptionPanel(this.userProcessContainer, this.userAccount, this.business);
        jSplitPane1.setRightComponent(bov);
    }//GEN-LAST:event_jButtongetprescription1ActionPerformed

    private void jButtonviewprescription1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonviewprescription1ActionPerformed
        // TODO add your handling code here:
        PatientViewPrescriptionPanel bov = new PatientViewPrescriptionPanel(this.userProcessContainer, this.userAccount, this.business);
        jSplitPane1.setRightComponent(bov);
    }//GEN-LAST:event_jButtonviewprescription1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonbookappointment;
    private javax.swing.JButton jButtongetprescription1;
    private javax.swing.JButton jButtonviewhistory;
    private javax.swing.JButton jButtonviewprescription1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabelpatientpanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}