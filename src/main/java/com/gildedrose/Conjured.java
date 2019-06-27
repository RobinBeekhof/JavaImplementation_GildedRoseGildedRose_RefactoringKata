package com.gildedrose;

public class Conjured extends ItemGR {
    public Conjured(String name, int sellIn, int quality, int daySold, Day currentDay) {
        super(name, sellIn, quality, daySold, currentDay);
    }

    @Override
    public int getUpdatedQuality() {
        int q = getQuality();
        int daysPassed = getCurrentDay() - getDayAdded();

        if (daysPassed < getSellIn()) {
            q -= 2 * daysPassed;
            return q <= 0 ? 0 : q;
        }
        q -= 4 * (daysPassed - getSellIn()) + 2 * getSellIn();
        return q <= 0 ? 0 : q;
    }

    @Override
    public String toString() {
        return "Conjured: " + getName() + ", Sell in: " + getUpdatedSellIn() + ", quality is: " + getUpdatedQuality();
    }
}
