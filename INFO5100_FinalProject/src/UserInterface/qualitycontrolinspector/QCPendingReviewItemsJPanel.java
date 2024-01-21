/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.qualitycontrolinspector;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import SystemModels.EcoSystem;
import SystemModels.Inventory.Item;
import SystemModels.Rewards.RewardsUtil;
import SystemModels.User.Employee.QCInspector;
import SystemModels.User.Employee.Technician;
import SystemModels.Work.QCInspection;
import SystemModels.Work.RefurbAssignment;
import SystemModels.Work.WorkRequest;

/**
 *
 * @author kalle
 */
public class QCPendingReviewItemsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QCPendingReviewItemsJPanel
     */
    
    JPanel jpanel12;
    EcoSystem ecosystem;
    QCInspector qcInspector;
    QCInspection selectedInspection;
    public QCPendingReviewItemsJPanel(JPanel pendingitems, EcoSystem ecosystem, QCInspector qcInspector) {
        initComponents();
        this.PendingReviewItemsJPanel = pendingitems;
        this.ecosystem = ecosystem;
        this.qcInspector = qcInspector;
       // this.selectedInspection = this.ecosystem.getWorkRequestDirectory().getQcInspections();
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

        PendingReviewItemsJPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendingitemsJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtitemid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmake = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtassignedtime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JTextField();
        btnassignrecycle = new javax.swing.JButton();
        btnassignrefurbish = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        PendingReviewItemsJPanel.setBackground(new java.awt.Color(0, 102, 102));

        pendingitemsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Comp. Parts", "Appliance", "Make", "Model", "Assigned Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pendingitemsJTable);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pending Inspection Items");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Item ID");

        txtitemid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        jLabel3.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Make");

        txtmake.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));
        txtmake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmakeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Assigned Time");

        txtassignedtime.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));
        txtassignedtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtassignedtimeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Status");

        txtstatus.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));
        txtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatusActionPerformed(evt);
            }
        });

        btnassignrecycle.setBackground(new java.awt.Color(204, 255, 204));
        btnassignrecycle.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        btnassignrecycle.setText("Mark for Recycling");
        btnassignrecycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignrecycleActionPerformed(evt);
            }
        });

        btnassignrefurbish.setBackground(new java.awt.Color(204, 255, 204));
        btnassignrefurbish.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        btnassignrefurbish.setText("Mark for Refurbishing");
        btnassignrefurbish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignrefurbishActionPerformed(evt);
            }
        });

        btnview.setBackground(new java.awt.Color(204, 255, 204));
        btnview.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        btnview.setText("View Details");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/data_pending_127px_black.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout PendingReviewItemsJPanelLayout = new javax.swing.GroupLayout(PendingReviewItemsJPanel);
        PendingReviewItemsJPanel.setLayout(PendingReviewItemsJPanelLayout);
        PendingReviewItemsJPanelLayout.setHorizontalGroup(
            PendingReviewItemsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PendingReviewItemsJPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PendingReviewItemsJPanelLayout.createSequentialGroup()
                .addGroup(PendingReviewItemsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PendingReviewItemsJPanelLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnview)
                        .addGap(87, 87, 87)
                        .addComponent(btnassignrecycle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PendingReviewItemsJPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtitemid, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(txtmake, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(txtassignedtime, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                .addGroup(PendingReviewItemsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PendingReviewItemsJPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(txtstatus)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PendingReviewItemsJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnassignrefurbish)
                        .addGap(110, 110, 110))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PendingReviewItemsJPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(PendingReviewItemsJPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        PendingReviewItemsJPanelLayout.setVerticalGroup(
            PendingReviewItemsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PendingReviewItemsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PendingReviewItemsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(PendingReviewItemsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PendingReviewItemsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtitemid, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmake, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtassignedtime, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PendingReviewItemsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnview, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnassignrecycle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnassignrefurbish, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        add(PendingReviewItemsJPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        if (!this.hasSelectedItem()) return;
        txtitemid.setText(this.selectedInspection.getItem().getId());
        txtmake.setText(this.selectedInspection.getItem().getMake());
        txtassignedtime.setText(this.selectedInspection.getRequestDate().format(formatter));
        txtstatus.setText(String.valueOf(this.selectedInspection.getStatus().name()));
    }//GEN-LAST:event_btnviewActionPerformed

    private void txtassignedtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtassignedtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtassignedtimeActionPerformed

    private void txtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatusActionPerformed

    private void txtmakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmakeActionPerformed

    private void btnassignrecycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignrecycleActionPerformed
        // TODO add your handling code here:
        
        if (!this.hasSelectedItem()) return;
        this.selectedInspection.setStatus(WorkRequest.RequestStatus.COMPLETED);
        this.selectedInspection.getItem().setStatus(Item.ItemStatus.READY_FOR_PRICING);
        this.selectedInspection.getItem().setType(Item.ItemType.RECYCLE);
        this.selectedInspection.setResolveDate(LocalDateTime.now());
        
        //decrease assignment count
        this.ecosystem.getWorkRequestDirectory().decreaseqcInspectionAssignmentCount(qcInspector);
        
        int rewardPoints = RewardsUtil.getRewardPoints(this.selectedInspection.getItem().getCategory(), this.selectedInspection.getItem().getSubCategory(), this.selectedInspection.getItem().getType().name());
        this.selectedInspection.getItem().getRecievedFrom().updateRewardPoints(rewardPoints);
        
        JOptionPane.showMessageDialog(this, "Inspection done successfully");
        this.populateTable();
        
        txtitemid.setText("");
        txtmake.setText("");
        txtassignedtime.setText("");
        txtstatus.setText("");
    }//GEN-LAST:event_btnassignrecycleActionPerformed

    private void btnassignrefurbishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignrefurbishActionPerformed
        // TODO add your handling code here:
        
        
        if (!this.hasSelectedItem()) return;
        this.selectedInspection.setStatus(WorkRequest.RequestStatus.COMPLETED);
        this.selectedInspection.getItem().setStatus(Item.ItemStatus.IN_REPAIR);
        this.selectedInspection.getItem().setType(Item.ItemType.REFURB);
        this.selectedInspection.setResolveDate(LocalDateTime.now());
        //decrease assignment count
        this.ecosystem.getWorkRequestDirectory().decreaseqcInspectionAssignmentCount(qcInspector);
        
        // assign to technician for refurb
        Technician technician =  this.ecosystem.getWorkRequestDirectory().getTechniciantoAssign();
        RefurbAssignment refurbAssignment = new RefurbAssignment(technician, this.selectedInspection.getItem());
        this.ecosystem.getWorkRequestDirectory().addRefurbAssignment(refurbAssignment);
        this.ecosystem.getWorkRequestDirectory().increaserefurbAssignmentMapCount(technician);
        
        JOptionPane.showMessageDialog(this, "Inspection done successfully");
        this.populateTable();
        
        txtitemid.setText("");
        txtmake.setText("");
        txtassignedtime.setText("");
        txtstatus.setText("");
    }//GEN-LAST:event_btnassignrefurbishActionPerformed
    
    private boolean hasSelectedItem() {
        int selectedRowIndex = pendingitemsJTable.getSelectedRow();
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select an entry");
            return false;
        }
        DefaultTableModel model = (DefaultTableModel) pendingitemsJTable.getModel();
        this.selectedInspection = (QCInspection) model.getValueAt(selectedRowIndex, 0);
        return true;
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) pendingitemsJTable.getModel();
        model.setRowCount(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        for (QCInspection inspection: this.ecosystem.getWorkRequestDirectory().getInspectionsByInspector(this.qcInspector)) {
            if (inspection.getStatus() == WorkRequest.RequestStatus.ASSIGNED){
                Object[] row = new Object[7];
                row[0] = inspection;
                row[1] = inspection.getItem().getCategory();
                row[2] = inspection.getItem().getSubCategory();
                row[3] = inspection.getItem().getMake();
                row[4] = inspection.getItem().getModel();
                row[5] = inspection.getRequestDate().format(formatter);
                row[6] = inspection.getStatus().name();
                model.addRow(row);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PendingReviewItemsJPanel;
    private javax.swing.JButton btnassignrecycle;
    private javax.swing.JButton btnassignrefurbish;
    private javax.swing.JButton btnview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pendingitemsJTable;
    private javax.swing.JTextField txtassignedtime;
    private javax.swing.JTextField txtitemid;
    private javax.swing.JTextField txtmake;
    private javax.swing.JTextField txtstatus;
    // End of variables declaration//GEN-END:variables
}
