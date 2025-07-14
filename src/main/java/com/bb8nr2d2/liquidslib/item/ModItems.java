package com.bb8nr2d2.liquidslib.item;

import com.bb8nr2d2.liquidslib.LiquidsLib;
import com.bb8nr2d2.liquidslib.item.custom.ChiselItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LiquidsLib.MODID);

    public static final DeferredItem<Item> ROCK = ITEMS.register("rock",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HOT_ROCK = ITEMS.register("hot_rock",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COPPER_CHISEL = ITEMS.register("copper_chisel",
            () -> new ChiselItem(new Item.Properties().durability(640)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
