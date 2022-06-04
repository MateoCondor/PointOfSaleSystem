package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class EmployeeeUser {
    private String employeeUser;
    private String employeePassword;

    /**
     * @return the employeeUser
     */
    public String getEmployeeUser() {
        return employeeUser;
    }

    /**
     * @param employeeUser the employeeUser to set
     */
    public void setEmployeeUser(String employeeUser) {
        this.employeeUser = employeeUser;
    }

    /**
     * @return the employeePassword
     */
    public String getEmployeePassword() {
        return employeePassword;
    }

    /**
     * @param employeePassword the employeePassword to set
     */
    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public EmployeeeUser(String employeeUser, String employeePassword) {
        this.employeeUser = employeeUser;
        this.employeePassword = employeePassword;
    }
    
    
}
