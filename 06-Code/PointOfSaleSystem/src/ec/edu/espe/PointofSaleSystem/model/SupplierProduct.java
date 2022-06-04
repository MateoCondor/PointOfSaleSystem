package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class SupplierProduct {
    private String supplierProductID;
    private String dateofPurchase;
    private String shoppingTime;

    public SupplierProduct(String supplierProductID, String dateofPurchase, String shoppingTime) {
        this.supplierProductID = supplierProductID;
        this.dateofPurchase = dateofPurchase;
        this.shoppingTime = shoppingTime;
    }

    /**
     * @return the supplierProductID
     */
    public String getSupplierProductID() {
        return supplierProductID;
    }

    /**
     * @param supplierProductID the supplierProductID to set
     */
    public void setSupplierProductID(String supplierProductID) {
        this.supplierProductID = supplierProductID;
    }

    /**
     * @return the dateofPurchase
     */
    public String getDateofPurchase() {
        return dateofPurchase;
    }

    /**
     * @param dateofPurchase the dateofPurchase to set
     */
    public void setDateofPurchase(String dateofPurchase) {
        this.dateofPurchase = dateofPurchase;
    }

    /**
     * @return the shoppingTime
     */
    public String getShoppingTime() {
        return shoppingTime;
    }

    /**
     * @param shoppingTime the shoppingTime to set
     */
    public void setShoppingTime(String shoppingTime) {
        this.shoppingTime = shoppingTime;
    }
    
    
}
