package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class DailyReport {
    private String saleoftheDay;
    private String paymentotheDay;

    /**
     * @return the saleoftheDay
     */
    public String getSaleoftheDay() {
        return saleoftheDay;
    }

    /**
     * @param saleoftheDay the saleoftheDay to set
     */
    public void setSaleoftheDay(String saleoftheDay) {
        this.saleoftheDay = saleoftheDay;
    }

    /**
     * @return the paymentotheDay
     */
    public String getPaymentotheDay() {
        return paymentotheDay;
    }

    /**
     * @param paymentotheDay the paymentotheDay to set
     */
    public void setPaymentotheDay(String paymentotheDay) {
        this.paymentotheDay = paymentotheDay;
    }

    public DailyReport(String saleoftheDay, String paymentotheDay) {
        this.saleoftheDay = saleoftheDay;
        this.paymentotheDay = paymentotheDay;
    }
    
    
}
