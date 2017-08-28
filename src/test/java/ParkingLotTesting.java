import model.ParkingLot;
import model.Car;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParkingLotTesting {
    @Test
    public void testParkingLotClass(){
        ParkingLot parkinglot = new ParkingLot(4);
        assertEquals(ParkingLot.class,parkinglot.getClass());
    }

    @Test
    public void testCarClass(){
        Car car = new Car("RJ-02-CB-5244","Pink");
        assertEquals(Car.class,car.getClass());
    }

    @Test
    public void testTotalNumberOfSlots(){
        ParkingLot parkingLot = new ParkingLot(4);
        assertEquals(4,parkingLot.getTotalSlots());
    }

    @Test
    public void testParkingInASlot(){
        ParkingLot parkingLot = new ParkingLot(4);
        Car car1 = new Car("RJ-02-CB-5244","Pink");
        assertEquals("Car parked to slot number: 1",parkingLot.park(car1));
        Car car2 = new Car("RJ-02-CB-5245","White");
        assertEquals("Car parked to slot number: 2",parkingLot.park(car2));
    }

    @Test
    public void testFullParkingSlot(){
        ParkingLot parkingLot = new ParkingLot(4);
        Car car1 = new Car("RJ-02-CB-5244","Pink");
        parkingLot.park(car1);
        Car car2 = new Car("RJ-02-CB-5245","White");
        parkingLot.park(car2);
        Car car3 = new Car("RJ-02-CB-5246","Pink");
        parkingLot.park(car3);
        Car car4 = new Car("RJ-02-CB-5247","White");
        parkingLot.park(car4);
        Car car5 = new Car("RJ-02-CB-5248","White");
        assertEquals("Sorry, Parking Lot is full",parkingLot.park(car5));
    }
    @Test
    public void testTotalCarsParked(){
        ParkingLot parkingLot = new ParkingLot(4);
        Car car1 = new Car("RJ-02-CB-5244","Pink");
        parkingLot.park(car1);
        Car car2 = new Car("RJ-02-CB-5245","White");
        parkingLot.park(car2);
        assertEquals(2,parkingLot.getTotalCarsParked());

    }

    @Test
    public void testLeaveParkingSlot(){
        ParkingLot parkingLot = new ParkingLot(4);
        Car car1 = new Car("RJ-02-CB-5244","Pink");
        parkingLot.park(car1);
        Car car2 = new Car("RJ-02-CB-5245","White");
        parkingLot.park(car2);
        assertEquals("Slot Number 2 is now free",parkingLot.leave(2));
    }

    @Test
    public void testLeaveNonExistingSlot(){
        ParkingLot parkingLot = new ParkingLot(1);
        assertEquals("Sorry,this slot doesn't exist",parkingLot.leave(2));
    }

    @Test
    public void testStatus(){
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.status();
    }

    @Test
    public void testgetRegistrationNoByColor(){
        ParkingLot parkingLot = new ParkingLot(4);
        Car car1 = new Car("RJ-02-CB-5244","Pink");
        parkingLot.park(car1);
        Car car2 = new Car("RJ-02-CB-5245","White");
        parkingLot.park(car2);
        Car car3 = new Car("RJ-02-CB-5246","Pink");
        parkingLot.park(car3);
        Car car4 = new Car("RJ-02-CB-5247","White");
        parkingLot.park(car4);
        assertEquals("RJ-02-CB-5245, RJ-02-CB-5247",parkingLot.getRegistrationNoByColor("White"));
    }
}
