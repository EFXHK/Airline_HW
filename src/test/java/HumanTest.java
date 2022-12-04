import Manifest.Human;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {

    Human human;

    @Before
    public void setup() {
        human = new Human("Laura Roslin");
    }

    @Test
    public void hasName() {
        assertEquals("Laura Roslin", human.getName());
    }
}
