package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Customer {
    private String CusmtomerName;

    /**
     * @return the CusmtomerName
     */
    public String getCusmtomerName() {
        return CusmtomerName;
    }

    /**
     * @param CusmtomerName the CusmtomerName to set
     */
    public void setCusmtomerName(String CusmtomerName) {
        this.CusmtomerName = CusmtomerName;
    }

    public Customer(String CusmtomerName) {
        this.CusmtomerName = CusmtomerName;
    }
    
    
}
