package ec.edu.espe.PointofSaleSystem.model;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE, DAMAGE SE
 */

public class Admin {
    private String getAdminUser;
    private String getAdminPassword;

    public Admin(String getAdminUser, String getAdminPassword) {
        this.getAdminUser = getAdminUser;
        this.getAdminPassword = getAdminPassword;
    }

    public void registerNewAdminUser(){
        
    }
    
    /**
     * @return the getAdminUser
     */
    public String getGetAdminUser() {
        return getAdminUser;
    }

    /**
     * @param getAdminUser the getAdminUser to set
     */
    public void setGetAdminUser(String getAdminUser) {
        this.getAdminUser = getAdminUser;
    }

    /**
     * @return the getAdminPassword
     */
    public String getGetAdminPassword() {
        return getAdminPassword;
    }

    /**
     * @param getAdminPassword the getAdminPassword to set
     */
    public void setGetAdminPassword(String getAdminPassword) {
        this.getAdminPassword = getAdminPassword;
    }
    
}
