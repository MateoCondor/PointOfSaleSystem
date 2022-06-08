package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE
 */
public class Expense {
    private float electricityBill;
    private float waterBill;
    private float rentBill;
    private float gasBill;

    public Expense(float electricityBill, float waterBill, float rentBill, float gasBill) {
        this.electricityBill = electricityBill;
        this.waterBill = waterBill;
        this.rentBill = rentBill;
        this.gasBill = gasBill;
    }
  
    /**
     * @return the electricityBill
     */
    public float getElectricityBill() {
        return electricityBill;
    }

    /**
     * @param electricityBill the electricityBill to set
     */
    public void setElectricityBill(float electricityBill) {
        this.electricityBill = electricityBill;
    }

    /**
     * @return the waterBill
     */
    public float getWaterBill() {
        return waterBill;
    }

    /**
     * @param waterBill the waterBill to set
     */
    public void setWaterBill(float waterBill) {
        this.waterBill = waterBill;
    }

    /**
     * @return the rentBill
     */
    public float getRentBill() {
        return rentBill;
    }

    /**
     * @param rentBill the rentBill to set
     */
    public void setRentBill(float rentBill) {
        this.rentBill = rentBill;
    }

    /**
     * @return the gasBill
     */
    public float getGasBill() {
        return gasBill;
    }

    /**
     * @param gasBill the gasBill to set
     */
    public void setGasBill(float gasBill) {
        this.gasBill = gasBill;
    }
}

