package com.gildedrose;

class ItemGR extends Item {
    private int daySold;
    private Day currentDay;

    ItemGR(String name, int sellIn, int quality, int daySold, Day currentDay) {
        super(name, sellIn, quality);
        this.daySold = daySold;
        this.currentDay = currentDay;

    }

    int getDayAdded() {
        return daySold;
    }

    int getCurrentDay() {
        return currentDay.getDay();
    }

    int getQuality() {
        return super.quality;
    }

    int getSellIn() {
        return super.sellIn;
    }

    String getName() {
        return super.name;
    }

    int getUpdatedQuality() {
        int q = getQuality();

        if (getCurrentDay() - getDayAdded() < getSellIn()) {
            q -= (getCurrentDay() - getDayAdded());
            return q <= 0 ? 0 : q;
        }
        q -= 2 * (getCurrentDay() - getDayAdded() - getSellIn()) + getSellIn();
        return q <= 0 ? 0 : q;
    }

    int getUpdatedSellIn() {
        int s = getSellIn() - (getCurrentDay() - getDayAdded());
        return s > 0 ? s : 0;
    }


}
