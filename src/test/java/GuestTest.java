import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Before
    public void before(){
        this.guest = new Guest("Gary");
    }

    @Test
    public void hasName(){
        assertEquals("Gary", guest.getName());
    }


}
