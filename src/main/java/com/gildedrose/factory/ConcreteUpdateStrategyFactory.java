package com.gildedrose.factory;

import com.gildedrose.behavior.*;
import com.gildedrose.Item;

public class ConcreteUpdateStrategyFactory implements UpdateStrategyFactory {

    public Updatable FactoryMethod(Item item) {

        Updatable updateStrategy;
        String itemName = item.name.toLowerCase();

        if (itemName.contains("aged brie")) {
            updateStrategy = new AgedBrieUpdateStrategy();
        } else if (itemName.contains("backstage")) {
            updateStrategy = new BackstagePassUpdateStrategy();
        } else if (itemName.contains("conjured")) {
            updateStrategy = new ConjuredUpdateStrategy();
        } else if (itemName.contains("sulfuras")){
            updateStrategy = new LegendaryUpdateStrategy();
        } else {
            updateStrategy = new NormalUpdateStrategy();
        }

        return updateStrategy;
    }
}
