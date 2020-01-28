package edu.alenasoft.gildedrose;

public class ItemFactory {

    private static final String AGEND = "Aged Brie";
    private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    private static final String CONJURED = "Conjured Mana Cake";

    public static IQuality createItem(Item item){
        switch (item.getName()) {
            case AGEND : return new AgedBrie(item);
            case BACKSTAGE : return new Backstage(item);
            case CONJURED : return new Conjured(item);
            default: return new Other(item);
        }
    }
}
