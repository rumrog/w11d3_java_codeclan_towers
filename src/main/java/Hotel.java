import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms){
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public boolean checkInGuestToBedroom(Guest guest, Bedroom bedroom){
        return bedroom.addGuest(guest);
    }

    public boolean checkOutGuestFromBedroom(Guest guest, Bedroom bedroom){
        return bedroom.removeGuest(guest);
    }

}
