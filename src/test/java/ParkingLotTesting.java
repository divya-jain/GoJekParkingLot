import model.ParkingLot;
import model.Car;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;


public class ParkingLotTesting {
    public ParkingLot parkinglot;

    @Before
    public void initializeParkingLot(){
        parkinglot = new ParkingLot(4);
        Car car1 = new Car("RJ-02-CB-5244","Pink");
        parkinglot.park(car1);
        Car car2 = new Car("RJ-02-CB-5245","White");
        parkinglot.park(car2);
        Car car3 = new Car("RJ-02-CB-5246","Pink");
        parkinglot.park(car3);
    }

    @Test
    public void testParkingLotClass(){
        assertEquals(ParkingLot.class,parkinglot.getClass());
    }

    @Test
    public void testTotalNumberOfSlots(){
        assertEquals(4,parkinglot.getTotalSlots());
    }

    @Test
    public void testParkingInASlot(){
        Car car4 = new Car("RJ-02-CB-5247","White");
        assertEquals("Car parked to slot number: 4",parkinglot.park(car4));
    }

    @Test
    public void testUnavailableParkingSlot(){
        Car car4 = new Car("RJ-02-CB-5247","White");
        parkinglot.park(car4);
        Car car5 = new Car("RJ-02-CB-5248","White");
        assertEquals("Sorry, Parking Lot is full",parkinglot.park(car5));
    }
    @Test
    public void testTotalCarsParked(){
        assertEquals(3,parkinglot.getTotalCarsParked());
    }

    @Test
    public void testLeaveParkingSlot(){
        assertEquals("Slot Number 2 is now free",parkinglot.leave(2));
    }

    @Test
    public void testLeaveNonExistingSlot(){
        assertEquals("Sorry,this slot doesn't exist",parkinglot.leave(7));
    }

    @Test
    public void testStatus(){
        parkinglot.status();
    }

    @Test
    public void testgetRegistrationNoByColor(){
        Car car4 = new Car("RJ-02-CB-5247","White");
        parkinglot.park(car4);
        assertEquals("RJ-02-CB-5245, RJ-02-CB-5247",parkinglot.getRegistrationNoByColor("White"));
    }

    @Test
    public void testSlotByCarColor(){
        assertEquals("1 ,3",parkinglot.getSlotsByCarColor("Pink"));
    }

    @Test
    public void getSlotsByCarRegistrationNo(){
        assertEquals("3",parkinglot.getSlotsByCarRegistrationNo("RJ-02-CB-5246"));
    }

    @Test
    public void getSlotsByInvalidCarRegistrationNo(){
        assertEquals("Not Exist",parkinglot.getSlotsByCarRegistrationNo("KA-02-CB-5246"));
    }
}
