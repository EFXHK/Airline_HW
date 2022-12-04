import Manifest.CabinCrewMember;
import Manifest.Human;
import Manifest.Passenger;
import Manifest.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Kara Thrace", Rank.CAPTAIN);
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.CAPTAIN, cabinCrewMember.getRank());
    }

    @Test
    public void cabinCrewMemberHasName() {
        assertEquals("Kara Thrace", cabinCrewMember.getName());
    }

    @Test
    public void canSpeak() {
        assertEquals("Buckle up, folks", cabinCrewMember.speak("Buckle up, folks"));
    }
}
