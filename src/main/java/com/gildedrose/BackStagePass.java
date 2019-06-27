package com.gildedrose;

public class BackStagePass extends ItemGR{
    public BackStagePass(String name, int sellIn, int quality, int daySold, Day currentDay) {
        super(name, sellIn, quality, daySold, currentDay);
    }

    @Override
    public int getUpdatedQuality() {
        int timeToEvent = getSellIn() - (getCurrentDay() - getDayAdded());


        if(timeToEvent > 10){
            int q = getQuality() + (getCurrentDay() - getDayAdded());
            return q >= 50 ? 50 : q;
        }
        else if (timeToEvent <= 10 && timeToEvent > 5){
            int q = getQuality() + 2 * (getCurrentDay() - getDayAdded());
            return q >= 50 ? 50 : q;
        }
        else if (timeToEvent <= 5 && timeToEvent > 0){
            int q = getQuality() + 3 * (getCurrentDay() - getDayAdded());
            return q >= 50 ? 50 : q;
        }
        return 0;



    }

    @Override
    public String toString() {
        return "Backstage passes to a " + getName() + ", Sell in: " + getUpdatedSellIn() + ", quality is: "  + getUpdatedQuality();
    }
}
