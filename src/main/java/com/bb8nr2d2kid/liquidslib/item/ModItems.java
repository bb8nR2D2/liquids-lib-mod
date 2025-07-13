package com.bb8nr2d2kid.liquidslib.item;

import com.bb8nr2d2kid.liquidslib.LiquidsLib;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LiquidsLib.MODID);

    public static final DeferredItem<Item> ROCK = ITEMS.register("rock",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
