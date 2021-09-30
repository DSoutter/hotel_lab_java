package fawltyTowers.roomType;

import fawltyTowers.Guest;
import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    private ArrayList<Guest> guestList;

    public Room(int capacity, ArrayList<Guest> guestList) {
        this.capacity = capacity;
        this.guestList = guestList;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }
}
