/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.Work;

import SystemModels.Inventory.Item;
import SystemModels.User.Employee.Technician;

/**
 *
 * @author kalle
 */
public class RefurbAssignment extends WorkRequest{
    
    private final Technician technician;
    private final Item item;
    
    public RefurbAssignment(Technician technician, Item item) {
        this.item = item;
        this.technician = technician;
    }

    public Technician getTechnician() {
        return technician;
    }

    public Item getItem() {
        return item;
    }
    
    @Override
    public String toString() {
        return this.getId();
    }
    
}
