package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class Customer {
    private String customerName;
    private String customerSurname;
    private int customerID;
    private int customerPhone;
    private String customerAddress;

    public Customer(String customerName, String customerSurname, int customerID, int customerPhone, String customerAddress) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerID = customerID;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
    }

    

    @Override
    public String toString() {
        return getCustomerName() + ";" + getCustomerSurname() + ";" + getCustomerID() + ";" + getCustomerPhone() + ";" + getCustomerAddress();
    }
    
    public void register(){
        
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the customerSurname
     */
    public String getCustomerSurname() {
        return customerSurname;
    }

    /**
     * @param customerSurname the customerSurname to set
     */
    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    /**
     * @return the customerID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the customerPhone
     */
    public int getCustomerPhone() {
        return customerPhone;
    }

    /**
     * @param customerPhone the customerPhone to set
     */
    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }

    /**
     * @return the customerAddress
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * @param customerAddress the customerAddress to set
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    
    
    
    
}
