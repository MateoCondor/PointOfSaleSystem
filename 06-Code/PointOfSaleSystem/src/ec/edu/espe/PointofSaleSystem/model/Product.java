package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Product {
    private String ProductID;
    private String safeDate;
    private String timeofSale;

    public Product(String ProductID, String safeDate, String timeofSale) {
        this.ProductID = ProductID;
        this.safeDate = safeDate;
        this.timeofSale = timeofSale;
    }

    /**
     * @return the ProductID
     */
    public String getProductID() {
        return ProductID;
    }

    /**
     * @param ProductID the ProductID to set
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * @return the safeDate
     */
    public String getSafeDate() {
        return safeDate;
    }

    /**
     * @param safeDate the safeDate to set
     */
    public void setSafeDate(String safeDate) {
        this.safeDate = safeDate;
    }

    /**
     * @return the timeofSale
     */
    public String getTimeofSale() {
        return timeofSale;
    }

    /**
     * @param timeofSale the timeofSale to set
     */
    public void setTimeofSale(String timeofSale) {
        this.timeofSale = timeofSale;
    }
    
    
}
