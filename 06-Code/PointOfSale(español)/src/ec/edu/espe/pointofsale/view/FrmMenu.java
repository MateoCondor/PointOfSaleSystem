package ec.edu.espe.pointofsale.view;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        setTitle("MENU");
        Image icon = new ImageIcon(getClass().getResource("/pan.png")).getImage();
        setIconImage(icon);
        setDefaultCloseOperation(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuBakerySystem = new javax.swing.JMenu();
        itemAbout = new javax.swing.JMenuItem();
        mnuRegisterNewUser = new javax.swing.JMenuItem();
        itemLogout = new javax.swing.JMenuItem();
        itemExit = new javax.swing.JMenuItem();
        mnuProduct = new javax.swing.JMenu();
        mnuRegisterNewProduct = new javax.swing.JMenuItem();
        mnuSeeProducts = new javax.swing.JMenuItem();
        mnuSale = new javax.swing.JMenu();
        mnuRegisterNewSale = new javax.swing.JMenuItem();
        mnuSeeSales = new javax.swing.JMenuItem();
        mnuExpense = new javax.swing.JMenu();
        mnuRegisterExpenses = new javax.swing.JMenuItem();
        mnuSeeAllExpense = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panadería-y-postre-logo-zen-simple-vector-logotipo-plantilla-214876100.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        mnuBakerySystem.setText("Sistema");

        itemAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itemAbout.setText("Acerca de");
        itemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAboutActionPerformed(evt);
            }
        });
        mnuBakerySystem.add(itemAbout);

        mnuRegisterNewUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnuRegisterNewUser.setText("Registrar nuevo usuario");
        mnuRegisterNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegisterNewUserActionPerformed(evt);
            }
        });
        mnuBakerySystem.add(mnuRegisterNewUser);

        itemLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        itemLogout.setText("Log-out");
        itemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLogoutActionPerformed(evt);
            }
        });
        mnuBakerySystem.add(itemLogout);

        itemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        itemExit.setText("Salir");
        itemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExitActionPerformed(evt);
            }
        });
        mnuBakerySystem.add(itemExit);

        jMenuBar1.add(mnuBakerySystem);

        mnuProduct.setText("Producto");
        mnuProduct.setToolTipText("");

        mnuRegisterNewProduct.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mnuRegisterNewProduct.setText("Registrar nuevo producto");
        mnuRegisterNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegisterNewProductActionPerformed(evt);
            }
        });
        mnuProduct.add(mnuRegisterNewProduct);

        mnuSeeProducts.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuSeeProducts.setText("Ver Productos");
        mnuSeeProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSeeProductsActionPerformed(evt);
            }
        });
        mnuProduct.add(mnuSeeProducts);

        jMenuBar1.add(mnuProduct);

        mnuSale.setText("Ventas");

        mnuRegisterNewSale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuRegisterNewSale.setText("Registrar nueva venta");
        mnuRegisterNewSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegisterNewSaleActionPerformed(evt);
            }
        });
        mnuSale.add(mnuRegisterNewSale);

        mnuSeeSales.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuSeeSales.setText("Ver ventas");
        mnuSeeSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSeeSalesActionPerformed(evt);
            }
        });
        mnuSale.add(mnuSeeSales);

        jMenuBar1.add(mnuSale);

        mnuExpense.setText("Pagos");

        mnuRegisterExpenses.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mnuRegisterExpenses.setText("Registrar Pagos");
        mnuRegisterExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegisterExpensesActionPerformed(evt);
            }
        });
        mnuExpense.add(mnuRegisterExpenses);

        mnuSeeAllExpense.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuSeeAllExpense.setText("Ver Pagos");
        mnuSeeAllExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSeeAllExpenseActionPerformed(evt);
            }
        });
        mnuExpense.add(mnuSeeAllExpense);

        jMenuBar1.add(mnuExpense);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExitActionPerformed
        int reply;
        String message;
        message = "Are you sure you want exit? ";
        reply = JOptionPane.showConfirmDialog(this,message,"Warning",JOptionPane.WARNING_MESSAGE);
        if(reply == JOptionPane.YES_OPTION){
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_itemExitActionPerformed

    private void itemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLogoutActionPerformed
        int reply;
        String message;
        message = "Are you sure you want logout? ";
        reply = JOptionPane.showConfirmDialog(this,message,"Warning",JOptionPane.WARNING_MESSAGE);
        if(reply == JOptionPane.YES_OPTION){
            FrmLogin view = new FrmLogin();
            view.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_itemLogoutActionPerformed

    private void itemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAboutActionPerformed
        FrmAbout view = new FrmAbout();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemAboutActionPerformed

    private void mnuRegisterNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegisterNewProductActionPerformed
        FrmProduct view = new FrmProduct();
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuRegisterNewProductActionPerformed

    private void mnuRegisterNewSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegisterNewSaleActionPerformed
        FrmSale view = new FrmSale();
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuRegisterNewSaleActionPerformed

    private void mnuRegisterExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegisterExpensesActionPerformed
        FrmExpense view = new FrmExpense();
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuRegisterExpensesActionPerformed

    private void mnuSeeProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSeeProductsActionPerformed
        FrmTableProduct view = new FrmTableProduct();
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuSeeProductsActionPerformed

    private void mnuRegisterNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegisterNewUserActionPerformed
        FrmRegister view = new FrmRegister();
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuRegisterNewUserActionPerformed

    private void mnuSeeSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSeeSalesActionPerformed
        FrmTableSale view = new FrmTableSale();
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuSeeSalesActionPerformed

    private void mnuSeeAllExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSeeAllExpenseActionPerformed
        FrmTableExpense view = new FrmTableExpense();
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuSeeAllExpenseActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAbout;
    private javax.swing.JMenuItem itemExit;
    private javax.swing.JMenuItem itemLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JMenu mnuBakerySystem;
    private javax.swing.JMenu mnuExpense;
    private javax.swing.JMenu mnuProduct;
    private javax.swing.JMenuItem mnuRegisterExpenses;
    private javax.swing.JMenuItem mnuRegisterNewProduct;
    private javax.swing.JMenuItem mnuRegisterNewSale;
    private javax.swing.JMenuItem mnuRegisterNewUser;
    private javax.swing.JMenu mnuSale;
    private javax.swing.JMenuItem mnuSeeAllExpense;
    private javax.swing.JMenuItem mnuSeeProducts;
    private javax.swing.JMenuItem mnuSeeSales;
    // End of variables declaration//GEN-END:variables
}
