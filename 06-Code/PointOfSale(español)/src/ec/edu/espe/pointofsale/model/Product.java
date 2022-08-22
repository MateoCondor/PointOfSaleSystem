package ec.edu.espe.pointofsale.model;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class Product {
    private String productName;
    private String idProduct;
    private float price;
    private String supplier;
    private int quantity;
    private float totalprice;

    public Product(){
        
    }
    
    public Product(String name, float price, int quantity , float totalprice) {
        this.productName = name;
        this.price = price;
        this.quantity = quantity;
        this.totalprice = totalprice;
    }

    public Product(String id, String name, float price, String supplier){
        this.productName = name;
        this.idProduct = id;
        this.price = price;
        this.supplier = supplier;
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
     * @return the idProduct
     */
    public String getIdProduct() {
        return idProduct;
    }

    /**
     * @param idProduct the idProduct to set
     */
    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the supplier
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * @param supplier the supplier to set
     */
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the totalprice
     */
    public float getTotalprice() {
        return totalprice;
    }

    /**
     * @param totalprice the totalprice to set
     */
    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }


    
    

}
