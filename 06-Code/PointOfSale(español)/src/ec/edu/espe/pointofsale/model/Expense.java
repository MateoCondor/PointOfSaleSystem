package ec.edu.espe.pointofsale.model;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class Expense {
    private String date;
    private float electricity;
    private float water;
    private float rent;
    private float gas;

    public Expense(){
        
    }
    public Expense(String date, float electricity, float water, float rent, float gas) {
        this.date = date;
        this.electricity = electricity;
        this.water = water;
        this.rent = rent;
        this.gas = gas;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the electricity
     */
    public float getElectricity() {
        return electricity;
    }

    /**
     * @param electricity the electricity to set
     */
    public void setElectricity(float electricity) {
        this.electricity = electricity;
    }

    /**
     * @return the water
     */
    public float getWater() {
        return water;
    }

    /**
     * @param water the water to set
     */
    public void setWater(float water) {
        this.water = water;
    }

    /**
     * @return the rent
     */
    public float getRent() {
        return rent;
    }

    /**
     * @param rent the rent to set
     */
    public void setRent(float rent) {
        this.rent = rent;
    }

    /**
     * @return the gas
     */
    public float getGas() {
        return gas;
    }

    /**
     * @param gas the gas to set
     */
    public void setGas(float gas) {
        this.gas = gas;
    }

    
    
}
