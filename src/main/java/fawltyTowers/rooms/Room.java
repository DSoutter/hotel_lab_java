package fawltyTowers.rooms;

import fawltyTowers.Guest;
import java.util.ArrayList;

public abstract class Room {

    protected RoomType roomType;
    private ArrayList<Guest> guestList;

    public Room(RoomType roomType) {
        this.roomType = roomType;
        this.guestList = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return this.roomType.getValue();
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }
}
