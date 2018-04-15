package RoomTypes;
import Guests.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guestList;

    public Room() {
        this.guestList = new ArrayList<>();
    }

    public int getDefaultCapacity(){
        return this.capacity;
    }

    public void setDefaultCapacity(int newCapacity){
         this.capacity = newCapacity;
    }

    public ArrayList<Guest> getGuestList(){
        return this.guestList;
    }

    public boolean addGuest(Guest guest){
        if (this.guestList.size() < this.capacity) {
            this.guestList.add(guest);
            return true;
        } else {
            System.out.println("Room is already full: guest not added.");
            return false;
        }
    }

    public boolean removeGuest(Guest guest){
        if (!guestList.remove(guest)) {
            System.out.println("Guest not found in this room!");
            return false;
        } else {
            return true;
        }
    }
}
