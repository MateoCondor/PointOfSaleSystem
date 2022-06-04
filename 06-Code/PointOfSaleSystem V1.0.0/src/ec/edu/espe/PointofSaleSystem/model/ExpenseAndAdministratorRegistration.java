package ec.edu.espe.PointofSaleSystem.model;

import java.util.ArrayList;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class ExpenseAndAdministratorRegistration {
    private String getEmployeUser;
    private String getEmployePassword;
    private String getAdministrator;

    public ExpenseAndAdministratorRegistration(String getEmployeUser, String getEmployePassword, String getAdministrator) {
        this.getEmployeUser = getEmployeUser;
        this.getEmployePassword = getEmployePassword;
        this.getAdministrator = getAdministrator;
    }

    /**
     * @return the getEmployeUser
     */
    public String getGetEmployeUser() {
        return getEmployeUser;
    }

    /**
     * @param getEmployeUser the getEmployeUser to set
     */
    public void setGetEmployeUser(String getEmployeUser) {
        this.getEmployeUser = getEmployeUser;
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

}
