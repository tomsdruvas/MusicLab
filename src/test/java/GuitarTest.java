import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Guitar1", 100, 150, 6);
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(50.00, guitar.calcMarkUp(guitar), 0);
    }
}
