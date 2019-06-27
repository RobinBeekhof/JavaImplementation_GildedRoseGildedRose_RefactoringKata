package com.gildedrose;

class AgedBrie extends ItemGR {
    AgedBrie(String name, int sellIn, int quality, int daySold, Day currentDay) {
        super(name, sellIn, quality, daySold, currentDay);
    }

    @Override
    int getUpdatedQuality() {
            int q = getQuality() + (getCurrentDay() - getDayAdded());
            return q >= 50 ? 50 : q;
    }

    @Override
    public String toString() {
        return "Aged Brie of brand: " + getName() + ", Sell in: " + getUpdatedSellIn() + ", quality is: "  + getUpdatedQuality();
    }
}
