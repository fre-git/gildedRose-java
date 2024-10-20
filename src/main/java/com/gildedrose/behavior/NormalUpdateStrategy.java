package com.gildedrose.behavior;

import com.gildedrose.Item;

public class NormalUpdateStrategy implements Updatable {
    @Override
    public void update(Item item) {
        item.sellIn--;
        if (item.quality == 0) {
            return;
        }

        item.quality--;
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality--;
        }
    }
}


