package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class AdministratorUser {
    private String getEmployeUSer;
    private String getEmployePassword;
    private String getAdministrator;
    private String atribute;

    public AdministratorUser(String getEmployeUSer, String getEmployePassword, String getAdministrator, String atribute) {
        this.getEmployeUSer = getEmployeUSer;
        this.getEmployePassword = getEmployePassword;
        this.getAdministrator = getAdministrator;
        this.atribute = atribute;
    }

    /**
     * @return the getEmployeUSer
     */
    public String getGetEmployeUSer() {
        return getEmployeUSer;
    }

    /**
     * @param getEmployeUSer the getEmployeUSer to set
     */
    public void setGetEmployeUSer(String getEmployeUSer) {
        this.getEmployeUSer = getEmployeUSer;
    }

    /**
     * @return the getEmployePassword
     */
    public String getGetEmployePassword() {
        return getEmployePassword;
    }

    /**
     * @param getEmployePassword the getEmployePassword to set
     */
    public void setGetEmployePassword(String getEmployePassword) {
        this.getEmployePassword = getEmployePassword;
    }

    /**
     * @return the getAdministrator
     */
    public String getGetAdministrator() {
        return getAdministrator;
    }

    /**
     * @param getAdministrator the getAdministrator to set
     */
    public void setGetAdministrator(String getAdministrator) {
        this.getAdministrator = getAdministrator;
    }

    /**
     * @return the atribute
     */
    public String getAtribute() {
        return atribute;
    }

    /**
     * @param atribute the atribute to set
     */
    public void setAtribute(String atribute) {
        this.atribute = atribute;
    }
    
    
}
