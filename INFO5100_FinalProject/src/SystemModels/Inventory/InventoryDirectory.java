/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.Inventory;

import java.util.ArrayList;
import SystemModels.Inventory.Item.ItemStatus;
import SystemModels.Inventory.Item.ItemType;
import SystemModels.User.Customer.Resident;

/**
 *
 * @author kalle
 */
public class InventoryDirectory {
    
    ArrayList<Item> inventory;
    
    public InventoryDirectory() {
        this.inventory = new ArrayList<>();
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }
    
    public Item addToInventory(Item item) {
        this.inventory.add(item);
        return item;
    }
    
    public ArrayList<Item> getInventoryByResident(Resident resident) {
        ArrayList<Item> items = new ArrayList<>();
        for (Item item: this.inventory) {
            if (item.getRecievedFrom() == resident) items.add(item);
        }
        return items;
    }
    
    public ArrayList<Item> getInventoryByStatus(ItemStatus status) {
        ArrayList<Item> items = new ArrayList<>();
        for (Item item: this.inventory) {
            if (item.getStatus()== status) items.add(item);
        }
        return items;
    }
    
    public ArrayList<Item> getInventoryByType(ItemType itemType) {
        ArrayList<Item> items = new ArrayList<>();
        for (Item item: this.inventory) {
            if (item.getType()== itemType) items.add(item);
        }
        return items;
    }

}
