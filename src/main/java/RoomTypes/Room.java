package RoomTypes;
import Guests.Guest;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guestList;

    public Room() {
        this.guestList = new ArrayList<>();
    }

    public ArrayList<Guest> getGuestList(){
        return this.guestList;
    }

    public void addGuest(Guest guest){
        this.guestList.add(guest);
    }

    public void removeGuest(Guest guest){
        if (!guestList.remove(guest)) System.out.println("Guest not found in this room!");
    }
}
