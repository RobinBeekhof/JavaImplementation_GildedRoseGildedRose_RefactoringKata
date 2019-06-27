package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest {
    @Test
    public void testAgedBrieQuality_same_day() {
        Day day = new Day();
        AgedBrie ab = new AgedBrie("Hello World Cheeses", 15,10, day.getDay(), day);
        assertEquals(10, ab.getUpdatedQuality());
    }
    @Test
    public void testAgedBrieQuality_5_days_later() {
        Day day = new Day();
        AgedBrie ab = new AgedBrie("Foo Bar fighters Concert", 15,10, day.getDay(), day);
        day.addMultipleDays(5);
        assertEquals(15, ab.getUpdatedQuality());
    }
    @Test
    public void testAgedBrieQuality_max_is_50() {
        Day day = new Day();
        AgedBrie ab = new AgedBrie("Foo Bar fighters Concert", 11,10, day.getDay(), day);
        day.addMultipleDays(100);
        assertEquals(50, ab.getUpdatedQuality());
    }

}
