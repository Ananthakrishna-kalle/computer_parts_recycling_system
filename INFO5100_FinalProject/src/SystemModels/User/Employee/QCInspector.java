/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.User.Employee;

import java.util.UUID;
import SystemModels.User.Person;
import SystemModels.Roles.QCInspectorRole;
import SystemModels.User.UserAccount;

/**
 *
 * @author Vennela Bandla
 */
public class QCInspector extends Person{
    
    final String eid;
    final UserAccount userAccount;
    
    public QCInspector(String username, String password) {
        this.userAccount = new UserAccount(username, password, new QCInspectorRole());
        this.eid = UUID.randomUUID().toString().substring(0,5);
    }

    public String getEid() {
        return eid;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }
    
    
}
