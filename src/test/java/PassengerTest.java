import Manifest.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Gaius Baltar", 6);
    }

    @Test
    public void hasName() {
        assertEquals("Gaius Baltar", passenger.getName());
    }

    @Test
    public void hasBaggage() {
        assertEquals(6, passenger.getNumOfBags());
    }
}
