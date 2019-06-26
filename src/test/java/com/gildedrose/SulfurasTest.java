package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasTest {
    @Test
    public void testSulfurasQuality_same_day() {
        Day day = new Day();
        Sulfuras sul = new Sulfuras(day.getDay(), day);
        assertEquals(80, sul.getUpdatedQuality());
    }
    @Test
    public void testSulfurasQuality_5_days_later() {
        Day day = new Day();
        Sulfuras sul = new Sulfuras(day.getDay(), day);
        day.addMultipleDays(5);
        assertEquals(80, sul.getUpdatedQuality());
    }

}
