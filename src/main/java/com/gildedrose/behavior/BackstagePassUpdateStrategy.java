package com.gildedrose.behavior;

import com.gildedrose.Item;

public class BackstagePassUpdateStrategy implements Updatable {
    @Override
    public void update(Item item) {
        item.sellIn--;

        if (item.sellIn < 0) {
            item.quality = 0;
            return;
        }

        if (item.quality < 50){
            item.quality++;
        }

        if (item.sellIn < 10 && item.quality < 50) {
            item.quality++;
        }

        if (item.sellIn < 5 && item.quality < 50) {
            item.quality++;
        }
    }
}
