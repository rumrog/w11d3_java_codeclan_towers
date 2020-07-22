import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;

    @Before
    public void before(){
        bedroom1 = new Bedroom(100, 4, 45.00);
        bedroom2 = new Bedroom(666, 2, 333.33);
        ArrayList<Bedroom> bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);

        conferenceRoom1 = new ConferenceRoom("Melinda's Hall", 75);
        conferenceRoom2 = new ConferenceRoom("Superheroes Den", 3);
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(conferenceRoom1);
        conferenceRooms.add(conferenceRoom2);

        hotel = new Hotel(bedrooms, conferenceRooms);

        guest1 = new Guest("Gary");
        guest2 = new Guest("Anton");
        guest3 = new Guest("Harrison");
        guest4 = new Guest("Louise");
        guest5 = new Guest("John");
    }

//    @Test

}
