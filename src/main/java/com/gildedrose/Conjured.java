package com.gildedrose;

public class Conjured extends ItemGR {
    public Conjured(String name, int sellIn, int quality, int daySold, Day currentDay) {
        super(name, sellIn, quality, daySold, currentDay);
    }

    @Override
    public int getUpdatedQuality() {
        int q = getQuality();

        if (getCurrentDay() - getDayAdded() < getSellIn()) {
            q -= 2 * (getCurrentDay() - getDayAdded());
            return q <= 0 ? 0 : q;
        }
        q -= 4 * (getCurrentDay() - getDayAdded() - getSellIn()) + 2 * getSellIn();
        return q <= 0 ? 0 : q;
    }

    @Override
    public String toString() {
        return "Conjured: " + getName() + ", Sell in: " + getUpdatedSellIn() + ", quality is: " + getUpdatedQuality();
    }
}
