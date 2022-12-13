/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.employeeScreen;

import DBConnection.DBConnect;
import common.Enum.UserRole;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Employee;
import view.adminScreen.AdminMainScreen;
import view.adminScreen.transportAdminScreen;

/**
 *
 * @author akshb
 */
public class employeeLoginScreen extends javax.swing.JPanel {

    /**
     * Creates new form employeeLoginScreen
     */
    JPanel userProcessPanel;
    DBConnect dbConnect;
    Employee sessionUser;

    public employeeLoginScreen(JPanel userProcessPanel) {
        initComponents();
        this.userProcessPanel = userProcessPanel;
        this.dbConnect = new DBConnect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        employeeIDTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Employee Login");

        jLabel2.setText("Enter ID:");

        employeeIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeIDTextFieldActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(loginButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(employeeIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(304, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(employeeIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(loginButton)
                .addContainerGap(316, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void employeeIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeIDTextFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        try {
            int empId = Integer.parseInt(employeeIDTextField.getText());
            sessionUser = getEmployeeDetailById(empId);
            int role = sessionUser.getRole();

            switch (role) {
                case 0:
                    showSysAdminScreen();
                    break;
                case 1:
                    showEMSAdminScreen();
                    break;
                case 2:
                    showCSAdminScreen();
                    break;
                case 3:
                    showTAdminScreen();
                    break;
                case 4:
                    showRMScreen();
                    break;
                case 5:
                    showEmpScreen();
                    break;
                default:
//                    showEmpScreen();
                    //showSysAdminScreen();
                    //showTAdminScreen();
                    showCSAdminScreen();
//                    JOptionPane.showMessageDialog(userProcessPanel, "Please try logging with correct credentials", "Error while logging", 0);
            }

        } catch (Exception e) {
            System.err.println("Exception:" + e.getMessage());
            System.err.println("Exception:" + e.getStackTrace());
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    public Employee getEmployeeDetailById(int empId) {
        Employee proto = new Employee();
        proto.setEmployeeId(empId);
        dbConnect.open();
        ArrayList<Employee> empList = dbConnect.getListOf(proto);
        dbConnect.close();
        return empList.size() == 0 ? new Employee() : empList.get(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField employeeIDTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    // End of variables declaration//GEN-END:variables

    private void showEmpScreen() {
        employeeMainScreen empMainScreen = new employeeMainScreen(userProcessPanel);
        userProcessPanel.add("employeeMainScreen", empMainScreen);
        CardLayout layout = (CardLayout) userProcessPanel.getLayout();
        layout.next(userProcessPanel);
    }

    private void showSysAdminScreen() {
        AdminMainScreen adminMainScreen = new AdminMainScreen(userProcessPanel, sessionUser);
        userProcessPanel.add("AdminMainScreen", adminMainScreen);
        CardLayout layout = (CardLayout) userProcessPanel.getLayout();
        layout.next(userProcessPanel);
    }

    private void showCSAdminScreen() {
        customerServiceScreen customerServiceSc = new customerServiceScreen(userProcessPanel);
        userProcessPanel.add("customerServiceScreen", customerServiceSc);
        CardLayout layout = (CardLayout) userProcessPanel.getLayout();
        layout.next(userProcessPanel);
    }

    private void showEMSAdminScreen() {
        employeeMainScreen empMainScreen = new employeeMainScreen(userProcessPanel);
        userProcessPanel.add("empMainScreen", empMainScreen);
        CardLayout layout = (CardLayout) userProcessPanel.getLayout();
        layout.next(userProcessPanel);
    }

    private void showRMScreen() {
        employeeMainScreen empMainScreen = new employeeMainScreen(userProcessPanel);
        userProcessPanel.add("empMainScreen", empMainScreen);
        CardLayout layout = (CardLayout) userProcessPanel.getLayout();
        layout.next(userProcessPanel);
    }

    private void showTAdminScreen() {
        transportAdminScreen transportAdminSc = new transportAdminScreen(userProcessPanel);
        userProcessPanel.add("transportAdminScreen", transportAdminSc);
        CardLayout layout = (CardLayout) userProcessPanel.getLayout();
        layout.next(userProcessPanel);
    }
}
