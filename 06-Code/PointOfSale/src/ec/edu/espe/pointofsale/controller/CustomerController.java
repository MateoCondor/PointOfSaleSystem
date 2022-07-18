package ec.edu.espe.pointofsale.controller;

import ec.edu.espe.pointofsale.model.Customer;
import utils.DataBaseManager;
import utils.DataCustomer;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class CustomerController {

    DataCustomer dataCustomer;

    public boolean register(Customer customer) {
        dataCustomer = new DataBaseManager();
        //dataCustomer.create("customers", customer);

        return true;
    }

    public boolean update(String criterion, Customer customer) {
        //dataCustomer.update("customers", criterion, customer);

        return false;
    }
    
    public boolean read(String source){
        //dataCustomer.read(source);
        return false;
    }
    
    public boolean delete(String criterion){
        dataCustomer.delete("customer", criterion);
        return false;
    }
            
}

