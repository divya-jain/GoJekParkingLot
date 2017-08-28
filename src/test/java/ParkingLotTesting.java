import model.ParkingLot;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParkingLotTesting {
    @Test
    public void testParkingLotClass(){

        ParkingLot parkinglot = new ParkingLot(4);
        assertEquals(ParkingLot.class,parkinglot.getClass());
    }
}
