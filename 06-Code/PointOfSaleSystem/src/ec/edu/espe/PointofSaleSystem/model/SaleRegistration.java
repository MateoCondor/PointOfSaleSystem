package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class SaleRegistration {
    private String numerofSafe;

    public SaleRegistration(String numerofSafe) {
        this.numerofSafe = numerofSafe;
    }

    /**
     * @return the numerofSafe
     */
    public String getNumerofSafe() {
        return numerofSafe;
    }

    /**
     * @param numerofSafe the numerofSafe to set
     */
    public void setNumerofSafe(String numerofSafe) {
        this.numerofSafe = numerofSafe;
    }
   
    
}