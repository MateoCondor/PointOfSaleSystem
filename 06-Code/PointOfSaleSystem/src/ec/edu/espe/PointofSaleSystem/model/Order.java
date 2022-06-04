/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class Order {
    private String itemName;
    private String itemID;
    private int numeberOrder;
    private float paymentAmount;
    private String orderDate;

    public Order(String itemName, String itemID, int numeberOrder, float paymentAmount, String orderDate) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.numeberOrder = numeberOrder;
        this.paymentAmount = paymentAmount;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" + "itemName=" + getItemName() + ", itemID=" + getItemID() + ", numeberOrder=" + getNumeberOrder() + ", paymentAmount=" + getPaymentAmount() + ", orderDate=" + getOrderDate() + '}';
    }
    
    
    public void register(){
        
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemID
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    /**
     * @return the numeberOrder
     */
    public int getNumeberOrder() {
        return numeberOrder;
    }

    /**
     * @param numeberOrder the numeberOrder to set
     */
    public void setNumeberOrder(int numeberOrder) {
        this.numeberOrder = numeberOrder;
    }

    /**
     * @return the paymentAmount
     */
    public float getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * @param paymentAmount the paymentAmount to set
     */
    public void setPaymentAmount(float paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    
    
}
