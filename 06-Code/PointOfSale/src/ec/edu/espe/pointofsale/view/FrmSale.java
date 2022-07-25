package ec.edu.espe.pointofsale.view;

import ec.edu.espe.pointofsale.controller.SaleController;
import ec.edu.espe.pointofsale.controller.ValidateMethod;
import ec.edu.espe.pointofsale.model.Customer;
import ec.edu.espe.pointofsale.model.Product;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import org.bson.Document;
import utils.DataBaseManager;
import utils.DataCustomer;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class FrmSale extends javax.swing.JFrame {

    /**
     * Creates new form FrmSale
     */
    public FrmSale() {
        initComponents();
        Image icon = new ImageIcon(getClass().getResource("/pan.png")).getImage();
        setIconImage(icon);
        SpinnerNumberModel limit = new SpinnerNumberModel();
        limit.setMaximum(100);
        limit.setMinimum(0);
        spnQuantity.setModel(limit);
        setDefaultCloseOperation(0);
        SaleController names = new SaleController();
        names.getProducts(cmbProduct, txtPrice);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCustomer = new javax.swing.JTextField();
        spnQuantity = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtTotalPrice = new javax.swing.JTextField();
        lblCustomerError = new javax.swing.JLabel();
        lblQtyError = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbProduct = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnRegisterSale = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Register sale");

        jLabel2.setText("Customer:");

        jLabel3.setText("Product:");

        jLabel4.setText("Quantity:");

        txtCustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCustomerKeyPressed(evt);
            }
        });

        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        spnQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnQuantityStateChanged(evt);
            }
        });

        jLabel5.setText("Price:");

        jLabel6.setText("Total Price:");

        txtPrice.setEditable(false);
        txtPrice.setText("0");
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPriceKeyPressed(evt);
            }
        });

        txtTotalPrice.setEditable(false);
        txtTotalPrice.setText("0");

        lblCustomerError.setForeground(new java.awt.Color(204, 0, 0));
        lblCustomerError.setText("*");

        lblQtyError.setForeground(new java.awt.Color(204, 0, 0));
        lblQtyError.setText("*");

        jLabel7.setText("$");

        jLabel8.setText("$");

        cmbProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un producto" }));
        cmbProduct.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProductItemStateChanged(evt);
            }
        });
        cmbProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblQtyError, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCustomerError, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbProduct, 0, 172, Short.MAX_VALUE)
                        .addGap(216, 216, 216))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lblCustomerError))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQtyError))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(47, 47, 47))
        );

        btnRegisterSale.setText("Register");
        btnRegisterSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterSaleActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegisterSale)
                .addGap(88, 88, 88))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterSale)
                    .addComponent(btnBack))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmMenu view = new FrmMenu();
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterSaleActionPerformed
        Customer customer;
        Product product;
        SaleController saleC;
        saleC = new SaleController();

        String name;
        String productName;
        float price;
        int quantity;

        name = txtCustomer.getText();
        productName = cmbProduct.getSelectedItem().toString();
        price = Float.parseFloat(txtPrice.getText());
        quantity = Integer.parseInt(spnQuantity.getValue().toString());
        float totalprice = calculateTotalPrice(price, quantity);
        txtTotalPrice.setText(String.valueOf(totalprice));

        if(name != null 
                && productName != "Seleccione un producto"
                && price != 0
                && quantity != 0
                && totalprice != 0){
            
            customer = new Customer(name, "", 0, "");
            product = new Product(productName, price, quantity, totalprice);

            saleC.register(this, customer, product);
        }else{
            String message = "Please make sure all fields are filled";
            JOptionPane.showMessageDialog(this, message, "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_btnRegisterSaleActionPerformed

    private void spnQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnQuantityStateChanged
        int value = Integer.parseInt(spnQuantity.getValue().toString());
        if (value == 0) {
            lblQtyError.setText("*Insert a non-zero quantity");
        } else {
            lblQtyError.setText("");
        }
        
        float totalprice = calculateTotalPrice(Float.parseFloat(txtPrice.getText()),
                 Integer.parseInt(spnQuantity.getValue().toString()));
        txtTotalPrice.setText(String.valueOf(totalprice));
    }//GEN-LAST:event_spnQuantityStateChanged

    private void txtCustomerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerKeyPressed
        ValidateMethod validate = new ValidateMethod();
        validate.validateCharacters(evt, txtCustomer, lblCustomerError);
    }//GEN-LAST:event_txtCustomerKeyPressed

    private void txtPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyPressed

    }//GEN-LAST:event_txtPriceKeyPressed

    private void cmbProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductActionPerformed
        
    }//GEN-LAST:event_cmbProductActionPerformed

    private void cmbProductItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProductItemStateChanged
        String item = cmbProduct.getSelectedItem().toString();
        DataCustomer read = new DataBaseManager();
        Document doc = read.search("product", "productName", item);
        txtPrice.setText(String.valueOf(doc.getDouble("price")));
        float totalprice = calculateTotalPrice(Float.parseFloat(txtPrice.getText()),
                 Integer.parseInt(spnQuantity.getValue().toString()));
        txtTotalPrice.setText(String.valueOf(totalprice));
    }//GEN-LAST:event_cmbProductItemStateChanged

    private float calculateTotalPrice(float price, int quantity) {

        float totalprice = price * quantity;
        return totalprice;
    }

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
            java.util.logging.Logger.getLogger(FrmSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegisterSale;
    private javax.swing.JComboBox<String> cmbProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCustomerError;
    private javax.swing.JLabel lblQtyError;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
