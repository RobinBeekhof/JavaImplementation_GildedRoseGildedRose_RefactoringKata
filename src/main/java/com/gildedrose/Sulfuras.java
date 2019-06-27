package com.gildedrose;

class Sulfuras extends ItemGR {
    public Sulfuras(int daySold, Day currentDay) {
        super("Sulfuras, Hand of Ragnaros", 0, 80, daySold, currentDay);
    }

    @Override
    int getUpdatedQuality() {
        return getQuality();
    }

    @Override
    int getUpdatedSellIn() {
        return getSellIn();
    }

    @Override
    public String toString() {
        return getName() + ", Sell in: " + getUpdatedSellIn() + ", quality is: "  + getUpdatedQuality();
    }
}
