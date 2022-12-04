import FlightInfo.Flight;
import FlightInfo.PlaneType;
import org.junit.Before;

public class FlightTest {
    Flight flight;

    @Before
    public void before() {
        flight = new Flight(
                planeType.BASESTAR,
                "CYL6",
                "KOBOL",
                "CAPRICA",
                "2300 HOURS",
                "LEE ADAMA", "KARA THRACE", "LAURA ROSLIN");
    }

}
