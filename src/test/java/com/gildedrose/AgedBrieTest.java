package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest {
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
        day.addOneDay();
        assertEquals(12, bsp.getUpdatedQuality());
    }
    @Test
    public void testBackStagePassQuality_less_then_5_more_then_0_days_left() {
        Day day = new Day();
        BackStagePass bsp = new BackStagePass("Foo Bar fighters Concert", 6,10, day.getDay(), day);
        day.addOneDay();
        assertEquals(13, bsp.getUpdatedQuality());
    }
    @Test
    public void testBackStagePassQuality_0_days_left() {
        Day day = new Day();
        BackStagePass bsp = new BackStagePass("Foo Bar fighters Concert", 1,10, day.getDay(), day);
        day.addOneDay();
        assertEquals(0, bsp.getUpdatedQuality());
    }
}