package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemGRTest {
    @Test
    public void testItemGRQuality_same_day() {
        Day day = new Day();
        ItemGR item  = new ItemGR("+5 Dexterity Vest", 15,10, day.getDay(), day);
        assertEquals(10, item .getUpdatedQuality());
    }
    @Test
    public void testItemGRQuality_2_days_later() {
        Day day = new Day();
        ItemGR item  = new ItemGR("+5 Dexterity Vest", 15,10, day.getDay(), day);
        day.addMultipleDays(2);
        assertEquals(8, item .getUpdatedQuality());
    }
    @Test
    public void testItemGRQuality_no_days_left_q_drops_double() {
        Day day = new Day();
        ItemGR item  = new ItemGR("+5 Dexterity Vest", 1,10, day.getDay(), day);
        day.addMultipleDays(2);
        assertEquals(7, item .getUpdatedQuality());
    }

}
