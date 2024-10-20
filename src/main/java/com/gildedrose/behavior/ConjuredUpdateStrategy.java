package com.gildedrose.behavior;

import com.gildedrose.Item;

public class ConjuredUpdateStrategy implements Updatable {
    @Override
    public void update(Item item) {
        item.sellIn--;
        item.quality -= 2;

        if(item.sellIn < 0){
            item.quality -= 2;
        }

        if(item.quality < 0){
            item.quality = 0;
        }
    }
}
