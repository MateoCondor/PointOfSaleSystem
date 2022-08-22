package ec.edu.espe.pointofsale.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class DatabaseController {
    
    public static MongoDatabase database = null;
    
    
    public MongoDatabase conectionDb(){
        MongoClient mongoClient = MongoClients.create("mongodb+srv://admin00:adminp00@bakerydb.q3bylhk.mongodb.net/?retryWrites=true&w=majority");
        DatabaseController.database = mongoClient.getDatabase("Pointofsaledata");
        return DatabaseController.database;
    }
    
}
