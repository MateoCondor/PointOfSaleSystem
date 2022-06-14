package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class Employee {
    private String employeUser;
    private String employePasword;

    public Employee(String employeUser, String employePasword) {
        this.employeUser = employeUser;
        this.employePasword = employePasword;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeUser=" + getEmployeUser() + ", employePasword=" + getEmployePasword() + '}';
    }
    
    
   public void registerNewEmployeeUser(){
       
   }
   
   public void registerNewEmployeePasword(){
       
   }

    /**
     * @return the employeUser
     */
    public String getEmployeUser() {
        return employeUser;
    }

    /**
     * @param employeUser the employeUser to set
     */
    public void setEmployeUser(String employeUser) {
        this.employeUser = employeUser;
    }

    /**
     * @return the employePasword
     */
    public String getEmployePasword() {
        return employePasword;
    }

    /**
     * @param employePasword the employePasword to set
     */
    public void setEmployePasword(String employePasword) {
        this.employePasword = employePasword;
    }
   
   
}

