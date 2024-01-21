/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.Roles;

import SystemModels.EcoSystem;

import SystemModels.User.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Vennela Bandla
 */
public abstract class Role {
    
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem ecoSystem);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}