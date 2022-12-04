import Manifest.Pilot;
import Manifest.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Lee Adama", Rank.CAPTAIN, "SB11", "Push autopilot button");
    }

    @Test
    public void pilotHasName() {
        assertEquals("Lee Adama", pilot.getName());
    }

    @Test
    public void pilotHasRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasLicenceNumber() {
        assertEquals("SB11", pilot.getLicenceNumber());
    }

    @Test
    public void pilotCanFlyPlane() {
        assertEquals("Push autopilot button", pilot.flyPlane("Push autopilot button"));
    }

}
