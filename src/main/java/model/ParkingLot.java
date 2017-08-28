package model;

import java.util.HashMap;

public class ParkingLot {

    private int totalslots;
    HashMap<Integer,Car> parkinglotmapping = new HashMap<Integer, Car>();

    public ParkingLot(int slots ) {
        this.totalslots=slots;

        for(int i=1;i<=slots;i++){
            parkinglotmapping.put(i,null);
        }
    }

    public int getTotalSlots() {
        return this.totalslots;
    }

    public String park(Car car) {

        int emptySlot=getFreeSlot();

        if(emptySlot==0)
            return "Sorry, Parking Lot is full";
        else{
            parkinglotmapping.put(emptySlot,car);
            return "Car parked to slot number: "+emptySlot;

        }
    }

    public int getFreeSlot() {
        for(int i=1;i<this.parkinglotmapping.size();i++){
            if(parkinglotmapping.get(i)==null)
                return i;
        }
        return 0;
    }

    public int getTotalCarsParked() {
        int count=0;
        for(int i=1;i<=this.parkinglotmapping.size();i++){
            if(parkinglotmapping.get(i)!=null)
                count++;
        }
        return count;
    }

    public String leave(int position) {
        if(position>this.parkinglotmapping.size()|| position<1)
            return "Sorry,this slot doesn't exist";
        else{
            this.parkinglotmapping.put(position,null);
            return "Slot Number "+position+" is now free";
        }
    }
}
