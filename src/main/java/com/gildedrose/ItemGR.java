package com.gildedrose;

public class ItemGR extends Item {
    private int daySold;
    private Day currentDay;

    public ItemGR(String name, int sellIn, int quality, int daySold, Day currentDay) {
        super(name, sellIn, quality);
        this.daySold = daySold;
        this.currentDay = currentDay;

    }

    public int getDayAdded() {
        return daySold;
    }

    public int getCurrentDay() {
        return currentDay.getDay();
    }

    public int getQuality() {
        return super.quality;
    }

    public int getSellIn() {
        return super.sellIn;
    }

    public String getName() {
        return super.name;
    }

    public int getUpdatedQuality() {
        if (getCurrentDay() - getDayAdded() < getSellIn()) {
            int q = getQuality() - (getCurrentDay() - getDayAdded());
            return q <= 0 ? 0 : q;
        }
        int q = getQuality() - 2 * (getCurrentDay() - getDayAdded());
        return q <= 0 ? 0 : q;
    }

    public int getUpdatedSellIn() {
        int s = getSellIn() - (getCurrentDay() - getDayAdded());
        return s > 0 ? s : 0;
    }


}
