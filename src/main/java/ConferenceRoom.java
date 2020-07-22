import java.util.ArrayList;

public class ConferenceRoom {
    private String name;
    private int capacity;
    private ArrayList<Guest> guestCollection;

    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guestCollection = new ArrayList<Guest>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int countGuests(){
        return this.guestCollection.size();
    }

    public boolean addGuest(Guest guest) {
        if (this.countGuests() < this.capacity) {
            this.guestCollection.add(guest);
            return true;
        }
        return false;
    }
}
