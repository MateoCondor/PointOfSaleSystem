package ec.edu.espe.pointofsale.controller;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.pointofsale.model.Customer;
import ec.edu.espe.pointofsale.model.Product;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
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
public class SaleController {

    public boolean register(JFrame frame, Customer customer, Product product) {

        int reply;
        String message;
        message = "Are you sure you want to save this sale?";

        reply = JOptionPane.showConfirmDialog(frame, message);
        DataCustomer fileManager = new DataBaseManager();
        Document d1 = new Document("customerName", customer.getCustomerName())
                .append("productName", product.getProductName())
                .append("price", product.getPrice())
                .append("quantity", product.getQuantity())
                .append("totalprice", product.getTotalprice());

        if (reply == JOptionPane.YES_OPTION) {
            fileManager.create(d1, "sales");
            JOptionPane.showMessageDialog(frame, "Saved", "OK", JOptionPane.OK_OPTION);
        } else {
            JOptionPane.showMessageDialog(frame, "It was not saved", "Warning", JOptionPane.CANCEL_OPTION);
        }

        return true;
    }

    public void populateSaleTable(JTable tbl) {

        CodecRegistry codecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoDatabase db = DatabaseController.database.withCodecRegistry(codecRegistry);
        MongoCollection<Product> collection = db.getCollection("sales", Product.class);
        List<Product> products = collection.find(new Document(), Product.class).into(new ArrayList<Product>());
        MongoCollection<Customer> collection2 = db.getCollection("sales", Customer.class);
        List<Customer> products2 = collection.find(new Document(), Customer.class).into(new ArrayList<Customer>());

        Object[][] objects = new Object[products.size()][5];

        for (int i = 0; i < products.size(); i++) {
            objects[i][0] = products2.get(i).getCustomerName();
            objects[i][1] = products.get(i).getProductName();
            objects[i][2] = products.get(i).getPrice();
            objects[i][3] = products.get(i).getQuantity();
            objects[i][4] = products.get(i).getTotalprice();

            tbl.setModel(new javax.swing.table.DefaultTableModel(
                    objects,
                    new String[]{
                        "Customer", "Product", "Unit price", "Quantity", "Total price"
                    }));
        }
    }

    public void getProducts(JComboBox cmb, JTextField txt) {
        CodecRegistry codecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoDatabase db = DatabaseController.database.withCodecRegistry(codecRegistry);
        MongoCollection<Product> collection = db.getCollection("product", Product.class);
        List<Product> products = collection.find(new Document(), Product.class).into(new ArrayList<Product>());

        Object[][] objects = new Object[products.size()][2];

        for (int i = 0; i < products.size(); i++) {
            objects[i][0] = products.get(i).getProductName();
            objects[i][1] = products.get(i).getPrice();
            cmb.addItem(objects[i][0]);
        }
    }
}
