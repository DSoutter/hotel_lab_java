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

    public void addGuestToRoom(Guest guest, Room room){
        room.addGuest(guest);
    }

    public void removeGuestFromRoom(Guest guest, Room room){
        room.removeGuest(guest);
    }

}
