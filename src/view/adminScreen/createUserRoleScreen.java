/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.adminScreen;

import DBConnection.DBConnect;
import common.RandomGen;
import java.awt.CardLayout;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Employee;

/**
 *
 * @author aishwaryanagaraj
 */
public class createUserRoleScreen extends javax.swing.JPanel {

    /**
     * Creates new form createAdminScreen
     */
    JPanel userProcessPanel;
    Employee sessionUser;
    long updateEmpId;
    DBConnect dbConnect;
    Employee updateEmployee;
            
    public createUserRoleScreen(JPanel userProcessPanel, Employee sessionUser, long empId) {
        initComponents();
        dbConnect = new DBConnect();
        this.userProcessPanel = userProcessPanel;
        this.sessionUser = sessionUser;
        this.updateEmpId = empId;
        populateUserRoleDropdown();
        populateCityDropdown();
        if (updateEmpId != 0)
        {
            Employee emp = new Employee();
            emp.setEmployeeId(updateEmpId);
            dbConnect.open();
            updateEmployee = (Employee) dbConnect.queryByExample(emp).next();
            dbConnect.close();
            getDataInForm();
        }
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
        jPanel4 = new javax.swing.JPanel();
        cityDropdown = new javax.swing.JComboBox<>();
        lastNameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userRoleDropdown = new javax.swing.JComboBox<>();
        emailTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(866, 510));
        setMinimumSize(new java.awt.Dimension(866, 510));
        setPreferredSize(new java.awt.Dimension(866, 510));

        heading_LB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        heading_LB.setText("New User Role");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("City:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Last Name:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel4.setText("User Role:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel1.setText("First Name:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        userRoleDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userRoleDropdownActionPerformed(evt);
            }
        });

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Email:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24)
                        .addComponent(userRoleDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5))
                            .addComponent(jLabel6)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cityDropdown, javax.swing.GroupLayout.Alignment.TRAILING, 0, 193, Short.MAX_VALUE)
                                .addComponent(lastNameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(firstNameTextField, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cityDropdown, emailTextField, firstNameTextField, jLabel1, jLabel2, jLabel4, jLabel5, jLabel6, lastNameTextField, userRoleDropdown});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(userRoleDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cityDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cityDropdown, emailTextField, firstNameTextField, jLabel1, jLabel2, jLabel4, jLabel5, jLabel6, lastNameTextField, userRoleDropdown});

        createButton.setBackground(new java.awt.Color(255, 204, 204));
        createButton.setText("Create User Role");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        backButton.setBackground(new java.awt.Color(255, 204, 204));
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245)
                .addComponent(heading_LB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 234, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(366, 366, 366))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(heading_LB))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(createButton)
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getDataInForm() {

        firstNameTextField.setText(updateEmployee.getFirstName());
        lastNameTextField.setText(updateEmployee.getLastName());
        userRoleDropdown.setSelectedIndex(updateEmployee.getRole());
        cityDropdown.setSelectedIndex(updateEmployee.getCity());
        emailTextField.setText(updateEmployee.getEmail());
        
    }

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        boolean status = validateUserRole();
        String email = emailTextField.getText();
            
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
            Pattern pat = Pattern.compile(emailRegex);
            boolean Valid = pat.matcher(email).matches();  
        if (status) {
            if(firstNameTextField.getText().equals("")){
              JOptionPane.showMessageDialog(this, "First name is empty");  
            }
            else if(lastNameTextField.getText().equals("")) {
              JOptionPane.showMessageDialog(this, "Last name is empty");    
            }
            else if(emailTextField.getText().equals("")) {
              JOptionPane.showMessageDialog(this, "email is empty");    
            }
            else if(Valid == false){
            JOptionPane.showMessageDialog(this, "Email invalid");
            }
            else{
                saveData();
                clearData();
            }
            
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessPanel.remove(this);
        CardLayout layout = (CardLayout) userProcessPanel.getLayout();
        layout.previous(userProcessPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void userRoleDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userRoleDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userRoleDropdownActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> cityDropdown;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel heading_LB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JComboBox<String> userRoleDropdown;
    // End of variables declaration//GEN-END:variables

    private void populateUserRoleDropdown() {
        for (Object role : common.Enum.UserRole.values()) {
            userRoleDropdown.addItem(role.toString());

        }
    }
    
    private void populateCityDropdown() {
        for (Object city : common.Enum.City.values()) {
            cityDropdown.addItem(city.toString());

        }
    }

    private boolean validateUserRole() {

        boolean status = false;
        if(sessionUser.getRole() == 1) {
            status  = userRoleDropdown.getSelectedIndex() == 4;
        }
        if(sessionUser.getRole() == 4) {
            status  = userRoleDropdown.getSelectedIndex() == 5;
        }
        if (sessionUser.getRole() == 0) {
            status = true;
        }
        if (!status) {
            JOptionPane.showMessageDialog(this, "Please select Valid Role", "Error", 2);
        }
        return status;
    }

    private void saveData() {
        if (updateEmpId == 0) {
            RandomGen rand = new RandomGen();
            Employee newEmployee = new Employee();
            newEmployee.setFirstName(firstNameTextField.getText());
            newEmployee.setLastName(lastNameTextField.getText());
            newEmployee.setEmployeeId(rand.getRandomEmployeeId());
            newEmployee.setRole(userRoleDropdown.getSelectedIndex());
            newEmployee.setCity(cityDropdown.getSelectedIndex());
            newEmployee.setEmail(emailTextField.getText());

            dbConnect.open();
            dbConnect.setEntity(newEmployee);
            dbConnect.close();
            JOptionPane.showMessageDialog(this, "Data Saved!!");

        } else 
        {
            updateEmployee.setFirstName(firstNameTextField.getText());
            updateEmployee.setLastName(lastNameTextField.getText());
            updateEmployee.setRole(userRoleDropdown.getSelectedIndex());
            updateEmployee.setCity(cityDropdown.getSelectedIndex());
            updateEmployee.setEmail(emailTextField.getText());

            dbConnect.open();
            dbConnect.setEntity(updateEmployee);
            dbConnect.close();
            JOptionPane.showMessageDialog(this, "Data Saved!!");
        
        }
        
    }

    private void clearData() {
            firstNameTextField.setText("");
            lastNameTextField.setText("");
            userRoleDropdown.setSelectedIndex(0);
            cityDropdown.setSelectedIndex(0);
            emailTextField.setText("");
    }

    
}
