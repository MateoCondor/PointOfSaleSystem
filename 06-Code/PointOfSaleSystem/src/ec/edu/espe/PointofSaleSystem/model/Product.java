package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE, DAMAGE SE
 */
public class Product {
    private String productName;
    private float productPrice;
    private String productID;
    private int productQuantity;

    
    public Product(String productName, float productPrice, String productID, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productID = productID;
        this.productQuantity = productQuantity;
    }

    
    public Product(String productName, float productPrice, String productID) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productID = productID;
    }
    
    @Override
    public String toString() {
        return  productName + ";" + productPrice + ";" + productID + ";" + productQuantity ;
    }
    
    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the productPrice
     */
    public float getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice the productPrice to set
     */
    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * @return the productID
     */
    public String getProductID() {
        return productID;
    }

    /**
     * @param productID the productID to set
     */
    public void setProductID(String productID) {
        this.productID = productID;
    }

    /**
     * @return the productQuantity
     */
    public int getProductQuantity() {
        return productQuantity;
    }

    /**
     * @param productQuantity the productQuantity to set
     */
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
    
}
