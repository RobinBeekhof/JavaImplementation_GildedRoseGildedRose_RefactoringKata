package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GildedRoseOldTest {

    @Test
    public void testFoo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose_old app = new GildedRose_old(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

}
