package com.gildedrose;

public class BackStagePass extends ItemGR{
    public BackStagePass(String name, int sellIn, int quality, int daySold) {
        super(name, sellIn, quality, daySold);
    }

    public int getQuality(int currentDay){
        return -1;

    }

}
