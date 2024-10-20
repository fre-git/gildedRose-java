package com.gildedrose.behavior;

import com.gildedrose.Item;

public class AgedBrieUpdateStrategy implements Updatable {
    @Override
    public void update(Item item) {
        item.sellIn--;
        if (item.quality >= 50) {
            return;
        }
        item.quality++;

        if (item.sellIn < 0 && item.quality < 50) {
            item.quality++;
        }
    }
}
