import fawltyTowers.Hotel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;

    @Before
    public void before(){
        ArrayList<String> bedrooms = new ArrayList<>();
        ArrayList<String> conferenceRooms = new ArrayList<>();
        bedrooms.add(hotel);

        hotel = new Hotel();
    }
}
