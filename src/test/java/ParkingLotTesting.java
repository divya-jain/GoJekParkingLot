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
    public void testTotalCarsParked(){
        ParkingLot parkingLot = new ParkingLot(4);
        Car car1 = new Car("RJ-02-CB-5244","Pink");
        parkingLot.park(car1);
        Car car2 = new Car("RJ-02-CB-5245","White");
        parkingLot.park(car2);
        assertEquals(2,parkingLot.getTotalCarsParked());

    }
}
