package com.bb8nr2d2.liquidslib.item;

import com.bb8nr2d2.liquidslib.LiquidsLib;
import com.bb8nr2d2.liquidslib.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LiquidsLib.MODID);

    public static final Supplier<CreativeModeTab> LIQUIDS_LIBRARY_TAB = CREATIVE_MODE_TAB.register("liquids_library_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ROCK.get()))
                    //.withTabsBefore(ResourceLocation.fromNamespaceAndPath(LiquidsLib.MOD_ID, "liquids_library_tab"))
                    .title(Component.translatable("creativetab.liquidslib.liquids_library_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ROCK);
                        output.accept(ModItems.HOT_ROCK);
                        output.accept(ModItems.HOTTER_ROCK);
                        output.accept(ModItems.HOTTEST_ROCK);
                        output.accept(ModItems.MAGMA_ROCK);

                        output.accept(ModItems.WHITE_CHOCOLATE_BAR);
                        output.accept(ModItems.MILK_CHOCOLATE_BAR);
                        output.accept(ModItems.DARK_CHOCOLATE_BAR);

                        output.accept(ModItems.FLINT_CHISEL);
                        output.accept(ModItems.COPPER_CHISEL);
                        output.accept(ModItems.IRON_CHISEL);
                        output.accept(ModItems.GOLD_CHISEL);
                        output.accept(ModItems.DIAMOND_CHISEL);
                        output.accept(ModItems.NETHERITE_CHISEL);

                        output.accept(ModBlocks.COBBLED_COBBLESTONE);
                        output.accept(ModBlocks.HOT_COBBLESTONE);
                        output.accept(ModBlocks.HOTTER_COBBLESTONE);
                        output.accept(ModBlocks.HOTTEST_COBBLESTONE);
                        output.accept(ModBlocks.HOT_BLOCK);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
