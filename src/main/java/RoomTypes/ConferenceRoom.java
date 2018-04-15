package RoomTypes;

import Guests.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;
    private double dailyRate;

    public ConferenceRoom(String name,  double dailyRate) {
        this.name = name;
        this.dailyRate = dailyRate;
    }

    public String getRoomName() {
        return this.name;
    }

    public double getDailyRate() {
        return this.dailyRate;
    }

    public void setConferenceRoomCapacity(){
        setDefaultCapacity(3);
    }
}
