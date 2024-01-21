/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.User.Customer;

import java.util.ArrayList;
import SystemModels.User.UserAccount;

/**
 *
 * @author kalle
 */
public class CustomerDirectory {
    
    private ArrayList<Resident> residents;
    private ArrayList<Commercial> commercialCustomers;
    
    public CustomerDirectory() {
        this.residents = new ArrayList<>();
        this.commercialCustomers = new ArrayList<>();
    }
    
    public Resident addResidents(Resident resident) {
        this.residents.add(resident);
        return resident;
    }
    
    
    public Resident removeResident(Resident resident) {
        this.residents.remove(resident);
        return resident;
    }

    public ArrayList<Resident> getResidents() {
        return residents;
    }

    
    public Resident getResidentByUserAccount(UserAccount userAccount) {
        for (Resident resident: this.residents) {
            if (resident.getUserAccount() == userAccount) return resident;
        }
        return null;
    }
    
    
}
