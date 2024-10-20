package com.gildedrose.factory;

import com.gildedrose.behavior.Updatable;
import com.gildedrose.Item;

public interface UpdateStrategyFactory {
    Updatable FactoryMethod(Item item);
}
