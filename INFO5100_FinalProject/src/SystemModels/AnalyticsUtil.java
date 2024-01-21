/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels;


import java.util.ArrayList;
import java.util.HashMap;
import SystemModels.Inventory.Item;
import SystemModels.User.Client.Client;
import SystemModels.User.Customer.Resident;
import SystemModels.Work.InventoryPickup;

/**
 *
 * @author Vennela Bandla
 */
public class AnalyticsUtil {
    
    private static ArrayList<Item.ItemType> readyForSale;
    private static ArrayList<Item.ItemType> inInventory;
    
    // logistics dashboard
    public static int logisticsTripsMade(EcoSystem ecosystem) {
        return ecosystem.getWorkRequestDirectory().getInventoryPickups().size() + ecosystem.getWorkRequestDirectory().getRetailOrders().size();
    }
    
    public static int logisticsPersonell(EcoSystem ecosystem) {
        return ecosystem.getEmployeeDirectory().getLogisticsMen().size();
    }
    
    public static int logisticsEwasteMoved(EcoSystem ecosystem) {
        int total = 0;
        for (InventoryPickup pickup: ecosystem.getWorkRequestDirectory().getInventoryPickups()) {
            if (pickup.getStatus() != InventoryPickup.RequestStatus.ASSIGNED){
                for (Item item: pickup.getInventoryBooking().getItems()) total += item.getWeightApprox();
            }
        }
        return total;
    }
    
    
    // management dashboard
    public static int managementItemCount(EcoSystem ecosystem, Item.ItemType type) {
        int total = 0;
        for (Item item: ecosystem.getInventoryDirectory().getInventory()) {
            if ((item.getType()==type) && (item.getStatus() == Item.ItemStatus.READY_FOR_PRICING || item.getStatus() == Item.ItemStatus.READY_FOR_SALE || item.getStatus() == Item.ItemStatus.READY_FOR_PRICING)) total+=1;
        }
        return total;
    }
    
    public static int managementInventoryCount(EcoSystem ecosystem) {
        int total = 0;
        for (Item item: ecosystem.getInventoryDirectory().getInventory()) {
            if (item.getStatus() == Item.ItemStatus.PROCURED || item.getStatus() == Item.ItemStatus.IN_REPAIR || item.getStatus() == Item.ItemStatus.IN_QC) total+=1;
        }
        return total;
    }
    
    public static int managementOrderCount(EcoSystem ecosystem) {
        return ecosystem.getClientOrderDirectory().getBookings().size();
    }
    
    
    //retailer dashboard
    public static int retailerNewlyAddedItems(EcoSystem ecosystem, Item.ItemType type) {
        int total = 0;
//        for (Item item: ecosystem.getInventoryDirectory().getInventory()) {
//            if ((item.getType()==type) && ((Date) item.getRecievedOn()== (Date) LocalDateTime.now()) && (item.getStatus() == Item.ItemStatus.READY_FOR_PRICING || item.getStatus() == Item.ItemStatus.READY_FOR_SALE || item.getStatus() == Item.ItemStatus.READY_FOR_PRICING)) total+=1;
//        }
        return 0;
    }
    
    public static int retailerTotalItemsForSale(EcoSystem ecosystem, Item.ItemType type) {
        int total = 0;
        for (Item item: ecosystem.getInventoryDirectory().getInventory()) {
            if ((item.getType()==type) && (item.getStatus() == Item.ItemStatus.READY_FOR_PRICING || item.getStatus() == Item.ItemStatus.READY_FOR_SALE || item.getStatus() == Item.ItemStatus.READY_FOR_PRICING)) total+=1;
        }
        return total;
    } 
    
    public static int retailerMyOrders(EcoSystem ecosystem, Client client) {
        return ecosystem.getClientOrderDirectory().getOrdersByClient(client).size();
    }
    
    // individual dashboard
    public static int individualRecycleCount(EcoSystem ecosystem, Resident resident) {
        int count = 0;
        count = ecosystem.getInventoryDirectory().getInventory().stream().filter(item -> (item.getRecievedFrom() == resident && item.getType() == Item.ItemType.RECYCLE)).map(_item -> 1).reduce(count, Integer::sum);
        return count;
    }
    
    public static int individualRefurbCount(EcoSystem ecosystem, Resident resident) {
        int count = 0;
        count = ecosystem.getInventoryDirectory().getInventory().stream().filter(item -> (item.getRecievedFrom() == resident && item.getType() == Item.ItemType.REFURB)).map(_item -> 1).reduce(count, Integer::sum);
        return count;
    }
    
    public static HashMap<String, Integer> individualContributionByCategory(EcoSystem ecosystem, Resident resident) {
        HashMap<String, Integer> contibutionMap = new HashMap<>();
        contibutionMap.put("Home Appliances", 0);
        contibutionMap.put("Communications & IT Devices", 0);
        contibutionMap.put("Office and Medical Equipment", 0);
        contibutionMap.put("Home Entertainment Devices", 0);
        contibutionMap.put("Electronic Utilities", 0);
        contibutionMap.put("Other", 0);
        for (Item item: ecosystem.getInventoryDirectory().getInventoryByResident(resident)) {
            int count = contibutionMap.get(item.getCategory());
            contibutionMap.put(item.getCategory(), count+1);
        }
        return contibutionMap;
    }
    
}
