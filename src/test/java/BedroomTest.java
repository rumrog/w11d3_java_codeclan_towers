import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;

    @Before
    public void before() {
        guest1 = new Guest("Gary");
        guest2 = new Guest("Anton");
        guest3 = new Guest("Harrison");
        guest4 = new Guest("Louise");
        guest5 = new Guest("John");
        bedroom = new Bedroom(100, 4, 45.00);
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(100, this.bedroom.getRoomNumber());
    }

    @Test
    public void testGetPrice() {
        assertEquals(45.00, this.bedroom.getPrice(), 0.01);
    }

    @Test
    public void testGetCapacity() {
        assertEquals(4, this.bedroom.getCapacity());
    }

    @Test
    public void getGuestCount() {
        this.bedroom.addGuest(guest1);
        assertEquals(1, this.bedroom.getGuestCount());
    }

    @Test
    public void testRoomStartsEmpty() {
        assertEquals(0, this.bedroom.getGuestCount());
    }

    @Test
    public void testRoomFull() {
        this.bedroom.addGuest(guest1);
        this.bedroom.addGuest(guest2);
        this.bedroom.addGuest(guest3);
        this.bedroom.addGuest(guest4);
        assertEquals(false, this.bedroom.addGuest(guest5));
    }
}
