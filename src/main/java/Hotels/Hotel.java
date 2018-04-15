package Hotels;

import Guests.Guest;
import RoomTypes.Room;
import java.util.ArrayList;

public class Hotel {

    private String name;
    private Room room;
    private ArrayList<Room> rooms;

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public String getName(){ return this.name; }

    public ArrayList<Room> getAllRoomsInHotel(){
        return this.rooms;
    }

    public Room getRoom(int whichRoom){
        return this.rooms.get(whichRoom);
    }

    public void addRoom(Room roomToAdd){
        this.rooms.add(roomToAdd);
    }

    public boolean isGuestAlreadyCheckedIn(Guest guest){

        for (Room room: rooms){
            if (room.getGuestList().contains(guest)){
                return true;
            }
        }
        return false;
    }

    public boolean guestCheckIn(int whichRoom, Guest guest) {
        if (!isGuestAlreadyCheckedIn(guest)) {
            room = this.rooms.get(whichRoom);
            if (room.addGuest(guest)){
            rooms.set(whichRoom, room);
            return true;
            } else {
            return false;}
        } else {
            System.out.println("Guest is already checked in!");
            return false;
        }
    }

    public void guestCheckOut(int whichRoom, Guest guest){
        room = this.rooms.get(whichRoom);
        room.removeGuest(guest);
        rooms.set(whichRoom, room);
    }

    public ArrayList<Guest> getGuestsInRoom(int whichRoom){
        room = this.rooms.get(whichRoom);
        return room.getGuestList();
    }

}