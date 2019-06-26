package com.gildedrose;

public class Sulfuras extends ItemGR{
    public Sulfuras(int daySold, Day currentDay) {
        super("Sulfuras, Hand of Ragnaros", 0, 80, daySold, currentDay);
    }

    @Override
    public int getUpdatedQuality() {
        return getQuality();
    }

    @Override
    public int getUpdatedSellIn() {
        return getSellIn();
    }

    @Override
    public String toString() {
        return getName() + ", Sell in: " + getUpdatedSellIn() + ", quality is: "  + getUpdatedQuality();
    }
}
