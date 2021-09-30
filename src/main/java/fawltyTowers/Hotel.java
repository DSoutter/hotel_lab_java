package fawltyTowers;

import fawltyTowers.rooms.Room;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> roomArrayList;


    public Hotel(ArrayList<Room> roomArrayList) {
        this.roomArrayList = roomArrayList;
    }

    public ArrayList<Room> getRoomArrayList() {
        return roomArrayList;
    }

//CREATE CHECK IN'S AND CHECK OUT'S METHODS
}
