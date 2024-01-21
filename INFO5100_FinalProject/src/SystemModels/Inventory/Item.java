/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.Inventory;

import java.time.LocalDateTime;
import java.util.UUID;
import SystemModels.Rewards.RewardsUtil;
import SystemModels.User.Customer.Resident;

/**
 *
 * @author kalle
 */
public class Item {
    
    private final String id;
    private final Resident recievedFrom;
    private final String category;
    private final String subCategory;
    private ItemCondition condition;
    private final LocalDateTime recievedOn;
    private LocalDateTime soldOn;
    private ItemStatus status;
    private ItemType type;
    private int price;
    
    private String make;
    private String model;
    private int manufactureYear;
    private float weightApprox;
    
    public Item(Resident recievedFrom, String category, String subCategory) {
        this.id = UUID.randomUUID().toString().substring(0,5);
        this.recievedFrom = recievedFrom;
        this.category = category;
        this.subCategory = subCategory;
        this.recievedOn = LocalDateTime.now();
        this.type = ItemType.TBD;
        this.status = ItemStatus.AWAITING;
    }
    
    public enum ItemCondition {
        INTACT,
        BROKEN,
    }
    
    public enum ItemStatus {
        AWAITING,
        PROCURED,
        IN_QC,
        IN_REPAIR,
        READY_FOR_PRICING,
        READY_FOR_SALE,
        BLOCKED_FOR_ORDER,
        SOLD
    }
    
    
    public enum ItemType {
        TBD,
        RECYCLE,
        REFURB
    }
    
    public int getRewardPoints() {
        int points = RewardsUtil.getRewardPoints(this.category, this.subCategory, this.type.name());
        if (type != ItemType.REFURB) return (int) ((this.weightApprox*points)/3);
        return points;
    }

    public String getId() {
        return id;
    }

    public Resident getRecievedFrom() {
        return recievedFrom;
    }

    public float getWeightApprox() {
        return weightApprox;
    }

    public void setWeightApprox(float weightApprox) {
        this.weightApprox = weightApprox;
    }

    public String getCategory() {
        return category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public ItemCondition getCondition() {
        return condition;
    }

    public void setCondition(ItemCondition condition) {
        this.condition = condition;
    }

    public LocalDateTime getRecievedOn() {
        return this.recievedOn;
    }

    public LocalDateTime getSoldOn() {
        return soldOn;
    }

    public void setSoldOn(LocalDateTime soldOn) {
        this.soldOn = soldOn;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.id;
    }
    
    
}
