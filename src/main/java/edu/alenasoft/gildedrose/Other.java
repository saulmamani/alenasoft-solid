package edu.alenasoft.gildedrose;

public class Other extends Quality {
    public Other(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        decrementQuality();

        decreaseItemeSellIn();

        if (item.getSellIn() < 0)
            decrementQuality();
    }
}
