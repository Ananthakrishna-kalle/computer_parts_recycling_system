/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.Roles;

import javax.swing.JPanel;
import SystemModels.EcoSystem;
import SystemModels.User.UserAccount;

/**
 *
 * @author Vennela Bandla
 */
public class ClientRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return null;
    }
}
