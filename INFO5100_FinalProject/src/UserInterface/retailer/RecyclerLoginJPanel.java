/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.retailer;

import UserInterface.MainJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import SystemModels.DB4OUtil.DB4OUtil;
import SystemModels.EcoSystem;
import SystemModels.Inventory.Item;
import SystemModels.Recycle.RecycleBatch;
import SystemModels.User.Client.Client;

/**
 *
 * @author Vennela Bandla
 */
public class RecyclerLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RecyclerLoginJPanel
     */
    
    JPanel jpanel15;
    EcoSystem ecosystem;
    Client client;
    ArrayList<Item> batchItems;
    int totalcountOfItems;
    public RecyclerLoginJPanel(JPanel RecyclerHome, EcoSystem ecosystem, Client client) {
        initComponents();
        this.ecosystem = ecosystem;
        this.client = client;
        this.RecyclerLoginHomeJPanel = RecyclerHome;
        welcometext.setText(client.getFullName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RecyclerLoginHomeJPanel = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcategory = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblrecycle = new javax.swing.JTable();
        btnbuy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        welcometext = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        RecyclerLoginHomeJPanel.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel1.setBackground(new java.awt.Color(0, 102, 102));
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 102, 102));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Computer Parts");

        txtcategory.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        txtcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptops", "Desktops", "Peripherals", "Semiconductor", "Cables", "Other" }));
        txtcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcategoryActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        tblrecycle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Batch ID", "Price", "Item Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblrecycle);

        btnbuy.setBackground(new java.awt.Color(203, 247, 194));
        btnbuy.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        btnbuy.setText("Accept Batch");
        btnbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Available Recyclable Items");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(txtcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(388, 388, 388))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(btnbuy)
                        .addGap(527, 527, 527))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        kGradientPanel2.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel2.setkGradientFocus(800);
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 102, 102));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(300, 1460));

        jLabel13.setBackground(new java.awt.Color(204, 255, 204));
        jLabel13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel13.setText("Computer Parts Recycling System");
        jLabel13.setOpaque(true);

        welcometext.setBackground(new java.awt.Color(204, 255, 204));
        welcometext.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        welcometext.setOpaque(true);

        logoutButton.setBackground(new java.awt.Color(204, 255, 204));
        logoutButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(51, 51, 51));
        logoutButton.setText("Logout");
        logoutButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcometext, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(welcometext, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout RecyclerLoginHomeJPanelLayout = new javax.swing.GroupLayout(RecyclerLoginHomeJPanel);
        RecyclerLoginHomeJPanel.setLayout(RecyclerLoginHomeJPanelLayout);
        RecyclerLoginHomeJPanelLayout.setHorizontalGroup(
            RecyclerLoginHomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1397, Short.MAX_VALUE)
            .addGroup(RecyclerLoginHomeJPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        RecyclerLoginHomeJPanelLayout.setVerticalGroup(
            RecyclerLoginHomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecyclerLoginHomeJPanelLayout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(RecyclerLoginHomeJPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void txtcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcategoryActionPerformed
        // TODO add your handling code here:
        this.batchItems = new ArrayList<>();
        this.totalcountOfItems = 0;
        String category = (String) txtcategory.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) tblrecycle.getModel();
        model.setRowCount(0);
        for(RecycleBatch batch: this.ecosystem.getRecycleBatchDirectory().getBatches()) {
            if(batch.getBatchCategory().equals(category)){

                Object[] row = new Object[3];
                row[0] = batch;
                row[1] = batch.getPrice();
                row[2] = batch.getItems().size();

                model.addRow(row);

            }
        }

    }//GEN-LAST:event_txtcategoryActionPerformed

    private void btnbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuyActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) tblrecycle.getModel();
        int selectedRowIndex = tblrecycle.getSelectedRow();
        RecycleBatch batch = (RecycleBatch) model.getValueAt(selectedRowIndex, 0);
        batch.setSoldTo(this.client);
        for(Item item : batch.getItems()){
            item.setStatus(Item.ItemStatus.SOLD);
        }
        JOptionPane.showMessageDialog(null, "Batch Sold!");

    }//GEN-LAST:event_btnbuyActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        DB4OUtil.getInstance().storeSystem(this.ecosystem);
        MainJPanel main = new MainJPanel(RecyclerLoginHomeJPanel);
        CardLayout layout = (CardLayout) RecyclerLoginHomeJPanel.getLayout();
        RecyclerLoginHomeJPanel.add("Home", main);

        layout.next(RecyclerLoginHomeJPanel);
    }//GEN-LAST:event_logoutButtonActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RecyclerLoginHomeJPanel;
    private javax.swing.JButton btnbuy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTable tblrecycle;
    private javax.swing.JComboBox<String> txtcategory;
    private javax.swing.JLabel welcometext;
    // End of variables declaration//GEN-END:variables
}
