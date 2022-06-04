package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class PaymentlnVoice {
    private String supplierproductData;
    private String supplierData;

    public PaymentlnVoice(String supplierproductData, String supplierData) {
        this.supplierproductData = supplierproductData;
        this.supplierData = supplierData;
    }

    /**
     * @return the supplierproductData
     */
    public String getSupplierproductData() {
        return supplierproductData;
    }

    /**
     * @param supplierproductData the supplierproductData to set
     */
    public void setSupplierproductData(String supplierproductData) {
        this.supplierproductData = supplierproductData;
    }

    /**
     * @return the supplierData
     */
    public String getSupplierData() {
        return supplierData;
    }

    /**
     * @param supplierData the supplierData to set
     */
    public void setSupplierData(String supplierData) {
        this.supplierData = supplierData;
    }
    
    
}
