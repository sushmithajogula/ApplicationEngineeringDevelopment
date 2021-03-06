/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.RestaurantAdminRole;

import Project.SmartCity.Establishment.Item;
import Project.SmartCity.Establishment.ItemDirectory;
import Project.SmartCity.Establishment.Menu;
import Project.SmartCity.Establishment.MenuItem;
import Project.SmartCity.Establishment.Restaurant;
import Project.SmartCity.Establishment.Shop;
import Project.SmartCity.SmartCity;
import Project.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harooniqbal
 */
public class RestaurantAdminManageMenuPanel extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantAdminManageMenuPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private SmartCity business;
    Restaurant restaurant;
    public RestaurantAdminManageMenuPanel(JPanel userProcessContainer, UserAccount account, SmartCity business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        for(Restaurant s:business.getRestaurantDirectory().getRestaurantList()){
            if(s.getUsername().equals(userAccount.getUsername())){
                restaurant = s;
                break;
        }
        }
        itemtxt.setEnabled(false);
        typetxt.setEnabled(false);
        costtxt.setEnabled(false);
        caltxt.setEnabled(false);
        addbtn.setEnabled(false); 
        confirmupdatebtn.setEnabled(false);  
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

        jScrollPane2 = new javax.swing.JScrollPane();
        menutbl = new javax.swing.JTable();
        plusbtn = new javax.swing.JButton();
        minusbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        itemtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        caltxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        costtxt = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        jLabeltype = new javax.swing.JLabel();
        typetxt = new javax.swing.JTextField();
        updatebtn = new javax.swing.JButton();
        confirmupdatebtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(212, 217, 235));
        setForeground(new java.awt.Color(0, 51, 51));

        menutbl.setForeground(new java.awt.Color(0, 51, 51));
        menutbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Menu Item", "Calories in Item", "Item Cost", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(menutbl);

        plusbtn.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        plusbtn.setForeground(new java.awt.Color(0, 51, 51));
        plusbtn.setText("Add Item");
        plusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusbtnActionPerformed(evt);
            }
        });

        minusbtn.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        minusbtn.setForeground(new java.awt.Color(0, 51, 51));
        minusbtn.setText("Remove Item");
        minusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusbtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Food Item:");

        itemtxt.setForeground(new java.awt.Color(0, 51, 51));
        itemtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemtxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Calories in Item:");

        caltxt.setForeground(new java.awt.Color(0, 51, 51));
        caltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caltxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Item Cost:");

        costtxt.setForeground(new java.awt.Color(0, 51, 51));
        costtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costtxtActionPerformed(evt);
            }
        });

        addbtn.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        addbtn.setForeground(new java.awt.Color(0, 51, 51));
        addbtn.setText("Add to Menu");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        jLabeltype.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabeltype.setForeground(new java.awt.Color(0, 51, 51));
        jLabeltype.setText("Type:");

        typetxt.setForeground(new java.awt.Color(0, 51, 51));
        typetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typetxtActionPerformed(evt);
            }
        });

        updatebtn.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(0, 51, 51));
        updatebtn.setText("Update Item");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        confirmupdatebtn.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        confirmupdatebtn.setForeground(new java.awt.Color(0, 51, 51));
        confirmupdatebtn.setText("Confirm Update");
        confirmupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmupdatebtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 56, 82));
        jLabel6.setText("RESTAURANT MENU");

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/restmenu.png")); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/menuicon.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(471, 471, 471)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(plusbtn)
                                .addGap(40, 40, 40)
                                .addComponent(minusbtn)
                                .addGap(32, 32, 32)
                                .addComponent(updatebtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addbtn)
                                        .addGap(95, 95, 95)
                                        .addComponent(confirmupdatebtn)
                                        .addGap(96, 96, 96))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(itemtxt)
                                            .addComponent(caltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(84, 84, 84)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabeltype))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(typetxt)
                                            .addComponent(costtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plusbtn)
                    .addComponent(minusbtn)
                    .addComponent(updatebtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(costtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(caltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(typetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabeltype)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn)
                    .addComponent(confirmupdatebtn))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void plusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusbtnActionPerformed
        // TODO add your handling code here:
        itemtxt.setEnabled(true);
        typetxt.setEnabled(true);
        costtxt.setEnabled(true);
        caltxt.setEnabled(true);
        addbtn.setEnabled(true);
    }//GEN-LAST:event_plusbtnActionPerformed

    private void minusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusbtnActionPerformed
        // TODO add your handling code here:
      int selectedRowIndex = menutbl.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be deleted.");
            return;
        }

        DefaultTableModel records = (DefaultTableModel) menutbl.getModel();
        String name = (String) records.getValueAt(selectedRowIndex, 0);
        MenuItem item = restaurant.getMenu().getItem(name);
        restaurant.getMenu().removeItem(item);
        populateTable();
    }//GEN-LAST:event_minusbtnActionPerformed

    private void itemtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemtxtActionPerformed

    private void caltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caltxtActionPerformed

    private void costtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costtxtActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
       try{
            
                    
                            Menu menu = restaurant.getMenu();
                            MenuItem item = menu.addItem(itemtxt.getText(),caltxt.getText(),costtxt.getText());
                            item.setType(typetxt.getText());
                            restaurant.setMenu(menu);
                            typetxt.setText("");
                            costtxt.setText("");
                            itemtxt.setText("");
                            caltxt.setText("");
                            typetxt.setEnabled(false);
                            costtxt.setEnabled(false);
                            caltxt.setEnabled(false);
                            itemtxt.setEnabled(false);
                            addbtn.setEnabled(false); 
                    }
                        catch(Exception e){
                            JOptionPane.showMessageDialog(this, e);
                        }
                   populateTable();
                   
    }//GEN-LAST:event_addbtnActionPerformed

    private void typetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typetxtActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        itemtxt.setEnabled(true);
        typetxt.setEnabled(true);
        costtxt.setEnabled(true);
        caltxt.setEnabled(true);
        confirmupdatebtn.setEnabled(true);
        int selectedRowIndex = menutbl.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be updated.");
            return;
        }
         DefaultTableModel records = (DefaultTableModel) menutbl.getModel();
        String name = (String) records.getValueAt(selectedRowIndex, 0);
        MenuItem item = restaurant.getMenu().getItem(name);
        itemtxt.setText(item.getName());
        typetxt.setText(item.getType());
        costtxt.setText(item.getCost());
        caltxt.setText(item.getCal());
    }//GEN-LAST:event_updatebtnActionPerformed

    private void confirmupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmupdatebtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = menutbl.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be updated.");
            return;
        }

        DefaultTableModel records = (DefaultTableModel) menutbl.getModel();
        String name = (String) records.getValueAt(selectedRowIndex, 0);
        MenuItem item = restaurant.getMenu().getItem(name);
        item.setName(itemtxt.getText());
        item.setType(typetxt.getText());
        item.setCost(costtxt.getText());
        item.setCal(caltxt.getText());
        typetxt.setText("");
                            costtxt.setText("");
                            itemtxt.setText("");
                             caltxt.setText("");
                            typetxt.setEnabled(false);
                            costtxt.setEnabled(false);
                            itemtxt.setEnabled(false);
                            caltxt.setEnabled(false);
                            confirmupdatebtn.setEnabled(false); 
                            populateTable();
    }//GEN-LAST:event_confirmupdatebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField caltxt;
    private javax.swing.JButton confirmupdatebtn;
    private javax.swing.JTextField costtxt;
    private javax.swing.JTextField itemtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabeltype;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable menutbl;
    private javax.swing.JButton minusbtn;
    private javax.swing.JButton plusbtn;
    private javax.swing.JTextField typetxt;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    DefaultTableModel records = (DefaultTableModel) menutbl.getModel();
        records.setRowCount(0); //Clear empty records
        
        for(MenuItem i : restaurant.getMenu().getItemList()){
            Object[] row = new Object[4];
            row[0] = i.getName();
            //row[0] = vs.getDate();
            row[3] = i.getType();
            row[2] = i.getCost();
            row[1] = i.getCal();
            records.addRow(row);
        }
    }
}
