package RoomTypes;

public class DiningRoom extends Room {

    private String name;

    public DiningRoom(String name) {
        this.name = name;
    }

    public String getRoomName() {
        return this.name;
    }

    public void setDiningRoomCapacity(){
        setDefaultCapacity(4);
    }
}
