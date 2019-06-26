package com.gildedrose;

public class AgedBrie extends ItemGR{
    public AgedBrie(String name, int sellIn, int quality, int daySold, Day currentDay) {
        super(name, sellIn, quality, daySold, currentDay);
    }

    @Override
    public int getUpdatedQuality() {
            int q = getQuality() + (getCurrentDay() - getDaySold());
            return q >= 50 ? 50 : q;
    }

    @Override
    public String toString() {
        return "Aged Brie of brand: " + getName() + ", Sell in: " + getUpdatedSellIn() + ", quality is: "  + getUpdatedQuality();
    }
}
