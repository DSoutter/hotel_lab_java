import fawltyTowers.rooms.ConferenceRoom;
import fawltyTowers.rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, "Event");
    }
    @Test
    public void hasRoomTypeConference(){
        assertEquals(50, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Event",conferenceRoom.getName());
    }
}
