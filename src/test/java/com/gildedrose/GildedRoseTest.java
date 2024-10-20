package com.gildedrose;

import com.gildedrose.factory.ConcreteUpdateStrategyFactory;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("brie", 0, 0)};
        ConcreteUpdateStrategyFactory factory = new ConcreteUpdateStrategyFactory();
        GildedRose app = new GildedRose(items, factory);
        app.updateQuality();
        System.out.println(items[0]);
        assertEquals("brie", items[0].name);
    }

}
