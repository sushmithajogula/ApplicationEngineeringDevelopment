/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DoctorRole;

import Project.SmartCity.HealthcareRoles.Doctor;
import Project.SmartCity.HealthcareRoles.Patient;
import Project.SmartCity.HealthcareSystem.Appointment;
import Project.SmartCity.HealthcareSystem.Prescription;
import Project.SmartCity.SmartCity;
import Project.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harooniqbal
 */
public class DoctorCreatePrescriptionPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorCreatePrescriptionPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private SmartCity business;
    Doctor doctor;
    Patient patient;
    public DoctorCreatePrescriptionPanel(JPanel userProcessContainer, UserAccount account, SmartCity business) {
        initComponents();
        this.business = business;
        this.userAccount = account;
        this.userProcessContainer = userProcessContainer;
        for (Doctor c : business.getDoctorDirectory().getDoctorList()){
            if(c.getUsername().equals(userAccount.getUsername())){
                doctor = c;
                break;
            }
        }
        populateTable();
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
        jTableapps = new javax.swing.JTable();
        jButtongoto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablesymptoms = new javax.swing.JTable();
        jLabeldrugs = new javax.swing.JLabel();
        jTextFielddrugs = new javax.swing.JTextField();
        jButtongoto1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabeldrugs2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(206, 236, 206));

        jScrollPane1.setForeground(new java.awt.Color(0, 51, 51));

        jTableapps.setForeground(new java.awt.Color(0, 51, 51));
        jTableapps.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Appointment ID", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTableapps);

        jButtongoto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtongoto.setForeground(new java.awt.Color(0, 51, 51));
        jButtongoto.setText(">>");
        jButtongoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtongotoActionPerformed(evt);
            }
        });

        jScrollPane2.setForeground(new java.awt.Color(0, 51, 51));

        jTablesymptoms.setForeground(new java.awt.Color(0, 51, 51));
        jTablesymptoms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Symptoms"
            }
        ));
        jScrollPane2.setViewportView(jTablesymptoms);

        jLabeldrugs.setBackground(new java.awt.Color(204, 238, 204));
        jLabeldrugs.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabeldrugs.setForeground(new java.awt.Color(0, 51, 51));
        jLabeldrugs.setText("Enter Drugs:");

        jTextFielddrugs.setForeground(new java.awt.Color(0, 51, 51));

        jButtongoto1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtongoto1.setForeground(new java.awt.Color(0, 51, 51));
        jButtongoto1.setText("Create Prescription");
        jButtongoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtongoto1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 56, 82));
        jLabel6.setText("DOCTOR CREATE PRESCRIPTION");

        jLabeldrugs2.setBackground(new java.awt.Color(204, 238, 204));
        jLabeldrugs2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabeldrugs2.setForeground(new java.awt.Color(0, 51, 51));
        jLabeldrugs2.setText("View Appointments:");

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/prescriptionbg.png")); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/Logo.png")); // NOI18N
        jLabel11.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButtongoto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabeldrugs2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(343, 343, 343)
                                .addComponent(jButtongoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jLabeldrugs)
                                .addGap(32, 32, 32)
                                .addComponent(jTextFielddrugs, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(222, 222, 222)))))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabeldrugs2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButtongoto)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeldrugs)
                    .addComponent(jTextFielddrugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jButtongoto1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtongoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtongoto1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTableapps.getSelectedRow();
        
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select an appointment.");
            return;
        }
        
        if((jTextFielddrugs.getText()==null) || (jTextFielddrugs.getText().equals(""))){
            JOptionPane.showMessageDialog(this, "Please enter drugs.");
            return;
        }
        
        String[] drugs = jTextFielddrugs.getText().split(",",-2);
        Prescription p = patient.getPresdirectory().createPrescription(drugs);
        p.setStatus("Active");
        jTextFielddrugs.setText("");
        JOptionPane.showMessageDialog(this, "Prescription Created");
    }//GEN-LAST:event_jButtongoto1ActionPerformed

    private void jButtongotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtongotoActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTableapps.getSelectedRow();
        
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a appointment.");
            return;
        }
        
        DefaultTableModel records = (DefaultTableModel) jTableapps.getModel();
        Integer id = (Integer) records.getValueAt(selectedRowIndex, 0);
        
        Appointment a = doctor.getApplist().getAppointment(id);
        
        for(Patient p : business.getHospitalDirectory().getHospital(doctor.hospitalname).getPatientDirectory().getPatientList()){
           for(Appointment i : p.getApplist().getAppointmentList()){
               if(i.equals(a))
                   patient = p;
           }
        }
                   
        populateTable2(a);
        
    }//GEN-LAST:event_jButtongotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtongoto;
    private javax.swing.JButton jButtongoto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabeldrugs;
    private javax.swing.JLabel jLabeldrugs2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableapps;
    private javax.swing.JTable jTablesymptoms;
    private javax.swing.JTextField jTextFielddrugs;
    // End of variables declaration//GEN-END:variables
private void populateTable() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel records = (DefaultTableModel) jTableapps.getModel();
        records.setRowCount(0); //Clear empty records
        for(Appointment o : doctor.getApplist().getAppointmentList()){
            Object[] row = new Object[2];
            row[0] = o.getId();
            row[1] = o.getDate();
            
            records.addRow(row);
        }
    }

    private void populateTable2(Appointment a) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel records = (DefaultTableModel) jTablesymptoms.getModel();
        records.setRowCount(0); //Clear empty records
        for(String s : a.getSymptoms()){
            Object[] row = new Object[1];
            row[0] = s;
            
            records.addRow(row);
        }
    }
    
}
