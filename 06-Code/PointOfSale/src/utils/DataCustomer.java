package utils;

import org.bson.Document;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public interface DataCustomer {

    public boolean create(Document doc, String coll);

    public boolean update(String coll, String dataName, String data, Document doc);

    public boolean delete(String coll,String dataName,String value);

    public Document search(String coll, String field, String value);

}
