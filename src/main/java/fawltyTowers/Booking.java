package fawltyTowers;

import fawltyTowers.rooms.Bedroom;
import fawltyTowers.rooms.RoomType;

public class Booking {

    private int numOfNights;
    private RoomType roomType;
    private int roomNumber;
    private Bedroom bedroom;

    public Booking(Bedroom bedroom, int numOfNights) {
        this.numOfNights = numOfNights;
        this.bedroom = bedroom;
    }

    public int getNumOfNights() {
        return numOfNights;
    }



}
