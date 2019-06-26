package com.gildedrose;

public class Day {
    private int day;

    public int getDay() {
        return day;
    }

    public void addOneDay(){
        day++;
    }

    public void addMultipleDays(int days){
        day += days;
    }
}
