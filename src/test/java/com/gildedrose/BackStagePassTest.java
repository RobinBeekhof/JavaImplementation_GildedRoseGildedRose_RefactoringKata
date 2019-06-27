package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackStagePassTest {
    @Test
    public void testBackStagePassQuality_same_day() {
        Day day = new Day();
        BackStagePass bsp = new BackStagePass("Foo Bar fighters Concert", 15,10, day.getDay(), day);
        assertEquals(10, bsp.getUpdatedQuality());
    }
    @Test
    public void testBackStagePassQuality_more_then_10_days_left() {
        Day day = new Day();
        BackStagePass bsp = new BackStagePass("Foo Bar fighters Concert", 15,10, day.getDay(), day);
        day.addOneDay();
        assertEquals(11, bsp.getUpdatedQuality());
    }
    @Test
    public void testBackStagePassQuality_less_then_10_more_then_5_days_left() {
        Day day = new Day();
        BackStagePass bsp = new BackStagePass("Foo Bar fighters Concert", 11,10, day.getDay(), day);
        day.addMultipleDays(2);
        assertEquals(13, bsp.getUpdatedQuality());
    }
    @Test
    public void testBackStagePassQuality_less_then_5_more_then_0_days_left() {
        Day day = new Day();
        BackStagePass bsp = new BackStagePass("Foo Bar fighters Concert", 6,10, day.getDay(), day);
        day.addMultipleDays(2);
        assertEquals(15, bsp.getUpdatedQuality());
    }
    @Test
    public void testBackStagePassQuality_0_days_left() {
        Day day = new Day();
        BackStagePass bsp = new BackStagePass("Foo Bar fighters Concert", 1,10, day.getDay(), day);
        day.addOneDay();
        assertEquals(0, bsp.getUpdatedQuality());
    }

    @Test
    public void testBackStagePassQuality_sellIn20_12daysPassed() {
        Day day = new Day();
        BackStagePass bsp = new BackStagePass("Foo Bar fighters Concert", 20,10, day.getDay(), day);
        day.addMultipleDays(12);
        assertEquals(24, bsp.getUpdatedQuality());
    }
    @Test
    public void testBackStagePassQuality_sellIn20_18daysPassed() {
        Day day = new Day();
        BackStagePass bsp = new BackStagePass("Foo Bar fighters Concert", 20,10, day.getDay(), day);
        day.addMultipleDays(18);
        assertEquals(39, bsp.getUpdatedQuality());
    }
}
