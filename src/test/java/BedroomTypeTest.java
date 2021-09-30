import fawltyTowers.roomType.Bedroom;
import fawltyTowers.roomType.BedroomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTypeTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(BedroomType.SINGLE);
    }

    @Test
    public void canGetBedroomType(){
        assertEquals(BedroomType.SINGLE, bedroom.getBedroomType());
    }

}
