package SystemModels;

import SystemModels.Roles.Role;
import SystemModels.Roles.SystemAdminRole;
import SystemModels.User.UserAccount;

/**
 *
 * @author Vennela Bandla
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new SystemAdminRole());
                
        return system;
    }
    
}
