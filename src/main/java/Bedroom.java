import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guestsCollection;
    private double price;

    public Bedroom(int roomNumber, int capacity, double price) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guestsCollection = new ArrayList<Guest>();
        this.price = price;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getGuestCount() {
        return this.guestsCollection.size();
    }

    public double getPrice() {
        return this.price;
    }

    public boolean addGuest(Guest guest) {
        if (this.getGuestCount() < this.capacity) {
            this.guestsCollection.add(guest);
            return true;
        }
        return false;
    }




}
