package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class Order {
    private String itemName;
    private String itemID;
    private int numberOrder;
    private float paymentAmount;
    private String orderDate;

    public Order(String itemName, String itemID, int numberOrder, float paymentAmount, String orderDate) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.numberOrder = numberOrder;
        this.paymentAmount = paymentAmount;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return itemName + ";" + itemID + ";" + numberOrder + ";" + paymentAmount + ";" + orderDate;
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
     * @return the numberOrder
     */
    public int getNumberOrder() {
        return numberOrder;
    }

    /**
     * @param numberOrder the numberOrder to set
     */
    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
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
