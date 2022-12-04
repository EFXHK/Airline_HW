import FlightInfo.Plane;
import FlightInfo.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.GALACTICA);
    }

    @Test
    public void planeHasType() {
        assertEquals(PlaneType.GALACTICA, plane.getType());
    }

    @Test
    public void planeHasCapacity() {
        assertEquals(330, plane.getCapacity());
    }

    @Test
    public void planeHasWeight() {
        assertEquals(9900, plane.getTotalWeight());
    }
}
