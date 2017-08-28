import org.junit.Test;
import static org.junit.Assert.*;

public class ParkingLotTesting {
    @Test
    public void testParkingLotClass(){

        ParkingLot parkinglot = new ParkingLot();
        assertEquals(ParkingLot.class,parkinglot.getClass());
    }
}
