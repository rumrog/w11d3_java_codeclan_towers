import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guestCollection;
    private double price;

    public Bedroom(int roomNumber, int capacity, double price) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guestCollection = new ArrayList<Guest>();
        this.price = price;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getGuestCount() {
        return this.guestCollection.size();
    }

    public double getPrice() {
        return this.price;
    }

    public boolean addGuest(Guest guest) {
        if (this.getGuestCount() < this.capacity) {
            this.guestCollection.add(guest);
            return true;
        }
        return false;
    }

    public boolean removeGuest(Guest guest) {
        if (this.guestCollection.contains(guest)) {
            int index = this.guestCollection.indexOf(guest);
            this.guestCollection.remove(index);
            return true;
        }
        return false;
    }




}
