package com.gildedrose;

public class ItemGR extends Item{
    private int daySold ;
    private Day currentDay;

    public int getDaySold() {
        return daySold;
    }

    public int getCurrentDay() {
        return currentDay.getDay();
    }

    public int getQuality(){
        return super.quality;
    }
    public int getSellIn(){
        return super.sellIn;
    }
    public String getName(){
        return super.name;
    }

    public ItemGR(String name, int sellIn, int quality, int daySold, Day currentDay) {
        super(name, sellIn, quality);
        this.daySold = daySold;
        this.currentDay = currentDay;

    }

    public int getUpdatedQuality(){

        if(getCurrentDay() - getDaySold() < getSellIn()){
            int q = getQuality() - (getCurrentDay() - getDaySold());
            return q <= 0 ? 0 : q;
        }
        int q = getQuality() - 2 * (getCurrentDay() - getDaySold());
        return q <= 0 ? 0 : q;
    }

    public int getUpdatedSellIn(){
        int s = getSellIn() - (getCurrentDay() - getDaySold());
        return s > 0 ? s : 0;
    }


}
