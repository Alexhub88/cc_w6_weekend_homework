
import RoomTypes.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceroom1;

    @Before
    public void before(){
        this.conferenceroom1 = new ConferenceRoom("Executive Boardroom",  115.5);

    }

    @Test
    public void hasName(){
        assertEquals("Executive Boardroom", conferenceroom1.getRoomName());
    }

    @Test
    public void hasDefaultCapacity(){
        conferenceroom1.setConferenceRoomCapacity();
        assertEquals(3, conferenceroom1.getDefaultCapacity());
    }


    @Test
    public void hasDailyRate(){
        assertEquals(115.5, conferenceroom1.getDailyRate(), 0.01);
    }



}
