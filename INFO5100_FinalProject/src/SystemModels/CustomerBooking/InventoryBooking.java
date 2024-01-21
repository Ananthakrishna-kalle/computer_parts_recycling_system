/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.CustomerBooking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;
import SystemModels.Inventory.Item;
import SystemModels.User.Customer.Resident;

/**
 *
 * @author Vennela Bandla
 */
public class InventoryBooking {
    
    private final String id;
    private final Resident resident;
    private final ArrayList<Item> items;
    private final LocalDateTime bookedOn;
    private final BookingType bookingType;
    private LocalDateTime requestedDateTime;
    private boolean assigned;
    
    public InventoryBooking(Resident resident, BookingType bookingType) {
        this.id = UUID.randomUUID().toString().substring(0,5);
        this.bookingType = bookingType;
        this.resident = resident;
        this.bookedOn = LocalDateTime.now();
        this.items = new ArrayList<>();
        this.assigned = false;
    }
    
    public enum BookingType {
        PICKUP,
        DROPOFF
    }

    public String getId() {
        return id;
    }

    public Resident getResident() {
        return resident;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public LocalDateTime getBookedOn() {
        return bookedOn;
    }

    public BookingType getBookingType() {
        return bookingType;
    }

    public LocalDateTime getRequestedDateTime() {
        return requestedDateTime;
    }

    public void setRequestedDateTime(LocalDateTime requestedDateTime) {
        this.requestedDateTime = requestedDateTime;
    }
    
    public void addToItems(Item item) {
        this.items.add(item);
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    
    
}
