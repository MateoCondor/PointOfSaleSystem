package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class ExpenseData {
    private int waterCost;
    private int lighCost;
    private int rentCost;

    /**
     * @return the waterCost
     */
    public int getWaterCost() {
        return waterCost;
    }

    public ExpenseData(int waterCost, int lighCost, int rentCost) {
        this.waterCost = waterCost;
        this.lighCost = lighCost;
        this.rentCost = rentCost;
    }

    /**
     * @param waterCost the waterCost to set
     */
    public void setWaterCost(int waterCost) {
        this.waterCost = waterCost;
    }

    /**
     * @return the lighCost
     */
    public int getLighCost() {
        return lighCost;
    }

    /**
     * @param lighCost the lighCost to set
     */
    public void setLighCost(int lighCost) {
        this.lighCost = lighCost;
    }

    /**
     * @return the rentCost
     */
    public int getRentCost() {
        return rentCost;
    }

    /**
     * @param rentCost the rentCost to set
     */
    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }
    
    
}
