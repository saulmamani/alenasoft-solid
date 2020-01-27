package edu.alenasoft.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    public static List<Item> items = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("OMGHAI!");

        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        updateQuality();

        System.out.println(items);
    }

    public static void updateQuality() {
        for (Item item : items) {

            updateItemQuality(item, true);

            decreaseItemeSellIn(item);

            if(item.getSellIn() < 0)
                updateItemQuality(item, false);

        }
    }

    private static void updateItemQuality(Item item, boolean beforeDecreaseSellIn){

        if ("Aged Brie".equals(item.getName())) {
            incremetQuality(item);
        } else if ("Backstage passes to a TAFKAL80ETC concert".equals(item.getName())) {
            if(beforeDecreaseSellIn) {
                incremetQuality(item);

                if (item.getSellIn() < 11) {
                    incremetQuality(item);
                }

                if (item.getSellIn() < 6) {
                    incremetQuality(item);
                }
            }
            else
            {
                    item.setQuality(0);
            }
        } else {
            decrementQuality(item);
        }
    }

    private static void incremetQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }

    private static void decrementQuality(Item item) {
        if (item.getQuality() > 0) {
            if (! isItemSulfuras(item)) {
                item.setQuality(item.getQuality() - 1);
            }
        }
    }

    private static void decreaseItemeSellIn(Item item) {
        if (! isItemSulfuras(item)) {
            item.setSellIn(item.getSellIn() - 1);
        }
    }

    private  static boolean isItemSulfuras(Item item)
    {
        return "Sulfuras, Hand of Ragnaros".equals(item.getName());
    }
}
