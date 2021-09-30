import fawltyTowers.Guest;
import fawltyTowers.Hotel;
import fawltyTowers.rooms.Bedroom;
import fawltyTowers.rooms.ConferenceRoom;
import fawltyTowers.rooms.Room;
import fawltyTowers.rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private ArrayList<Room> roomArrayList;
    private Guest guest;
    private Guest guest2;
    private Room room1;
    private Room room2;

    @Before
    public void before(){
        roomArrayList = new ArrayList<>();
        room1 = new Bedroom(1, RoomType.DOUBLE);
        room2 = new ConferenceRoom(RoomType.CONFERENCE, "Event");
        guest = new Guest("Maggie");
        guest2 = new Guest("Duncan");
        roomArrayList.add(room1);
        roomArrayList.add(room2);
        hotel = new Hotel(roomArrayList);
    }

    @Test
    public void hotelHasArrayofSize2(){
        assertEquals(2, hotel.getRoomArrayList().size());
    }

    @Test
    public void hotelHasArray(){
        assertEquals(roomArrayList, hotel.getRoomArrayList());
    }
    @Test
    public void hotelCanAddGuestToRoom(){
        hotel.addGuestToRoom(guest, room1);
        assertEquals(1, room1.getGuestList().size());
        assertEquals(true, room1.getGuestList().contains(guest));
        assertEquals(false, room1.getGuestList().contains(guest2));
    }
    @Test
    public void hotelCanRemoveGuestToRoom(){
        hotel.addGuestToRoom(guest, room1);
        hotel.addGuestToRoom(guest2, room1);
        hotel.removeGuestFromRoom(guest2, room1);
        assertEquals(1, room1.getGuestList().size());
    }
}
