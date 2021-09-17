/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CommuterRole;
import Project.SmartCity.SmartCity;
import Project.SmartCity.TransportationSystem.Bus;
import Project.SmartCity.TransportationSystem.BusDirectory;
import Project.SmartCity.TransportationSystem.Cruise;
import Project.SmartCity.TransportationSystem.CruiseDirectory;
import Project.SmartCity.TransportationSystem.Flight;
import Project.SmartCity.TransportationSystem.FlightDirectory;
import Project.SmartCity.TransportationSystem.Train;
import Project.SmartCity.TransportationSystem.TrainDirectory;
import Project.UserAccount.UserAccount;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harooniqbal
 */
public class CommuterViewServicesPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommuterViewServicesPanel
     */
    /*JButton busimage;
    JButton trainimage;
    JButton flightimage;
    JButton cruiseimage;*/
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private SmartCity business;
    String type = "";
    
    public CommuterViewServicesPanel(JPanel userProcessContainer, UserAccount account, SmartCity business) {
        initComponents();
       /* ImageIcon iconbus = new ImageIcon("");
        busimage = new JButton("");
        trainimage = new JButton("");
        flightimage = new JButton("");
        cruiseimage = new JButton("");*/
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jButtonbus = new javax.swing.JButton();
        jButtontrain = new javax.swing.JButton();
        jButtonflight = new javax.swing.JButton();
        jButtoncruise = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablecommuterviewservices = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel10.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/commuterworkpanel.png")); // NOI18N

        setBackground(new java.awt.Color(253, 232, 215));
        setForeground(new java.awt.Color(0, 51, 51));

        jButtonbus.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonbus.setForeground(new java.awt.Color(0, 51, 51));
        jButtonbus.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/Bus (1).png")); // NOI18N
        jButtonbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbusActionPerformed(evt);
            }
        });

        jButtontrain.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtontrain.setForeground(new java.awt.Color(0, 51, 51));
        jButtontrain.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/Train (1).png")); // NOI18N
        jButtontrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontrainActionPerformed(evt);
            }
        });

        jButtonflight.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonflight.setForeground(new java.awt.Color(0, 51, 51));
        jButtonflight.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/Flight (1).png")); // NOI18N
        jButtonflight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonflightActionPerformed(evt);
            }
        });

        jButtoncruise.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtoncruise.setForeground(new java.awt.Color(0, 51, 51));
        jButtoncruise.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/Cruise_3 (1).png")); // NOI18N
        jButtoncruise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncruiseActionPerformed(evt);
            }
        });

        jTablecommuterviewservices.setForeground(new java.awt.Color(0, 51, 51));
        jTablecommuterviewservices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Number", "Start Location", "Drop Location"
            }
        ));
        jScrollPane1.setViewportView(jTablecommuterviewservices);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 56, 82));
        jLabel6.setText("COMMUTER VIEW SERVICES");

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/commuterviewservices.png")); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/commutericon.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(242, 242, 242)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonbus)
                                .addGap(76, 76, 76)
                                .addComponent(jButtontrain)
                                .addGap(82, 82, 82)
                                .addComponent(jButtonflight)))
                        .addGap(83, 83, 83)
                        .addComponent(jButtoncruise)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonbus)
                    .addComponent(jButtontrain)
                    .addComponent(jButtonflight)
                    .addComponent(jButtoncruise))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbusActionPerformed
        // TODO add your handling code here:
        type="Bus";
        populateTable();
    }//GEN-LAST:event_jButtonbusActionPerformed

    private void jButtontrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontrainActionPerformed
        // TODO add your handling code here:
        type="Train";
        populateTable();
    }//GEN-LAST:event_jButtontrainActionPerformed

    private void jButtonflightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonflightActionPerformed
        // TODO add your handling code here:
        type="Flight";
        populateTable();
    }//GEN-LAST:event_jButtonflightActionPerformed

    private void jButtoncruiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncruiseActionPerformed
        // TODO add your handling code here:
        type="Cruise";
        populateTable();
    }//GEN-LAST:event_jButtoncruiseActionPerformed
    
    private void populateTable() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        DefaultTableModel records = (DefaultTableModel) jTablecommuterviewservices.getModel();
        
        switch(type){
            case "Bus":
                BusDirectory busDirectory = business.getBusDirectory();
                records.setRowCount(0); //Clear empty records

                for(Bus o : busDirectory.getBusList()){
                        Object[] row = new Object[4];
                        row[0] = o.getId();
                        //row[0] = vs.getDate();
                        row[1] = o.getNumber();
                        row[2] = o.getStartLocation();
                        row[3] = o.getDropLocation();

                        records.addRow(row);
                }
                break;
            case "Train":
                TrainDirectory trainDirectory = business.getTrainDirectory();
                records.setRowCount(0); //Clear empty records

                for(Train o : trainDirectory.getTrainList()){
                        Object[] row = new Object[4];
                        row[0] = o.getId();
                        //row[0] = vs.getDate();
                        row[1] = o.getNumber();
                        row[2] = o.getStartLocation();
                        row[3] = o.getDropLocation();

                        records.addRow(row);
                }
                break;
            case "Flight":
                FlightDirectory flightDirectory = business.getFlightDirectory();
                records.setRowCount(0); //Clear empty records

                for(Flight o : flightDirectory.getFlightList()){
                        Object[] row = new Object[4];
                        row[0] = o.getId();
                        //row[0] = vs.getDate();
                        row[1] = o.getNumber();
                        row[2] = o.getStartLocation();
                        row[3] = o.getDropLocation();

                        records.addRow(row);
                }
                break;
            case "Cruise":
                CruiseDirectory cruiseDirectory = business.getCruiseDirectory();
                records.setRowCount(0); //Clear empty records

                for(Cruise o : cruiseDirectory.getCruiseList()){
                        Object[] row = new Object[4];
                        row[0] = o.getId();
                        //row[0] = vs.getDate();
                        row[1] = o.getNumber();
                        row[2] = o.getStartLocation();
                        row[3] = o.getDropLocation();

                        records.addRow(row);
                }
                break;
            default:
                JOptionPane.showMessageDialog(this, "Please select either a bus, train, flight or a restaurant.");
                return;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonbus;
    private javax.swing.JButton jButtoncruise;
    private javax.swing.JButton jButtonflight;
    private javax.swing.JButton jButtontrain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablecommuterviewservices;
    // End of variables declaration//GEN-END:variables
}