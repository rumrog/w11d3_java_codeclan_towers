import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;

    @Before
    public void before(){
        guest1 = new Guest("Gary");
        guest2 = new Guest("Anton");
        guest3 = new Guest("Harrison");
        guest4 = new Guest("Louise");
        guest5 = new Guest("John");
        conferenceRoom = new ConferenceRoom("Melinda's Hall", 75);
    }

    @Test
    public void hasName(){
        assertEquals("Melinda's Hall", this.conferenceRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(75, this.conferenceRoom.getCapacity());
    }

    @Test
    public void conferenceRoomHasZeroGuests() {
        assertEquals(0, this.conferenceRoom.countGuests());
    }

    @Test
    public void getGuestCount(){
        this.conferenceRoom.addGuest(guest1);
        assertEquals(1, this.conferenceRoom.countGuests());
    }

    @Test
    public void conferenceRoomFull(){
        ConferenceRoom conferenceRoom2 = new ConferenceRoom("Superhero Den", 3);
        conferenceRoom2.addGuest(guest2);
        conferenceRoom2.addGuest(guest3);
        conferenceRoom2.addGuest(guest4);
        assertEquals(false, conferenceRoom2.addGuest(guest5));
    }
}
