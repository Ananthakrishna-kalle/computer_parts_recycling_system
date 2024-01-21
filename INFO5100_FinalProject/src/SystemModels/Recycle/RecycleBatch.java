/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.Recycle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;
import SystemModels.Inventory.Item;
import SystemModels.User.Client.Client;

/**
 *
 * @author kalle
 */
public class RecycleBatch {
    
    private ArrayList<Item> items;
    private int price;
    private Client soldTo;
    private String batchCategory;
    private LocalDateTime soldAt;
    private String id;
    
    public RecycleBatch() {
        this.items = new ArrayList<>();
        this.id = UUID.randomUUID().toString().substring(0,5);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public String getId() {
        return id;
    }

    
    public Item addItem(Item item) {
        this.items.add(item);
        return item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Client getSoldTo() {
        return soldTo;
    }

    public String getBatchCategory() {
        return batchCategory;
    }

    public void setBatchCategory(String batchCategory) {
        this.batchCategory = batchCategory;
    }
    

    public void setSoldTo(Client soldTo) {
        this.soldTo = soldTo;
    }

    public LocalDateTime getSoldAt() {
        return soldAt;
    }

    public void setSoldAt(LocalDateTime soldAt) {
        this.soldAt = soldAt;
    }

    @Override
    public String toString() {
        return this.id; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
