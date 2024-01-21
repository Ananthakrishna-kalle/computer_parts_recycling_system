/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.User;

import java.util.ArrayList;
import SystemModels.Roles.Role;

/**
 *
 * @author Vennela Bandla
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccounts;
    
    public UserAccountDirectory() {
        this.userAccounts = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccounts() {
        return userAccounts;
    }
    
    public UserAccount addUserAccount(UserAccount userAccount) {
        this.userAccounts.add(userAccount);
        return userAccount;
    }
    
    public void removeUserAccount(UserAccount userAccount) {
        this.userAccounts.remove(userAccount);
    }
    
    
    public boolean userNameExists(String username) {
        for (UserAccount userAccount: this.userAccounts) {
            if (userAccount.getUsername().equals(username)) return true;
        }
        return false;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : this.userAccounts)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Role role){
        UserAccount userAccount = new UserAccount(username, password, role);
        this.userAccounts.add(userAccount);
        return userAccount;
    }
    
    
}
