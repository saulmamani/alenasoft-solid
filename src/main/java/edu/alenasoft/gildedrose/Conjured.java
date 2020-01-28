package edu.alenasoft.gildedrose;

public class Conjured extends Quality {
    public Conjured(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        decrementQuality();
        decrementQuality();

        decreaseItemeSellIn();

        if (item.getSellIn() < 0) {
            decrementQuality();
            decrementQuality();
        }
    }
}
