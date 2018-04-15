import Guests.Guest;
import RoomTypes.Bedroom;
import RoomTypes.ConferenceRoom;
import RoomTypes.DiningRoom;
import RoomTypes.Type;
import RoomTypes.Room;
import Hotels.Hotel;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;
    private Guest guest6;
    private Guest guest7;
    private Guest guest8;
    private Guest guest9;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceroom;
    private DiningRoom diningroom;
    private Hotel hotel;
    private ArrayList<Room> listOfRooms;
    private Room room;
    private ArrayList<Guest> listOfGuests;
    private ArrayList<Guest> listOfGuests2;

    @Before
    public void before() {
        this.guest1 = new Guest("Susan", "2017-06-01", "2017-07-01");
        this.guest2 = new Guest("Bill", "2017-07-01", "2017-08-01");
        this.guest3 = new Guest("Sarah", "2017-09-01", "2017-10-01");
        this.guest4 = new Guest("Ben", "2017-11-01", "2017-12-01");
        this.guest5 = new Guest("Jim", "2018-01-01", "2018-02-01");
        this.guest6 = new Guest("Evelyn", "2018-03-01", "2018-04-01");
        this.guest7 = new Guest("Bob", "2018-05-01", "2018-06-01");
        this.guest8 = new Guest("Alice", "2018-07-01", "2018-08-01");
        this.guest9 = new Guest("Zach", "2018-09-01", "2018-10-01");
        this.bedroom1 = new Bedroom(1, Type.SINGLE, 45.2);
        this.bedroom2 = new Bedroom(2, Type.DOUBLE, 82.4);
        this.conferenceroom = new ConferenceRoom("Executive Boardroom", 150.75);
        this.diningroom = new DiningRoom("Main Dining Hall");
        this.hotel = new Hotel("Overlook");
        this.hotel.addRoom(bedroom1);
        this.hotel.addRoom(bedroom2);
        this.hotel.addRoom(conferenceroom);
        this.hotel.addRoom(diningroom);
        this.hotel.guestCheckIn(0, guest1);
        this.hotel.guestCheckIn(0, guest2);
        this.hotel.guestCheckIn(1, guest3);
        this.hotel.guestCheckIn(1, guest4);
        this.hotel.guestCheckIn(2, guest5);
        this.hotel.guestCheckIn(2, guest6);
        this.hotel.guestCheckIn(3, guest7);
        this.hotel.guestCheckIn(3, guest8);

    }

    @Test
    public void hasName() {
        assertEquals("Overlook", hotel.getName());
    }

    @Test
    public void checkRooms() {
        assertEquals(bedroom1, hotel.getRoom(0));
        assertEquals(bedroom2, hotel.getRoom(1));
        assertEquals(conferenceroom, hotel.getRoom(2));
        assertEquals(diningroom, hotel.getRoom(3));
    }

    @Test
    public void checkAllRooms() {
        listOfRooms = new ArrayList<>();
        listOfRooms.add(bedroom1);
        listOfRooms.add(bedroom2);
        listOfRooms.add(conferenceroom);
        listOfRooms.add(diningroom);
        assertEquals(listOfRooms, hotel.getAllRoomsInHotel());
    }

    @Test
    public void checkGuestList() {
        listOfGuests = new ArrayList<>();
        listOfGuests.add(guest5);
        listOfGuests.add(guest6);
        room = hotel.getRoom(2);
        assertEquals(listOfGuests, room.getGuestList());
    }

    @Test
    public void checkGuestCheckIn__succeeds() {
        listOfGuests = new ArrayList<>();
        listOfGuests.add(guest3);
        listOfGuests.add(guest4);
        room = hotel.getRoom(1);
        assertEquals(listOfGuests, room.getGuestList());

        assertEquals(true, hotel.guestCheckIn(1, guest9));
        listOfGuests.add(guest9);

        room = hotel.getRoom(1);
        assertEquals(listOfGuests, room.getGuestList());

    }

    @Test
    public void checkGuestCheckIn__fails() {
        listOfGuests = new ArrayList<>();
        listOfGuests.add(guest3);
        listOfGuests.add(guest4);
        room = hotel.getRoom(1);
        assertEquals(listOfGuests, room.getGuestList());

        assertEquals(false, hotel.guestCheckIn(1, guest4));

        room = hotel.getRoom(1);
        assertEquals(listOfGuests, room.getGuestList());

    }

    @Test
    public void checkGuestCheckOut() {
        listOfGuests = new ArrayList<>();
        listOfGuests.add(guest3);
        listOfGuests.add(guest4);
        room = hotel.getRoom(1);
        assertEquals(listOfGuests, room.getGuestList());

        hotel.guestCheckOut(1, guest4);

        listOfGuests = new ArrayList<>();
        listOfGuests.add(guest3);
        room = hotel.getRoom(1);
        assertEquals(listOfGuests, room.getGuestList());
    }

    @Test
    public void checkGetGuestList() {
        listOfGuests = new ArrayList<>();
        listOfGuests2 = new ArrayList<>();

        listOfGuests.add(guest7);
        listOfGuests.add(guest8);

        listOfGuests2 = hotel.getGuestsInRoom(3);
        assertEquals(listOfGuests, listOfGuests2);

    }

}