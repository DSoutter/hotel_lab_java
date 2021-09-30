import fawltyTowers.rooms.Bedroom;
import fawltyTowers.rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTypeTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1, RoomType.SINGLE);
    }

    @Test
    public void canGetBedroomType(){
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }

}
