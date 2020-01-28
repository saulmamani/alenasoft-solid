package edu.alenasoft.gildedrose;

public abstract class Quality implements IQuality{
    protected Item item;

    protected void incremetQuality() {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }

    protected void decrementQuality() {
        if (item.getQuality() > 0) {
            if (!isItemSulfuras()) {
                item.setQuality(item.getQuality() - 1);
            }
        }
    }

    protected void decreaseItemeSellIn() {
        if (!isItemSulfuras()) {
            item.setSellIn(item.getSellIn() - 1);
        }
    }

    private boolean isItemSulfuras() {
        return "Sulfuras, Hand of Ragnaros".equals(item.getName());
    }
}
