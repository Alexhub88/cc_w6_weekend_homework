import RoomTypes.Bedroom;
import RoomTypes.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Bedroom bedroom2;

    @Before
    public void before(){
        this.bedroom1 = new Bedroom(1, Type.DOUBLE, 56.5);
        this.bedroom2 = new Bedroom(1, Type.SINGLE, 56.5);
    }

    @Test
    public void hasNumber(){
        assertEquals(1, bedroom1.getRoomNumber());
    }

    @Test
    public void hasRoomType(){
        assertEquals(Type.DOUBLE, bedroom1.getRoomType());
    }

    @Test
    public void hasRoomCapacity(){
        assertEquals(2, bedroom1.getRoomCapacity());
    }

    @Test
    public void hasDefaultCapacity(){
        bedroom1.setBedRoomCapacity();
        bedroom2.setBedRoomCapacity();
        assertEquals(2, bedroom1.getDefaultCapacity());
        assertEquals(1, bedroom2.getDefaultCapacity());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(56.5, bedroom1.getNightlyRate(), 0.01);
    }



}
