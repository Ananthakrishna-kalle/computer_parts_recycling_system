/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.sysadmin;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import SystemModels.EcoSystem;
import SystemModels.User.Employee.LogisticsMan;

/**
 *
 * @author Pranav Kashyap Komanduri
 */
public class LogisticsSysAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSysAdminLogisticsJPanel
     */
    JPanel jpanel6;
    EcoSystem ecosystem;
    LogisticsMan selectedLogisticsMan;
    public LogisticsSysAdminJPanel(JPanel ManageSysAdminLogistics, EcoSystem ecosystem) {
        this.ManageSysAdminLogisticsMainJPanel = ManageSysAdminLogistics;
        initComponents();
        this.ecosystem = ecosystem;
        this.populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManageSysAdminLogisticsMainJPanel = new javax.swing.JPanel();
        createLogisticsLabel = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        logisticsJTable = new javax.swing.JTable();
        nameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        ManageSysAdminLogisticsMainJPanel.setBackground(new java.awt.Color(0, 102, 102));

        createLogisticsLabel.setBackground(new java.awt.Color(204, 255, 204));
        createLogisticsLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        createLogisticsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createLogisticsLabel.setText("Create New Logistics Login");
        createLogisticsLabel.setOpaque(true);

        nameLbl.setBackground(new java.awt.Color(255, 255, 255));
        nameLbl.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(255, 255, 255));
        nameLbl.setText("Name :");

        logisticsJTable.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        logisticsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Username", "Password"
            }
        ));
        logisticsJTable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(logisticsJTable);

        nameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username :");

        usernameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        jLabel3.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password :");

        passwordTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        btnUpdate.setBackground(new java.awt.Color(204, 255, 204));
        btnUpdate.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(51, 51, 51));
        btnUpdate.setText("Update");
        btnUpdate.setBorderPainted(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(204, 255, 204));
        btnCreate.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.setBorderPainted(false);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 255, 204));
        btnDelete.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(51, 51, 51));
        btnDelete.setText("Delete");
        btnDelete.setBorderPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnModify.setBackground(new java.awt.Color(204, 255, 204));
        btnModify.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        btnModify.setForeground(new java.awt.Color(51, 51, 51));
        btnModify.setText("Modify");
        btnModify.setBorderPainted(false);
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("View Logistics Users");
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout ManageSysAdminLogisticsMainJPanelLayout = new javax.swing.GroupLayout(ManageSysAdminLogisticsMainJPanel);
        ManageSysAdminLogisticsMainJPanel.setLayout(ManageSysAdminLogisticsMainJPanelLayout);
        ManageSysAdminLogisticsMainJPanelLayout.setHorizontalGroup(
            ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createSequentialGroup()
                                .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(nameLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(37, 37, 37)
                                .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCreate))
                            .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(createLogisticsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModify))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        ManageSysAdminLogisticsMainJPanelLayout.setVerticalGroup(
            ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(createLogisticsLabel)
                .addGap(18, 18, 18)
                .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTextField)
                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        add(ManageSysAdminLogisticsMainJPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String name = nameTextField.getText();
        String password = passwordTextField.getText();
        if (!this.hasSelectedLogisticsMan()) return;
        if (password.equals("") || name.equals("")) {
                JOptionPane.showMessageDialog(this, "All fields are required");
                return;
            }
        this.selectedLogisticsMan.getUserAccount().setPassword(password);
        this.selectedLogisticsMan.setFullName(name);
        populateTable();
        nameTextField.setText("");
        usernameTextField.setText("");
        passwordTextField.setText("");
        JOptionPane.showMessageDialog(null, "Updated details");
        this.populateTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String name = nameTextField.getText();
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        if (username.equals("") || password.equals("") || name.equals("")) {
                JOptionPane.showMessageDialog(this, "All fields are required");
                return;
            }
        
        if(username.length()<3 || password.length()<5){
            JOptionPane.showMessageDialog(this, "Username minimum lenght should be 3 and Password minimum lenght should be 5!!");
            return;
        }
        if (this.ecosystem.getUserAccountDirectory().userNameExists(username)) {
                JOptionPane.showMessageDialog(this, "Username already taken!");
                return;
            }
        LogisticsMan logMan = new LogisticsMan(username, password);
        logMan.setFullName(name);
        this.ecosystem.getUserAccountDirectory().addUserAccount(logMan.getUserAccount());
        this.ecosystem.getEmployeeDirectory().addLogisticsMen(logMan);
        JOptionPane.showMessageDialog(null, "Logistics employee added successfully");
        this.populateTable();
        
        nameTextField.setText("");
        usernameTextField.setText("");
        passwordTextField.setText("");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (!this.hasSelectedLogisticsMan()) return;
        this.ecosystem.getEmployeeDirectory().removeLogisticsMan(this.selectedLogisticsMan);
        JOptionPane.showMessageDialog(this, "Employee entry deleted");
        this.populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        if (!this.hasSelectedLogisticsMan()) return;
        nameTextField.setText(this.selectedLogisticsMan.getFullName());
        usernameTextField.setText(this.selectedLogisticsMan.getUserAccount().getUsername());
        passwordTextField.setText(this.selectedLogisticsMan.getUserAccount().getPassword());
    }//GEN-LAST:event_btnModifyActionPerformed

    
    private boolean hasSelectedLogisticsMan() {
        int selectedRowIndex = logisticsJTable.getSelectedRow();
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a logistics man");
            return false;
        }
        DefaultTableModel model = (DefaultTableModel) logisticsJTable.getModel();
        this.selectedLogisticsMan = (LogisticsMan) model.getValueAt(selectedRowIndex, 0);
        return true;
    }
    
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) logisticsJTable.getModel();
        model.setRowCount(0);
        for (LogisticsMan logisticsMan: this.ecosystem.getEmployeeDirectory().getLogisticsMen()) {
            Object[] row = new Object[3];
            row[0] = logisticsMan;
            row[1] = logisticsMan.getUserAccount().getUsername();
            row[2] = logisticsMan.getUserAccount().getPassword();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManageSysAdminLogisticsMainJPanel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel createLogisticsLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable logisticsJTable;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
