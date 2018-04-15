import Guests.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Before
    public void before() {
        this.guest = new Guest("Jim", "2017-06-23", "2017-07-23");

    }

    @Test
    public void hasName() {
        assertEquals("Jim", guest.getName());
    }

    @Test
    public void hasStartDate() {
        assertEquals("2017-06-23", guest.getStartDate());
    }

    @Test
    public void hasEndDate() {
        assertEquals("2017-07-23", guest.getEndDate());
    }
}