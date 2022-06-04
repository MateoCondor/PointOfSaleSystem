package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class NewProduct {
    private int getproductName;
    private int getProdcutValue;

    public NewProduct(int getproductName, int getProdcutValue) {
        this.getproductName = getproductName;
        this.getProdcutValue = getProdcutValue;
    }

    /**
     * @return the getproductName
     */
    public int getGetproductName() {
        return getproductName;
    }

    /**
     * @param getproductName the getproductName to set
     */
    public void setGetproductName(int getproductName) {
        this.getproductName = getproductName;
    }

    /**
     * @return the getProdcutValue
     */
    public int getGetProdcutValue() {
        return getProdcutValue;
    }

    /**
     * @param getProdcutValue the getProdcutValue to set
     */
    public void setGetProdcutValue(int getProdcutValue) {
        this.getProdcutValue = getProdcutValue;
    }
    
    
}
