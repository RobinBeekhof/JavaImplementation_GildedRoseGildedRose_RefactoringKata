package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        GildedRose app = new GildedRose();
        app.addNormalItem("+5 Dexterity Vest", 10, 20)
                .addAgedBrie("Hello World Cheeses", 2, 0)
                .addNormalItem("Elixir of the Mongoose", 5, 7)
                .addSulfuras()
                .addBackStagePass("TAFKAL80ETC concert", 15, 20)
                .addBackStagePass("TAFKAL80ETC concert", 10, 49)
                .addBackStagePass("TAFKAL80ETC concert", 5, 49)
                .addConjured("Mana Cake", 3, 6);


        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            app.printItems();
            app.endDay();
        }

    }

}
