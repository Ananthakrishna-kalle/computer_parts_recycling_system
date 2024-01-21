/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.CustomerBooking;

import java.util.ArrayList;
import SystemModels.User.Customer.Resident;

/**
 *
 * @author Vennela Bandla
 */
public class BookingDirectory {
    
    private ArrayList<InventoryBooking> bookings;
    
    public BookingDirectory() {
        this.bookings = new ArrayList<>();
    }

    public ArrayList<InventoryBooking> getBookings() {
        return bookings;
    }
    
    public InventoryBooking addBooking(InventoryBooking booking) {
        this.bookings.add(booking);
        return booking;
    }
    
    public ArrayList<InventoryBooking> getBookingsByResident(Resident resident) {
        ArrayList<InventoryBooking> residentBookings = new ArrayList<>();
        for (InventoryBooking booking: this.bookings) {
            if (booking.getResident() == resident) {
                residentBookings.add(booking);
            }
        }
        return residentBookings;
    }
    
    public InventoryBooking getNextPendingBooking() {
        for (InventoryBooking booking: this.bookings) {
            if (!booking.isAssigned()) return booking;
        }
        return null;
    }
}
