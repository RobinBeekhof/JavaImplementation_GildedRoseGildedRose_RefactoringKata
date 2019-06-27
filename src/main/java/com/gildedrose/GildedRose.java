package com.gildedrose;


import java.util.stream.Stream;

public class GildedRose {
    private Item[] items;
    private Day day = new Day();

    public void endDay() {
        day.addOneDay();
    }

    public void endMultipleDays(int days) {
        day.addMultipleDays(days);
    }

    private void addItem(Item item) {
        if (items == null) {
            items = new Item[]{item};
        } else {
            items = Stream.of(items, new Item[]{item}).flatMap(Stream::of)
                    .toArray(Item[]::new);
        }

    }

    public void addNormalItem(String name, int selIn, int quality) {
        addItem(new ItemGR(name, selIn, quality, day.getDay(), this.day));
    }

    public void addBackStagePass(String name, int selIn, int quality) {
        addItem(new BackStagePass(name, selIn, quality, day.getDay(), this.day));
    }

    public void addAgedBrie(String name, int selIn, int quality) {
        addItem(new AgedBrie(name, selIn, quality, day.getDay(), this.day));
    }

    public void addSulfuras() {
        addItem(new Sulfuras(day.getDay(), this.day));
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }


}
