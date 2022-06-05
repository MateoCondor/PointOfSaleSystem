/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class Customer {
    private String customerName;
    private int customerID;
    private int customerPhone;
    private String customerAddress;

    public Customer(String customerName, int customerID, int customerPhone, String customerAddress) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerName = " + getCustomerName() + ", customerID = " + getCustomerID() + ", customerPhone = " + getCustomerPhone() + ", customerAddress = " + getCustomerAddress() + '}';
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
