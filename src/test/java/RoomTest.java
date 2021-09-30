import fawltyTowers.rooms.Bedroom;
import fawltyTowers.rooms.RoomType;
import fawltyTowers.rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void before(){
        room = new Bedroom(1, RoomType.SINGLE);
    }
    @Test
    public void checkRoomCapacity(){
        assertEquals(1, room.getCapacity());
    }

}
