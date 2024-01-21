/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.logistics;

import java.time.format.DateTimeFormatter;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import SystemModels.EcoSystem;
import SystemModels.User.Employee.LogisticsMan;
import SystemModels.Work.InventoryPickup;

/**
 *
 * @author kalle
 */
public class LogisticsProfilePastOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsProfilePastOrdersJPanel
     */
    JPanel jpanel3;
    EcoSystem ecosystem;
    LogisticsMan logisticsMan;
    public LogisticsProfilePastOrdersJPanel(JPanel LogisticsProfilePastOrdersJPanel, EcoSystem ecosystem, LogisticsMan logisticsMan) {
        this.LogisticsPastOrdersMain = LogisticsProfilePastOrdersJPanel;
        initComponents();
        this.ecosystem = ecosystem;
        this.logisticsMan = logisticsMan;
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

        LogisticsPastOrdersMain = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDropoffBooking = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        LogisticsPastOrdersMain.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Past Orders");
        jLabel4.setOpaque(true);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tblDropoffBooking.setAutoCreateRowSorter(true);
        tblDropoffBooking.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tblDropoffBooking.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        tblDropoffBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Resident Name", "Delivery Address", "Assigned Time", "Weight(lbs.)", "Status", "Completed Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDropoffBooking.setGridColor(new java.awt.Color(255, 255, 255));
        tblDropoffBooking.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jScrollPane1.setViewportView(tblDropoffBooking);

        javax.swing.GroupLayout LogisticsPastOrdersMainLayout = new javax.swing.GroupLayout(LogisticsPastOrdersMain);
        LogisticsPastOrdersMain.setLayout(LogisticsPastOrdersMainLayout);
        LogisticsPastOrdersMainLayout.setHorizontalGroup(
            LogisticsPastOrdersMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogisticsPastOrdersMainLayout.createSequentialGroup()
                .addGroup(LogisticsPastOrdersMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LogisticsPastOrdersMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LogisticsPastOrdersMainLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        LogisticsPastOrdersMainLayout.setVerticalGroup(
            LogisticsPastOrdersMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogisticsPastOrdersMainLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel4)
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        add(LogisticsPastOrdersMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblDropoffBooking.getModel();
        model.setRowCount(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        for (InventoryPickup pickup: this.ecosystem.getWorkRequestDirectory().getPickupsByLogisticMan(this.logisticsMan)) {
            Object[] row = new Object[7];
            row[0] = pickup.getInventoryBooking().getId();
            row[1] = pickup.getInventoryBooking().getResident().getFullName();
            row[2] = pickup.getInventoryBooking().getResident().getAddress();
            row[3] = pickup.getRequestDate().format(formatter);
            row[4] = pickup.getInventoryBooking().getResident().getAddress();
            row[5] = pickup.getStatus().name();
            row[5] = pickup.getResolveDate() == null ? "" : pickup.getResolveDate().format(formatter);
            model.addRow(row);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LogisticsPastOrdersMain;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDropoffBooking;
    // End of variables declaration//GEN-END:variables
}
