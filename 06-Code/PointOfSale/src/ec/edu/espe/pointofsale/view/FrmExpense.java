package ec.edu.espe.pointofsale.view;

import ec.edu.espe.pointofsale.controller.ExpenseController;
import ec.edu.espe.pointofsale.controller.ValidateMethod;
import ec.edu.espe.pointofsale.model.Expense;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class FrmExpense extends javax.swing.JFrame {

    private Object DateFormat;

    /**
     * Creates new form FrmExpense
     */
    public FrmExpense() {
        initComponents();
        setDefaultCloseOperation(0);
        Image icon = new ImageIcon(getClass().getResource("/pan.png")).getImage();
        setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel3 = new javax.swing.JPanel();
        txtWater = new javax.swing.JTextField();
        txtRent = new javax.swing.JTextField();
        txtGas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtElectricity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        lblElectricityError = new javax.swing.JLabel();
        lblWaterError = new javax.swing.JLabel();
        lblRentError = new javax.swing.JLabel();
        lblGasError = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtWater.setText("0");
        txtWater.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWaterKeyPressed(evt);
            }
        });

        txtRent.setText("0");
        txtRent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRentKeyPressed(evt);
            }
        });

        txtGas.setText("0");
        txtGas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGasKeyPressed(evt);
            }
        });

        jLabel6.setText("$");

        jLabel7.setText("$");

        jLabel8.setText("$");

        jLabel2.setText("Electricity:");

        jLabel9.setText("$");

        jLabel3.setText("Water:");

        jLabel4.setText("Rent:");

        jLabel5.setText("Gas:");

        txtElectricity.setText("0");
        txtElectricity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtElectricityKeyPressed(evt);
            }
        });

        jLabel10.setText("Register bills");

        dateChooser.setDateFormatString("dd/MM/yyyy");

        jLabel11.setText("Date:");

        lblElectricityError.setForeground(new java.awt.Color(204, 0, 0));
        lblElectricityError.setText("*");

        lblWaterError.setForeground(new java.awt.Color(255, 0, 51));
        lblWaterError.setText("*");

        lblRentError.setForeground(new java.awt.Color(255, 0, 0));
        lblRentError.setText("*");

        lblGasError.setForeground(new java.awt.Color(255, 0, 0));
        lblGasError.setText("*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtGas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGasError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtRent, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRentError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtWater, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblWaterError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtElectricity, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblElectricityError, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtElectricity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lblElectricityError))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lblWaterError))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(lblRentError))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(lblGasError))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(btnRegister)
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnBack))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmMenu view = new FrmMenu();
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        Expense expense;
        ExpenseController expenseController;
        expenseController = new ExpenseController();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

        String simpledate;
        float electricity;
        float water;
        float rent;
        float gas;
        try {
            simpledate = date.format(dateChooser.getDate());
            electricity = Float.parseFloat(txtElectricity.getText());
            water = Float.parseFloat(txtWater.getText());
            rent = Float.parseFloat(txtRent.getText());
            gas = Float.parseFloat(txtGas.getText());
            expense = new Expense(simpledate, electricity, water, rent, gas);
            if (simpledate != null
                    && electricity != 0
                    && water != 0
                    && rent != 0
                    && gas != 0) {
                expenseController.register(this, expense);
                txtElectricity.setText("0");
                txtGas.setText("0");
                txtRent.setText("0");
                txtWater.setText("0");
                dateChooser.setDate(null);
            } else {
                String message = "Please make sure all fields are filled";
                if (simpledate == null) {
                    JOptionPane.showMessageDialog(this, message, "Warning", JOptionPane.WARNING_MESSAGE);
                }
                JOptionPane.showMessageDialog(this, message, "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            String message = "Please make sure all fields are filled";
            JOptionPane.showMessageDialog(this, message, "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtElectricityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtElectricityKeyPressed
        ValidateMethod validate = new ValidateMethod();
        validate.validateFloat(evt, txtElectricity, lblElectricityError);

        char getKey = evt.getKeyChar();
        String value = txtElectricity.getText();
        int length = value.length();
        if (length > 4) {
            txtElectricity.setEditable(false);
            lblElectricityError.setText("*Only 4 digits please");
            if (getKey == KeyEvent.VK_BACK_SPACE) {
                txtElectricity.setEditable(true);
                lblElectricityError.setText("");
            }
        }
    }//GEN-LAST:event_txtElectricityKeyPressed

    private void txtWaterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWaterKeyPressed
        ValidateMethod validate = new ValidateMethod();
        validate.validateFloat(evt, txtWater, lblWaterError);

        char getKey = evt.getKeyChar();
        String value = txtWater.getText();
        int length = value.length();
        if (length > 4) {
            txtWater.setEditable(false);
            lblWaterError.setText("*Only 4 digits please");
            if (getKey == KeyEvent.VK_BACK_SPACE) {
                txtWater.setEditable(true);
                lblWaterError.setText("");
            }
        }
    }//GEN-LAST:event_txtWaterKeyPressed

    private void txtRentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRentKeyPressed
        ValidateMethod validate = new ValidateMethod();
        validate.validateFloat(evt, txtRent, lblRentError);

        char getKey = evt.getKeyChar();
        String value = txtRent.getText();
        int length = value.length();
        if (length > 4) {
            txtRent.setEditable(false);
            lblRentError.setText("*Only 4 digits please");
            if (getKey == KeyEvent.VK_BACK_SPACE) {
                txtRent.setEditable(true);
                lblRentError.setText("");
            }
        }
    }//GEN-LAST:event_txtRentKeyPressed

    private void txtGasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGasKeyPressed
        ValidateMethod validate = new ValidateMethod();
        validate.validateFloat(evt, txtGas, lblGasError);

        char getKey = evt.getKeyChar();
        String value = txtGas.getText();
        int length = value.length();
        if (length > 4) {
            txtGas.setEditable(false);
            lblGasError.setText("*Only 4 digits please");
            if (getKey == KeyEvent.VK_BACK_SPACE) {
                txtGas.setEditable(true);
                lblGasError.setText("");
            }
        }
    }//GEN-LAST:event_txtGasKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmExpense().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private com.toedter.calendar.JDateChooser dateChooser;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblElectricityError;
    private javax.swing.JLabel lblGasError;
    private javax.swing.JLabel lblRentError;
    private javax.swing.JLabel lblWaterError;
    private javax.swing.JTextField txtElectricity;
    private javax.swing.JTextField txtGas;
    private javax.swing.JTextField txtRent;
    private javax.swing.JTextField txtWater;
    // End of variables declaration//GEN-END:variables
}
