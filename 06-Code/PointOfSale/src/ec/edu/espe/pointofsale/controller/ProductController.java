package ec.edu.espe.pointofsale.controller;

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
public class ProductController{
    
    public boolean register(JFrame frame,Product product){
        
        int reply;
        String message;
        message = "Are you sure you want to register the product?";
        reply = JOptionPane.showConfirmDialog(frame,message);
        DataCustomer fileManager = new DataBaseManager();
        Document d1 = new Document("idProduct",product.getIdProduct())
                .append("name", product.getProductName())
                .append("price", product.getPrice())
                .append("supplier",product.getSupplier());
        
        if(reply == JOptionPane.YES_OPTION){ 
            fileManager.create(d1,"product");
            JOptionPane.showMessageDialog(frame,"Saved","OK",JOptionPane.OK_OPTION);
        }else{
            JOptionPane.showMessageDialog(frame,"It was not saved","Warning",JOptionPane.CANCEL_OPTION);
        }
        
        return true;
    } 
}
