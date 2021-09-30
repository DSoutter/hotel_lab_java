package fawltyTowers;

import fawltyTowers.rooms.Bedroom;
import fawltyTowers.rooms.Room;
import fawltyTowers.rooms.RoomType;

public class Booking {

    private int numOfNights;
    private RoomType roomType;
    private int roomNumber;
    private Room room;

    public Booking(Room room, int numOfNights) {
        this.numOfNights = numOfNights;
        this.room = room;
    }

    public int getNumOfNights() {
        return numOfNights;
    }



}
