/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.customerScreen;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import DBConnection.DBConnect;
import com.db4o.ObjectSet;
import common.Enum.Status;
import java.util.ArrayList;
import model.PackageManagementEnterprise.Franchise;
import model.PackageManagementEnterprise.Package;

/**
 *
 * @author aishwaryanagaraj
 */
public class trackingInfoScreen extends javax.swing.JPanel {

    JPanel userProcessPanel;
    long trackingNumber;
    DBConnect dbConnect;

    public trackingInfoScreen(JPanel userProcessPanel, long trackingNumber) {
        this.userProcessPanel = userProcessPanel;
        this.trackingNumber = trackingNumber;
        initComponents();
        dbConnect = new DBConnect();
        populalateTrackingTable(trackingNumber);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        shipmentDetailsTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(860, 540));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Shipment Details");

        shipmentDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shipment ID", "Status", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(shipmentDetailsTable);
        if (shipmentDetailsTable.getColumnModel().getColumnCount() > 0) {
            shipmentDetailsTable.getColumnModel().getColumn(0).setResizable(false);
            shipmentDetailsTable.getColumnModel().getColumn(1).setResizable(false);
            shipmentDetailsTable.getColumnModel().getColumn(2).setResizable(false);
        }

        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessPanel.remove(this);
        CardLayout layout = (CardLayout) userProcessPanel.getLayout();
        layout.previous(userProcessPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable shipmentDetailsTable;
    // End of variables declaration//GEN-END:variables

    private void populalateTrackingTable(long trackingNumber) {
        DefaultTableModel model = (DefaultTableModel) shipmentDetailsTable.getModel();
        model.setRowCount(0);
        Package pkg = new Package();
        pkg.setTrackingId(trackingNumber);
        try {
            dbConnect.open();
            ObjectSet result = this.dbConnect.queryByExample(pkg);
            Package data = (Package) result.toArray()[0];
            dbConnect.close();
            for (Status s : data.getStatusHistory()) {
                // here
                Object[] row = new Object[3];
                row[0] = trackingNumber;
                row[1] = s.toString();
                row[2] = data.getCurrentLocationCity();
                model.addRow(row);
            }
        } catch (Exception e) {
        }
    }
}
