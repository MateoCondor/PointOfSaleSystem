package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Supplier {
    private String supplierName;
    private String supplierAdress;
    private int supplierPhone;
    private String supplierProduct;
    private int supplierProductQuantity;
    private float supplierProductPrice;

    public Supplier(String supplierName, String supplierAdress, int supplierPhone, String supplierProduct, int supplierProductQuantity, float supplierProductPrice) {
        this.supplierName = supplierName;
        this.supplierAdress = supplierAdress;
        this.supplierPhone = supplierPhone;
        this.supplierProduct = supplierProduct;
        this.supplierProductQuantity = supplierProductQuantity;
        this.supplierProductPrice = supplierProductPrice;
    }

    /**
     * @return the supplierName
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * @param supplierName the supplierName to set
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * @return the supplierAdress
     */
    public String getSupplierAdress() {
        return supplierAdress;
    }

    /**
     * @param supplierAdress the supplierAdress to set
     */
    public void setSupplierAdress(String supplierAdress) {
        this.supplierAdress = supplierAdress;
    }

    /**
     * @return the supplierPhone
     */
    public int getSupplierPhone() {
        return supplierPhone;
    }

    /**
     * @param supplierPhone the supplierPhone to set
     */
    public void setSupplierPhone(int supplierPhone) {
        this.supplierPhone = supplierPhone;
    }

    /**
     * @return the supplierProduct
     */
    public String getSupplierProduct() {
        return supplierProduct;
    }

    /**
     * @param supplierProduct the supplierProduct to set
     */
    public void setSupplierProduct(String supplierProduct) {
        this.supplierProduct = supplierProduct;
    }

    /**
     * @return the supplierProductQuantity
     */
    public int getSupplierProductQuantity() {
        return supplierProductQuantity;
    }

    /**
     * @param supplierProductQuantity the supplierProductQuantity to set
     */
    public void setSupplierProductQuantity(int supplierProductQuantity) {
        this.supplierProductQuantity = supplierProductQuantity;
    }

    /**
     * @return the supplierProductPrice
     */
    public float getSupplierProductPrice() {
        return supplierProductPrice;
    }

    /**
     * @param supplierProductPrice the supplierProductPrice to set
     */
    public void setSupplierProductPrice(float supplierProductPrice) {
        this.supplierProductPrice = supplierProductPrice;
    }
}
