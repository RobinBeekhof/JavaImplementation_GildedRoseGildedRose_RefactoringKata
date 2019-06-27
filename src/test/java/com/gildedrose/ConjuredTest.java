package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredTest {
    @Test
    public void testConjuredQuality_same_day() {
        Day day = new Day();
        Conjured con  = new Conjured("Mana Cake", 15,10, day.getDay(), day);
        assertEquals(10, con .getUpdatedQuality());
    }
    @Test
    public void testConjuredQuality_2_days_later() {
        Day day = new Day();
        Conjured con  = new Conjured("Mana Cake", 15,10, day.getDay(), day);
        day.addMultipleDays(2);
        assertEquals(6, con .getUpdatedQuality());
    }
    @Test
    public void testConjuredQuality_no_days_left_q_drops_double() {
        Day day = new Day();
        Conjured con  = new Conjured("Mana Cake", 1,10, day.getDay(), day);
        day.addMultipleDays(2);
        assertEquals(4, con .getUpdatedQuality());
    }

}
