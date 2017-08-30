package model;

import java.util.HashMap;

public class ParkingLot {

    private int totalslots;
    HashMap<Integer, Car> parkinglotmapping = new HashMap<Integer, Car>();

    public ParkingLot(int slots) {
        this.totalslots = slots;

        for (int i = 1; i <= slots; i++) {
            parkinglotmapping.put(i, null);
        }
    }

    public int getTotalSlots() {
        return this.totalslots;
    }

    public String park(Car car) {
        int emptySlot = getFreeSlot();

        if (emptySlot == 0)
            return "Sorry, Parking Lot is full";
        else {
            parkinglotmapping.put(emptySlot, car);
            return "Allocated slot number: " + emptySlot;
        }
    }

    public int getFreeSlot() {
        for (int i = 1; i <= this.parkinglotmapping.size(); i++) {
            if (parkinglotmapping.get(i) == null)
                return i;
        }
        return 0;
    }

    public int getTotalCarsParked() {
        int count = 0;
        for (int i = 1; i <= this.parkinglotmapping.size(); i++) {
            if (parkinglotmapping.get(i) != null)
                count++;
        }
        return count;
    }

    public String leave(int position) {
        if (position > this.parkinglotmapping.size() || position < 1)
            return "Sorry,this slot doesn't exist";
        else {
            this.parkinglotmapping.put(position, null);
            return "Slot Number " + position + " is free";
        }
    }

    public void status() {
        System.out.println("Slot No. " + "\t" + "Registration No. " + "\t" + "Color");
        for (int i = 1; i <= this.parkinglotmapping.size(); i++) {
            if (this.parkinglotmapping.get(i) != null) {
                System.out.println(i + "\t" + this.parkinglotmapping.get(i).getRegistratonNo() + "\t" + this.parkinglotmapping.get(i).getcolor());
            }
        }
    }

    public String getRegistrationNoByColor(String color) {
        String regNo = "";
        for (int i = 1; i <= this.parkinglotmapping.size(); i++) {
            if (this.parkinglotmapping.get(i) != null && this.parkinglotmapping.get(i).getcolor().equalsIgnoreCase(color)) {
                regNo += this.parkinglotmapping.get(i).getRegistratonNo() + ", ";
            }
        }
        return regNo.substring(0, regNo.length() - 2);
    }

    public String getSlotsByCarColor(String color) {
        String slots = "";
        for (int i = 1; i <= this.parkinglotmapping.size(); i++) {
            if (this.parkinglotmapping.get(i) != null && this.parkinglotmapping.get(i).getcolor().equalsIgnoreCase(color))
                slots += i + ", ";
        }
        return slots.substring(0, slots.length() - 2);
    }

    public String getSlotsByCarRegistrationNo(String RegNo) {
        for (int i = 1; i <= this.parkinglotmapping.size(); i++) {
            if (this.parkinglotmapping.get(i) != null && this.parkinglotmapping.get(i).getRegistratonNo().equalsIgnoreCase(RegNo)) {
                return Integer.toString(i);
            }
        }
        return "Not found";
    }
}
