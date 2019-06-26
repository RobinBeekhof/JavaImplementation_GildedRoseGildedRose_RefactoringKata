package com.gildedrose;

public class ItemGR extends Item{
    private int daySold ;

    public ItemGR(String name, int sellIn, int quality, int daySold) {
        super(name, sellIn, quality);
        this.daySold = daySold;
    }


}
