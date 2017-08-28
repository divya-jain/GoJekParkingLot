package model;

import java.util.HashMap;

public class ParkingLot {

    private int Totalslots;
    HashMap<Integer,Car> parkinglotmapping = new HashMap<Integer, Car>();
    public ParkingLot(int slots ) {
        this.Totalslots=slots;

        for(int i=1;i<=slots;i++){
            parkinglotmapping.put(i,null);
        }
    }
}
