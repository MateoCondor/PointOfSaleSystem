package ec.edu.espe.pointofsale.controller;

import ec.edu.espe.pointofsale.model.Customer;
import ec.edu.espe.pointofsale.model.Product;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.bson.Document;
import utils.DataBaseManager;
import utils.DataCustomer;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class SaleController {
        
    public boolean register(JFrame frame,Customer customer,Product product){
        
        int reply;
        String message;
        message = "Are you sure you want to save this sale?";
        
        reply = JOptionPane.showConfirmDialog(frame,message);
        DataCustomer fileManager = new DataBaseManager();
        Document d1 = new Document("customerName",customer.getCustomerName())
                .append("productName", product.getProductName())
                .append("price", product.getPrice())
                .append("quantity",product.getQuantity())
                .append("totalprice",product.getTotalprice());
        
        if(reply == JOptionPane.YES_OPTION){
            fileManager.create(d1,"sales");
            JOptionPane.showMessageDialog(frame,"Saved","OK",JOptionPane.OK_OPTION);
        }else{
            JOptionPane.showMessageDialog(frame,"It was not saved","Warning",JOptionPane.CANCEL_OPTION);
        }
        
        return true;
    }
}
