import fawltyTowers.Booking;
import fawltyTowers.rooms.Bedroom;
import fawltyTowers.rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1, RoomType.DOUBLE);
        booking = new Booking(bedroom, 5);
    }

    @Test
    public void getNumberOfNights(){
        assertEquals(5, booking.getNumOfNights());
    }

}

