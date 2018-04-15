
import RoomTypes.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom diningroom1;

    @Before
    public void before(){
        this.diningroom1 = new DiningRoom("Diningroom");

    }

    @Test
    public void hasName(){
        assertEquals("Diningroom", diningroom1.getRoomName());
    }

    @Test
    public void hasDefaultCapacity(){
        diningroom1.setDiningRoomCapacity();
        assertEquals(4, diningroom1.getDefaultCapacity());
    }

}
