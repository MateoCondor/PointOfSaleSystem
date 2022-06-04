package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Existence {
    private Float productExistence;

    /**
     * @return the productExistence
     */
    public Float getProductExistence() {
        return productExistence;
    }

    /**
     * @param productExistence the productExistence to set
     */
    public void setProductExistence(Float productExistence) {
        this.productExistence = productExistence;
    }

    public Existence(Float productExistence) {
        this.productExistence = productExistence;
    }
    
}
