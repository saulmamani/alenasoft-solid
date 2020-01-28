package edu.alenasoft.gildedrose;

public class Backstage extends Quality {
    private final int ELEVEN = 11;
    private final int SIX = 6;

    public Backstage(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        update();

        decreaseItemeSellIn();

        if (item.getSellIn() < 0) {
            item.setQuality(0);
        }
    }

    private void update() {
        incremetQuality();

        if (item.getSellIn() < ELEVEN) {
            incremetQuality();
        }

        if (item.getSellIn() < SIX) {
            incremetQuality();
        }
    }
}
