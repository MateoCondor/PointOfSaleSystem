package utils;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import ec.edu.espe.pointofsale.controller.DatabaseController;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class DataBaseManager implements DataCustomer {

    @Override
    public String read(String coll) {
        MongoCollection<Document> collection = DatabaseController.database.getCollection(coll);

        return "";

    }

    @Override
    public boolean create(Document doc, String coll) {

        MongoCollection<Document> collection = DatabaseController.database.getCollection(coll);
        collection.insertOne(doc);

        return true;
    }

    @Override
    public boolean update(String table, String criterion, Document doc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String table, String criterion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Document search(String coll, String field, String value) {

        MongoCollection<Document> collection = DatabaseController.database.getCollection(coll);
        Bson filter = Filters.eq(field, value);
        Document resultDocument = collection.find(filter).first();

        return resultDocument;
    }
}
