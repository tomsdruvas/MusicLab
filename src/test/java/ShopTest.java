import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    Speakers speakers;
    DrumSticks drumSticks;

    @Before

    public void before(){
        shop = new Shop("New Test Music Shop");
        guitar = new Guitar("Guitar xz3", 100, 150, 6);
        piano = new Piano("Piano xz3", 500, 750, 100);
        speakers = new Speakers("Logitech", 50, 200);
        drumSticks = new DrumSticks("Sticks for life", 33, 66);
    }

    @Test
    public void canAddEverythingToWallet(){
        shop.addItem(guitar);
        shop.addItem(piano);
        shop.addItem(speakers);
        shop.addItem(drumSticks);
        assertEquals(4, shop.getNumberOfItems());

    }
}
