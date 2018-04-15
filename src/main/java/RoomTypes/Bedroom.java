package RoomTypes;

import Guests.Guest;
import RoomTypes.Type;

import java.util.ArrayList;

public class Bedroom extends Room{

    private int roomNumber;
    private Type type;
    private double nightlyRate;

    public Bedroom(int roomNumber, Type type,  double nightlyRate) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public Type getRoomType(){
        return this.type;
    }

    public int getRoomCapacity(){
        return type.getCapacity();
    }

    public double getNightlyRate(){
        return this.nightlyRate;
    }

}
