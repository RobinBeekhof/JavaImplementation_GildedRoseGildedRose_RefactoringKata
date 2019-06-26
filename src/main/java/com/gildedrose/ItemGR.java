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
            return getQuality() - (getCurrentDay() - getDaySold());
        }
        return getQuality() - 2 * (getCurrentDay() - getDaySold());

    }


}
