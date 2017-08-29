import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import model.Car;

public class CarTesting {
    Car car;

    @Before
    public void initializeCar(){
        car = new Car("","");
    }

    @Test
    public void testCarClass(){assertEquals(Car.class,car.getClass());}
}