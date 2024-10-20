package com.gildedrose.behavior;

import com.gildedrose.Item;

public class LegendaryUpdateStrategy implements Updatable {
    @Override
    public void update(Item item) {
        item.sellIn--;
    }
}
