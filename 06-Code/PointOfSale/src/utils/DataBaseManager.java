package utils;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.ReplaceOptions;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import ec.edu.espe.pointofsale.controller.DatabaseController;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class DataBaseManager implements DataCustomer {

    @Override
    public boolean create(Document doc, String coll) {

        MongoCollection<Document> collection = DatabaseController.database.getCollection(coll);
        collection.insertOne(doc);

        return true;
    }

    @Override
    public boolean update(String coll, String dataName, String data, Document doc) {
        ReplaceOptions opts = new ReplaceOptions().upsert(true);
        MongoCollection<Document> collection = DatabaseController.database.getCollection(coll);

        Bson query = eq(dataName, data);
        UpdateResult result = collection.replaceOne(query, doc, opts);

        return true;
    }

    @Override
    public boolean delete(String coll, String dataName, String data) {
        MongoCollection<Document> collection = DatabaseController.database.getCollection(coll);

        Bson query = eq(dataName, data);
        DeleteResult result = collection.deleteOne(query);
        
        return true;
    }

    @Override
    public Document search(String coll, String field, String value) {

        MongoCollection<Document> collection = DatabaseController.database.getCollection(coll);
        Bson filter = Filters.eq(field, value);
        Document resultDocument = collection.find(filter).first();

        return resultDocument;
    }
}
