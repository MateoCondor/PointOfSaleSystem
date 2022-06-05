/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
