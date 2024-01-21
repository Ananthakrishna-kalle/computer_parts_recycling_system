/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.ClientOrder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;
import SystemModels.Inventory.Item;
import SystemModels.User.Client.Client;

/**
 *
 * @author kalle
 */
public class ClientOrder {
    
    private String id;
    private Client client;
    private ArrayList<Item> orderedItems;
    private LocalDateTime orderTime;
    private boolean assigned;
    
    public ClientOrder(Client client) {
        this.client = client;
        this.orderedItems = new ArrayList<>();
        this.id = UUID.randomUUID().toString().substring(0,5);
        this.orderTime = LocalDateTime.now();
        this.assigned = false;
    }

    public Client getClient() {
        return this.client;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    
    public ArrayList<Item> getOrderedItems() {
        return orderedItems;
    }
    
    public Item addItem(Item item) {
        this.orderedItems.add(item);
        return item;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }
    
    public int orderPrice() {
        int price = 0;
        price = this.getOrderedItems().stream().map(item -> item.getPrice()).reduce(price, Integer::sum);
        return price;
    }

    @Override
    public String toString() {
        return this.id;
    }
    
}
