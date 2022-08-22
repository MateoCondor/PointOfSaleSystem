package ec.edu.espe.pointofsale.controller;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.pointofsale.model.Expense;
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
public class ExpenseController {
        public boolean register(JFrame frame,Expense expense){
        
        int reply;
        String message;
        message = "Are you sure you want save this bills?";
        
        reply = JOptionPane.showConfirmDialog(frame,message);
        DataCustomer fileManager = new DataBaseManager();
        Document d1 = new Document("date",expense.getDate())
                .append("electricity",expense.getElectricity())
                .append("water", expense.getWater())
                .append("rent", expense.getRent())
                .append("gas",expense.getGas());
        
        if(reply == JOptionPane.YES_OPTION){
            fileManager.create(d1,"expenses");
            JOptionPane.showMessageDialog(frame,"Saved","OK",JOptionPane.OK_OPTION);
        }else{
            JOptionPane.showMessageDialog(frame,"It was not saved","Warning",JOptionPane.CANCEL_OPTION);
        }
        
        return true;
    }
        
     public void populateExpenseTable(JTable tbl) {

        CodecRegistry codecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoDatabase db = DatabaseController.database.withCodecRegistry(codecRegistry);
        MongoCollection<Expense> collection = db.getCollection("expenses", Expense.class);
        List<Expense> products = collection.find(new Document(), Expense.class).into(new ArrayList<Expense>());

        Object[][] objects = new Object[products.size()][5];

        for (int i = 0; i < products.size(); i++) {
            objects[i][0] = products.get(i).getDate();
            objects[i][1] = products.get(i).getElectricity();
            objects[i][2] = products.get(i).getWater();
            objects[i][3] = products.get(i).getRent();
            objects[i][4] = products.get(i).getGas();

            tbl.setModel(new javax.swing.table.DefaultTableModel(
                    objects,
                    new String[]{
                        "Date", "Electricity", "Water", "Rent", "Gas"
                    }));
        }
    }
}
