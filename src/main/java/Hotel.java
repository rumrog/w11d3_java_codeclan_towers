import java.awt.print.Book;

import java.awt.print.Book;import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public boolean checkInGuestToBedroom(Guest guest, Bedroom bedroom) {
        return bedroom.addGuest(guest);
    }

    public boolean checkOutGuestFromBedroom(Guest guest, Bedroom bedroom) {
        return bedroom.removeGuest(guest);
    }

    public HashMap<Integer, ArrayList<Bedroom>> getBedroomsGroupedByCapacity() {
//       we declare a variable "bedroomCapacityHash" which expects a HashMap
//       with an Integer as its keys, and an
//       ArrayList of Bedroom objects as its values.
            HashMap<Integer, ArrayList<Bedroom>> bedroomCapacityHash;
//       we instantiate a HashMap which expects an Integer as its keys, and an
//       ArrayList of Bedroom objects as its values.
            bedroomCapacityHash = new  HashMap<Integer, ArrayList<Bedroom>>();
            this.bedrooms.forEach( bedroom -> {
                        if(!bedroomCapacityHash.containsKey(bedroom.getCapacity())) {
                            ArrayList<Bedroom> capacityArrayListValue = new ArrayList<Bedroom>();
                            capacityArrayListValue.add(bedroom);
                            bedroomCapacityHash.put(bedroom.getCapacity(), capacityArrayListValue);
                        }
                        else {
                            ArrayList<Bedroom> keyArrayListValue = bedroomCapacityHash.get(bedroom.getCapacity());
                            keyArrayListValue.add(bedroom);
                            bedroomCapacityHash.put(bedroom.getCapacity(), keyArrayListValue);
                        }

                    }
            );
              System.out.println(bedroomCapacityHash);

            return bedroomCapacityHash;
    }

    public HashMap<Integer, ArrayList<Bedroom>> getBedroomsGroupedByCapacity2() {

        HashMap<Integer, ArrayList<Bedroom>> bedroomCapacityHash;

        bedroomCapacityHash = new HashMap<Integer, ArrayList<Bedroom>>();
        this.bedrooms.forEach( bedroom -> {
            int key = bedroom.getCapacity();
            ArrayList<Bedroom> capacityArrayListValue = new ArrayList<Bedroom>();
            capacityArrayListValue.add(bedroom);

            bedroomCapacityHash.merge(key, capacityArrayListValue,(prev, room) ->
                    prev.add(bedroom)

            );

                }
        );
        System.out.println(bedroomCapacityHash);

        return bedroomCapacityHash;
    }

}