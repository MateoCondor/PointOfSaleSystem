package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Inventory {
    private int productName;
    private int productValue;

    public Inventory(int productName, int productValue) {
        this.productName = productName;
        this.productValue = productValue;
    }

    /**
     * @return the productName
     */
    public int getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(int productName) {
        this.productName = productName;
    }

    /**
     * @return the productValue
     */
    public int getProductValue() {
        return productValue;
    }

    /**
     * @param productValue the productValue to set
     */
    public void setProductValue(int productValue) {
        this.productValue = productValue;
    }
    
    
}
