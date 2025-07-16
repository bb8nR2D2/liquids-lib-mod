package com.bb8nr2d2.liquidslib.item;

import com.bb8nr2d2.liquidslib.LiquidsLib;
import com.bb8nr2d2.liquidslib.item.custom.ChiselItem;
import com.bb8nr2d2.liquidslib.item.custom.FuelItem;
import net.minecraft.world.item.BlockItem;
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
    public static final DeferredItem<Item> HOTTER_ROCK = ITEMS.register("hotter_rock",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HOTTEST_ROCK = ITEMS.register("hottest_rock",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGMA_ROCK = ITEMS.register("magma_rock",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MILK_CHOCOLATE_BAR = ITEMS.register("milk_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MILK_CHOCOLATE_BAR)));
    public static final DeferredItem<Item> WHITE_CHOCOLATE_BAR = ITEMS.register("white_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoodProperties.WHITE_CHOCOLATE_BAR)));
    public static final DeferredItem<Item> DARK_CHOCOLATE_BAR = ITEMS.register("dark_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DARK_CHOCOLATE_BAR)));

    public static final DeferredItem<Item> COPPER_CHISEL = ITEMS.register("copper_chisel",
            () -> new ChiselItem(new Item.Properties().durability(418)));
    public static final DeferredItem<Item> FLINT_CHISEL = ITEMS.register("flint_chisel",
            () -> new ChiselItem(new Item.Properties().durability(288)));
    public static final DeferredItem<Item> IRON_CHISEL = ITEMS.register("iron_chisel",
            () -> new ChiselItem(new Item.Properties().durability(600)));
    public static final DeferredItem<Item> GOLD_CHISEL = ITEMS.register("gold_chisel",
            () -> new ChiselItem(new Item.Properties().durability(300)));
    public static final DeferredItem<Item> DIAMOND_CHISEL = ITEMS.register("diamond_chisel",
            () -> new ChiselItem(new Item.Properties().durability(3434)));
    public static final DeferredItem<Item> NETHERITE_CHISEL = ITEMS.register("netherite_chisel",
            () -> new ChiselItem(new Item.Properties().durability(4468)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
