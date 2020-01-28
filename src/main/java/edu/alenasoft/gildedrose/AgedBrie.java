package edu.alenasoft.gildedrose;

public class AgedBrie extends Quality {
    public AgedBrie(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality()
    {
        incremetQuality();

        decreaseItemeSellIn();

        if (item.getSellIn() < 0)
            incremetQuality();
    }
}
