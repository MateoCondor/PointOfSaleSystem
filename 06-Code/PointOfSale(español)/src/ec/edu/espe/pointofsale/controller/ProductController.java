package ec.edu.espe.pointofsale.controller;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.pointofsale.model.Product;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import org.bson.Document;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import utils.DataBaseManager;
import utils.DataCustomer;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class ProductController {

    public boolean register(JFrame frame, Product product) {

        int reply;
        String message;
        message = "Are you sure you want to register the product?";
        reply = JOptionPane.showConfirmDialog(frame, message);
        DataCustomer fileManager = new DataBaseManager();
        Document d1 = new Document("idProduct", product.getIdProduct())
                .append("productName", product.getProductName())
                .append("price", product.getPrice())
                .append("supplier", product.getSupplier());

        if (reply == JOptionPane.YES_OPTION) {
            fileManager.create(d1, "product");
            JOptionPane.showMessageDialog(frame, "Saved", "OK", JOptionPane.OK_OPTION);
        } else {
            JOptionPane.showMessageDialog(frame, "It was not saved", "Warning", JOptionPane.CANCEL_OPTION);
        }

        return true;
    }

    public boolean update(JFrame frame,String dataName, String data, Product updateProduct) {

        int reply;
        String message;
        message = "Are you sure you want update this product?";
        reply = JOptionPane.showConfirmDialog(frame, message);
        
        Document updateDoc = new Document("idProduct", updateProduct.getIdProduct())
                .append("productName", updateProduct.getProductName())
                .append("price", updateProduct.getPrice())
                .append("supplier", updateProduct.getSupplier());

        DataCustomer fileManager = new DataBaseManager();
        if (reply == JOptionPane.YES_OPTION) {
            fileManager.update("product", dataName, data, updateDoc);
            JOptionPane.showMessageDialog(frame, "Updated", "OK", JOptionPane.OK_OPTION);
        } else {
            JOptionPane.showMessageDialog(frame, "It was not updated", "Warning", JOptionPane.CANCEL_OPTION);
        }

        return true;
    }
    
    public boolean delete(JFrame frame, String dataName, String data){
        int reply;
        String message;
        message = "Are you sure you want delete this product?";
        reply = JOptionPane.showConfirmDialog(frame, message);
        
        DataCustomer fileManager = new DataBaseManager();
        if (reply == JOptionPane.YES_OPTION) {
            
            fileManager.delete("product", dataName, data);
            JOptionPane.showMessageDialog(frame, "Deleted", "OK", JOptionPane.OK_OPTION);
        } else {
            JOptionPane.showMessageDialog(frame, "It was not deleted", "Warning", JOptionPane.CANCEL_OPTION);
        }
        return true;
    }
    
    public void populateProductTable(JTable tbl) {

        CodecRegistry codecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoDatabase db = DatabaseController.database.withCodecRegistry(codecRegistry);
        MongoCollection<Product> collection = db.getCollection("product", Product.class);
        List<Product> products = collection.find(new Document(), Product.class).into(new ArrayList<Product>());

        Object[][] objects = new Object[products.size()][4];

        for (int i = 0; i < products.size(); i++) {
            objects[i][0] = products.get(i).getIdProduct();
            objects[i][1] = products.get(i).getProductName();
            objects[i][2] = products.get(i).getPrice();
            objects[i][3] = products.get(i).getSupplier();

            tbl.setModel(new javax.swing.table.DefaultTableModel(
                    objects,
                    new String[]{
                        "Id", "Name", "Price", "Supplier"
                    }));
        }
    }

}
