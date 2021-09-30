import fawltyTowers.roomType.BedroomType;
import fawltyTowers.roomType.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void before(){
        room = new Bedroom(1, BedroomType.SINGLE);
    }
}
