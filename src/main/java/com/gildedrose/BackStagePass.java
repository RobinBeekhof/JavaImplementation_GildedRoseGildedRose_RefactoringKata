package com.gildedrose;

public class BackStagePass extends ItemGR {
    public BackStagePass(String name, int sellIn, int quality, int daySold, Day currentDay) {
        super(name, sellIn, quality, daySold, currentDay);
    }

    @Override
    public int getUpdatedQuality() {
        int q = getQuality();
        int daysPassed = getCurrentDay() - getDayAdded();

        if (getUpdatedSellIn() > 10) {
            q += daysPassed;
            return q >= 50 ? 50 : q;
        } else if (getUpdatedSellIn() <= 10 && getUpdatedSellIn() > 5) {
            q += 2 * (10 - getUpdatedSellIn());
            if (getSellIn() > 10) {
                q += getSellIn() - 10;
            }
            return q >= 50 ? 50 : q;
        } else if (getUpdatedSellIn() <= 5 && getUpdatedSellIn() > 0) {
            q += 3 * (5 - getUpdatedSellIn());
            if (getSellIn() <= 10 && getSellIn() > 5) {
                q += 2 * (sellIn - 5);
            }
            if (getSellIn() > 10) {
                q += getSellIn();
            }
            return q >= 50 ? 50 : q;
        }
        return 0;

    }

    @Override
    public String toString() {
        return "Backstage passes to a " + getName() + ", Sell in: " + getUpdatedSellIn() + ", quality is: " + getUpdatedQuality();
    }
}
