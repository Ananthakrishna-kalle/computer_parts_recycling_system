/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.Work;

import SystemModels.CustomerBooking.InventoryBooking;
import SystemModels.User.Employee.LogisticsMan;

/**
 *
 * @author kalle
 */
public class InventoryPickup extends WorkRequest{
    
    private LogisticsMan logisticsMan;
    private final InventoryBooking inventoryBooking;
    
    public InventoryPickup(InventoryBooking inventoryBooking) {
        this.inventoryBooking = inventoryBooking;
    }
    
        
    public LogisticsMan getLogisticsMan() {
        return logisticsMan;
    }

    public void setLogisticsMan(LogisticsMan logisticsMan) {
        this.logisticsMan = logisticsMan;
    }

    public InventoryBooking getInventoryBooking() {
        return inventoryBooking;
    }
    
    
    
}
