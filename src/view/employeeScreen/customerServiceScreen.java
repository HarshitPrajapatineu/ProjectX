/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.employeeScreen;

import DBConnection.DBConnect;
import com.db4o.ObjectSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import model.customerServiceEnterprise.CustomerService;

/**
 *
 * @author aishwaryanagaraj
 */
public class customerServiceScreen extends javax.swing.JPanel {

    JPanel userProcessPanel;
    DBConnect dbConnect;
    private static final String EMPTY_STRING = "";
    
    public customerServiceScreen(JPanel userProcessPanel) {
        initComponents();
        this.userProcessPanel = userProcessPanel;
        dbConnect = new DBConnect();
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

        heading_LB = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        queriesTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resolutionTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        queryTextArea = new javax.swing.JTextArea();
        resolveButton = new javax.swing.JButton();
        answerQueryButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(866, 510));

        heading_LB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        heading_LB.setText("Customer Service");

        backButton.setText("Go Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        queriesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Query"
            }
        ));
        jScrollPane1.setViewportView(queriesTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/search.png"))); // NOI18N
        searchButton.setText(" Search");
        searchButton.setMaximumSize(new java.awt.Dimension(53, 25));
        searchButton.setMinimumSize(new java.awt.Dimension(53, 25));
        searchButton.setPreferredSize(new java.awt.Dimension(53, 25));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setText("Query:");

        resolutionTextArea.setColumns(20);
        resolutionTextArea.setRows(5);
        jScrollPane2.setViewportView(resolutionTextArea);

        jLabel2.setText("Resolution:");

        queryTextArea.setColumns(20);
        queryTextArea.setRows(5);
        jScrollPane3.setViewportView(queryTextArea);

        resolveButton.setText("Resolve");
        resolveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolveButtonActionPerformed(evt);
            }
        });

        answerQueryButton.setText("Answer Query");
        answerQueryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerQueryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(261, 261, 261)
                        .addComponent(heading_LB)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(resolveButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane3)
                                            .addComponent(jScrollPane2)))
                                    .addComponent(jScrollPane1))))
                        .addGap(12, 12, 12)
                        .addComponent(answerQueryButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(heading_LB))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(answerQueryButton)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resolveButton)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

    }//GEN-LAST:event_backButtonActionPerformed

    private void answerQueryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerQueryButtonActionPerformed
        
        CustomerService custService = new CustomerService();
        
        try {
            
            int selectedRow = queriesTable.getSelectedRow();
            if (selectedRow < 0) {
                showMessageDialog(this, "Please select a row.");
                return;
        }
            
            dbConnect.open();
            CustomerService CS = new CustomerService();
            ObjectSet result = dbConnect.queryByExample(CS.getClass());
            ArrayList<CustomerService> list = new ArrayList<CustomerService>();
            Object[] arr = result.toArray();
            for (Object o : arr) {
                CustomerService f = (CustomerService) o;
                list.add(f);
            }
            
            dbConnect.close();
            
            DefaultTableModel model = (DefaultTableModel) queriesTable.getModel();
            
            String Query = model.getValueAt(selectedRow,0).toString();
            
            queryTextArea.setText(Query);
        
            
            } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println("Exception:" + e.getMessage());
            System.err.println("Exception:" + e.getStackTrace());
        }
    }//GEN-LAST:event_answerQueryButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

    }//GEN-LAST:event_searchButtonActionPerformed

    private void resolveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolveButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) queriesTable.getModel();
        
        CustomerService custService = new CustomerService();
        
        
        try {
            
            //dbConnect.open();
            //CustomerService CS = new CustomerService();
            //ObjectSet result = dbConnect.queryByExample(custService.getClass());
            //ArrayList<CustomerService> list = new ArrayList<CustomerService>();
            //Object[] arr = result.toArray();
            //for (Object o : arr) {
             //   CustomerService f = (CustomerService) o;
             //   list.add(f);
                
                
            //}
            
            //dbConnect.close();
            
            String query = queryTextArea.getText();
            String answer = resolutionTextArea.getText();
            
            //custService.setQuestion(query);
            //custService.setAnswer(answer);
            
            //CustomerService css = new CustomerService();
            
            //custService = list != null ? list.stream().filter(a -> a.getQuestion()== (query)).findAny().orElse(null) : null;
            //custService.setAnswer(answer);
            
            CustomerService custServiceUpdated = new CustomerService();
            custServiceUpdated.setQuestion(query);
            custServiceUpdated.setAnswer("");
            dbConnect.open();
            ObjectSet resultUp = this.dbConnect.queryByExample(custServiceUpdated);
            
            CustomerService custServiceUpdated1 = new CustomerService();
            custServiceUpdated1 = (CustomerService)resultUp.next();
            String q = custServiceUpdated1.getQuestion();
            custServiceUpdated1.setQuestion(query);
            custServiceUpdated1.setAnswer(answer);
            dbConnect.close();
            
            
            //UPDATE BACK TO DB
            dbConnect.open();
            dbConnect.setEntity(custServiceUpdated1);
            dbConnect.close();
            
            //populateTable();
        
        }catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println("Exception:" + e.getMessage());
            System.err.println("Exception:" + e.getStackTrace());
        }
    }//GEN-LAST:event_resolveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answerQueryButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel heading_LB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable queriesTable;
    private javax.swing.JTextArea queryTextArea;
    private javax.swing.JTextArea resolutionTextArea;
    private javax.swing.JButton resolveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables


    private void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) queriesTable.getModel();
        
        CustomerService custService = new CustomerService();
        
        
        try {
            dbConnect.open();
            CustomerService CS = new CustomerService();
            ObjectSet result = dbConnect.queryByExample(CS.getClass());
            ArrayList<CustomerService> list = new ArrayList<CustomerService>();
            Object[] arr = result.toArray();
            for (Object o : arr) {
                CustomerService f = (CustomerService) o;
                list.add(f);
            }
            
            dbConnect.close();
            
            
            
            for(CustomerService cs : list){
                
                Object[] row = new Object[1];
                if ((cs.getAnswer()==null ||  cs.getAnswer()=="")&& cs.getQuestion()!=""){
                row[0] = cs.getQuestion();
                model.addRow(row);
                }
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println("Exception:" + e.getMessage());
            System.err.println("Exception:" + e.getStackTrace());
        }
        
    }
}